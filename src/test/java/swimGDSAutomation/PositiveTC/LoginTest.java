package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;

public class LoginTest extends BaseClass{

	
	String email = "nda.norala@gmail.com";
	String password ="Nikhil@86";
	String expectedtext ="Home";
	String expectedURL = "https://demo.swimgds.com/";
	
	//Verify if user can insert the username and password and clicks on back button.
	@Test(priority=1)
	public void EnterEmailandPassword_clickBack() {
		
	LandingPage landingPage = new LandingPage(driver);
	landingPage.SellerLogin();	
	landingPage.Loginpage();
	landingPage.Enter_useremail(email);
	landingPage.Enter_password(password);
	landingPage.Backoption();
	
	String actualURL = driver.getCurrentUrl();
	Assert.assertEquals(actualURL, expectedURL);
	}
	
	
	//Verify if user can do login with valid credentials
	@Test(priority=2)
	public void LoginWithValidCredentails() {
		
	LandingPage landingPage = new LandingPage(driver);
	landingPage.SellerLogin();	
	landingPage.Loginpage();
	
	boolean Boolean = landingPage.Loginpage_assertion();
	Assert.assertTrue(Boolean, "Back button is displayed on DOM");
	
	landingPage.Enter_useremail(email);
	landingPage.Enter_password(password);
	landingPage.Loginbtn();
	}
	
	
	//Verify if user is able to do login with valid credentials and clicks on password icon (enabled and disabled)
	@Test(priority=3)
	public void LoginWithValidCredentails_withPassIcon() {
	
	LandingPage landingPage = new LandingPage(driver);
	landingPage.SellerLogin();	
	landingPage.Loginpage();
	landingPage.Enter_useremail(email);
	landingPage.Enter_password(password);
	landingPage.Click_PassEye();
	landingPage.Click_PassEye();
	landingPage.Loginbtn();
	}
	
	
	//Verify if user can do login with valid credentials with Remember checkbox is selected
	@Test(priority=4)
	public void LoginWithValidCredentails_withSelectedRememberMe() {
		
	LandingPage landingPage = new LandingPage(driver);
    landingPage.SellerLogin();	
	landingPage.Loginpage();
	landingPage.Enter_useremail(email);
	landingPage.Enter_password(password);
	landingPage.Click_PassEye();
	
	boolean isselected = landingPage.Select_rememberme();
	Assert.assertTrue(isselected, "Remember-me checkbox is selected");
	
	landingPage.Loginbtn();
	}
	
	//Verify if user can do login with valid credentials and all visible options
	@Test(priority=5)
	public void LoginWith_AllVisibleOptions() {
		
	LandingPage landingPage = new LandingPage(driver);
	landingPage.SellerLogin();	
	landingPage.Loginpage();
	landingPage.Enter_useremail(email);
	landingPage.Enter_password(password);
	landingPage.Click_PassEye();
	landingPage.Loginbtn();
	}

	
	//Verify if user is able to do login with valid credentials and able to do logout
	@Test(priority=6)
	public void LoginAndLogout() {
		
	LandingPage landingPage = new LandingPage(driver);
	landingPage.SellerLogin();	
	landingPage.Loginpage();
	landingPage.Enter_useremail(email);
	landingPage.Enter_password(password);
	landingPage.Click_PassEye();
	landingPage.Loginbtn();
	
	String Actualtext = landingPage.Assertion_ondashboard();
	Assert.assertEquals(Actualtext, expectedtext);
	
	landingPage.Logoutbtn();
	}
	
	//Verify if user is able to click on Back arrow to navigate to Landing page
    //pass- https://prnt.sc/qBOSRmEGW5Le
	@Test(priority=7)

	public void ClickBackArrowToNavigateLandingPage() {
			
	LandingPage landingPage = new LandingPage(driver);
	landingPage.SellerLogin();	
	landingPage.Loginpage();
	landingPage.Click_backarrow();
	String url = landingPage.CurrentURLOfPage();
	Assert.assertEquals(url, "https://demo.swimgds.com/");
	
	}
	
	
	//Verify if user is able to get the title for the Login page
	//Pass- https://prnt.sc/7h5S9wN10B70
	@Test(priority=8)

	public void GetTitleForLoginPage() {
			
	LandingPage landingPage = new LandingPage(driver);
	landingPage.SellerLogin();	
	landingPage.Loginpage();
	String logintitle = landingPage.titleOfPage();
	System.out.println("Title of the page is :" +logintitle);
	Assert.assertEquals(logintitle, "SWiM GDS");
	try {
		landingPage.waitCode();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	

	}
}
