package stringclassmethods;

public class ReplaceMethod
{
	public static void main(String[] args) throws Exception
	{
		String x="rama";
		String y=x.replace("a", "k");
		System.out.println(y);
		
		String g="rama";
		String h=g.replace('a', 'k');
		System.out.println(h);
		
		String p="rama";
		String q=p.replace("am", "k");
		System.out.println(q);
		
		String d="dhoni is a cricketer. dhoni is dhoni. dhoni is not rohit";
		String e=d.replaceAll("dhoni", "virat");
		System.out.println(e);
		
		String m="dhoni is a cricketer. dhoni is not football player. dhoni is not rohit sharma";
		String n=m.replace("dhoni", "he");
		String o=n.replaceFirst("he", "dhoni");
		System.out.println(o);
		
		String i="27,48,768.30";
		String j=i.replace(",", "");
		double k=Double.parseDouble(j);
		System.out.println(j);
		String l1=j.substring(0,7);
		int l2=Integer.parseInt(l1);
		System.out.println(l2);
	}
}
