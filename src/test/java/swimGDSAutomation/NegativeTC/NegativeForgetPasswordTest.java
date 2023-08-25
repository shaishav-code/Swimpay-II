package swimGDSAutomation.NegativeTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.ForgetPasswordPage;
import swimGDSAutomation.pageclass.LandingPage;

public class NegativeForgetPasswordTest extends BaseClass{
	
	    String email = "nda.norala@yopmail.com";
	    String password ="Nayan@86";
	    String unregisteredemail="nda@narola.email";
	    String unverifiedemail="nik07@yopmail.com";

	 
	    //Verify if user is able to click on next button without inserting Email id in forget password page
		@Test(priority=1)
		public void WithoutInsertingEmail_ClickNextBtn(){
			
			LandingPage landingPage = new LandingPage(driver);
			landingPage.SellerLogin();	
			landingPage.Loginpage();
			ForgetPasswordPage forgetpasswordpage = landingPage.ForgetPasswordOption();
			boolean enabledOrNot = forgetpasswordpage.Nextbtn_enabled();
			Assert.assertFalse(enabledOrNot, "Next button is not enabled, first please insert the email Id");
			forgetpasswordpage.Nextbutton();
		}
		
		
	    //Verify if user is able to get the reset mail on unregistered email ID in forget password page
		@Test(priority=2)
		public void InsertUnregisteredEmail_ClickNext(){
			
			LandingPage landingPage = new LandingPage(driver);
			landingPage.SellerLogin();	
			landingPage.Loginpage();
			ForgetPasswordPage forgetpasswordpage = landingPage.ForgetPasswordOption();
			forgetpasswordpage.Enter_email(unregisteredemail);
			forgetpasswordpage.Nextbutton();
			boolean unverifiedemail = forgetpasswordpage.InactiveEmail();
			Assert.assertTrue(unverifiedemail, "Can't move forward because the entered email is invalid or not Registered yet");
		}
		
		//Verify if user entered the invalid answer and click on Next button in forget password page
		@Test(priority=3)
		public void EnterAnswer_SecurityQues(){
					
			LandingPage landingPage = new LandingPage(driver);
			landingPage.SellerLogin();	
			landingPage.Loginpage();		
			ForgetPasswordPage forgetpasswordpage = landingPage.ForgetPasswordOption();
			forgetpasswordpage.Enter_email(email);
			forgetpasswordpage.Nextbutton();
			forgetpasswordpage.Invalidanswer();
			forgetpasswordpage.Nextbutton();
		}
		
		
		//Verify if user is able to get the reset mail on unverified email id in forget password page
		@Test(priority=4)
		public void InsertUnverifiedemail_clickNext(){
			
			LandingPage landingPage = new LandingPage(driver);
			landingPage.SellerLogin();	
			landingPage.Loginpage();
			ForgetPasswordPage forgetpasswordpage = landingPage.ForgetPasswordOption();
			forgetpasswordpage.Enter_email(unverifiedemail);
			forgetpasswordpage.Nextbutton();
			boolean unverifiedemail = forgetpasswordpage.InactiveEmail();
			Assert.assertTrue(unverifiedemail, "Can't move forward because the entered email is not Verified yet by Admin");
		}
		
		//Verify without inserting the answer and user click on next button in forget password page
		@Test(priority=5)
		public void WithoutInsertingAnswer_clickNext() throws InterruptedException{
			
			LandingPage landingPage = new LandingPage(driver);
			landingPage.SellerLogin();	
			landingPage.Loginpage();
			ForgetPasswordPage forgetpasswordpage = landingPage.ForgetPasswordOption();
			forgetpasswordpage.Enter_email(email);
			forgetpasswordpage.Nextbutton();
			boolean enabledOrNot = forgetpasswordpage.Nextbtn_enabled();
			Assert.assertFalse(enabledOrNot, "Next button is not enabled, first please insert the Answer");
			forgetpasswordpage.Nextbutton();
		}
		
		
		String Text = "Passwords do not match";
		
		//Verify if user is able to insert the mismatched New and Confirm password in Reset password page
		@Test(priority=6)
		public void Enter_NewandConfirmPassword() throws InterruptedException{
					
			LandingPage landingPage = new LandingPage(driver);
			landingPage.SellerLogin();	
			landingPage.Loginpage();		
			ForgetPasswordPage forgetpasswordpage = landingPage.ForgetPasswordOption();
			forgetpasswordpage.Enter_email(email);
			forgetpasswordpage.Nextbutton();
			forgetpasswordpage.Answerfield();
			forgetpasswordpage.Nextbutton();
			forgetpasswordpage.waitCode();
			forgetpasswordpage.Verify_resetmail();
			forgetpasswordpage.ResetPasswordbtn();
			forgetpasswordpage.Windowhandling(1);
			forgetpasswordpage.Invalid_NewandConfirmPassword();
			forgetpasswordpage.Click_submitbtn();
			String text = forgetpasswordpage.EnterinvalidPassword();
			Assert.assertEquals(text, Text);
			}
}
