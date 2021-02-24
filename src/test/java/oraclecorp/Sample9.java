package oraclecorp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sample9 
{
	//Global objects
	public RemoteWebDriver driver;
	
	public Sample9()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void browserBadaKaro()
	{
		driver.manage().window().maximize();
	}
	
	public void siteChaluKaro(String url)
	{
		driver.get(url);
	}
	
	public void zaraRuko(int kitnidertakrukana) throws Exception
	{
		Thread.sleep(kitnidertakrukana);
	}
	
	public void sitekoSulao()
	{
		driver.close();
	}
}
