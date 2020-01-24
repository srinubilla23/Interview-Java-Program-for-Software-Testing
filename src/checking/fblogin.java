package checking;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class fblogin 
{
	WebDriver driver;
	@Test(priority=1)
	public void launch()
	{
		System.out.println("Enter Browser Name: ");
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		  
		if (x.equalsIgnoreCase("c")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver(); 
		} else if (x.equalsIgnoreCase("f")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Jar Files\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (x.equalsIgnoreCase("i")) {
			System.setProperty("webdriver.ie.driver", "D:\\Jar Files\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	@Test(priority=2)
	public void browser()
	{
		driver.get("http://www.facebook.com");
	}
	
	@Test(priority=3)
	public void close()
	{
		driver.close();
	}
	
}
