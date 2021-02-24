package oraclecorp;

public class StaticClass1Runner
{
	public static void main(String[] args) throws Exception
	{
		StaticClass1 obj1=new StaticClass1();
		StaticClass1 obj2=new StaticClass1();
		StaticClass1.x=100;
		obj1.y=200;
		obj2.y=300;
		System.out.println(StaticClass1.x+"   "+obj1.y);
		System.out.println(StaticClass1.x+"   "+obj2.y);	
	}
}
