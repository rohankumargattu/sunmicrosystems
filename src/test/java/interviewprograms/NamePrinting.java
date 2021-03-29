package interviewprograms;

public class NamePrinting 
{
	public static void main(String[] args) throws Exception
	{
		String x="Priyanka Tummalapalla";
		for(int i=0;i<x.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(x.charAt(j));
			}
			System.out.println();
		}
	}
}
