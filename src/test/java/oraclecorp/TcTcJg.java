package oraclecorp;

public class TcTcJg
{
	public static void main(String[] args) throws Exception
	{
		/* 
		1. (byte,short,int,long,float,double) all are compatible type, depending on target type and source type
		   Automatic Type casting and Explicit Type casting takes place.
		2. (byte,short,int,long,float,double) can type cast to 'char'(ASCII Equivalents), depending on target
		   type and source type Automatic Type casting and Explicit Type casting takes place.
		3. primitive <--> derived datatypes are not possible for TYPE CASTING
		4. derived(String) --> primitive datatypes(except 'char','boolean') are possible for TYPE CONVERSION
		   if there is a Possibility(depending on Value/Structure/Format)
		5. Using class name as Type is JAVA GENERIC
		6. GENERIC is mentioned in '< >'
		*/
		
		
		//TYPE CASTING
		int x=10;
		float y=x;		//Automatic Type Casting(Target type is equal to source type) & COMPATIBLE TYPES
		System.out.println(y);
		
		int g=155;
		long d=g;		//Automatic Type Casting(Target type is larger than source type) & COMPATIBLE TYPES
		System.out.println(d);
		
		int e=155;
		double f=e;		//Automatic(implicit) Type Casting(Target type is larger than source type) & COMPATIBLE TYPES
		System.out.println(f);
		
		int a1=10;
		byte bb1=(byte) a1;		//Explicit Type Casting & COMPATIBLE TYPES
		System.out.println(bb1);
		
		int a2=10;
		short ss1=(short) a2;		//Explicit Type Casting & COMPATIBLE TYPES
		System.out.println(ss1);
		
		float a=(float) 10.5;
		int b=(int) a;			//Explicit Type Casting & COMPATIBLE TYPES
		System.out.println(b);
		
		long g1=1565466465;
		int d1=(int) g1;		//Explicit Type Casting & COMPATIBLE TYPES
		System.out.println(d1);
		
		double e1=15.64544646;
		int f1=(int) e1;		//Explicit Type Casting & COMPATIBLE TYPES
		System.out.println(f1);
		
		char c='a';	
		int i=c;			//ASCII Equivalent(Automatic Type Casting). Similar for long,float,double
		System.out.println(i);		
		
		char c1='A';	
		short i1=(short) c1;		//ASCII Equivalent(Explicit Type Casting).Similar for byte
		System.out.println(i1);
		
		
		
		/*String s="mindq";
		int p=s;*/		//premitive <--> derived datatypes are not possible for Type Casting
		
		/*int d=15;
		String t=d;*/		//premitive <--> derived datatypes are not possible for Type Casting
		
		//TYPE CONVERSION
		String z="123";
		int w=Integer.parseInt(z);
		System.out.println(w);		//As there is a Possibility(depending on Value/Structure/Format)
		
		//JAVA GENERICS
		/*
		List<WebElement> l=driver.findElements(locator);
		ArrayList<String> a=new ArrayList<String>();	 
		*/
	}
}
