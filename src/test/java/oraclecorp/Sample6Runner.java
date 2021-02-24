package oraclecorp;

public class Sample6Runner
{
	public static void main(String[] args) throws Exception
	{
		Sample6 obj=new Sample6(15,20);
		obj.add1();
		int result=obj.add2();
		System.out.println(result);
	}
}
