package oraclecorp;

public class PolymorphismRunnerClass3 
{
	public static void main(String[] args) throws Exception
	{
		PolymorphismSuper obj1=new PolymorphismSuper();
		obj1.display();
		PolymorphismSub obj2=new PolymorphismSub();
		obj2.display();
		obj2.display1();
	}
}
