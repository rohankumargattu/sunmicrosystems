package loopsinjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForLoopCollectAllTextBoxesFromFrames
{
	public static void main(String[] args) throws Exception
	{
		//Launch browser
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Maximize
		driver.manage().window().maximize();
		//Open site
		driver.get("https://jqueryui.com/button/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Demos'])[1]")));
		//Get count of all text boxes and buttons in page(out of frames)
		List<WebElement> tl=driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("No of text boxes in page are: "+tl.size());
		List<WebElement> bl=driver.findElements(By.xpath("(//button)|(//input[@type='button' or @type='submit' or @role='button'])|(//a[@role='button'])"));
		System.out.println("No of buttons in page are: "+bl.size());
		//Get count of all frames in page
		List<WebElement> fl=driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames in page are: "+fl.size());
		for(int i=0;i<fl.size();i++)
		{
			//Change driver object focus from page to frame
			driver.switchTo().frame(i);
			//Get count of all text boxes and buttons in  frames
			List<WebElement> tlf=driver.findElements(By.xpath("//input[@type='text']"));
			System.out.println("No of text boxes in frame "+(i+1)+" are: "+tlf.size());
			List<WebElement> blf=driver.findElements(By.xpath("(//button)|(//input[@type='button' or @type='submit' or @role='button'])|(//a[@role='button'])"));
			System.out.println("No of buttons in frame "+(i+1)+" are: "+blf.size());
			driver.switchTo().parentFrame();
		}
		driver.switchTo().defaultContent();
		//Close site
		driver.close();	
	}
}
