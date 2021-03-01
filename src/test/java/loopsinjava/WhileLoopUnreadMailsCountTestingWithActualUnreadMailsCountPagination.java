package loopsinjava;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WhileLoopUnreadMailsCountTestingWithActualUnreadMailsCountPagination 
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
		ExtentReports er=new ExtentReports("whileloopunreadmailscountwithactualunreadmailscountpagination.html",false);
		ExtentTest et=er.startTest("Gmail unread mails count via pagination using while loop");
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
		//Get count of unread mails via pagination
		int enourm=0;
		while(2>1)
		{
			List<WebElement> mails=driver.findElements(By.xpath("(//table)[4]/tbody/tr"));
			int nomp=mails.size();
			//Count of unread mails
			for(int i=1;i<=nomp;i++)
			{
				WebElement e=driver.findElement(By.xpath("(//table)[4]/tbody/tr["+i+"]/td[5]/div[1]"));
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("var v=arguments[0].textContent;window.alert(v);",e);
				//Thread.sleep(1000);
				String x=driver.switchTo().alert().getText();
				//Thread.sleep(1000);
				driver.switchTo().alert().dismiss();
				//driver.switchTo().alert().accept();
				if(x.contains("unread"))
				{
					enourm=enourm+1;
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
		//Get actual count of unread mails
		String temp=driver.findElement(By.xpath("//*[@data-tooltip='Inbox']/div/div[2]/div")).getText();
		int anourm=Integer.parseInt(temp);
		//Validations
		System.out.println("Program count is "+enourm);
		System.out.println("Website count is "+anourm);
		if(enourm==anourm)
		{
			et.log(LogStatus.PASS,"Gmail unread mails count test passed");
		}
		else
		{
			SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
			Date d=new Date();
			String fname=sf.format(d)+".png";
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File(fname);
			FileHandler.copy(src, dest);
			et.log(LogStatus.FAIL,"Gmail unread mails count test failed",et.addScreenCapture(fname));
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
