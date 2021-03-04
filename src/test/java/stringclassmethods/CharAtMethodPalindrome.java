package stringclassmethods;

import java.util.Scanner;

public class CharAtMethodPalindrome
{
	public static void main(String[] args) throws Exception
	{
		//Take a word from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String x=sc.nextLine();
		String y="";
		for(int i=x.length()-1;i>=0;i--)
		{
			char z=x.charAt(i);
			y=y+z;
		}
		System.out.println("Reversed String is \""+y+"\"");
		//Validations
		if(x.equals(y))
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}
}
