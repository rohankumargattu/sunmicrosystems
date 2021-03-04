package oraclecorp;

import org.openqa.selenium.chrome.ChromeDriver;

public class FinalizeClass 
{
	public void finalize()
	{
		System.out.println("Testing Completed");
	}
	public static void main(String[] args) throws Exception
	{
		//Launch browser
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Maximize
		driver.manage().window().maximize();
		//Open site
		driver.get("http://www.google.co.in/");
		Thread.sleep(5000);
		driver.close();
		FinalizeClass obj=new FinalizeClass();
		obj=null;
		//finalize method can run automatically
		System.gc();
	}
}
