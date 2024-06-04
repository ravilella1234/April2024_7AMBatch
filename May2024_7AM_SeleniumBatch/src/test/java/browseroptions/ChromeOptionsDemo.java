package browseroptions;

import java.util.Collections;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsDemo 
{

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		String b = option.getBrowserName();
		System.out.println("Browser : " +  b);
		
		String v = option.getBrowserVersion();
		System.out.println("Browser Version : "+ v); 
		
		//option.addArguments("--headless");
		
		//option.addArguments("--incognito");
		
		//option.setExperimentalOption("excludeswitches", Collections.singletonList("enable-automation"));
		option.addArguments("--disable-notifications");
		
		option.addArguments("--ignore-certificate-errors");
		
		//option.addArguments("--proxy-server=https://192.168.10.1:1744");
		
		WebDriver driver = new ChromeDriver(option);
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.get("https://www.axisbank.com/");
		//driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		//driver.manage().window().maximize();
	}

}


