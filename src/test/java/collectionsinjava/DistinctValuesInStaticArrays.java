package collectionsinjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistinctValuesInStaticArrays
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
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<x.length;i++)
		{
			int ai=x[i];
			if(!hm.containsKey(ai))
			{
				hm.put(ai,1);
			}
		}
		for(Map.Entry e:hm.entrySet())
		{
			System.out.println(e.getKey()+"--"+e.getValue());
		}
	}
}
