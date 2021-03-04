package stringclassmethods;

public class ToUpperToLowerTrimMethods 
{
	public static void main(String[] args) throws Exception
	{
		String x="  Nageswara RAO  ";
		x=x.toLowerCase();
		System.out.println("Lower case word is "+x);
		x=x.toUpperCase();
		System.out.println("Upper case word is "+x);
		x=x.trim();
		System.out.println("Trimmed word is "+x);
	}
}
