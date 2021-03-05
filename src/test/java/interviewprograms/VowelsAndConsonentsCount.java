package interviewprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsAndConsonentsCount
{
	public static void main(String[] args) throws Exception
	{
		String s="lGbi ewi wi74 wuhe 989w4i hisIH @#%Iu he9wih nf wushe8fn HuegNF";
		//Way 1(for Vowels)
		int vowels1=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
			{
				vowels1=vowels1+1;
			}
		}
		System.out.println("Count of vowels is "+vowels1);
		
		//Way 2(for Vowels)
		Pattern p1=Pattern.compile("[aAeEiIoOuU]");
		Matcher m1=p1.matcher(s);
		int vowels2=0;
		while(m1.find())
		{
			vowels2=vowels2+1;
		}
		System.out.println("Count of vowels is "+vowels2);
		
		//(for consonents)(Not efficient when special chars are present in string)
		Pattern p2=Pattern.compile("[^aAeEiIoOuU0-9 ]");
		Matcher m2=p2.matcher(s);
		int consonents=0;
		while(m2.find())
		{
			consonents=consonents+1;
		}
		System.out.println("Count of consonents is "+consonents);
		
		//Way 3(with ASCII)(Effective way to find vows and cons even there are spec chars)
		int lvows=0;
		int uvows=0;
		int lcons=0;
		int ucons=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>=97 && c<=122)
			{
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				{
					lvows=lvows+1;
				}
				else
				{
					lcons=lcons+1;
				}
			}
			else if(c>=65 && c<=90)
			{
				if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
				{
					uvows=uvows+1;
				}
				else
				{
					ucons=ucons+1;
				}
			}
		}
		System.out.println("No of vowels in a given string are "+(lvows+uvows));
		System.out.println("No of consonents in a given string are "+(lcons+ucons));
	}
}
