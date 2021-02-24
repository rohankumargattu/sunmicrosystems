package oraclecorp;

public class AbstractRunnerClass 
{
	public static void main(String[] args) throws Exception
	{
		//Object creation to Abstract class
		AbstractClassName obj1=new AbstractConcreteClass();
		System.out.println("Two step process results:");
		int addition1=obj1.add(10, 20);
		System.out.println("Result of addition is "+addition1);
		int subtraction1=obj1.subtract(20, 5);
		System.out.println("Result of subtraction is "+subtraction1);
		
		//Object creation directly to concrete class of Abstract class
		AbstractConcreteClass obj2=new AbstractConcreteClass();
		System.out.println("One step process results:");
		int addition2=obj2.add(10, 20);
		System.out.println("Result of addition is "+addition2);
		int multiplication2=obj2.multiply(10, 5);
		System.out.println("Result of multiplication is "+multiplication2);
		int subtraction2=obj2.subtract(20, 5);
		System.out.println("Result of subtraction is "+subtraction2);
	}
}
