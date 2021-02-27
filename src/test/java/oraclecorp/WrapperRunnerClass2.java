package oraclecorp;

public class WrapperRunnerClass2
{
	public static void main(String[] args) throws Exception
	{
		Integer i1=new Integer(10);
		Integer i2=new Integer("20");
		System.out.println(i1+"  "+i2);
		
		Float f1=new Float(10.5);
		Float f2=new Float("20.5");
		System.out.println(f1+"  "+f2);
		
		Long l1=new Long(45368365);
		Long l2=new Long("455568536");
		System.out.println(l1+"  "+l2);
		
		Double d1=new Double(10.4578459);
		Double d2=new Double("20.4579745");
		System.out.println(d1+"  "+d2);
		
		Character c=new Character('a');
		System.out.println(c);
		
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean("false");
		System.out.println(b1+"  "+b2);
	}
}
