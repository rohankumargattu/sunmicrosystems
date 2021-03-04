package oraclecorp;

public class FinalClass
{
	public static void main(String[] args) throws Exception
	{
		//final(keyword in java)
		//final - variable
		int x=10;
		final int y=20;		//here y value can never be changed. treated as a constant
		
		//final - method
		/*public final void mindq()		//will not allow overloading and overriding. No POLYMORPHISM
		{
			---------		
			---------
		}*/
		
		//final - class
		/*public final class Mindq			//Cannot be inherited. will not allow child class. No Inheritance
		{
			//Data members/properties     
			//methods/operations
		}*/	
	}
}
