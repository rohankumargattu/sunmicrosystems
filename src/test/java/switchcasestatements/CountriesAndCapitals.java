package switchcasestatements;

import java.util.Scanner;

public class CountriesAndCapitals
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a country name");
		String country=sc.nextLine();
		switch(country)
		{
			case "India":
				System.out.println("Capital of "+country+" is New Delhi");
				break;
			case "Srilanka":
				System.out.println("Capital of "+country+" is Colombo");
				break;
			case "United stated of America":
				System.out.println("Capital of "+country+" is New York");
				break;
			case "England":
				System.out.println("Capital of "+country+" is London");
				break;
			case "Australia":
				System.out.println("Capital of "+country+" is Canberra");
				break;
			case "Spain":
				System.out.println("Capital of "+country+" is Madrid");
				break;
			case "New Zealand":
				System.out.println("Capital of "+country+" is Auckland");
				break;
			default:
				System.out.println("I Dont know the capital of "+country);
				break;
		}	
	}
}
