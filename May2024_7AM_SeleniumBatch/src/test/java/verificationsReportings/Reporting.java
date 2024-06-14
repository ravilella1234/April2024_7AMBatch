package verificationsReportings;

import com.aventstack.extentreports.Status;

import selenium.BaseTest;

public class Reporting extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("Reporting");
		test.log(Status.INFO, "init the properties files.....");
		
		launch("chromebrowser");
		test.log(Status.PASS, "opened the Browser :"+ p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigated to application : "+ childprop.getProperty("amazonurl"));

		String expectedLink = "Best Seller";		
		
		if(!islinkEqual(expectedLink))
			//System.out.println("Both links are not equal...");
			reportFail("Both links are not equal...");
		else 
			//System.out.println("Both links are  equal...");
			reportPass("Both links are  equal...");
		
		report.flush();
			
	}	

}
