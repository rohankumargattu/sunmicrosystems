package interviewprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MathematicalTablesExcel
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit for no of math tables to print");
		int limit=sc.nextInt();
		//Create a new Excel file(.xlsx)
		File f=new File("mathematicstables.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		Sheet sh=wb.createSheet("tables");
		//Heading decorations
		Font font1=wb.createFont();
		font1.setColor(IndexedColors.RED.getIndex());
	    font1.setItalic(true);
	    font1.setBold(true);
	    //Cell Style settings for Headings
		CellStyle cs1=wb.createCellStyle();
		cs1.setFont(font1);
		cs1.setAlignment(HorizontalAlignment.CENTER);
		//Give headings to results in excel file
		for(int i=0;i<limit;i++)
		{
			if(i==0)
			{
				sh.createRow(0).createCell(i).setCellValue((i+1)+" table");
				sh.getRow(0).getCell(i).setCellStyle(cs1);
			}
			else
			{
				sh.getRow(0).createCell(i).setCellValue((i+1)+" table");
				sh.getRow(0).getCell(i).setCellStyle(cs1);
			}
		}
		for(int i=1;i<=limit;i++)	//No of tables
		{
			for(int j=1;j<=10;j++)	// No of multiples
			{
				if(i==1)
				{
					sh.createRow(j).createCell(i-1).setCellValue(""+i+"*"+j+"="+(i*j));
				}
				else
				{
					sh.getRow(j).createCell(i-1).setCellValue(""+i+"*"+j+"="+(i*j));
				}
			}
		}
		
		for(int i=1;i<=20;i++)
		{
			sh.autoSizeColumn(i);
		}
		//Save data back to excel
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		wb.close();
	}
}
