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
import org.sikuli.script.Screen;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WhileLoopDeleteMailFromSpecifiedMonthGmailPagination
{
	public static void main(String[] args) throws Exception
	{
		//Get test data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id");
		String uid=sc.nextLine();
		System.out.println("Enter password");
		String pwd=sc.nextLine();
		System.out.println("Enter first 3 characters of month name in lower case");
		String name=sc.nextLine();
		sc.close();
		//Create results file
		ExtentReports er=new ExtentReports("whileloopdeletemailsfromspecifiedmonthgmailpagination.html",false);
		ExtentTest et=er.startTest("Gmail mails delete from a specific month via pagination using while loop");
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
		//Click on Social tab and go to delete mails received in the month of May
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@role='heading'])[3]")));
		driver.findElement(By.xpath("(//*[@role='heading'])[3]")).click();
		//Get actual count of all mails before deletion in Social Tab
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-tooltip='Newer']/preceding::span[1]")));
		String temp=driver.findElement(By.xpath("//*[@data-tooltip='Newer']/preceding::span[1]")).getText();
		int anoam=Integer.parseInt(temp);		 //*[@aria-label='Show more messages']/descendant::span[5]
		System.out.println("Website count for total mails count before deletion is: "+anoam);
		int nomd=0;
		while(2>1)
		{
			List<WebElement> rl=driver.findElements(By.xpath("(//*[@role='tabpanel'])[2]/descendant::table/tbody/tr"));
			for(int i=1;i<=rl.size();i++)
			{
				String temp1=driver.findElement(By.xpath("(//*[@role='tabpanel'])[2]/descendant::table/tbody/tr["+i+"]/td[9]/span")).getAttribute("title");
				String x=temp1.toLowerCase();
				if(x.contains(name))
				{
					driver.findElement(By.xpath("(//*[@role='tabpanel'])[2]/descendant::table/tbody/tr["+i+"]/td[2]/div")).click();
					Thread.sleep(2000);
					Screen s=new Screen();
					s.mouseMove("gmaildeletebutton.png");
					//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-tooltip='Delete']/div")));
					//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-tooltip='Delete']/div")));
					driver.findElement(By.xpath("//div[@data-tooltip='Delete']/div")).click();
					nomd=nomd+1;
					Thread.sleep(3000);
					//To check mail which was occupied by the deleted mail
					i=i-1;
					rl=driver.findElements(By.xpath("(//*[@role='tabpanel'])[2]/descendant::table/tbody/tr"));
				}
			}
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
		if(nomd!=0)
		{
			//Total no of mails deleted
			System.out.println("Total no of mails deleted are "+nomd);
			//Get all mails count after deletion
			temp=driver.findElement(By.xpath("//*[@data-tooltip='Newer']/preceding::span[1]")).getText();
			int amcad=Integer.parseInt(temp);		 //*[@aria-label='Show more messages']/descendant::span[5]
			System.out.println("Website count for total mails count after deletion is: "+amcad);
			//validations
			if(nomd==anoam-amcad)
			{
				et.log(LogStatus.PASS,"Gmail delete mails from specific month test passed");
			}
			else
			{
				SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
				Date d=new Date();
				String fname=sf.format(d)+".png";
				File src=driver.getScreenshotAs(OutputType.FILE);
				File dest=new File(fname);
				FileHandler.copy(src, dest);
				et.log(LogStatus.FAIL,"Gmail delete mails from specific month test failed",et.addScreenCapture(fname));
			}
		}
		else
		{
			System.out.println("No mails were deleted from the specified month");
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
