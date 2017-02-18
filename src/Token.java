public class Token
{
    public String type, value;
    public Token(String t, String v)
    {
        type = t;
        value = v;
    }

    @Override
    public String toString() {
        return "\nType: " + type + "\nValue: " + value + "\n";
    }
}
