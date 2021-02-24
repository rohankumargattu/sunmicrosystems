package oraclecorp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sample8 
{
	//Global objects
	public RemoteWebDriver driver;
	
	public Sample8()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void browserPeddagaCheyyi()
	{
		driver.manage().window().maximize();
	}
	
	public void siteOpenCheyyi(String url)
	{
		driver.get(url);
	}
	
	public void konchamAagu(int enthasepu) throws Exception
	{
		Thread.sleep(enthasepu);
	}
	
	public void siteMuyyi()
	{
		driver.close();
	}
}
