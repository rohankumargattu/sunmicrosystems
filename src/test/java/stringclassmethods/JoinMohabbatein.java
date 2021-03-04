package stringclassmethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class JoinMohabbatein
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("lovesymboljoin.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet("Sheet1");
		int nour=sh.getPhysicalNumberOfRows();
		int nouc=sh.getRow(0).getLastCellNum();
		//Give headings to results in excel file
		sh.getRow(0).createCell(nouc).setCellValue("Relationship");
		sh.getRow(0).createCell(nouc+1).setCellValue("Proof of Relation");
		
		//Data Driven from 2nd row(index=1)
		for(int i=1;i<nour;i++)
		{
			//Read data from excel
			DataFormatter df=new DataFormatter();
			String husb=df.formatCellValue(sh.getRow(i).getCell(0));
			String wife=df.formatCellValue(sh.getRow(i).getCell(1));
			
			String[] s= {husb,wife};
			String p="";
			p=p.join("❤",s);
			//p=String.join("â�¤ ",s);
			System.out.println(p);
			
			//Write result back to excel
			sh.getRow(i).createCell(nouc).setCellValue(p);
			if(p.contains("Shwetha"))
			{
				sh.getRow(i).createCell(nouc+1).setCellValue("Gaurav and 10 to go");
			}
			else if(p.contains("Anusha"))
			{
				sh.getRow(i).createCell(nouc+1).setCellValue("Aayansh");
			}
			else if(p.contains("Raji"))
			{
				sh.getRow(i).createCell(nouc+1).setCellValue("Eagerly waiting");
			}
			else if(p.contains("Farheen"))
			{
				sh.getRow(i).createCell(nouc+1).setCellValue("Syed Sulaiman");
			}
			else if(p.contains("Chandrakala"))
			{
				sh.getRow(i).createCell(nouc+1).setCellValue("TejVardhan");
			}
			else if(p.contains("Priyanka"))
			{
				sh.getRow(i).createCell(nouc+1).setCellValue("Vyshu and Saanvi...etc");
			}
			else if(p.contains("Raja"))
			{
				sh.getRow(i).createCell(nouc+1).setCellValue("Proof to be submitted");
			}
			else if(p.contains("Himaja"))
			{
				sh.getRow(i).createCell(nouc+1).setCellValue("Saasha and Harsha");
			}
			else if(p.contains("Jaya"))
			{
				sh.getRow(i).createCell(nouc+1).setCellValue("Abhiram and Gourav Kishan");
			}
		}
		
		sh.autoSizeColumn(nouc);
		sh.autoSizeColumn(nouc+1);
		
		//Save data back to excel
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		fi.close();
		fo.close();
		wb.close();
	}
}
