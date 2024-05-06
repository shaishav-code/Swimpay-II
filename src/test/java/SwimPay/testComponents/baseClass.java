package SwimPay.testComponents;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import SwimPay.AbstractComponents.abstractComponentsMethods;
import SwimPay.pageObject.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	public WebDriver driver;
	public loginPage LoginPage;
	String email3 = "qa3@narola.email";
	String password3 = "12345678";

	public WebDriver invokeDriver() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		return driver;
	}

	@BeforeMethod(alwaysRun = true)
	public loginPage lanuchWebsite() throws InterruptedException {
		driver = invokeDriver();
		LoginPage = new loginPage(driver);
		LoginPage.invokeURL();
		return LoginPage;

	}

	// Closing browser once Test Methods completed

	@AfterMethod

	public void tearDown() throws InterruptedException {
		abstractComponentsMethods AbstarctPage = new abstractComponentsMethods(driver);
		AbstarctPage.Logout();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.urlContains("http://192.168.100.141:3500/auth/login"));
//		System.out.println(driver.getCurrentUrl());
//		 if (driver != null) {
//	            driver.quit(); // Quit the browser session
//	        }
	driver.quit();

	}

	public String getScreenshots(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot src = (TakesScreenshot) driver;
		File source = src.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//Reports" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//Reports" + testCaseName + ".png";
	}

	// ====Login logout========///
	public void loginLogout_Admin() {
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password3);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
	}

	@FindBy(xpath = "//i[@class='bi bi-power text-light fw-bold']")
	private WebElement logout;

	public void Logout_Click(WebDriver driver) {

		logout.click();

	}
}
