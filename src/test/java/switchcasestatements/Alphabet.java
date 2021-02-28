package switchcasestatements;

import java.util.Scanner;

public class Alphabet
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a lower/upper alphabet");
		String l=sc.nextLine();
		for(int i=0;i<l.length();i++)
		{
			char x=l.charAt(i);
			switch(x)
			{
				case 'a':
					System.out.print("Apple ");
					break;
				case 'b':
					System.out.print("Ball ");
					break;
				case 'c':
					System.out.print("Cat ");
					break;
				case 'd':
					System.out.print("Dog ");
					break;
				case 'e':
					System.out.print("Elephant ");
					break;
				case 'f':
					System.out.print("Fish ");
					break;
				case 'g':
					System.out.print("Gun ");
					break;
				case 'h':
					System.out.print("Hen ");
					break;
				case 'i':
					System.out.print("Ice Cream ");
					break;
				case 'j':
					System.out.print("Jug ");
					break;
				case 'k':
					System.out.print("Kite ");
					break;
				case 'l':
					System.out.print("Lion ");
					break;
				case 'm':
					System.out.print("Monkey ");
					break;
				case 'n':
					System.out.print("Nest ");
					break;
				case 'o':
					System.out.print("Owl ");
					break;
				case 'p':
					System.out.print("Parrot ");
					break;
				case 'q':
					System.out.print("Queen ");
					break;
				case 'r':
					System.out.print("Rabbit ");
					break;
				case 's':
					System.out.print("Ship ");
					break;
				case 't':
					System.out.print("Tiger ");
					break;
				case 'u':
					System.out.print("Umbrella ");
					break;
				case 'v':
					System.out.print("Van ");
					break;
				case 'w':
					System.out.print("Watch ");
					break;
				case 'x':
					System.out.print("X-ray ");
					break;
				case 'y':
					System.out.print("Yak ");
					break;
				case 'z':
					System.out.print("Zebra ");
					break;
				case 'A':
					System.out.print("Apple ");
					break;
				case 'B':
					System.out.print("Ball ");
					break;
				case 'C':
					System.out.print("Cat ");
					break;
				case 'D':
					System.out.print("Dog ");
					break;
				case 'E':
					System.out.print("Elephant ");
					break;
				case 'F':
					System.out.print("Fish ");
					break;
				case 'G':
					System.out.print("Gun ");
					break;
				case 'H':
					System.out.print("Hen ");
					break;
				case 'I':
					System.out.print("Ice Cream ");
					break;
				case 'J':
					System.out.print("Jug ");
					break;
				case 'K':
					System.out.print("Kite ");
					break;
				case 'L':
					System.out.print("Lion ");
					break;
				case 'M':
					System.out.print("Monkey ");
					break;
				case 'N':
					System.out.print("Nest ");
					break;
				case 'O':
					System.out.print("Owl ");
					break;
				case 'P':
					System.out.print("Parrot ");
					break;
				case 'Q':
					System.out.print("Queen ");
					break;
				case 'R':
					System.out.print("Rabbit ");
					break;
				case 'S':
					System.out.print("Ship ");
					break;
				case 'T':
					System.out.print("Tiger ");
					break;
				case 'U':
					System.out.print("Umbrella ");
					break;
				case 'V':
					System.out.print("Van ");
					break;
				case 'W':
					System.out.print("Watch ");
					break;
				case 'X':
					System.out.print("X-ray ");
					break;
				case 'Y':
					System.out.print("Yak ");
					break;
				case 'Z':
					System.out.print("Zebra ");
					break;
				default:
					System.out.print("No digits,special characters are allowed");
					break;		//Optional(as "default:" is last statement)
			}
		}
	}
}
