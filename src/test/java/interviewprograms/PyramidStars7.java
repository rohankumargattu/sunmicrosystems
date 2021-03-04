package interviewprograms;

public class PyramidStars7
{
	public static void main(String[] args) throws Exception
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			for(int r=2;r<=i;r++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
