package swimGDSAutomation.TestComponents;

import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import swimGDSAutomation.pageclass.LandingPage;


public class BaseClass {
	
	public WebDriver driver;
	public LandingPage landingPage;
	public WebDriverWait waitt;
	
	public WebDriver invokeDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	@BeforeMethod
	public LandingPage lanuchWebsite() throws InterruptedException
	{
		 driver=invokeDriver();
		 landingPage =new LandingPage(driver);
		 landingPage.launchURL();
		 return landingPage;
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		 waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
		 //driver.quit();
	}
	
	public static String getScreenshots(String testCaseName, WebDriver driver) throws java.io.IOException {
		TakesScreenshot src = (TakesScreenshot) driver;
		File source = src.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//Reports" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + testCaseName + ".png";
	}
	

}
