package stringclassmethods;

import java.util.ArrayList;

public class CharAtCountOfDigitsUpperLowerSpecialDynamicArray
{
	public static void main(String[] args) throws Exception
	{
		String x="jgrSfl JG igG /&%#&* IGIgi  gH35h46  GIgig  isfl5sf 5rg6gdg64g d6gdgdgd";
		ArrayList<Character> lccs=new ArrayList<Character>();
		ArrayList<Character> uccs=new ArrayList<Character>();
		ArrayList<Character> digits=new ArrayList<Character>();
		ArrayList<Character> scs=new ArrayList<Character>();
		for(int i=0;i<x.length();i++)
		{
			char c=x.charAt(i);
			if(c>=65 && c<=90)
			{
				uccs.add(c);
			}
			else if(c>=97 && c<=122)
			{
				lccs.add(c);
			}
			else if(c>=48 && c<=57)
			{
				digits.add(c);
			}
			else if(c!=' ')
			{
				scs.add(c);
			}
		}
		
		System.out.println("Count of upper case characters in given string is "+uccs.size());
		System.out.println("Count of lower case characters in given string is "+lccs.size());
		System.out.println("Count of digits in given string is "+digits.size());
		System.out.println("Count of special characters in given string is "+scs.size());
	}
}
