package oraclecorp;

public class Sample5 
{
	//Data members
	public int x;
	public float y;
	public char c;
	public boolean b;
	public String s;
	
	//Constructor methods
	public Sample5()
	{
		x=10;
		s="nageswararao";
	}
	public Sample5(int temp1)
	{
		x=temp1;
	}
	public Sample5(String temp1)
	{
		s=temp1;
	}
	public Sample5(float temp1)
	{
		y=temp1;
	}
	public Sample5(int temp1,String temp2)
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
