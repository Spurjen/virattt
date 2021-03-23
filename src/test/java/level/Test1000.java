package level;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1000 
{
	public static void main(String[] args) throws Exception
	{

		RemoteWebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		
		String x= driver.getCurrentUrl();
		if(x.startsWith("http"))
		{
			System.out.println("site is secured");
		}
		else
		{
			System.out.println("not secured");
		}
		
		String y=driver.getTitle();
		System.out.println(y);
		
		if(y.equalsIgnoreCase("google"))
		{
			System.out.println("Title test passed");
		}
		else
		{
			System.out.println("Title test failed");
		}
		
	}
}
