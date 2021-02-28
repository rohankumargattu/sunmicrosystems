package switchcasestatements;

import java.util.Scanner;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class AlphabetToVoice
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an alphabet/word to get related alphabet example word");
		String l=sc.nextLine();
		System.out.println("In the given word:");
		for(int i=0;i<l.length();i++)
		{
			char x=l.charAt(i);
			switch(x)
			{
				case 'a':
					System.out.println("a for Apple");
					oralOutput("a for Apple");
					break;
				case 'b':
					System.out.println("b for Ball");
					oralOutput("b for Ball");
					break;
				case 'c':
					System.out.println("c for Cat");
					oralOutput("c for Cat");
					break;
				case 'd':
					System.out.println("d for Dolphin");
					oralOutput("d for Dolphin");
					break;
				case 'e':
					System.out.println("e for Elephant");
					oralOutput("e for Elephant");
					break;
				case 'f':
					System.out.println("f for Fish");
					oralOutput("f for Fish");
					break;
				case 'g':
					System.out.println("g for Gun");
					oralOutput("g for Gun");
					break;
				case 'h':
					System.out.println("h for Ha ha ha ha");
					oralOutput("h for Ha ha ha ha");
					break;
				case 'i':
					System.out.println("i for Ice Cream");
					oralOutput("i for Ice Cream");
					break;
				case 'j':
					System.out.println("j for Jug");
					oralOutput("j for Jug");
					break;
				case 'k':
					System.out.println("k for Kite");
					oralOutput("k for Kite");
					break;
				case 'l':
					System.out.println("l for Lion");
					oralOutput("l for Lion");
					break;
				case 'm':
					System.out.println("m for Monkey");
					oralOutput("m for Monkey");
					break;
				case 'n':
					System.out.println("n for Nest");
					oralOutput("n for Nest");
					break;
				case 'o':
					System.out.println("o for Owl");
					oralOutput("o for Owl");
					break;
				case 'p':
					System.out.println("p for Peacock");
					oralOutput("p for Peacock");
					break;
				case 'q':
					System.out.println("q for Queen");
					oralOutput("q for Queen");
					break;
				case 'r':
					System.out.println("r for Rabbit");
					oralOutput("r for Rabbit");
					break;
				case 's':
					System.out.println("s for Ship");
					oralOutput("s for Ship");
					break;
				case 't':
					System.out.println("t for Tiger");
					oralOutput("t for Tiger");
					break;
				case 'u':
					System.out.println("u for Umbrella");
					oralOutput("u for Umbrella");
					break;
				case 'v':
					System.out.println("v for Van");
					oralOutput("v for Van");
					break;
				case 'w':
					System.out.println("w for Watch");
					oralOutput("w for Watch");
					break;
				case 'x':
					System.out.println("x for X-ray");
					oralOutput("x for X-ray");
					break;
				case 'y':
					System.out.println("y for Yak");
					oralOutput("y for Yak");
					break;
				case 'z':
					System.out.println("z for Zebra");
					oralOutput("z for Zebra");
					break;
				case 'A':
					System.out.println("A for Apple");
					oralOutput("A for Apple");
					break;
				case 'B':
					System.out.println("B for Ball");
					oralOutput("B for Ball");
					break;
				case 'C':
					System.out.println("C for Cat");
					oralOutput("C for Cat");
					break;
				case 'D':
					System.out.println("D for Dolphin");
					oralOutput("D for Dolphin");
					break;
				case 'E':
					System.out.println("E for Elephant");
					oralOutput("E for Elephant");
					break;
				case 'F':
					System.out.println("F for Fish");
					oralOutput("F for Fish");
					break;
				case 'G':
					System.out.println("G for Gun");
					oralOutput("G for Gun");
					break;
				case 'H':
					System.out.println("H for Ha ha ha ha");
					oralOutput("H for Ha ha ha ha");
					break;
				case 'I':
					System.out.println("I for Ice Cream");
					oralOutput("I for Ice Cream");
					break;
				case 'J':
					System.out.println("J for Jug");
					oralOutput("J for Jug");
					break;
				case 'K':
					System.out.println("K for Kite");
					oralOutput("K for Kite");
					break;
				case 'L':
					System.out.println("L for Lion");
					oralOutput("L for Lion");
					break;
				case 'M':
					System.out.println("M for Monkey");
					oralOutput("M for Monkey");
					break;
				case 'N':
					System.out.println("N for Nest");
					oralOutput("N for Nest");
					break;
				case 'O':
					System.out.println("O for Owl");
					oralOutput("O for Owl");
					break;
				case 'P':
					System.out.println("P for Peacock");
					oralOutput("P for Peacock");
					break;
				case 'Q':
					System.out.println("Q for Queen");
					oralOutput("Q for Queen");
					break;
				case 'R':
					System.out.println("R for Rabbit");
					oralOutput("R for Rabbit");
					break;
				case 'S':
					System.out.println("S for Ship");
					oralOutput("S for Ship");
					break;
				case 'T':
					System.out.println("T for Tiger");
					oralOutput("T for Tiger");
					break;
				case 'U':
					System.out.println("U for Umbrella");
					oralOutput("U for Umbrella");
					break;
				case 'V':
					System.out.println("V for Van");
					oralOutput("V for Van");
					break;
				case 'W':
					System.out.println("W for Watch");
					oralOutput("W for Watch");
					break;
				case 'X':
					System.out.println("X for X-ray");
					oralOutput("X for X-ray");
					break;
				case 'Y':
					System.out.println("Y for Yak");
					oralOutput("Y for Yak");
					break;
				case 'Z':
					System.out.println("Z for Zebra");
					oralOutput("Z for Zebra");
					break;
				default:
					System.out.println("No digits,special characters are allowed");
					break;		//Optional(as "default:" is last statement)
			}
		}
	}
	
	public static void oralOutput(String text)
	{
		//Convert text to voice
		System.setProperty("mbrola.base","E:\\Automation\\mbrola");
		VoiceManager vm=VoiceManager.getInstance();
		Voice v=vm.getVoice("mbrola_us1"); //or kevin16
		v.allocate();
		v.speak(text);
		v.deallocate();
	}
}
