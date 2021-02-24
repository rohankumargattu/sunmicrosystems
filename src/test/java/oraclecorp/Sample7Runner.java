package oraclecorp;

public class Sample7Runner
{
	public static void main(String[] args) throws Exception
	{
		Sample7 obj=new Sample7(8,4);
		int result1=obj.add();
		System.out.println(result1);
		int result2=obj.add(16);
		System.out.println(result2);
		int result3=obj.add(13,19);
		System.out.println(result3);
	}
}
