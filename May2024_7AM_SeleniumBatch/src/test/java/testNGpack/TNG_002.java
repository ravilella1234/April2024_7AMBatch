package testNGpack;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import selenium.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest
{
  
  
  @BeforeMethod
  public void beforeMethod() throws Exception 
  {
	  System.out.println("beforeMethod");
	    init();
		test = report.createTest("TNG_002");
		test.log(Status.INFO, "init the properties files.....");
		
		launch("chromebrowser");
		test.log(Status.PASS, "opened the Browser :"+ p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigated to application : "+ childprop.getProperty("amazonurl"));
  }

  @Test
  public void amazon() 
  {
	  System.out.println("amazon");
	    selectOption("amazondropdown_id","Books");
		test.log(Status.PASS, "selected the option Books By using locator : " + orprop.getProperty("amazondropdown_id"));
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		test.log(Status.PASS, "Entered the text Harry Potter  By using locator :" + orprop.getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonserachbutton_xpath");
		test.log(Status.PASS, "Clicked on Button By using locator : " + orprop.getProperty("amazonserachbutton_xpath"));
  }
  
  
  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("afterMethod");
	  report.flush();
	  driver.quit();
  }

}
