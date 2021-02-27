package operatorsinjava;

public class OperatorOverLoading
{
	public static void main(String[] args) throws Exception
	{
		int x1=15;
		int x2=25;
		char c1='p';
		char c2='q';
		String s1="nageswararao";
		String s2="mindq";
		boolean b=true;
		
		
		//number and number
		int r1=x1+x2;	//Addition
		System.out.println(r1);
		
		//number and char
		int r2=x1+c1;	//Addition
		System.out.println(r2);
		
		//number and boolean or //char and boolean or //boolean and boolean
		//If both/any of the variable is boolean(other variable excluding String) "+" operator cannot work
		
		//char and char
		int r3=c1+c2;	//Addition
		System.out.println(r3);
		
		//String and String
		String r4=s1+s2;	//Concatenation
		System.out.println(r4);
		
		//String and number
		String r5=s1+x1;	//Concatenation
		System.out.println(r5);
		
		//String and char
		String r6=s1+c1;	//Concatenation
		System.out.println(r6);
		
		//String and boolean
		String r7=s1+b;		//Concatenation
		System.out.println(r7);
	}
}
