import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class CodeGenerator
{
    Scanner scanner; // This was my way of informing CG about Constant Values detected by Scanner, you can do whatever you like


    private ArrayList<Instruction> program = new ArrayList<>();
    private int number_of_ins;

    private Operand o1, o2, o3;
    private Instruction ins;

    public CodeGenerator(Scanner scanner)
    {
        this.scanner = scanner;
        define_registers();
    }

    private void define_registers()
    {
        //  Register A
        o1 = new Operand(Instruction.ADDR_MODE_IMMIDIATE, Instruction.TYPE_INTEGER, "4");
        o2 = new Operand(Instruction.ADDR_MODE_GLOBAL_DIRECT, Instruction.TYPE_INTEGER, "0");
        ins = new Instruction(Instruction.GET_MEM ,o1, o2, null);
        program.add(number_of_ins, ins);
        number_of_ins ++;

        // Register B
        o1 = new Operand(Instruction.ADDR_MODE_IMMIDIATE, Instruction.TYPE_INTEGER, "4");
        o2 = new Operand(Instruction.ADDR_MODE_GLOBAL_DIRECT, Instruction.TYPE_INTEGER, "4");
        ins = new Instruction(Instruction.GET_MEM ,o1, o2, null);
        program.add(number_of_ins, ins);
        number_of_ins ++;
    }

    public void Generate(String sem)
    {
    	System.out.println(sem); // Just for debug
    	
        if (sem.equals("NoSem"))
            return;
        else if(sem.equals("@type_int"))
        {

        }
        else if(sem.equals("@type_string"))
        {

        }
        else if(sem.equals("@type_real"))
        {

        }
        else if(sem.equals("@type_char"))
        {

        }
        else if(sem.equals("@type_bool"))
        {

        }
        else if(sem.equals("@type_long"))
        {

        }
            /*
             * else if (sem.equals("SemanticRoutine1"))
             * {
             * 	...
             * }
             * else if (sem.equals("SemanticRoutine2"))
             * {
             * 	...
             * }
             */
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
}
