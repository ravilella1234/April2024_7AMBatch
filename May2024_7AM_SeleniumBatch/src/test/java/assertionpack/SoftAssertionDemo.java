package assertionpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertionDemo 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		String actualLink = driver.findElement(By.linkText("Best Sellers")).getText();
		String expectedLink = "Best Seller";
		
		SoftAssert obj = new SoftAssert();
		//obj.assertEquals(actualLink, expectedLink);
		obj.assertTrue(actualLink.equals(expectedLink), "Links are not equal...");
		
		obj.assertTrue(false, "err1");
		
		obj.assertTrue(false, "err2");
		
		obj.assertTrue(true, "err3");
		
		obj.assertTrue(false, "err4");
	
		//driver.findElement(By.linkText("Best Seller")).click();
		
		driver.findElement(By.linkText("Best Sellers")).click();
		
		obj.assertAll();
	}

}
