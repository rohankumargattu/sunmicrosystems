package stringclassmethods;

import java.util.Scanner;

public class CharAtNumberOfOccurancesWithIndexes
{
	public static void main(String[] args) throws Exception
	{
		String x="jgrSfl JG igG IGIgi /&%#&* gH35h46  GIgig  isfl5sf 5rg6gdg64g d6gdgdgd";
		Scanner sc=new Scanner(System.in);
		System.out.println("tell me 1 character");
		String y=sc.nextLine();
		char z=y.charAt(0);
		int c=0;
		sc.close();
		for(int i=0;i<x.length();i++)
		{
			char a=x.charAt(i);
			if(z==a)
			{
				c=c+1;
				System.out.println("found at index "+i);
				switch(i)
				{
					case 0:
						System.out.println("found at "+(i+1)+"st place");
						break;
					case 1:
						System.out.println("found at "+(i+1)+"nd place");
						break;
					case 2:
						System.out.println("found at "+(i+1)+"rd place");
						break;
					default:
						System.out.println("found at "+(i+1)+"th place");
						break; //Option
				}
			}
		}
		System.out.println("no of times "+z+" available in the given string is "+c);
	}
}
