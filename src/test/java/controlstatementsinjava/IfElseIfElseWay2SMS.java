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

public class IfElseIfElseWay2SMS
{
	public static void main(String[] args) throws Exception 
	{
		//Get test data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile number");
		String mbno=sc.nextLine();
		System.out.println("Enter mobile number criteria");
		String mbnoc=sc.nextLine();
		System.out.println("Enter password");
		String pwd=sc.nextLine();
		System.out.println("Enter password criteria");
		String pwdc=sc.nextLine();
		sc.close();
		//Launch browser
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Maximize
		driver.manage().window().maximize();
		//Open site
		driver.get("https://www.way2sms.com/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@name='mobileNo'])[1]")));
		//Do login
		driver.findElement(By.xpath("(//*[@name='mobileNo'])[1]")).sendKeys(mbno);
		driver.findElement(By.xpath("(//*[@name='password'])[1]")).sendKeys(pwd);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Login')])[1]")));
		driver.findElement(By.xpath("(//button[contains(text(),'Login')])[1]")).click();
		//Lambda Function wait state
		//wait.until(temp->driver.executeScript("return document.readyState").equals("complete"));
		Thread.sleep(3000);		//Mandatory wait for outcome
		//Validations
		try
		{
			if(mbno.length()==0 && driver.findElement(By.xpath("//*[text()='Enter your mobile number']")).isDisplayed())
			{
				System.out.println("Blank mobile no test passed");
			}
			else if(mbno.length()<10 && driver.findElement(By.xpath("//*[text()='Enter valid mobile number']")).isDisplayed())
			{
				System.out.println("Wrong size mobile no test passed");
			}
			else if(mbnoc.equalsIgnoreCase("invalid") && driver.findElement(By.xpath("//*[text()='Invalid Mobile Number']")).isDisplayed())
			{
				System.out.println("Invalid mobile no test passed");
			}
			else if(mbnoc.equalsIgnoreCase("notregistered") && driver.findElement(By.xpath("(//*[contains(text(),'not register with us')])[1]")).isDisplayed())
			{
				System.out.println("Unregistered mobile no test passed");
			}
			else if(pwd.length()==0 && driver.findElement(By.xpath("(//*[text()='Enter password'])[2]")).isDisplayed())
			{
				System.out.println("Blank password test passed");
			}
			else if(pwdc.equalsIgnoreCase("invalid") && driver.findElement(By.xpath("(//*[contains(text(),'Try Again')])[1]")).isDisplayed())
			{
				System.out.println("Invalid password test passed");
			}
			else if(mbnoc.equalsIgnoreCase("valid") && pwdc.equalsIgnoreCase("valid") && driver.findElement(By.xpath("//*[text()='Send SMS']")).isDisplayed())
			{
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(@class,'logout')])[2]")));
				driver.findElement(By.xpath("(//*[contains(@class,'logout')])[2]")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@name='mobileNo'])[1]")));
				System.out.println("Valid data test passed");
			}
			else
			{
				SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
				Date d=new Date();
				String fname=sf.format(d)+".png";
				File src=driver.getScreenshotAs(OutputType.FILE);
				File dest=new File(fname);
				FileHandler.copy(src, dest);
				System.out.println("Login test failed");
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
