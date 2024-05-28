package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	public static Properties p;
	public static FileInputStream fis;
	public static Properties mainprop;
	public static Properties childprop;
	public static Properties orprop;
	
	public static void init() throws Exception
	{
		//FileInputStream fis = new FileInputStream("D:\\Ashok2024WD\\May2024_7AM_SeleniumBatch\\src\\test\\resources\\data.properties");
		//System.out.println(System.getProperty("user.dir"));
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\data.properties");
		p = new Properties();
		p.load(fis);
		String e = p.getProperty("firefoxbrowser");
		System.out.println(e);
		
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\environment.properties");
		mainprop = new Properties();
		mainprop.load(fis);
		String k = mainprop.getProperty("env");
		System.out.println(k);
		
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\"+k+".properties");
		childprop = new Properties();
		childprop.load(fis);
		System.out.println(childprop.getProperty("amazonurl"));
		
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\or.properties");
		orprop = new Properties();
		orprop.load(fis);
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) {
			driver = new ChromeDriver();
		}else if (p.getProperty(browser).equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if (p.getProperty(browser).equals("edge")) {
			driver =  new EdgeDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(childprop.getProperty(url));
	}
	
	public static void clickElement(String locatorKey) 
	{
		//driver.findElement(By.xpath(orprop.getProperty(locatorKey))).click();
		getElement(locatorKey).click();
	}

	
	public static void typeText(String locatorKey, String text) 
	{
		//driver.findElement(By.id(orprop.getProperty(locatorKey))).sendKeys(text);
		getElement(locatorKey).sendKeys(text);
	}

	public static void selectOption(String locatorKey, String option) 
	{
		//driver.findElement(By.id(orprop.getProperty(locatorKey))).sendKeys(option);
		getElement(locatorKey).sendKeys(option);
	}

	
	public static WebElement getElement(String locatorKey) 
	{
		WebElement element = null;
		
		if(locatorKey.endsWith("_id")) {
			element = driver.findElement(By.id(orprop.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_name")) {
			element = driver.findElement(By.name(orprop.getProperty(locatorKey)));
		} else if (locatorKey.endsWith("_classname")) {
			element = driver.findElement(By.className(orprop.getProperty(locatorKey)));
		} else if (locatorKey.endsWith("_xpath")) {
			element = driver.findElement(By.xpath(orprop.getProperty(locatorKey)));
		} else if (locatorKey.endsWith("_css")) {
			element = driver.findElement(By.cssSelector(orprop.getProperty(locatorKey)));
		} else if (locatorKey.endsWith("_linktext")) {
			element = driver.findElement(By.linkText(orprop.getProperty(locatorKey)));
		} else if (locatorKey.endsWith("_partiallinktext")) {
			element = driver.findElement(By.partialLinkText(orprop.getProperty(locatorKey)));
		} 
		return element;
	}
}
