package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Example2 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		int pageMaxsize = driver.findElements(By.cssSelector("div[class='dt-paging']>nav>button")).size();
		System.out.println(pageMaxsize);
		
		for(int i=2;i<=8;i++)
		{
			String pageselector = "div[class='dt-paging']>nav>button:nth-child("+i+")";
			driver.findElement(By.cssSelector(pageselector)).click();
			
			List<WebElement> elementNames = driver.findElements(By.cssSelector("table#example>tbody>tr>td:nth-child(1)"));
			for(WebElement elementName:elementNames)
			{
				System.out.println(elementName.getText());
			}
			System.out.println("------- End Page --------");
		}
	}

}
