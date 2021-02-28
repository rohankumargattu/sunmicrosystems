package switchcasestatements;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class AlphabetToVoiceExcel
{
	public static void main(String[] args) throws Exception
	{
		//Read Excel file
		File f=new File("aforapple.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet("Sheet1");
		int nour=sh.getPhysicalNumberOfRows();
		int nouc=sh.getRow(0).getLastCellNum();
		//Give headings to results in excel file
		sh.getRow(0).createCell(nouc).setCellValue("Abbrevation");
		for(int i=1;i<nour;i++)
		{
			//Read data from excel
			DataFormatter df=new DataFormatter();
			String a=df.formatCellValue(sh.getRow(i).getCell(0));
			switch(a.charAt(0))
			{
				case 'a':
					sh.getRow(i).createCell(nouc).setCellValue("a for Apple");
					oralOutput("a for Apple");
					break;
				case 'b':
					sh.getRow(i).createCell(nouc).setCellValue("b for Ball");
					oralOutput("b for Ball");
					break;
				case 'c':
					sh.getRow(i).createCell(nouc).setCellValue("c for Cat");
					oralOutput("c for Cat");
					break;
				case 'd':
					sh.getRow(i).createCell(nouc).setCellValue("d for Dog");
					oralOutput("d for Dog");
					break;
				case 'e':
					sh.getRow(i).createCell(nouc).setCellValue("e for Elephant");
					oralOutput("e for Elephant");
					break;
				case 'f':
					sh.getRow(i).createCell(nouc).setCellValue("f for Fish");
					oralOutput("f for Fish");
					break;
				case 'g':
					sh.getRow(i).createCell(nouc).setCellValue("g for Gun");
					oralOutput("g for Gun");
					break;
				case 'h':
					sh.getRow(i).createCell(nouc).setCellValue("h for Hen");
					oralOutput("h for Hen");
					break;
				case 'i':
					sh.getRow(i).createCell(nouc).setCellValue("i for Ice Cream");
					oralOutput("i for Ice Cream");
					break;
				case 'j':
					sh.getRow(i).createCell(nouc).setCellValue("j for Jug");
					oralOutput("j for Jug");
					break;
				case 'k':
					sh.getRow(i).createCell(nouc).setCellValue("k for Kite");
					oralOutput("k for Kite");
					break;
				case 'l':
					sh.getRow(i).createCell(nouc).setCellValue("l for Lion");
					oralOutput("l for Lion");
					break;
				case 'm':
					sh.getRow(i).createCell(nouc).setCellValue("m for Monkey");
					oralOutput("m for Monkey");
					break;
				case 'n':
					sh.getRow(i).createCell(nouc).setCellValue("n for Nest");
					oralOutput("n for Nest");
					break;
				case 'o':
					sh.getRow(i).createCell(nouc).setCellValue("o for Owl");
					oralOutput("o for Owl");
					break;
				case 'p':
					sh.getRow(i).createCell(nouc).setCellValue("p for Parrot");
					oralOutput("p for Parrot");
					break;
				case 'q':
					sh.getRow(i).createCell(nouc).setCellValue("q for Queen");
					oralOutput("q for Queen");
					break;
				case 'r':
					sh.getRow(i).createCell(nouc).setCellValue("r for Rabbit");
					oralOutput("r for Rabbit");
					break;
				case 's':
					sh.getRow(i).createCell(nouc).setCellValue("s for Ship");
					oralOutput("s for Ship");
					break;
				case 't':
					sh.getRow(i).createCell(nouc).setCellValue("t for Tiger");
					oralOutput("t for Tiger");
					break;
				case 'u':
					sh.getRow(i).createCell(nouc).setCellValue("u for Umbrella");
					oralOutput("u for Umbrella");
					break;
				case 'v':
					sh.getRow(i).createCell(nouc).setCellValue("v for Van");
					oralOutput("v for Van");
					break;
				case 'w':
					sh.getRow(i).createCell(nouc).setCellValue("w for Watch");
					oralOutput("w for Watch");
					break;
				case 'x':
					sh.getRow(i).createCell(nouc).setCellValue("x for X-ray");
					oralOutput("x for X-ray");
					break;
				case 'y':
					sh.getRow(i).createCell(nouc).setCellValue("y for Yak");
					oralOutput("y for Yak");
					break;
				case 'z':
					sh.getRow(i).createCell(nouc).setCellValue("z for Zebra");
					oralOutput("z for Zebra");
					break;
				case 'A':
					sh.getRow(i).createCell(nouc).setCellValue("A for Apple");
					oralOutput("A for Apple");
					break;
				case 'B':
					sh.getRow(i).createCell(nouc).setCellValue("B for Ball");
					oralOutput("B for Ball");
					break;
				case 'C':
					sh.getRow(i).createCell(nouc).setCellValue("C for Cat");
					oralOutput("C for Cat");
					break;
				case 'D':
					sh.getRow(i).createCell(nouc).setCellValue("D for Dog");
					oralOutput("D for Dog");
					break;
				case 'E':
					sh.getRow(i).createCell(nouc).setCellValue("E for Elephant");
					oralOutput("E for Elephant");
					break;
				case 'F':
					sh.getRow(i).createCell(nouc).setCellValue("F for Fish");
					oralOutput("F for Fish");
					break;
				case 'G':
					sh.getRow(i).createCell(nouc).setCellValue("G for Gun");
					oralOutput("G for Gun");
					break;
				case 'H':
					sh.getRow(i).createCell(nouc).setCellValue("H for Hen");
					oralOutput("H for Hen");
					break;
				case 'I':
					sh.getRow(i).createCell(nouc).setCellValue("I for Ice Cream");
					oralOutput("I for Ice Cream");
					break;
				case 'J':
					sh.getRow(i).createCell(nouc).setCellValue("J for Jug");
					oralOutput("J for Jug");
					break;
				case 'K':
					sh.getRow(i).createCell(nouc).setCellValue("K for Kite");
					oralOutput("K for Kite");
					break;
				case 'L':
					sh.getRow(i).createCell(nouc).setCellValue("L for Lion");
					oralOutput("L for Lion");
					break;
				case 'M':
					sh.getRow(i).createCell(nouc).setCellValue("M for Monkey");
					oralOutput("M for Monkey");
					break;
				case 'N':
					sh.getRow(i).createCell(nouc).setCellValue("N for Nest");
					oralOutput("N for Nest");
					break;
				case 'O':
					sh.getRow(i).createCell(nouc).setCellValue("O for Owl");
					oralOutput("O for Owl");
					break;
				case 'P':
					sh.getRow(i).createCell(nouc).setCellValue("P for Parrot");
					oralOutput("P for Parrot");
					break;
				case 'Q':
					sh.getRow(i).createCell(nouc).setCellValue("Q for Queen");
					oralOutput("Q for Queen");
					break;
				case 'R':
					sh.getRow(i).createCell(nouc).setCellValue("R for Rabbit");
					oralOutput("R for Rabbit");
					break;
				case 'S':
					sh.getRow(i).createCell(nouc).setCellValue("S for Ship");
					oralOutput("S for Ship");
					break;
				case 'T':
					sh.getRow(i).createCell(nouc).setCellValue("T for Tiger");
					oralOutput("T for Tiger");
					break;
				case 'U':
					sh.getRow(i).createCell(nouc).setCellValue("U for Umbrella");
					oralOutput("U for Umbrella");
					break;
				case 'V':
					sh.getRow(i).createCell(nouc).setCellValue("V for Van");
					oralOutput("V for Van");
					break;
				case 'W':
					sh.getRow(i).createCell(nouc).setCellValue("W for Watch");
					oralOutput("W for Watch");
					break;
				case 'X':
					sh.getRow(i).createCell(nouc).setCellValue("X for X-ray");
					oralOutput("X for X-ray");
					break;
				case 'Y':
					sh.getRow(i).createCell(nouc).setCellValue("Y for Yak");
					oralOutput("Y for Yak");
					break;
				case 'Z':
					sh.getRow(i).createCell(nouc).setCellValue("Z for Zebra");
					oralOutput("Z for Zebra");
					break;
				default:
					System.out.println("No digits,special characters are allowed");
					break;		//Optional(as "default:" is last statement)
			}
		}
		
		sh.autoSizeColumn(nouc);
		
		//Save data back to excel
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		fi.close();
		fo.close();
		wb.close();
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
