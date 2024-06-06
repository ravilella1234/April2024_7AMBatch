package selenium;

import org.apache.log4j.Logger;

public class TC_004 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_004.class);

	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("init the properties files.....");
		
		launch("chromebrowser");
		log.info("opened the Browser :"+ p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to application : "+ childprop.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id","Books");
		log.info("selected the option Books By using locator : " + orprop.getProperty("amazondropdown_id"));
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		log.info("Entered the text Harry Potter  By using locator :" + orprop.getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonserachbutton_xpath");
		log.info("Clicked on Button By using locator : " + orprop.getProperty("amazonserachbutton_xpath"));
	}

}
