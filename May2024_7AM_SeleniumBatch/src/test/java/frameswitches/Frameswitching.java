package frameswitches;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frameswitching 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
		//List<WebElement> f = driver.findElements(By.tagName("frame"));
		//System.out.println(f.size());
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("java.applet")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		driver.findElement(By.linkText("Applet")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		driver.findElement(By.linkText("JApplet")).click();
	}

}
