package oraclecorp;

public class InheritanceChild extends InheritanceParent
{
	public int z;
	public int w;
	public InheritanceChild()
	{
		z=30;
		w=40;
	}
	public void display2()
	{
		System.out.println(z);
		System.out.println(w);
	}
}
