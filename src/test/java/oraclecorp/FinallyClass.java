package oraclecorp;

public class FinallyClass 
{
	public static void main(String[] args) throws Exception
	{
		//Finally
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
		}
		finally
		{
			System.out.println("This is printed by \"finally\" block of code");
		}
	}
}
