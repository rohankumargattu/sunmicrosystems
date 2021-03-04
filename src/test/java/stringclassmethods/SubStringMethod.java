package stringclassmethods;

public class SubStringMethod
{
	public static void main(String[] args) throws Exception
	{
		String x="My name is Khan";
		String y=x.substring(11);
		System.out.println(y);
		String z=x.substring(3,7);
		System.out.println(z);
		
		String a="Rs:76.45/-";
		String b=a.substring(3, a.length()-2);
		System.out.println(b);
		
		String p="$7549";
		String q=p.substring(1);
		System.out.println(q);
	}
}
