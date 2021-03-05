package interviewprograms;

import java.util.HashMap;
import java.util.Map;

public class NoOfOccurancesOfWords
{
	public static void main(String[] args) throws Exception
	{
		//Specific word in a given string(No of occurrences)
		String s1="she sells sea shells on the sea shore she sells sea shells on the sea shore";
		String sw1="sea";
		String[] sa1=s1.split(" ");
		int count1=0;
		for(int i=0;i<sa1.length;i++)
		{
			if(sa1[i].equals(sw1))
			{
				count1++;
			}
		}
		System.out.println(count1);
		
		//Each word in a given string(No of occurrences)
		String s2="edu erra lorylu padi pacha lorylu nalugu nalla lorylu";
		String[] sa2=s2.split(" ");
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<sa2.length;i++)
		{
			String aw=sa2[i];
			if(i==0)
			{
				hm.put(aw,1);
			}
			else
			{
				if(hm.containsKey(aw))
				{
					hm.replace(aw,hm.get(aw)+1);
				}
				else
				{
					hm.put(aw,1);
				}
			}
		}
		for(Map.Entry e:hm.entrySet())
		{
			System.out.println(e.getKey()+"--"+e.getValue());
		}
	}
}
