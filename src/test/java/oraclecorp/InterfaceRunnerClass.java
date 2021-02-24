package oraclecorp;

public class InterfaceRunnerClass 
{
	public static void main(String[] args) throws Exception
	{
		//Object creation to interface
		InterfaceName obj1=new InterfaceConcreteClass();
		System.out.println("Two step process results:");
		int addition1=obj1.add(10, 20);
		System.out.println("Result of addition is "+addition1);
		int subtraction1=obj1.subtract(20, 5);
		System.out.println("Result of subtraction is "+subtraction1);
		int multiplication1=obj1.multiply(10, 5);
		System.out.println("Result of multiplication is "+multiplication1);
		int division1=obj1.divide(50, 5);
		System.out.println("Result of division is "+division1);
		
		//Object creation directly to concrete class to Interface
		InterfaceConcreteClass obj2=new InterfaceConcreteClass();
		System.out.println("One step process results:");
		int addition2=obj2.add(10, 20);
		System.out.println("Result of addition is "+addition2);
		int subtraction2=obj2.subtract(20, 5);
		System.out.println("Result of subtraction is "+subtraction2);
		int multiplication2=obj2.multiply(10, 5);
		System.out.println("Result of multiplication is "+multiplication2);
		int division2=obj2.divide(50, 5);
		System.out.println("Result of division is "+division2);
	}
}
