package oraclecorp;

public class PolymorphismSub extends PolymorphismSuper
{
	public int x=20;
	public void display()
	{
		System.out.println("I am in Child");
		System.out.println("Value of x is "+this.x);
	}
	public void display1()
	{
		super.display();
	}
}
