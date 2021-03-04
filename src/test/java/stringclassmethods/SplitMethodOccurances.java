package stringclassmethods;

import java.util.Scanner;

public class SplitMethodOccurances
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter main String");
		String x=sc.nextLine();
		System.out.println("Enter Substring");
		String y=sc.nextLine();
		int noo=0;
		String[] p=x.split(" ");
		//String[] p=x.split("Reg exp");
		for(int i=0;i<p.length;i++)
		{
			if(p[i].equalsIgnoreCase(y))
			{
				noo=noo+1;
			}
		}
		System.out.println(noo);
	}
}
