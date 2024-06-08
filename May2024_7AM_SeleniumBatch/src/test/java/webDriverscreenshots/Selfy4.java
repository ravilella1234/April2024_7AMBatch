package webDriverscreenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy4 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> loc = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		for(int i=0;i<loc.size();i++)
		{
			Date dt = new Date();
			String d = dt.toString().replace(':', '_').replace(' ', '_');
			
			String linkName = loc.get(i).getText();
			loc.get(i).click();
			File scrnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scrnshot, new File("C:\\Users\\ravi\\Desktop\\Screenshots\\"+linkName+"_"+d+".png"));
			loc = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		}
		
	}

}
