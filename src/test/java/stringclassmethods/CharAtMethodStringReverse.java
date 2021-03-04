package stringclassmethods;

import java.util.Scanner;

public class CharAtMethodStringReverse
{
	public static void main(String[] args) throws Exception
	{
		//Take a word from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String x=sc.nextLine();
		sc.close();
		String y="";
		for(int i=x.length()-1;i>=0;i--)
		{
			char z=x.charAt(i);
			y=y+z;
		}
		System.out.println("Reversed String is \""+y+"\"");
		
		//Alternative looping
		/*String s="rohan";
		String z="";
		for(int i=1;i<=s.length();i++)
		{
			char b=s.charAt(s.length()-i);
			z=z+b;
		}
		System.out.println(z);*/
		
		//Way 1(Using for loop)
		String y1="";
		for(int i=0;i<x.length();i++)
		{
			char c=x.charAt(i);
			y1=c+y1;
		}
		System.out.println(y1);
		
		//Way 2
		String y2="";
		for(int i=x.length()-1;i>=0;i--)
		{
			char c=x.charAt(i);
			y2=y2+c;
		}
		System.out.println(y2);
		
		//Way 3(same as Way1 but Using for each loop)
		char[] x3ca=x.toCharArray();
		String y3="";
		for(char c:x3ca)
		{
			y3=c+y3;
		}
		System.out.println(y3);
		
		//Way 4
		String y4="";
		int i=0;
		do
		{
			char c=x.charAt(i);
			y4=c+y4;
			if(y4.length()<x.length())
			{
				i++;
			}
		}while(y4.length()<x.length());
		System.out.println(y4);
	}
}
