package stringclassmethods;

import java.util.ArrayList;
import java.util.Scanner;

public class JoinMethod 
{
	public static void main(String[] args) throws Exception
	{
		String x[]= {"My","name","is","khan"};
		String y="";
		y=y.join(" ",x);
		System.out.println(y);
		
		String p[]= {"My","name","is","khan"};
		String q=String.join(" ",p);		//Since join() is a static method
		System.out.println(q);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=Integer.parseInt(sc.nextLine());
		System.out.println("Enter "+size+" Strings into array");
		ArrayList<String> a=new ArrayList<String>();
		for(int i=0;i<size;i++)
		{
			a.add(sc.nextLine());
		}
		String d="";
		d=d.join(" ",a);
		System.out.println(d);
	}
}
