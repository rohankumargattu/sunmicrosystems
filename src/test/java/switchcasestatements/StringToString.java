package switchcasestatements;

import java.util.Scanner;

public class StringToString
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your credit card type");
		String x=sc.nextLine();
		switch(x)
		{
			case "visa":
				System.out.println("Valid Card");
				break;
			case "master":
				System.out.println("Valid Card");
				break;
			case "rupay":
				System.out.println("Valid Card");
				break;
			case "americanexpress":
				System.out.println("Valid Card");
				break;
			case "maestro":
				System.out.println("Valid Card");
				break;
			default:
				System.out.println("Invalid card type");
				break;		//Optional(as "default:" is last statement)
		}	
	}
}
