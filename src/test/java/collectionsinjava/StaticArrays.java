package collectionsinjava;

import java.util.Scanner;

public class StaticArrays 
{
	public static void main(String[] args) throws Exception
	{
		//Way 1
		int y[]= {10,20,50,80};
		//display using for loop or for each loop
		
		//Way 2
		int z[]=new int[]{50,75,45,95};
		//display using for loop or for each loop
		
		//Way 3
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of static array");
		int size=sc.nextInt();
		System.out.println("Enter "+size+" numbers");
		int x[]=new int[size];
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
				
		//way 4
		int[] i=new int[3];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		//i[3]=40;	//Cannot accept
		System.out.println(i.length);
	}
}
