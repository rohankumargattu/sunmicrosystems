package oraclecorp;

public class PolymorphismRunnerClass2 
{
	public static void main(String[] args) throws Exception
	{
		PolymorphismParent obj1=new PolymorphismParent();
		obj1.display();
		PolymorphismChild obj2=new PolymorphismChild();
		obj2.display();
	}
}
