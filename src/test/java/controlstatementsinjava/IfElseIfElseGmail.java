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

public class IfElseIfElseGmail
{
	public static void main(String[] args) throws Exception
	{
		//Get test data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id");
		String uid=sc.nextLine();
		System.out.println("Enter user id criteria");
		String uidc=sc.nextLine();
		sc.close();
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
		//UID testing
		try
		{
			if(uid.length()==0 && driver.findElement(By.xpath("//*[contains(text(),'Enter an email')]")).isDisplayed())
			{
				System.out.println("Blank UID test passed");
			}
			else if(uidc.equalsIgnoreCase("invalid") && driver.findElement(By.xpath("(//*[contains(text(),'find your Google Account')])[2]")).isDisplayed())
			{
				System.out.println("Invalid UID test passed");
			}
			else if(uidc.equalsIgnoreCase("valid") && driver.findElement(By.name("password")).isDisplayed())
			{
				System.out.println("Valid UID test passed");
			}
			else
			{
				SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
				Date d=new Date();
				String fname=sf.format(d)+".png";
				File src=driver.getScreenshotAs(OutputType.FILE);
				File dest=new File(fname);
				FileHandler.copy(src, dest);
				System.out.println("Valid UID test failed");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		//Close site
		driver.close();	
	}
}
