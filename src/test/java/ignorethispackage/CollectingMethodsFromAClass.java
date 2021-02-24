package ignorethispackage;

import java.lang.reflect.Method;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectingMethodsFromAClass
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		Actions a=new Actions(driver);
		Method m[]=a.getClass().getMethods();
		int x=m.length;
		System.out.println(x);
		for(int i=0;i<x;i++)
		{
			System.out.println(m[i].getName());
		}
		driver.close();
	}
}
