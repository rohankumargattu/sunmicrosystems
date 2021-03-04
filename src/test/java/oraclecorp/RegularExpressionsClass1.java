package oraclecorp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsClass1 
{
	public static void main(String[] args) throws Exception
	{
		String x="dkfbk54 kdgkb7888 134 khiehk45 ffkvj 646ghhf446";
		Pattern p=Pattern.compile("[0-9]+");
		Matcher m=p.matcher(x);
		while(m.find())
		{
			String y=m.group();
			System.out.println(y);
		}
	}
}
