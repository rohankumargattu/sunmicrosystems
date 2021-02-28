package switchcasestatements;

import java.util.Scanner;

public class MaritalStatus 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marital status as y/n");
		String l=sc.nextLine();
		char x=l.charAt(0);
		switch(x)
		{
			case 'y':
				System.out.println("Married");
				break;
			case 'n':
				System.out.println("Unmarried");
				break;
			default:
				System.out.println("undefined");
				break;		//Optional(as "default:" is last statement)
		}
	}
}
