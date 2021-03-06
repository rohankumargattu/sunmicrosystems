package interviewprograms;

public class ReverseNumber1 
{
	public static void main(String[] args) throws Exception
	{
		//Reversing an integer by converting into string
		int x=1231646;
		String y=String.valueOf(x);
		String z="";
		for(int i=0;i<y.length();i++)
		{
			char c=y.charAt(i);
			z=c+z;
		}
		int xr=Integer.parseInt(z);
		System.out.println(x);
		System.out.println(xr);
		
		//Using StringBuilder(direct method)
		StringBuilder sbd=new StringBuilder(y);
		System.out.println(sbd.reverse());
	}
}
