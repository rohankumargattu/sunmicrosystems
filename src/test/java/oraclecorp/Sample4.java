package oraclecorp;

public class Sample4 
{
	//Data members
	public int x;
	public float y;
	public char c;
	public boolean b;
	public String s;
	
	//Constructor method
	public Sample4(int temp1,String temp2)
	{
		x=temp1;
		s=temp2;
	}
	
	//Method
	public void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
	}
}
