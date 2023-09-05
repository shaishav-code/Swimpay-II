package swimGDSAutomation.NegativeTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.AuthorizeUserForgetPasswordPage;
import swimGDSAutomation.pageclass.LandingPage;

public class NegativeAuthorizeUserForgetPasswordTest extends BaseClass {

	    String email = "test30@yopmail.com";
	    String password ="Pratiksha@86";

	 
	    //Verify if user is able to click on next button without inserting Authorize User Email id in forget password page
		@Test(priority=1)
		public void WithoutInsertingEmail_ClickNextBtn(){
			
			LandingPage landingPage = new LandingPage(driver);
			landingPage.SellerLogin();	
			landingPage.Loginpage();
			AuthorizeUserForgetPasswordPage authforgetpasswordpage = landingPage.AuthForgetPasswordOption();
			boolean enabledOrNot = authforgetpasswordpage.Nextbtn_enabled();
			Assert.assertFalse(enabledOrNot, "Next button is not enabled, first please insert the email Id");
			authforgetpasswordpage.Nextbutton();
		}
		
		
		String Text = "Passwords do not match";
		
		//Verify if user is able to insert the mismatched New and Confirm password of Authorize User in Reset password page
		@Test(priority=2)
		public void Enter_NewandConfirmPassword() throws InterruptedException{
					
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
			authforgetpasswordpage.Invalid_NewandConfirmPassword();
			authforgetpasswordpage.Click_submitbtn();
			String text = authforgetpasswordpage.EnterinvalidPassword();
			Assert.assertEquals(text, Text);
			}
}
