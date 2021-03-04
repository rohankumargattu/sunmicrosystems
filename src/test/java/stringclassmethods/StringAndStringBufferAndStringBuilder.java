package stringclassmethods;

public class StringAndStringBufferAndStringBuilder 
{
	public static void main(String[] args) throws Exception
	{
		//Using String class
		String s=new String("a");
		long sst=System.currentTimeMillis();
		for(int i=0;i<=10000;i++)
		{
			s=s+"a";
		}
		long set=System.currentTimeMillis();
		System.out.println("String took "+(set-sst)+" milliseconds");
		
		//Using StringBuffer
		StringBuffer sbf=new StringBuffer("a");
		long sbfst=System.currentTimeMillis();
		for(int i=0;i<=10000;i++)
		{
			sbf.append("a");
		}
		long sbfet=System.currentTimeMillis();
		System.out.println("StringBuffer took "+(sbfet-sbfst)+" milliseconds");
		
		//StringBuilder
		StringBuilder sbd=new StringBuilder("a");
		long sbdst=System.currentTimeMillis();
		for(int i=0;i<=10000;i++)
		{
			sbd.append("a");
		}
		long sbdet=System.currentTimeMillis();
		System.out.println("StringBuilder took "+(sbdet-sbdst)+" milliseconds");
	}
}
