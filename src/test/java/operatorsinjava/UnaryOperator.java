package operatorsinjava;

public class UnaryOperator
{
	public static void main(String[] args) throws Exception
	{
		int x=19;
		System.out.println(x);
		System.out.println(x++); //First print value and then increment
		System.out.println(++x); //First increment and then print
		System.out.println(x--);
		System.out.println(-++x);
		System.out.println(--x);
		System.out.println(-x);
		System.out.println(x);
		System.out.println(-x);
	}
}
