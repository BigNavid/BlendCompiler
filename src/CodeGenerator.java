import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class CodeGenerator
{
    // Scanner scanner; // This was my way of informing CG about Constant Values detected by Scanner, you can do whatever you like

    private CG_STATE state = CG_STATE.IDLE;
    private int sp_top = 1000000;
    private String var_dcl_type = "";
    private DSCP assignment_l_dscp;

    private ArrayList<Instruction> program = new ArrayList<>();
    private int number_of_ins;


    private Operand o1, o2, o3, A, B, iA, iB;
    private Instruction ins;

    public CodeGenerator(Scanner scanner)
    {
        //this.scanner = scanner;
        define_registers();
    }

    private void define_registers()
    {
        //  Register A
        A = new Operand("gd_i_0");
        iA = new Operand("gi_i_0");

        // Register B
        B = new Operand("gd_i_4");
        iB = new Operand("gi_i_4");
    }

    public void Generate(String sem)
    {
    	//System.out.println(sem); // Just for debug
    	
        if (sem.equals("NoSem"))
            return;
        else if(sem.equals("@type_int"))
        {
            add_ins(new Instruction(Instruction.DEC_SP, new Operand("im_i_4"), null , null));
            sp_top -= 4;
            add_ins(new Instruction(Instruction.GET_SP, A, null, null));
            add_ins(new Instruction(Instruction.GET_MEM, new Operand("im_i_4"), iA, null));
            var_dcl_type = "int";
        }
        else if(sem.equals("@type_string"))
        {
            add_ins(new Instruction(Instruction.DEC_SP, new Operand("im_i_4"), null , null));
            sp_top -= 4;
            add_ins(new Instruction(Instruction.GET_SP, A, null, null));
            add_ins(new Instruction(Instruction.GET_MEM, new Operand("im_i_4"), iA, null));
            var_dcl_type = "string";
        }
        else if(sem.equals("@type_real"))
        {
            add_ins(new Instruction(Instruction.DEC_SP, new Operand("im_i_4"), null , null));
            sp_top -= 4;
            add_ins(new Instruction(Instruction.GET_SP, A, null, null));
            add_ins(new Instruction(Instruction.GET_MEM, new Operand("im_i_4"), iA, null));
            var_dcl_type = "real";
        }
        else if(sem.equals("@type_char"))
        {
            add_ins(new Instruction(Instruction.DEC_SP, new Operand("im_i_1"), null , null));
            sp_top -= 1;
            add_ins(new Instruction(Instruction.GET_SP, A, null, null));
            add_ins(new Instruction(Instruction.GET_MEM, new Operand("im_i_1"), iA, null));
            var_dcl_type = "char";
        }
        else if(sem.equals("@type_bool"))
        {
            add_ins(new Instruction(Instruction.DEC_SP, new Operand("im_i_4"), null , null));
            sp_top -= 4;
            add_ins(new Instruction(Instruction.GET_SP, A, null, null));
            add_ins(new Instruction(Instruction.GET_MEM, new Operand("im_i_4"), iA, null));
            var_dcl_type = "bool";
         }
        else if(sem.equals("@type_long"))
        {
            add_ins(new Instruction(Instruction.DEC_SP, new Operand("im_i_8"), null , null));
            sp_top -= 8;
            add_ins(new Instruction(Instruction.GET_SP, A, null, null));
            add_ins(new Instruction(Instruction.GET_MEM, new Operand("im_i_8"), iA, null));
            var_dcl_type = "long";
        }
        else if(sem.equals("@var_type"))
        {
            DSCP ds = SymbolTable.getSymbol(Scanner.current_id);
            if(ds.var_addr != -1)
            {
                System.out.println("Compile Error: Predefined identifier '" + Scanner.current_id +"'." );
                System.exit(0);
            }
            ds.var_addr = sp_top;
            ds.var_type = var_dcl_type;
        }
        else if(sem.equals("@push_id"))
        {
            assignment_l_dscp = SymbolTable.getSymbol(Scanner.current_id);
        }


        // EXPR
        else if(sem.equals("@cnst_int"))
        {

        }
        else
        {
            return;
        }
    }
    
    public void FinishCode() // You may need this
    {

    }

    public void WriteOutput(String outputName) throws Exception
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputName));
    	for(int i = 0; i < program.size(); i++)
        {
            bw.write(program.get(i).toString());
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    private void add_ins(Instruction i)
    {
        program.add(number_of_ins, i);
        number_of_ins++;
    }
}


enum CG_STATE
{
    IDLE,
    TYPE_INT
}