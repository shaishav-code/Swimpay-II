package SwimPay.testComponents;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import SwimPay.AbstractComponents.abstractComponentsMethods;
import SwimPay.pageObject.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	public WebDriver driver;
	public loginPage LoginPage;

	public WebDriver invokeDriver()
	{
        System.setProperty("wdm.targetPath", "/path/to/alternate/directory");
		WebDriverManager.chromedriver().setup();
	//	WebDriverManager.chromedriver().driverVersion("124.0.6367.62").setup();
		driver=new ChromeDriver();	
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	WebDriverManager.chromedriver().clearDriverCache().setup();		
		return driver;
	}
	
	@BeforeMethod(alwaysRun=true)
	public loginPage lanuchWebsite() throws InterruptedException
	{
		driver=invokeDriver();
		LoginPage=new loginPage(driver);
		LoginPage.invokeURL();
		return LoginPage;
		
		
	}
	
	//Closing browser once Test Methods completed 
	@AfterMethod
	public void tearDown()
	{
		abstractComponentsMethods AbstarctPage=new abstractComponentsMethods(driver);
		AbstarctPage.logout();	
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.urlContains("http://192.168.100.141:3500/auth/login"));
//		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}
	
	public String getScreenshots(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot src = (TakesScreenshot) driver;
		File source = src.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//Reports" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//Reports" + testCaseName + ".png";
	}
}
