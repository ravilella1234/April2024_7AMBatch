package selenium;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("firefoxbrowser");
		
		navigateUrl("amazonurl");
		
		selectOption("amazondropdown_id","Books");
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		
		clickElement("amazonserachbutton_xpath");
		
		
		
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}

	

}
