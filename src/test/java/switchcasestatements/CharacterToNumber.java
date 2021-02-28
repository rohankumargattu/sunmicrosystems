package switchcasestatements;

import java.util.Scanner;

public class CharacterToNumber 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an alphabet");
		String l=sc.nextLine();
		char x=l.charAt(0);
		switch(x)
		{
			case 'a':
				System.out.println("1");
				break;
			case 'b':
				System.out.println("2");
				break;
			case 'c':
				System.out.println("3");
				break;
			case 'd':
				System.out.println("4");
				break;
			case 'e':
				System.out.println("5");
				break;
			case 'f':
				System.out.println("6");
				break;
			case 'g':
				System.out.println("7");
				break;
			case 'h':
				System.out.println("8");
				break;
			case 'i':
				System.out.println("9");
				break;
			case 'j':
				System.out.println("10");
				break;
			case 'k':
				System.out.println("11");
				break;
			case 'l':
				System.out.println("12");
				break;
			case 'm':
				System.out.println("13");
				break;
			case 'n':
				System.out.println("14");
				break;
			case 'o':
				System.out.println("15");
				break;
			case 'p':
				System.out.println("16");
				break;
			case 'q':
				System.out.println("17");
				break;
			case 'r':
				System.out.println("18");
				break;
			case 's':
				System.out.println("19");
				break;
			case 't':
				System.out.println("20");
				break;
			case 'u':
				System.out.println("21");
				break;
			case 'v':
				System.out.println("22");
				break;
			case 'w':
				System.out.println("23");
				break;
			case 'x':
				System.out.println("24");
				break;
			case 'y':
				System.out.println("25");
				break;
			case 'z':
				System.out.println("26");
				break;
			default:
				System.out.println("Not an Alphabet");
				break;		//Optional(as "default:" is last statement)
		}
	}
}
