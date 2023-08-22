package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;

public class LoginTest extends BaseClass{

	
	String email = "cosco@gmail.com";
	String password ="Admin@123";
	String expectedtext ="Home";
	
	//Verify if user can do login with valid credentials
	@Test(priority=1)
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
	
	
	//Verify if user can do login with valid credentials with password icon in enabled and disabled form
	@Test(priority=2)
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
	@Test(priority=3)
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
	@Test(priority=4)
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
	@Test(priority=5)
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
	
}
