package stringclassmethods;


public class SplitMethod 
{
	public static void main(String[] args) throws Exception
	{
		String x="My name is Khan";
		String y[]=x.split(" ");
		//String y[]=x.split("Reg exp");
		int z=y.length;
		System.out.println("Size of array is "+z);
		System.out.println("Data in array:");
		for(int i=0;i<z;i++)
		{
			System.out.println(y[i]+": Length is "+y[i].length());
		}
		/*for(String e:y)		//for each loop
		{
			System.out.println(e);
		}*/
	}
}
