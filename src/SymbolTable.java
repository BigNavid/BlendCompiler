import java.util.HashMap;

public class SymbolTable {
    public static HashMap<String, DSCP> symbols = new HashMap<>();

    // Keywords
    static
    {
        symbols.put("array", new DSCP("KEYWORD"));
        symbols.put("assign", new DSCP("KEYWORD"));
        symbols.put("bool", new DSCP("KEYWORD"));
        symbols.put("break", new DSCP("KEYWORD"));
        symbols.put("case", new DSCP("KEYWORD"));
        symbols.put("char", new DSCP("KEYWORD"));
        symbols.put("continue", new DSCP("KEYWORD"));
        symbols.put("do", new DSCP("KEYWORD"));
        symbols.put("else", new DSCP("KEYWORD"));
        symbols.put("endcase", new DSCP("KEYWORD"));
        symbols.put("environment", new DSCP("KEYWORD"));
        symbols.put("false", new DSCP("KEYWORD"));
        symbols.put("function", new DSCP("KEYWORD"));
        symbols.put("goto", new DSCP("KEYWORD"));
        symbols.put("if", new DSCP("KEYWORD"));
        symbols.put("int", new DSCP("KEYWORD"));
        symbols.put("isvoid", new DSCP("KEYWORD"));
        symbols.put("label", new DSCP("KEYWORD"));
        symbols.put("late", new DSCP("KEYWORD"));
        symbols.put("long", new DSCP("KEYWORD"));
        symbols.put("of", new DSCP("KEYWORD"));
        symbols.put("out", new DSCP("KEYWORD"));
        symbols.put("real", new DSCP("KEYWORD"));
        symbols.put("release", new DSCP("KEYWORD"));
        symbols.put("return", new DSCP("KEYWORD"));
        symbols.put("string", new DSCP("KEYWORD"));
        symbols.put("structure", new DSCP("KEYWORD"));
        symbols.put("true", new DSCP("KEYWORD"));
        symbols.put("void", new DSCP("KEYWORD"));
        symbols.put("while", new DSCP("KEYWORD"));
    }



    public static void addSymbol(String s, DSCP d)
    {
        symbols.put(s, d);
    }

    public static DSCP getSymbol(String s)
    {
        return symbols.get(s);
    }
}
