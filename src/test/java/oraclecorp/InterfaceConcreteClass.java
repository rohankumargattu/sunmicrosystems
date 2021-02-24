package oraclecorp;

public class InterfaceConcreteClass implements InterfaceName
{
	public int add(int x, int y) 
	{
		int z=x+y;
		return(z);
	}

	public int subtract(int x, int y) 
	{
		int z=x-y;
		return(z);
	}

	public int multiply(int x, int y)
	{
		int z=x*y;
		return(z);
	}

	public int divide(int x, int y)
	{
		int z=x/y;
		return(z);
	}
}
