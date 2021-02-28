package controlstatementsinjava;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class NestedIfGmailExtentReports
{
	public static void main(String[] args) throws Exception
	{
		//Get test data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id");
		String uid=sc.nextLine();
		System.out.println("Enter user id criteria");
		String uidc=sc.nextLine();
		String pwd="";
		String pwdc="";
		if(uidc.equalsIgnoreCase("valid"))
		{
			System.out.println("Enter password");
			pwd=sc.nextLine();
			System.out.println("Enter password criteria");
			pwdc=sc.nextLine();
		}
		sc.close();
		//Create results file using extent reports
		ExtentReports er=new ExtentReports("gmaillogintest.html",false);
		ExtentTest et=er.startTest("Gmail Login Test");
		//Launch browser
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Maximize
		driver.manage().window().maximize();
		//Open site
		driver.get("https://www.gmail.com");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
		driver.findElement(By.name("identifier")).sendKeys(uid);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']")));
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(3000);		//Mandatory wait for outcome
		//Validations
		//UID testing
		try
		{
			if(uid.length()==0 && driver.findElement(By.xpath("//*[contains(text(),'Enter an email')]")).isDisplayed())
			{
				et.log(LogStatus.PASS,"Blank UID test passed");
			}
			else if(uidc.equalsIgnoreCase("invalid") && driver.findElement(By.xpath("(//*[contains(text(),'find your Google Account')])[2]")).isDisplayed())
			{
				et.log(LogStatus.PASS,"Invalid UID test passed");
			}
			else if(uidc.equalsIgnoreCase("valid") && driver.findElement(By.name("password")).isDisplayed())
			{
				et.log(LogStatus.PASS,"Valid UID test passed");
				//Password testing
				driver.findElement(By.name("password")).sendKeys(pwd);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']")));
				driver.findElement(By.xpath("//*[text()='Next']")).click();
				Thread.sleep(5000);			//Mandatory wait for outcome
				if(pwd.length()==0 && driver.findElement(By.xpath("//*[text()='Enter a password']")).isDisplayed())
				{
					et.log(LogStatus.PASS,"Blank PWD test passed");
				}
				else if(pwdc.equalsIgnoreCase("invalid") && driver.findElement(By.xpath("//*[contains(text(),'Wrong password')]")).isDisplayed())
				{
					et.log(LogStatus.PASS,"Invalid PWD test passed");
				}
				else if(pwdc.equalsIgnoreCase("valid") && driver.findElement(By.xpath("//*[text()='Compose']")).isDisplayed())
				{
					et.log(LogStatus.PASS,"Valid PWD test passed");
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@aria-label,'Google Account')]/span")));
					driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account')]/span")).click();
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Sign out']")));
					driver.findElement(By.xpath("//*[text()='Sign out']")).click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
				}
				else
				{
					SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
					Date d=new Date();
					String fname=sf.format(d)+".png";
					File src=driver.getScreenshotAs(OutputType.FILE);
					File dest=new File(fname);
					FileHandler.copy(src, dest);
					et.log(LogStatus.FAIL,"Valid PWD test failed",et.addScreenCapture(fname));
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
				et.log(LogStatus.FAIL,"Valid UID test failed",et.addScreenCapture(fname));
			}
		}
		catch(Exception ex)
		{
			et.log(LogStatus.ERROR,ex.getMessage());
		}
		//Close site
		driver.close();
		//save extent reports
		er.endTest(et);
		er.flush();		//save
	}
}
