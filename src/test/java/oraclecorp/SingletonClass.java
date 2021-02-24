package oraclecorp;

public class SingletonClass 
{
	public int x;
	private SingletonClass()
	{
		x=10;
	}
	
	public static SingletonClass create()
	{
		SingletonClass obj1=new SingletonClass();
		return(obj1);
	}
	
	public void display()
	{
		System.out.println(x);
	}
}
