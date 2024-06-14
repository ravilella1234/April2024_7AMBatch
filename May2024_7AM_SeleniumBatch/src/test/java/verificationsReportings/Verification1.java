package verificationsReportings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification1 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//String actualLink = driver.findElement(By.linkText("Best Sellers")).getText();
		String actualLink = driver.findElement(By.linkText("Best Sellers")).getAttribute("innerHTML");
		String expectedLink = "Best Sellers";
		System.out.println("actualLink :" + actualLink);
		System.out.println("expectedLink :" + expectedLink);
		
		if(actualLink.equals(expectedLink))
			System.out.println("Both links are equal...");
		else 
			System.out.println("Both links are not equal...");
	}

}
