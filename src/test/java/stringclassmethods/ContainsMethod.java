package stringclassmethods;

public class ContainsMethod 
{
	public static void main(String[] args) throws Exception
	{
		String x="nageswararao";
		String y="rao";
		if(x.contains(y))
		{
			System.out.println("\""+x+"\""+" contains "+"\""+y+"\"");
		}
		else
		{
			System.out.println("\""+x+"\""+" does not contains "+"\""+y+"\"");
		}
	}
}
