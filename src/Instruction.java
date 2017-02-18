import com.sun.istack.internal.Nullable;

import java.lang.management.OperatingSystemMXBean;

public class Instruction
{
    public static final String ADD = "+";
    public static final String SUBTRACT = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";
    public static final String MOD = "%";
    public static final String LOGICAL_AND = "&&";
    public static final String LOGICAL_OR = "||";
    public static final String BINARY_AND = "&";
    public static final String BINARY_OR = "|";
    public static final String BINARY_XOR = "^";
    public static final String BINARY_NOT = "~";
    public static final String LESS_THAN = "<";
    public static final String GREATER_THAN = ">";
    public static final String BINARY_LEFT = "<<";
    public static final String BINARY_RIGHT = ">>";
    public static final String LESS_OR_EQ_THAN = "<=";
    public static final String GREATER_OR_EQ_THAN = ">=";
    public static final String EQUAL = "==";
    public static final String NOT_EQUAL = "!=";
    public static final String LOGICAL_NOT = "!";
    public static final String UNARY_MINUS = "u-";
    public static final String ASSIGNMENT = ":=";
    public static final String JUMP_ZERO = "jz";
    public static final String JUMP = "jmp";
    public static final String WRITE = "wi";
    public static final String WRITE_FLOAT = "wf";
    public static final String WRITE_TEXT = "wt";
    public static final String READ_INT = "ri";
    public static final String READ_TEXT = "rt";
    public static final String READ_FLOAT = "rf";
    public static final String GET_MEM = "gmm";
    public static final String FREE_MEM = "fmm";
    public static final String GET_PC = ":=pc";
    public static final String GET_SP = ":=sp";
    public static final String SET_SP = "sp:=";
    public static final String INC_SP = "+sp";
    public static final String DEC_SP = "-sp";
    public static final String OVERFLOW = ":=v";


    // Addressing Mode
    public static final String ADDR_MODE_GLOBAL_DIRECT = "gd_";
    public static final String ADDR_MODE_GLOBAL_INDIRECT = "gi_";
    public static final String ADDR_MODE_LOCAL_DIRECT = "ld_";
    public static final String ADDR_MODE_LOCAL_INDIRECT = "li_";
    public static final String ADDR_MODE_IMMIDIATE = "im_";


    // Type
    public static final String TYPE_INTEGER = "i_";
    public static final String TYPE_FLOAT = "f_";
    public static final String TYPE_BOOLEAN = "b_";
    public static final String TYPE_STRING = "s_";
    public static final String TYPE_CHAR = "c_";

    public String opcode;

    public Operand operand_1;
    public Operand operand_2;
    public Operand operand_3;


    public Instruction(String op, Operand o1, @Nullable Operand o2, @Nullable Operand o3)
    {
        opcode = op; operand_1 = o1; operand_2 = o2; operand_3 = o3;
    }



    @Override
    public String toString() {
        return (opcode + "\t" + operand_1 + "\t" + (operand_2 == null ? "" : operand_2) + "\t" + (operand_3 == null ? "" : operand_3));
    }
}
