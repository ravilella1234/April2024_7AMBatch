package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserLaunch 
{
	public static void main(String[] args) 
	{
		WebDriver driver;
		
		//"webdriver.chrome.driver"
		//WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\ravi\\Downloads\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("https://www.amazon.in/");
		
		//"webdriver.edge.driver"
		//WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		 driver.get("https://www.bestbuy.com/");
	}

}
