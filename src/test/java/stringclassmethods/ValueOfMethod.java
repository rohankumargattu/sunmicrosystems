package stringclassmethods;

public class ValueOfMethod 
{
	public static void main(String[] args) throws Exception
	{
		//ValueOf method is used to convert any type of value to String type
		String a=String.valueOf('a');
		String b=String.valueOf(10);
		String c=String.valueOf(10.5);
		String d=String.valueOf(true);
		String e=String.valueOf(15475001.11565);
		String f=String.valueOf(1245546245);
		char[] ch={'r','o','h','a','n'};
		String g=String.valueOf(ch);
	}
}
