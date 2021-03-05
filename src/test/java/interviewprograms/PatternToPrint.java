package interviewprograms;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternToPrint 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a pattern as numchar for example: 1a2b3c");
		String s=sc.nextLine();
		Pattern p1=Pattern.compile("[0-9]+");
		Matcher m1=p1.matcher(s);
		Pattern p2=Pattern.compile("[a-z]+");
		Matcher m2=p2.matcher(s);
		ArrayList<Integer> count=new ArrayList<Integer>();
		ArrayList<String> str=new ArrayList<String>();
		while(m1.find())
		{
			count.add(Integer.parseInt(m1.group()));
		}
		while(m2.find())
		{
			str.add(m2.group());
		}
		for(int i=0;i<count.size();i++)
		{
			int notimes=count.get(i);
			for(int j=0;j<notimes;j++)
			{
				System.out.print(str.get(i));
			}
		}
	}
}
