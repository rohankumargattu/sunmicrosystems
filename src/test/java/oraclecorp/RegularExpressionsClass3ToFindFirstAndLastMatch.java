package oraclecorp;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsClass3ToFindFirstAndLastMatch 
{
	public static void main(String[] args) 
	{
		String x="dkfbk54 kdgkb7888 134 khiehk45 ffkvj 646ghhf446";
		Pattern p=Pattern.compile("[0-9]+");
		Matcher m=p.matcher(x);
		ArrayList<String> a=new ArrayList<String>();
		while(m.find())
		{
			String y=m.group();
			a.add(y);
		}
		int z=a.size();
		System.out.println(a.get(0));
		System.out.println(a.get(z-1));
	}
}
