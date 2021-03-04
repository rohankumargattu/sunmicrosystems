package stringclassmethods;

public class EqualsIgnoreCaseMethod
{
	public static void main(String[] args) throws Exception
	{
		String x="Mindq";
		String y="mindq";
		if(x.equalsIgnoreCase(y))
		{
			System.out.println("Strings are same");
		}
		else
		{
			System.out.println("Strings are not same");
		}
	}
}
