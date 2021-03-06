package interviewprograms;

public class ChukkaluKanipisthayi4 
{
	public static void main(String[] args) throws Exception
	{
		for(int i=1;i<=5;i++)
		{
			//for spaces
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			//for *'s
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
