public class Operand {
    public String addr_mode;
    public String type;
    public String value;

    public Operand(String am, String t, String v)
    {
        addr_mode = am; type = t; value = v;
    }

    public Operand(String op)
    {
        addr_mode = op.split("_")[0] + "_";
        type = op.split("_")[1] + "_";
        value = op.split("_")[2];
    }

    @Override
    public String toString() {
        return addr_mode + type + value;
    }
}
