package loopsinjava;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1111
{
	public static void main(String[] args)
	{
		String x="jsblj kSHkbk hkdbk 4wn5kwkkbw wih 4iwh4h wr4rkj";
		Pattern p=Pattern.compile("[a-zA-Z0-9]+");
		Matcher m=p.matcher(x);
		while(m.find())
		{
			if(m.group().startsWith("w"))
			{
				System.out.println(m.group());
			}
		}
		
		/*String[] words=x.split(" ");
		int wsw=0;
		for(int i=0;i<words.length;i++)
		{
			String aw=words[i];
			if(aw.charAt(0)=='w')
			{
				wsw=wsw+1;
			}
		}
		System.out.println("Words starting with w are "+wsw);*/
		
		
		/*ArrayList<String> words=new ArrayList<String>();
		String word="";
		for(int i=0;i<x.length();i++)
		{
			char c=x.charAt(i);
			if(c==' ')
			{
				words.add(word);
				word="";
			}
			else
			{
				word=word+c;
				if(i==x.length()-1)
				{
					words.add(word);
				}
			}
		}
		System.out.println("No of words in the given string are "+words.size());
		int wsw=0;
		for(int i=0;i<words.size();i++)
		{
			String aw=words.get(i);
			if(aw.charAt(0)=='w')
			{
				wsw=wsw+1;
			}
		}
		System.out.println("Words starting with w are "+wsw);*/
	}
}
