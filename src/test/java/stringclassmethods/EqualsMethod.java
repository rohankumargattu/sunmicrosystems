package stringclassmethods;

public class EqualsMethod 
{
	public static void main(String[] args) throws Exception
	{
		String x="Mindq";
		String y="mindq";
		if(x.equals(y))
		{
			System.out.println("Strings are exactly same");
		}
		else
		{
			System.out.println("Strings are not exactly same");
		}
	}
}
