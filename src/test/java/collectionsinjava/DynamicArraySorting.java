package collectionsinjava;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArraySorting 
{
	public static void main(String[] args) throws Exception
	{
		//Declare dynamic array
		ArrayList<Integer> x=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dynamic array size");
		int n=sc.nextInt();
		System.out.println("Enter values to dynamic array");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter input"+(i+1));
			x.add(sc.nextInt());
		}
		//Sorting
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(x.get(j)>x.get(j+1))
				{
					int temp=x.get(j);
					x.set(j,x.get(j+1));
					x.set(j+1,temp);
				}
			}
		}
		//Sorted order
		System.out.println("Sorted order is");
		for(int i=0;i<n;i++)
		{
			System.out.print(x.get(i)+"\t");
		}		
	}
}
