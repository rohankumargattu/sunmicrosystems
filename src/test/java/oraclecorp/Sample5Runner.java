package oraclecorp;

public class Sample5Runner
{
	public static void main(String[] args) throws Exception
	{
		Sample5 obj1=new Sample5();
		obj1.display();
		Sample5 obj2=new Sample5(25);
		obj2.display();
		Sample5 obj3=new Sample5("nageswararao");
		obj3.display();
		Sample5 obj4=new Sample5((float)20.123);
		obj4.display();
		Sample5 obj5=new Sample5(22,"PNR");
		obj5.display();
	}
}
