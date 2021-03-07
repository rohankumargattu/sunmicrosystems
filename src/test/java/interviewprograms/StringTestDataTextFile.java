package interviewprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTestDataTextFile 
{
	public static void main(String[] args) throws Exception
	{
		//Open text file for reading
		File f1=new File("stringtestdata.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		//Open text file for writing
		File f2=new File("stringtestresult.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		//Data driven
		String l="";
		int nol=0;
		int now=0;
		int non=0;
		while((l=br.readLine())!=null)
		{
			nol=nol+1;
			String[] p=l.split(" ");
			now=now+p.length;
			Pattern pn=Pattern.compile("[0-9]+");
			Matcher m=pn.matcher(l);
			while(m.find())
			{
				non=non+1;
			}
		}
		//Send output to file
		bw.write("No of lines are: "+nol);
		bw.newLine();
		bw.write("No of words are: "+(now-non));
		bw.newLine();
		bw.write("No of numeric values are: "+non);
		//bw.newLine();
		//Save text files
		bw.close();
		fw.close();
		br.close();
		fr.close();
	}
}
