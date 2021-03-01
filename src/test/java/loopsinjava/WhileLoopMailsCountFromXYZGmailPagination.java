package loopsinjava;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class WhileLoopMailsCountFromXYZGmailPagination
{
	public static void main(String[] args) throws Exception
	{
		//Get test data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id");
		String uid=sc.nextLine();
		System.out.println("Enter password");
		String pwd=sc.nextLine();
		System.out.println("Enter mail reciever name");
		String name=sc.nextLine();
		sc.close();
		//Create results file
		ExtentReports er=new ExtentReports("whileloopmailscountfromxyzgmailpagination.html",false);
		ExtentTest et=er.startTest("Gmail mails count from XYZ via pagination using while loop");
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys(pwd);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']")));
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Compose']")));
		//Pagination for mail box
		int norm=0;		//No of required mails
		while(2>1)
		{
			List<WebElement> rl=driver.findElements(By.xpath("(//table)[4]/tbody/tr"));
			int noam=rl.size(); 	//No of all mails
			for(int i=1;i<=noam;i++) 	//i=1, since i is used in xpath
			{
				String x=driver.findElement(By.xpath("(//table)[4]/tbody/tr["+i+"]/td[5]")).getText();
				if(x.equalsIgnoreCase(name))
				{
					norm=norm+1;
				}
			}
			try
			{
				if(driver.findElement(By.xpath("//*[@aria-label='Older']")).getAttribute("aria-disabled").equals("true"))
				{
					break;
				}
			}
			catch(Exception ex)
			{
				driver.findElement(By.xpath("//*[@aria-label='Older']")).click();
				Thread.sleep(5000);
			}
		}
		System.out.println("Total no of mails from "+name+" are "+norm);
		//Do logout
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@aria-label,'Google Account')]/span")));
		driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account')]/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Sign out']")));
		driver.findElement(By.xpath("//*[text()='Sign out']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		//Close site
		driver.close();
		//Save results
		er.endTest(et);
		er.flush();	
	}
}
