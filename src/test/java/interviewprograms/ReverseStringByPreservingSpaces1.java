package interviewprograms;

public class ReverseStringByPreservingSpaces1
{
	public static void main(String[] args) throws Exception
	{
		String s1="Manual Selenium Appium Java Frameworks Webservices Database";
		//String s4="ManualSeleniumAppiumJavaFrameworksWebservicesDatabase";
		//String s3="esabat adsecivr esbews krow emarfavajm uippamuinel eslaunam";
		String s2=s1.replace(" ","");
		String y="";
		int j=1;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c!=' ')
			{
				y=y+s2.charAt(s2.length()-j);
				j++;
			}
			else
			{
				y=y+" ";
			}
		}
		System.out.println(s1);
		System.out.println(y);
	}
}
