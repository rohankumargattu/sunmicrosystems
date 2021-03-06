package interviewprograms;

import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		int temp1=x;
		int temp2=0;
		int nod=String.valueOf(x).length();
		while(temp1!=0)
		{
			temp2=(int) (temp2+Math.pow(temp1%10, nod));
			temp1=temp1/10;
		}
		System.out.println(temp2);
		if(x==temp2)
		{
			System.out.println("It is an Armstrong number");
		}
		else
		{
			System.out.println("It is not an Armstrong number");
		}
	}
}
