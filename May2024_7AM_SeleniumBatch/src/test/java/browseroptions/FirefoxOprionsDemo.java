package browseroptions;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxOprionsDemo 
{

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions option = new FirefoxOptions();
		//option.addArguments("--headless");
		//option.addArguments("--private");
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile profile = p.getProfile("June2024FF");
		profile.setPreference("dom.webnotifications.enabled", false);
		
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		
		profile.setPreference("network.proxy.type", 1);
		profile.setPreference("network.proxy.scoks", "192.168.10.1");
		profile.setPreference("network.proxy.scoks_port", 1744);
				
		option.setProfile(profile);
		
		FirefoxDriver driver = new FirefoxDriver(option);
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.axisbank.com/");
		//driver.get("https://expired.badssl.com/");
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		System.out.println(driver.getTitle());
	}
	

}
