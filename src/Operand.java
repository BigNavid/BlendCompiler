public class Operand {
    public String addr_mode;
    public String type;
    public String value;

    public Operand(String am, String t, String v)
    {
        addr_mode = am; type = t; value = v;
    }

    @Override
    public String toString() {
        return addr_mode + type + value;
    }
}
