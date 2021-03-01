package loopsinjava;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WhileLoopTotalMailsCountTestingWithActualMailsCountPagination
{
	public static void main(String[] args) throws Exception
	{
		//Get test data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id");
		String uid=sc.nextLine();
		System.out.println("Enter password");
		String pwd=sc.nextLine();
		sc.close();
		//Create results file
		ExtentReports er=new ExtentReports("whilelooptotalmailscountwithactualmailscountpagination.html",false);
		ExtentTest et=er.startTest("Gmail total mails count via pagination using while loop");
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
		//Close notification dialogue
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='bBe']")));
		driver.findElement(By.xpath("//*[@class='bBe']")).click();
		//Pagination to count total no of mails
		int enoam=0;
		while(2>1)
		{
			List<WebElement> mails=driver.findElements(By.xpath("(//table)[4]/tbody/tr"));
			int nomp=mails.size();
			//Add count of mails in current page to total count
			enoam=enoam+nomp;
			//Go to next page
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
		//Get actual count of all mails
		String temp=driver.findElement(By.xpath("//*[@data-tooltip='Newer']/preceding::span[1]")).getText();
		int anoam=Integer.parseInt(temp);		 //*[@aria-label='Show more messages']/descendant::span[5]
		//Validations
		System.out.println("Program count is "+enoam);
		System.out.println("Website count is "+anoam);
		if(enoam==anoam)
		{
			et.log(LogStatus.PASS,"Gmail mails count test passed");
		}
		else
		{
			SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
			Date d=new Date();
			String fname=sf.format(d)+".png";
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File(fname);
			FileHandler.copy(src, dest);
			et.log(LogStatus.FAIL,"Gmail mails count test failed",et.addScreenCapture(fname));
		}
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
