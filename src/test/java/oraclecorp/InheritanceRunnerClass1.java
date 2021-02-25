package oraclecorp;

public class InheritanceRunnerClass1
{
	public static void main(String[] args) throws Exception
	{
		InheritanceClass1 obj1=new InheritanceClass1();
		obj1.x=10;
		obj1.method1();
		InheritanceClass2 obj2=new InheritanceClass2();
		obj2.y=20;
		obj2.method2();
		obj2.x=30;
		obj2.method1();
	}
}
