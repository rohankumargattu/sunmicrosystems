package oraclecorp;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsToFind3letteredWordWordStartingWithSpecificCharacter
{
	public static void main(String[] args)
	{
		String x="jsblj kSHkbk hkdbk 4wn5kwkkbw wih 4iwh4h wr4rkj sjdgljgiwb dAbkS kHs Hhckiz vdb";
		//Words with length 3
		System.out.println("Words with length 3 are:");
		Pattern p1=Pattern.compile("[a-zA-Z0-9]+");
		Matcher m1=p1.matcher(x);
		while(m1.find())
		{
			if(m1.group().length()==3)
			{
				System.out.println(m1.group());
			}
		}
		
		System.out.println();
		
		//Words starting with "w"
		System.out.println("Words starting with w are:");
		Pattern p2=Pattern.compile("[a-zA-Z0-9]+");
		Matcher m2=p2.matcher(x);
		while(m2.find())
		{
			if(m2.group().startsWith("w"))
			{
				System.out.println(m2.group());
			}
		}
	}
}
