package webDriverscreenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy3 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement loc = driver.findElement(By.linkText("Best Sellers"));
		String text = loc.getText();
		System.out.println(text);
		
		
		/*List<WebElement> ele = driver.findElements(By.tagName("a"));
		for(int i=0;i<ele.size();i++)
		{
			if(!ele.get(i).getText().isEmpty())
			{
				System.out.println(ele.get(i).getText());
			}
		}*/
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		for(int i=0;i<ele.size();i++)
		{
			System.out.println(ele.get(i).getText());
		}
		
	}

}
