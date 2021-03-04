package oraclecorp;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultiThreadingEformsAgility extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(15000);
			//Automate pop-up window
			Robot r=new Robot();
			StringSelection x=new StringSelection("mindq");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			StringSelection y=new StringSelection("mindq123");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);	
		}
		catch(Exception ex)
		{
		}
	}
	public static void main(String[] args) throws Exception
	{
		MultiThreadingEformsAgility obj=new MultiThreadingEformsAgility();
		obj.start();
		//Launch browser
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//Open site
		driver.get("https://eforms.agility.com");
		Thread.sleep(5000);
		driver.close();
	}
}
