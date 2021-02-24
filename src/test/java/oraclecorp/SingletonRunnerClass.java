package oraclecorp;

public class SingletonRunnerClass 
{
	public static void main(String[] args) throws Exception
	{
		SingletonClass obj2=SingletonClass.create();
		obj2.display();
	}
}
