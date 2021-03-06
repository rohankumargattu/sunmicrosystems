package interviewprograms;

public class ChukkaluKanipisthayi5 
{
	public static void main(String[] args) throws Exception
	{
		for(int i=1;i<=5;i++)
		{
			//for spaces
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			//for *'s
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
