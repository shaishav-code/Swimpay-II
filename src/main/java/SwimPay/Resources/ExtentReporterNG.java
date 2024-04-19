package SwimPay.Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports extentReport;
	
	public static ExtentReports getReporterObject()
	{
		String dirPath=System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter sparkReport=new ExtentSparkReporter(dirPath);
		sparkReport.config().setReportName("Swim-Pay Automation results");
		sparkReport.config().setDocumentTitle("Swim-Pay Automation Project");
		
		 extentReport= new ExtentReports();
		extentReport.attachReporter(sparkReport);
		extentReport.setSystemInfo("Tester", "Kuldeep Singh");
		return extentReport;
	}
	
	public static ExtentReports dummy()
	{
		String dirPath=System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter sparkReport=new ExtentSparkReporter(dirPath);
		sparkReport.config().setReportName("Swim-Pay Automation results");
		sparkReport.config().setDocumentTitle("Swim-Pay Automation Project");
		
		 extentReport= new ExtentReports();
		extentReport.attachReporter(sparkReport);
		extentReport.setSystemInfo("Tester", "Kuldeep Singh");
		return extentReport;
	}
}
