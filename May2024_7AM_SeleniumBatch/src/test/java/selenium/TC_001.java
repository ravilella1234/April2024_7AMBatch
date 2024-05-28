package selenium;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		launch("Firefox");
		
		navigateUrl("https://www.bestbuy.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.quit();
	}

}
