package actionsProgrames;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo 
{
	public static WebDriver driver;
	public static Actions a;
	
	public static void mouseOverElement(String locator)
	{
		driver.get("https://snapdeal.com/");
		a = new Actions(driver);
		WebElement e = driver.findElement(By.xpath(locator));
		a.moveToElement(e).perform();
		driver.findElement(By.linkText("Your Orders")).click();
	}
	
	public static void dragAndDropElement(String sourcelocator, String targetlocator)
	{
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		a = new Actions(driver);
		WebElement drag = driver.findElement(By.id(sourcelocator));
		WebElement drop = driver.findElement(By.id(targetlocator));
		
		//a.dragAndDrop(drag, drop).perform();
		a.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
	}

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//mouseOverElement("//span[text()='Sign In']");
		dragAndDropElement("draggable", "droppable");
	}

}
