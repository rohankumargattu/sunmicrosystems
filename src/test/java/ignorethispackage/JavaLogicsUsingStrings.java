package ignorethispackage;

public class JavaLogicsUsingStrings
{
	public static void main(String[] args) throws Exception
	{
		//Remove Vowels from a given string(Logic 1)
		//Take string in lower case
		String s="rohan";
		String y="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u')
			{
				y=y+s.charAt(i);
			}
			else
			{
				continue;
			}
		}
		System.out.println(y);
		
		//Remove Vowels from a given string(Logic 2)
		//Take string in lower case
        String st="kumar";
        char ch[]=st.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
               if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
               {
            	   ch[i]='$'; //replacing $ in the place of vowels
               }   
        }
        for (int i=0;i<ch.length;i++) 
        {
            System.out.print(ch[i]);
        }
        System.out.println();
        
        //Remove Vowels from a given string(Logic 3)
		//Take string in any case(Using regular expressions)
        String x="suchindra";
        //String x="SUCHINDRA";
        //String x="SuchIndra";
	    System.out.println("Given string: "+x);
	    x=x.replaceAll("[AaEeIiOoUu]","");
	    System.out.println("After deleting vowels in given a string: "+x);
		
		//Reverse a string
		String s1="suchindra";
		String y1="";
		for(int i=0;i<s1.length();i++)
		{
			y1=s1.charAt(i)+y1;
		}
		System.out.println(y1);
		
		//Total sentence Reverse1(char by char reversing)
		String s3="suchindra is a good boy";
		String z3="";
		for(int i=0;i<s3.length();i++)
		{
			z3=s3.charAt(i)+z3;
		}
		System.out.print(z3);	
		
		System.out.println();
		
		//Total sentence Reverse2(word by word reversing)
		String s2="suchindra is a good boy";
		String[] y2=s2.split(" ");
		String z2="";
		for(int i=0;i<y2.length;i++)
		{
			for(int j=0;j<y2[i].length();j++)
			{
				z2=y2[i].charAt(j)+z2;
			}
			if(i==y2.length-1)
			{
				break;
			}
			else
			{
				z2=" "+z2;
			}
		}
		System.out.print(z2);
		
		System.out.println();
		
		//Reverse words in a same order of sentence
		String s4="suchindra is a good boy";
		String[] y4=s4.split(" ");
		String z4="";
		for(int i=0;i<y4.length;i++)
		{
			for(int j=0;j<y4[i].length();j++)
			{
				z4=y4[i].charAt(j)+z4;
			}
			if(i==y4.length-1)
			{
				System.out.print(z4);
				break;
			}
			else
			{
				z4=z4+" ";
				System.out.print(z4);
			}
			z4="";
		}
		
		System.out.println();
		
		//Count of vowels and consonents in a given lower case word
		String s5="rohan";
		int consonents=0;
		int vowels=0;
		for(int i=0;i<s5.length();i++)
		{
			if(s5.charAt(i)!='a' && s5.charAt(i)!='e' && s5.charAt(i)!='i' && s5.charAt(i)!='o' && s5.charAt(i)!='u')
			{
				consonents++;
			}
			else
			{
				vowels++;
			}
		}
		System.out.println("Total no of consonents are "+consonents);
		System.out.println("Total no of vowels are "+vowels);
	}
}
