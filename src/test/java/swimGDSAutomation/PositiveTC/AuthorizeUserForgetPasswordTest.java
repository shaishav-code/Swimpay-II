package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.AuthorizeUserForgetPasswordPage;
import swimGDSAutomation.pageclass.LandingPage;

public class AuthorizeUserForgetPasswordTest extends BaseClass {

	
	String email = "test30@yopmail.com";
	String password ="	Pratiksha@86";
	String expected ="Forgot Password?";
	
	
	//Verify if user is able to enter the Authorize User email Id in Forget password page
	@Test(priority=1)
	public void EnterEmail_ForgetPasswordPage(){
			
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();		
		AuthorizeUserForgetPasswordPage authforgetpasswordpage = landingPage.AuthForgetPasswordOption();
		authforgetpasswordpage.Enter_email(email);
		authforgetpasswordpage.Nextbutton();
		}

	
	//Verify if user received the reset password mail on mentioned Authorize User Email Id and is able to click on Reset Password button
	@Test(priority=2)
	public void Verify_ResetPasswordMail() throws InterruptedException{
				
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();		
		AuthorizeUserForgetPasswordPage authforgetpasswordpage = landingPage.AuthForgetPasswordOption();
		authforgetpasswordpage.Enter_email(email);
		authforgetpasswordpage.Nextbutton();
		authforgetpasswordpage.waitCode();
		boolean ResetbtnDisplayed = authforgetpasswordpage.Verify_resetmail();
		Assert.assertTrue(ResetbtnDisplayed, "Reset Password button is displayed");
		authforgetpasswordpage.ResetPasswordbtn();
		}
	
	String ExpectedSuccessmessage = "Success!";
	
	//Verify if user is able to click on submit button after entering the new and confirm password for Authorize User and get the success message
	@Test(priority=3)
	public void Verify_ClickOnSubmitButton() throws InterruptedException{
				
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();		
		AuthorizeUserForgetPasswordPage authforgetpasswordpage = landingPage.AuthForgetPasswordOption();
		authforgetpasswordpage.Enter_email(email);
		authforgetpasswordpage.Nextbutton();
		authforgetpasswordpage.waitCode();
		authforgetpasswordpage.Verify_resetmail();
		authforgetpasswordpage.ResetPasswordbtn();
		authforgetpasswordpage.Windowhandling(1);
		authforgetpasswordpage.Enter_NewandConfirmPassword();
		authforgetpasswordpage.Click_submitbtn();
		String ActualSuccessmessage = authforgetpasswordpage.SuccessMessage();
		Assert.assertEquals(ActualSuccessmessage, ExpectedSuccessmessage);
	    }	
	
}
