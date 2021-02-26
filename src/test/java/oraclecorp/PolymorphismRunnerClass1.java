package oraclecorp;

public class PolymorphismRunnerClass1
{
	public static void main(String[] args) throws Exception
	{
		PolymorphismClass obj=new PolymorphismClass();
		int o1=obj.add();
		System.out.println(o1);
		int o2=obj.add(54);
		System.out.println(o2);
		int o3=obj.add(78, 45);
		System.out.println(o3);
		int o4=obj.add(21, (int) 15.12);
		System.out.println(o4);
	}
}
