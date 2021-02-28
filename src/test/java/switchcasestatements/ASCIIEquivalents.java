package switchcasestatements;

import java.util.Scanner;

public class ASCIIEquivalents
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a letter from keyboard to get its ASCII Equivalent");
		String l=sc.nextLine();
		if(l.length()>1)
		{
			System.out.println("Please enter only 1 variable/value");
		}
		else
		{
			char x=l.charAt(0);
			switch(x)
			{
				case '0':
					System.out.println("ASCII Equivalent is 48");
					break;
				case '1':
					System.out.println("ASCII Equivalent is 49");
					break;
				case '2':
					System.out.println("ASCII Equivalent is 50");
					break;
				case '3':
					System.out.println("ASCII Equivalent is 51");
					break;
				case '4':
					System.out.println("ASCII Equivalent is 52");
					break;
				case '5':
					System.out.println("ASCII Equivalent is 53");
					break;
				case '6':
					System.out.println("ASCII Equivalent is 54");
					break;
				case '7':
					System.out.println("ASCII Equivalent is 55");
					break;
				case '8':
					System.out.println("ASCII Equivalent is 56");
					break;
				case '9':
					System.out.println("ASCII Equivalent is 57");
					break;
				case 'A':
					System.out.print("ASCII Equivalent is 65");
					break;
				case 'B':
					System.out.print("ASCII Equivalent is 66");
					break;
				case 'C':
					System.out.print("ASCII Equivalent is 67");
					break;
				case 'D':
					System.out.print("ASCII Equivalent is 68");
					break;
				case 'E':
					System.out.print("ASCII Equivalent is 69");
					break;
				case 'F':
					System.out.print("ASCII Equivalent is 70");
					break;
				case 'G':
					System.out.print("ASCII Equivalent is 71");
					break;
				case 'H':
					System.out.print("ASCII Equivalent is 72");
					break;
				case 'I':
					System.out.print("ASCII Equivalent is 73");
					break;
				case 'J':
					System.out.print("ASCII Equivalent is 74");
					break;
				case 'K':
					System.out.print("ASCII Equivalent is 75");
					break;
				case 'L':
					System.out.print("ASCII Equivalent is 76");
					break;
				case 'M':
					System.out.print("ASCII Equivalent is 77");
					break;
				case 'N':
					System.out.print("ASCII Equivalent is 78");
					break;
				case 'O':
					System.out.print("ASCII Equivalent is 79");
					break;
				case 'P':
					System.out.print("ASCII Equivalent is 80");
					break;
				case 'Q':
					System.out.print("ASCII Equivalent is 81");
					break;
				case 'R':
					System.out.print("ASCII Equivalent is 82");
					break;
				case 'S':
					System.out.print("ASCII Equivalent is 83");
					break;
				case 'T':
					System.out.print("ASCII Equivalent is 84");
					break;
				case 'U':
					System.out.print("ASCII Equivalent is 85");
					break;
				case 'V':
					System.out.print("ASCII Equivalent is 86");
					break;
				case 'W':
					System.out.print("ASCII Equivalent is 87");
					break;
				case 'X':
					System.out.print("ASCII Equivalent is 88");
					break;
				case 'Y':
					System.out.print("ASCII Equivalent is 89");
					break;
				case 'Z':
					System.out.print("ASCII Equivalent is 90");
					break;
				case 'a':
					System.out.print("ASCII Equivalent is 97");
					break;
				case 'b':
					System.out.print("ASCII Equivalent is 98");
					break;
				case 'c':
					System.out.print("ASCII Equivalent is 99");
					break;
				case 'd':
					System.out.print("ASCII Equivalent is 100");
					break;
				case 'e':
					System.out.print("ASCII Equivalent is 101");
					break;
				case 'f':
					System.out.print("ASCII Equivalent is 102");
					break;
				case 'g':
					System.out.print("ASCII Equivalent is 103");
					break;
				case 'h':
					System.out.print("ASCII Equivalent is 104");
					break;
				case 'i':
					System.out.print("ASCII Equivalent is 105");
					break;
				case 'j':
					System.out.print("ASCII Equivalent is 106");
					break;
				case 'k':
					System.out.print("ASCII Equivalent is 107");
					break;
				case 'l':
					System.out.print("ASCII Equivalent is 108");
					break;
				case 'm':
					System.out.print("ASCII Equivalent is 109");
					break;
				case 'n':
					System.out.print("ASCII Equivalent is 110");
					break;
				case 'o':
					System.out.print("ASCII Equivalent is 111");
					break;
				case 'p':
					System.out.print("ASCII Equivalent is 112");
					break;
				case 'q':
					System.out.print("ASCII Equivalent is 113");
					break;
				case 'r':
					System.out.print("ASCII Equivalent is 114");
					break;
				case 's':
					System.out.print("ASCII Equivalent is 115");
					break;
				case 't':
					System.out.print("ASCII Equivalent is 116");
					break;
				case 'u':
					System.out.print("ASCII Equivalent is 117");
					break;
				case 'v':
					System.out.print("ASCII Equivalent is 118");
					break;
				case 'w':
					System.out.print("ASCII Equivalent is 119");
					break;
				case 'x':
					System.out.print("ASCII Equivalent is 120");
					break;
				case 'y':
					System.out.print("ASCII Equivalent is 121");
					break;
				case 'z':
					System.out.print("ASCII Equivalent is 122");
					break;
				default:
					System.out.print("It is a Special Character");
					break;		//Optional(as "default:" is last statement)
			}
		}	
	}
}
