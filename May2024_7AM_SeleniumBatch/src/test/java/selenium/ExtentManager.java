package selenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager 
{
	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{
		if(htmlReport == null)
		{
			htmlReport = new ExtentHtmlReporter(System.getProperty("user.dir")+"//report//htmlreport.html");
			htmlReport.config().setDocumentTitle("Automation Report");
			htmlReport.config().setReportName("Functional Report");
			htmlReport.config().setTheme(Theme.STANDARD);
			
			report = new ExtentReports();
			report.attachReporter(htmlReport);
			report.setSystemInfo("OS", "windows");
			report.setSystemInfo("TesterName", "Ravilella");
			report.setSystemInfo("Browser", "Chrome");
		}
		
		
		return report;
	}
}
