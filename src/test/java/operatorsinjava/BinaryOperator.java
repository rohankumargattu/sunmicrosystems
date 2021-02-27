package operatorsinjava;

public class BinaryOperator 
{
	public static void main(String[] args) throws Exception
	{
		//Initialization
		int x=10;
		int y=2;
		
		//Arithmatic Operators
		int z1=x+y;
		System.out.println(z1);
		int z2=x-y;
		System.out.println(z2);
		int z3=x*y;
		System.out.println(z3);
		int z4=x/y;
		System.out.println(z4);
		int z5=x%y;
		System.out.println(z5);
		
		//Conditional/Comparision operators
		if(x<y)
		{
			System.out.println("x is lesser");
		}
		else
		{
			System.out.println("x is greater");
		}
		if(x>y)
		{
			System.out.println("x is greater");
		}
		else
		{
			System.out.println("x is lesser");
		}
		if(x<=y)
		{
			System.out.println("x is lesser or equal to y");
		}
		else
		{
			System.out.println("x is greater");
		}
		if(x>=y)
		{
			System.out.println("x is greater or equal to y");
		}
		else
		{
			System.out.println("x is lesser");
		}
		if(x!=y)
		{
			System.out.println("x is not equal to y");
		}
		else
		{
			System.out.println("x is equal to y");
		}
		if(x==y)
		{
			System.out.println("x is equal to y");
		}
		else
		{
			System.out.println("x is not equal to y");
		}
		
		//&&,||,! operator(Used to combine more than 1 statement)
		if(x<y || x>y)
		{
			System.out.println("x is not equal to y");
		}
		else
		{
			System.out.println("x is equal to y");
		}
		if(x>y && x!=y)
		{
			System.out.println("x is not equal to y");
		}
		else
		{
			System.out.println("x is equal to y or less than y");
		}
	}
}
