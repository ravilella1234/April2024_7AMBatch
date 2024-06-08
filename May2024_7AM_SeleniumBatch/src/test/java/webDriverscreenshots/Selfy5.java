package webDriverscreenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy5 
{

	public static void main(String[] args) throws Exception 
	{
		Date dt = new Date();
		System.out.println(dt);
		String d = dt.toString().replace(':', '_').replace(' ', '_');
		System.out.println(d);
	}

}
