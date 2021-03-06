package interviewprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumberUnderLimit
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit");
		int limit=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=1;i<=limit;i++)
		{
			int temp1=i;
			int temp2=0;
			int nod=String.valueOf(temp1).length();
			while(temp1!=0)
			{
				temp2=(int) (temp2+Math.pow(temp1%10, nod));
				temp1=temp1/10;
			}
			if(i==temp2)
			{
				a.add(temp2);
			}	
		}
		System.out.println("There are "+a.size()+" armstrong numbers under the given limit of "+limit);
		for(int j=0;j<a.size();j++)
		{
			System.out.print(a.get(j)+"\t");
		}
	}
}
