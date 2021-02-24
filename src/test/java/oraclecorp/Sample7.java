package oraclecorp;

public class Sample7 
{
	//Declare variables
	public int input1;
	public int input2;
	
	//Constructor method
	public Sample7(int temp1,int temp2)
	{
		input1=temp1;
		input2=temp2;
	}
	
	//Operational methods with Polymorphism
	public int add()
	{
		int output=input1+input2;
		return(output);
	}
	
	public int add(int temp)
	{
		input1=temp;
		int output=input1+input2;
		return(output);
	}
	
	public int add(int temp1,int temp2)
	{
		input1=temp1;
		input2=temp2;
		int output=input1+input2;
		return(output);
	}
}
