package oraclecorp;

public class InheritanceRunnerClass2 
{
	public static void main(String[] args) throws Exception
	{
		InheritanceParent obj1=new InheritanceParent();
		InheritanceChild obj2=new InheritanceChild();
		obj1.x=100;
		obj1.y=200;
		obj1.display1();
		obj2.x=300;
		obj2.y=400;
		obj2.z=500;
		obj2.w=600;
		obj2.display1();
		obj2.display2();
	}
}
