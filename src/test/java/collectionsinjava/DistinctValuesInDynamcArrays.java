package collectionsinjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistinctValuesInDynamcArrays
{
	public static void main(String[] args) throws Exception
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
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.size();i++)
		{
			int ai=a.get(i);
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
