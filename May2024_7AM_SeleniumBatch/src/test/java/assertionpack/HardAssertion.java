package assertionpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertion 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		String actualLink = driver.findElement(By.linkText("Best Sellers")).getText();
		String expectedLink = "Best Seller";
		
		//Assert.assertEquals(actualLink, expectedLink);
		Assert.assertTrue(actualLink.equals(expectedLink), "Links are not equal...");
		
		driver.findElement(By.linkText("Best Sellers")).click();
		
	}

}
