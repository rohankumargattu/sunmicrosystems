package collectionsinjava;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollectionCRUD 
{
	public static void main(String[] args) throws Exception
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//Insert data to HashMap(C in CRUD)
		hm.put(101,"Manual");
		hm.put(102,"Selenium");
		hm.put(103,"Appium");
		hm.put(104,"Webservices");
		hm.put(105,"Database");
		
		//Retrieve data from HashMap(R in CRUD)
		//Using for each loop
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"--"+m.getValue());
		}
		System.out.println();
		//Retrieve specific value using key
		System.out.println(hm.get(102));
		
		System.out.println();
		
		//Update data from HashMap(U in CRUD)
		//update value of a key
		hm.replace(101,"Java");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"--"+m.getValue());
		}
		System.out.println();
		
		//update key using key
		hm.put(106,hm.remove(101));
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"--"+m.getValue());
		}
		System.out.println();
		
		//Delete data from HashMap(D in CRUD)
		hm.remove(106);
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"--"+m.getValue());
		}
		System.out.println();
		//Verify our required data in Hashmap(Using Key)
		if(hm.containsKey(106))
		{
			System.out.println("Exists");
		}
		else
		{
			System.out.println("Does not Exists");
		}
		
		//Verify our required data in Hashmap(Using Value)
		if(hm.containsValue("Appium"))
		{
			System.out.println("Exists");
		}
		else
		{
			System.out.println("Does not Exists");
		}
	}
}
