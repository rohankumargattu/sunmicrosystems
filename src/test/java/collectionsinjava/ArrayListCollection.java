package collectionsinjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListCollection 
{
	public static void main(String[] args) throws Exception
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Manual");
		a1.add("Selenium");
		a1.add("Appium");
		a1.add("Java");
		a1.add("Frameworks");
		a1.add("Webservices");
		a1.add("Database");
		System.out.println("Specific indexed value retreival is "+a1.get(2));
		System.out.println();
		//Using For loop
		System.out.println("All values retrieval using index, using for loop");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println();
		//Using For each loop
		System.out.println("All values retrieval using for each loop");
		for(String e:a1)
		{
			System.out.println(e);
		}
		
		System.out.println();
		
		//Convert Set to ArrayList
		Set s=new HashSet();
		s.add("Manual");
		s.add("Selenium");
		s.add("Appium");
		s.add("Java");
		s.add("Frameworks");
		s.add("Webservices");
		s.add("Database");
		ArrayList<String> a2=new ArrayList<String>(s);
		System.out.println(a2.get(2));
	}
}
