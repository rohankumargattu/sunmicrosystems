package collectionsinjava;

import java.util.Scanner;

public class StaticArraysSorting2 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of static array");
		int size=sc.nextInt();
		System.out.println("Enter "+size+" numbers");
		int x[]=new int[size];
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length-1;j++)
			{
				if(x[j]>x[j+1])
				{
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted order is");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+"\t");
		}
		System.out.println();
		//Second least value
		for(int i=0;i<x.length-1;i++)
		{
			if(x[i]!=x[i+1])
			{
				System.out.println("Second Least values in the array is "+x[i+1]);
				break;
			}
		}
		//Second highest value
		for(int i=x.length-1;i>0;i--)
		{
			if(x[i]!=x[i-1])
			{
				System.out.println("Second Highest values in the array is "+x[i-1]);
				break;
			}
		}
	}
}
