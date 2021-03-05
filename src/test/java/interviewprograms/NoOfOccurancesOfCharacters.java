package interviewprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoOfOccurancesOfCharacters
{
	public static void main(String[] args) throws Exception
	{
		//Specific character in a given string(No of occurrences)
		//Way 1
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character to search its no of occurrences in the given string");
		char c=sc.nextLine().charAt(0);
		String s1="she sells sea shells on the sea shore she sells sea shells on the sea shore";
		int count1=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch==c)
			{
				count1++;
			}
		}
		System.out.println("No of times "+c+" occurred is "+count1);
		
		//Way 2
		Pattern p=Pattern.compile("["+c+"]");
		Matcher m=p.matcher(s1);
		int count2=0;
		while(m.find())
		{
			count2++;
		}
		System.out.println("No of times "+c+" occurred is "+count2);
		
		//Way 3(without loop)
		int a=s1.length();
		String str=s1.replace(""+c+"","");
		int b=str.length();
		System.out.println("No of times "+c+" occurred is "+(a-b));
		
		//Each character in a given string(No of occurrences)
		String s2="edu erra lorylu padi pacha lorylu nalugu nalla lorylu";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(i==0)
			{
				hm.put(ch,1);
			}
			else
			{
				if(hm.containsKey(ch))
				{
					hm.replace(ch,hm.get(ch)+1);
				}
				else
				{
					hm.put(ch,1);
				}
			}
		}
		for(Map.Entry e:hm.entrySet())
		{
			System.out.println(e.getKey()+"--"+e.getValue());
		}
	}
}
