package collectionsinjava;

import java.util.ArrayList;

public class DynamicArrayUpdating
{
	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Appium");
		a.add("Manual");
		a.add("Selenium");
		for(String s:a)
		{
			System.out.println(s);
		}
		a.set(1,"Webservices");
		for(String s:a)
		{
			System.out.println(s);
		}
	}
}
