package collectionsinjava;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrays 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Let me know how many values will you add to array");
		int size=sc.nextInt();
		System.out.println("Enter "+size+" numbers");
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<size;i++)
		{
			a.add(sc.nextInt());
		}
		System.out.println();
		a.add(6);
		a.add(10);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
}
