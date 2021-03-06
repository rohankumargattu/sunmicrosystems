package interviewprograms;

public class ChukkaluKanipisthayi12 
{
	public static void main(String[] args) throws Exception
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print("+");
		}
		System.out.println();
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j==1 || j==10)
				{
					System.out.print("|");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=10;i++)
		{
			System.out.print("+");
		}
	}
}
