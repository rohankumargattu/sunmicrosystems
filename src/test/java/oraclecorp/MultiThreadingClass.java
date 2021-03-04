package oraclecorp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultiThreadingClass extends Thread
{
	public void run()
	{
		//Launch browser
		System.setProperty("webdriver.edge.driver","microsoftwebdriver.exe");
		EdgeDriver driver=new EdgeDriver();
		//maximize
		//driver.manage().window().maximize();
		//Open site
		driver.get("http://www.gmail.com");
		try 
		{
			Thread.sleep(1000);
		} 
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
		//Close site
		driver.close();
	}
	public static void main(String[] args) throws Exception
	{
		MultiThreadingClass obj=new MultiThreadingClass();
		obj.start();
		//Launch browser
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize
		//driver.manage().window().maximize();
		//Open site
		driver.get("http://www.google.co.in");
		//Thread.sleep(5000);
		//Close site
		driver.close();
	}
}
