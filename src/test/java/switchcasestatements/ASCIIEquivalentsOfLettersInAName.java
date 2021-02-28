package switchcasestatements;

import java.util.Scanner;

public class ASCIIEquivalentsOfLettersInAName
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name from keyboard to get each letter ASCII Equivalent");
		String l=sc.nextLine();
		for(int i=0;i<l.length();i++)
		{
			char x=l.charAt(i);
			System.out.print("ASCII Equivalent of "+x+" is:");
			switch(x)
			{
				case '0':
					System.out.println(" 48");
					break;
				case '1':
					System.out.println(" 49");
					break;
				case '2':
					System.out.println(" 50");
					break;
				case '3':
					System.out.println(" 51");
					break;
				case '4':
					System.out.println(" 52");
					break;
				case '5':
					System.out.println(" 53");
					break;
				case '6':
					System.out.println(" 54");
					break;
				case '7':
					System.out.println(" 55");
					break;
				case '8':
					System.out.println(" 56");
					break;
				case '9':
					System.out.println(" 57");
					break;
				case 'A':
					System.out.println(" 65");
					break;
				case 'B':
					System.out.println(" 66");
					break;
				case 'C':
					System.out.println(" 67");
					break;
				case 'D':
					System.out.println(" 68");
					break;
				case 'E':
					System.out.println(" 69");
					break;
				case 'F':
					System.out.println(" 70");
					break;
				case 'G':
					System.out.println(" 71");
					break;
				case 'H':
					System.out.println(" 72");
					break;
				case 'I':
					System.out.println(" 73");
					break;
				case 'J':
					System.out.println(" 74");
					break;
				case 'K':
					System.out.println(" 75");
					break;
				case 'L':
					System.out.println(" 76");
					break;
				case 'M':
					System.out.println(" 77");
					break;
				case 'N':
					System.out.println(" 78");
					break;
				case 'O':
					System.out.println(" 79");
					break;
				case 'P':
					System.out.println(" 80");
					break;
				case 'Q':
					System.out.println(" 81");
					break;
				case 'R':
					System.out.println(" 82");
					break;
				case 'S':
					System.out.println(" 83");
					break;
				case 'T':
					System.out.println(" 84");
					break;
				case 'U':
					System.out.println(" 85");
					break;
				case 'V':
					System.out.println(" 86");
					break;
				case 'W':
					System.out.println(" 87");
					break;
				case 'X':
					System.out.println(" 88");
					break;
				case 'Y':
					System.out.println(" 89");
					break;
				case 'Z':
					System.out.println(" 90");
					break;
				case 'a':
					System.out.println(" 97");
					break;
				case 'b':
					System.out.println(" 98");
					break;
				case 'c':
					System.out.println(" 99");
					break;
				case 'd':
					System.out.println(" 100");
					break;
				case 'e':
					System.out.println(" 101");
					break;
				case 'f':
					System.out.println(" 102");
					break;
				case 'g':
					System.out.println(" 103");
					break;
				case 'h':
					System.out.println(" 104");
					break;
				case 'i':
					System.out.println(" 105");
					break;
				case 'j':
					System.out.println(" 106");
					break;
				case 'k':
					System.out.println(" 107");
					break;
				case 'l':
					System.out.println(" 108");
					break;
				case 'm':
					System.out.println(" 109");
					break;
				case 'n':
					System.out.println(" 110");
					break;
				case 'o':
					System.out.println(" 111");
					break;
				case 'p':
					System.out.println(" 112");
					break;
				case 'q':
					System.out.println(" 113");
					break;
				case 'r':
					System.out.println(" 114");
					break;
				case 's':
					System.out.println(" 115");
					break;
				case 't':
					System.out.println(" 116");
					break;
				case 'u':
					System.out.println(" 117");
					break;
				case 'v':
					System.out.println(" 118");
					break;
				case 'w':
					System.out.println(" 119");
					break;
				case 'x':
					System.out.println(" 120");
					break;
				case 'y':
					System.out.println(" 121");
					break;
				case 'z':
					System.out.println(" 122");
					break;
				default:
					System.out.println("It is a Special Character");
					break;		//Optional(as "default:" is last statement)
			}
		}
		
	}
}
