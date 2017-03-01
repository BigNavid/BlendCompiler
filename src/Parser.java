import java.io.FileReader;
import java.util.Stack;

public class Parser 
{
	Scanner scanner;
	CodeGenerator cg;
	PTBlock[][] parseTable;
	Stack<Integer> parseStack = new Stack<>();
	String[] symbols;

	public Parser(String inputFile, String[] symbols, PTBlock[][] parseTable)
	{
		try
		{
			this.parseTable = parseTable;
			this.symbols = symbols;
	
			scanner = new Scanner(inputFile);
			cg = new CodeGenerator(scanner);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public int LineNumber()
	{
		return scanner.lineNumber; // Or any other name you used in your Scanner
	}

	public void Parse() throws Exception
	{
			int tokenId = nextTokenID();
			int curNode = 0;
			boolean notAccepted = true;
			while (notAccepted)
			{
				String token = symbols[tokenId];
	            PTBlock ptb = parseTable[curNode][tokenId];
				switch (ptb.getAct())
				{
	                case PTBlock.ActionType.Error:
	                    {
	                        throw new Exception("Unexpected token \"" + token + "\" at line " + scanner.lineNumber);
	                    }
					case PTBlock.ActionType.Shift:
						{
							cg.Generate(ptb.getSem());
							tokenId = nextTokenID();
							curNode = ptb.getIndex();
						}
						break;
	
					case PTBlock.ActionType.PushGoto:
						{
							parseStack.push(curNode);
							curNode = ptb.getIndex();
						}
						break;
	
					case PTBlock.ActionType.Reduce:
						{
							if (parseStack.size() == 0)
	                        {
		                        throw new Exception("Unexpected token \"" + token + "\" at line " + scanner.lineNumber);
	                        }
	
							curNode = parseStack.pop();
							ptb = parseTable[curNode][ptb.getIndex()];
							cg.Generate(ptb.getSem());
							curNode = ptb.getIndex();
						}
						break;
	
					case PTBlock.ActionType.Accept:
						{
							notAccepted = false;
						}
						break;
						
				}
	        }
	        cg.FinishCode();
	}

	int nextTokenID()
	{
		Token t = new Token("", "");
		try
		{
			t = scanner.NextToken();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		int i;
		
		for (i = 0; i < symbols.length; i++)
			if (symbols[i].equals(t.type))
				return i;
		System.out.println("Error at line " + scanner.lineNumber + ":" + t);
		System.exit(0);
		return 0;
	}
	
	public void WriteOutput(String outputFile) // You can change this function, if you think it is not comfortable
	{
		try {
			cg.WriteOutput(outputFile);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
}


