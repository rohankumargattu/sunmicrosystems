package oraclecorp;

public class WrapperRunnerClass1
{
	public static void main(String[] args) throws Exception
	{
		//Without double quotes
		Integer x1=new Integer(10);
		Integer y1=new Integer(20);
		Integer z1=new Integer(x1+y1);
		System.out.println(z1);
		
		//With double quotes
		Integer x2=new Integer("10");
		Integer y2=new Integer("20");
		Integer z2=new Integer(x2+y2);
		System.out.println(z2);	
	}
}
