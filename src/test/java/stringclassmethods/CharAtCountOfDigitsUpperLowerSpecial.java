package stringclassmethods;

import java.util.Scanner;

public class CharAtCountOfDigitsUpperLowerSpecial 
{
	public static void main(String[] args) throws Exception
	{
		//Take a sentence from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String with digits, upper case, lower case and special characters");
		String x=sc.nextLine();
		int nod=0;
		int nou=0;
		int nol=0;
		int nosc=0;
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			if(y>=97 && y<=122)
			{
				nol=nol+1;
				//nol++;
			}
			else if(y>=65 && y<=90)
			{
				nou=nou+1;
				//nou++;
			}
			else if(y>=48 && y<=57)
			{
				nod=nod+1;
				//nod++;
			}
			else
			{
				nosc=nosc+1;
				//nosc++;
			}
		}
		System.out.println("No of digits in the given String are: "+nod);
		System.out.println("No of upper case alphabet in the given String are: "+nou);
		System.out.println("No of lower case alphabet in the given String are: "+nol);
		System.out.println("No of special charaters in the given String are: "+nosc);	
	}
}
