package swimGDSAutomation.Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {

	static ExtentReports extent;

	public static ExtentReports extentReportGenerator()
	
	{

	String path = System.getProperty("user.dir")+"//reports//index.html";

	ExtentSparkReporter reporter = new ExtentSparkReporter(path);

	reporter.config().setTheme(Theme.DARK);

	reporter.config().setReportName("Swim-Pay Automation");
	
	reporter.config().setDocumentTitle("Swim Pay Automation Test Report");

	extent = new ExtentReports();

	extent.attachReporter(reporter);

	extent.setSystemInfo("Project name", "Swim Pay Website");

	extent.setSystemInfo("Environment", "SIT");

	extent.setSystemInfo("Executed by", "Nayan Akojwar");

	return extent;
  }
}