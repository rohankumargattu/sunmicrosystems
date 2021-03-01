package loopsinjava;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WhileLoopGoogleTitleTestPagination 
{
	public static void main(String[] args) throws Exception
	{
		//Take data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word to search");
		String x=sc.nextLine();
		sc.close();
		//Create results file
		ExtentReports er=new ExtentReports("whileloopgoogletitletestpagination.html",false);
		ExtentTest et=er.startTest("Google Title test via pagination using while loop");
		//Launch browser
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Maximize
		driver.manage().window().maximize();
		//Open site
		driver.get("https://www.google.co.in/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='All']")));
		//Validations
		int count=0;
		while(2>1)
		{
			String t=driver.getTitle();
			if(t.contains(x))
			{
				count=count+1;
				try 
				{
					if(driver.findElement(By.xpath("//*[text()='Next']")).isDisplayed())
					{
						driver.findElement(By.xpath("//*[text()='Next']")).click();
						wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='All']")));
					}
				}
				catch(Exception ex)
				{
					et.log(LogStatus.PASS,"Google title test passed","Total no of pages with title as "+x+" are "+count);
					break;
				}
			}
			else
			{
				SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
				Date d=new Date();
				String fname=sf.format(d)+".png";
				File src=driver.getScreenshotAs(OutputType.FILE);
				File dest=new File(fname);
				FileHandler.copy(src, dest);
				et.log(LogStatus.FAIL,"Google title test failed at page "+count+1,et.addScreenCapture(fname));
				break;
			}
		}
		//Close site
		driver.close();
		//Save results
		er.endTest(et);
		er.flush();
	}
}
