package interviewprograms;

public class ReverseEachWordInASentence 
{
	public static void main(String[] args) throws Exception
	{
		//Reverse each word in sentence sequence
		String s1="Manual Selenium Appium Java Frameworks Webservices Database";
		String[] sa1=s1.split(" ");
		for(int i=0;i<sa1.length;i++)
		{
			if(i!=0)
			{
				System.out.print(" ");
			}
			String x=sa1[i];
			String y="";
			for(int j=0;j<x.length();j++)
			{
				char c=x.charAt(j);
				y=c+y;
			}
			System.out.print(y);
		}
		
		System.out.println();
		
		//Reverse each word in by reversing sentence
		String s2="Manual Selenium Appium Java Frameworks Webservices Database";
		String[] sa2=s1.split(" ");
		for(int i=sa2.length-1;i>=0;i--)
		{
			if(i!=sa2.length-1)
			{
				System.out.print(" ");
			}
			String x=sa2[i];
			String y="";
			for(int j=0;j<x.length();j++)
			{
				char c=x.charAt(j);
				y=c+y;
			}
			System.out.print(y);
		}	
	}
}
