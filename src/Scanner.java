import java.io.*;
import java.util.regex.Pattern;

public class Scanner
{
    private Character ch;
    int lineNumber = 1;
    private FileReader fr;

    Scanner(String filename) throws Exception
    {
        File f = new File(filename);
        if (!f.exists())
            throw new Exception ("File does not exist: " + f);
        if (!f.isFile())
            throw new Exception("Should not be a directory: " + f);
        if (!f.canRead())
            throw new Exception("Can not read input file: " + f);
        // ...
        fr = new FileReader(filename);
        ch = getch();
    }

    private boolean remainedToken = false;

    Token NextToken() throws Exception
    {
        // EOF
        if(ch == '\uFFFF')
        {
            return new Token("$", "");
        }


        // remainedToken
        if(remainedToken)
        {
            remainedToken = false;
            return new Token("-", "");
        }

        // white space
        if(Pattern.matches("\\s", ch.toString()))
        {
            if(ch == '\n')
                lineNumber ++;
            while(Pattern.matches("\\s", ch.toString())) {
                ch = getch();
                if(ch == '\n')
                    lineNumber ++;
            }
        }

        // one-line comment
        else if (ch == '-')
        {
            ch = getch();
            if (ch == '-')
            {
                while (ch != '\n' && ch != '\r')
                    ch = getch();
            }
            else
                return new Token("-", "");
        }


        // Multiple-Line comment
        if(ch == '<')
        {
            ch = getch();
            if(ch == '-')
            {
                ch = getch();
                if(ch == '-') {
                    boolean done = false;
                    while (!done)
                    {
                        ch = getch();
                        if(ch == '-') {
                            ch = getch();
                            if(ch == '-')
                            {
                                ch = getch();
                                if(ch == '>')
                                    ch = getch();
                                    done = true;
                            }
                        }

                    }
                }
                else
                {
                    remainedToken = true;
                    return new Token("<", "");
                }
            }
            // <=
            else if(ch == '=')
            {
                ch = getch();
                return new Token("<=", "");
            }
            else
                return new Token("<", "");
        }


        // Constant Numbers
        else {
            if (Pattern.matches("\\d", ch.toString())) {
                // HEX
                if (ch == '0') {
                    ch = getch();
                    if (ch == 'x') {
                        ch = getch();
                        long icv = 0;
                        while (Pattern.matches("\\d|[A-F]", ch.toString())) {
                            icv *= 16;
                            icv += ch - 48;
                            ch = getch();
                        }
                        return new Token("CNST_HEX", Long.toString(icv));
                    } else {
                        return new Token("Error", "0 in beginnig of number");
                    }
                }
                long icv = 0;
                while (Pattern.matches("\\d", ch.toString())) {
                    icv *= 10;
                    icv += ch - 48;
                    ch = getch();
                }
                if (ch == '.') {
                    ch = getch();
                    int i = 1;
                    double rcv = 0;
                    while (Pattern.matches("\\d", ch.toString())) {
                        rcv += (double) (ch - 48) / i;
                        i *= 10;
                        ch = getch();
                    }
                    return new Token("CNST_REAL", Double.toString(icv + rcv));
                } else {
                    // TODO: 8 or 4 byte?
                    if (icv < 0x100000000L)
                        return new Token("CNST_INT4", Long.toString(icv));
                    else
                        return new Token("CNST_INT8", Long.toString(icv));
                }
            }

            // Single Character
            else if (ch == '\'') {
                ch = getch();
                String c = ch.toString();
                ch = getch();
                if (ch != '\'')
                    return new Token("Error", "Expected \" ' \"");

                // Set to next char
                ch = getch();

                return new Token("CNST_CHAR", c);
            }

            // String
            else if (ch == '\"') {
                String s = "";
                ch = getch();
                while (ch != '\"') {
                    s += ch;
                    ch = getch();
                }
                ch = getch();
                return new Token("CNST_STRING", s);
            }

            // ID or KEYWORD
            else if (Pattern.matches("[A-Z]|[a-z]", ch.toString())) {
                String s = ch.toString();
                ch = getch();
                while (Pattern.matches("\\w", ch.toString())) {
                    s += ch;
                    ch = getch();
                }
                if (SymbolTable.getSymbol(s) != null) {
                    if (SymbolTable.getSymbol(s).kind.equals("KEYWORD")) {
                        return new Token(s, "");
                    } else
                        return new Token("id", s);
                } else {
                    SymbolTable.addSymbol(s, new DSCP("id"));
                    return new Token("id", s);
                }
            }

            // Unary Symbols
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/'
                    || ch == '%' || ch == '~' || ch == '=' || ch == ','
                    || ch == ';' || ch == '[' || ch == ']' || ch == '('
                    || ch == ')' || ch == '{' || ch == '}' || ch == '.') {
                String s = ch.toString();
                ch = getch();
                return new Token(s, "");
            }

            // :
            else if (ch == ':') {
                ch = getch();
                if (ch == ':' || ch == '=')
                {
                    char c = ch;
                    ch = getch();
                    return new Token(":" + c, "");
                }
                return new Token(":", "");
            }

            // > >= ! !=
            else if (ch == '>' || ch == '!') {
                char t = getch();
                if (t == '=') {
                    return new Token("" + ch + t, "");
                } else {
                    String s = ch.toString();
                    ch = t;
                    return new Token(s, "");
                }
            } else if (ch == '&')
                if ((ch = getch()) == '&') {
                    ch = getch();
                    return new Token("&&", "");
                } else
                    return new Token("&", "");

            else if (ch == '|')
                if ((ch = getch()) == '|') {
                    ch = getch();
                    return new Token("||", "");
                } else {
                    return new Token("|", "");
                }
        }


        return new Token("Error", "wrong token");
    }


    private char getch()
    {
        try {
            return (char) fr.read();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return 0;
    }
}



