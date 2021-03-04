package oraclecorp;

public class ExceptionHandlingTryCatch 
{
	public static void main(String[] args) throws Exception
	{
		int x=10;
		int y=0;
		try
		{
			int z=x/y;
			System.out.println(z);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Wrong division");
			//System.out.println(ex.getMessage());
		}
	}
}
