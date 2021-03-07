package collectionsinjava;

import java.util.ArrayList;

public class DynamicArraysCRUD
{
	public static void main(String[] args) throws Exception
	{
		ArrayList<String> a=new ArrayList<String>();
		
		//Insert data to Dynamic array(C in CRUD)
		a.add("Manual");
		a.add("Selenium");
		a.add("Webservices");
		a.add("Database");
		a.add("SOAPUI");
		
		//Retrieve data from Dynamic array(R in CRUD)
		for(int i=0;i<a.size();i++)
		{
			System.out.print(a.get(i)+"   ");
		}
		
		System.out.println();
		
		//Update data from Dynamic array(U in CRUD)
		a.set(0,"Appium");
		for(int i=0;i<a.size();i++)
		{
			System.out.print(a.get(i)+"   ");
		}
		
		System.out.println();
		
		//Delete data from Dynamic array(D in CRUD)
		a.remove(4);
		for(int i=0;i<a.size();i++)
		{
			System.out.print(a.get(i)+"   ");
		}	
	}
}
