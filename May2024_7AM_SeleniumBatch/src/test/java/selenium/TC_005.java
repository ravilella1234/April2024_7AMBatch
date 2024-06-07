package selenium;

import com.aventstack.extentreports.Status;

public class TC_005 extends BaseTest
{
	

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("TC_005");
		test.log(Status.INFO, "init the properties files.....");
		
		launch("chromebrowser");
		test.log(Status.PASS, "opened the Browser :"+ p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigated to application : "+ childprop.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id","Books");
		test.log(Status.PASS, "selected the option Books By using locator : " + orprop.getProperty("amazondropdown_id"));
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		test.log(Status.PASS, "Entered the text Harry Potter  By using locator :" + orprop.getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonserachbutton_xpath");
		test.log(Status.PASS, "Clicked on Button By using locator : " + orprop.getProperty("amazonserachbutton_xpath"));
		
		report.flush();
	}

}
