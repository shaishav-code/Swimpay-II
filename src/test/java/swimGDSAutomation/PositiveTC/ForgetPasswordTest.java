package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.ForgetPasswordPage;
import swimGDSAutomation.pageclass.LandingPage;

public class ForgetPasswordTest extends BaseClass {

	
	String email = "nda.narola@gmail.com";
	String password ="Nikhil@86";
	String expected ="Forgot Password?";
	
	//Verify if user is able to click on Forget password link
	@Test(priority=1)
	public void ClickonForgetPassword(){
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_useremail(email);
		landingPage.Enter_password(password);
		ForgetPasswordPage forgetpasswordpage = landingPage.ForgetPasswordOption();
		String Actual = forgetpasswordpage.Forgetpage();
		Assert.assertEquals(Actual, expected);	
		forgetpasswordpage.Clickback();
	}
	
	
	 
	String Email="cosco@gmail.com";
	
	//Verify if user is able to enter the email in Forget password page
	@Test(priority=2)
	public void EnterEmail_ForgetPasswordPage(){
			
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();		
		ForgetPasswordPage forgetpasswordpage = landingPage.ForgetPasswordOption();
		forgetpasswordpage.Enter_email(email);
		forgetpasswordpage.Nextbutton();
		boolean actualQuest = forgetpasswordpage.SecurityQues();
		Assert.assertTrue(actualQuest, "Question text is matched");
		}
	
	
	//Verify if user is able to enter the Answer in Security question page
	@Test(priority=2)
	public void EnterAnswer_SecurityQues(){
				
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();		
		ForgetPasswordPage forgetpasswordpage = landingPage.ForgetPasswordOption();
		forgetpasswordpage.Enter_email(email);
		forgetpasswordpage.Nextbutton();
		}
	
	
	
	
}
