package collectionsinjava;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayStringSorting 
{
	public static void main(String[] args) throws Exception
	{
		//Declare dynamic array
		ArrayList<String> x=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dynamic array size");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter values to dynamic array");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter input"+(i+1));
			x.add(sc.nextLine());
		}
		//Sorting
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(x.get(j).compareToIgnoreCase(x.get(j+1))>0)
				{
					String temp=x.get(j);
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
