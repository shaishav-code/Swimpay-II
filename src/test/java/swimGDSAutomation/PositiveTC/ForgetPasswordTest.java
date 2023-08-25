package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.ForgetPasswordPage;
import swimGDSAutomation.pageclass.LandingPage;

public class ForgetPasswordTest extends BaseClass {
	
	String email = "nda.norala@yopmail.com";
	String password ="Nayan@86";
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
	}
	
	
	//Verify if user is able to go back on login page from forget password page after clicking on back option 
	@Test(priority=2)
	public void ClickBack_fromForgetPage()
	{
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		ForgetPasswordPage forgetpasswordpage = landingPage.ForgetPasswordOption();
		forgetpasswordpage.Clickback();
        
	}
	
	//Verify if user is able to enter the email in Forget password page and navigate to Security Questions
	@Test(priority=3)
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
	@Test(priority=4)
	public void EnterAnswer_SecurityQues(){
				
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();		
		ForgetPasswordPage forgetpasswordpage = landingPage.ForgetPasswordOption();
		forgetpasswordpage.Enter_email(email);
		forgetpasswordpage.Nextbutton();
		forgetpasswordpage.Answerfield();
		forgetpasswordpage.Verification_attribute();
		}
	
	//Verify if user received the reset password mail on mentioned Email Id
	@Test(priority=5)
	public void Verify_ResetPasswordMail() throws InterruptedException{
				
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();		
		ForgetPasswordPage forgetpasswordpage = landingPage.ForgetPasswordOption();
		forgetpasswordpage.Enter_email(email);
		forgetpasswordpage.Nextbutton();
		forgetpasswordpage.Answerfield();
		forgetpasswordpage.Nextbutton();
		forgetpasswordpage.waitCode();
		boolean ResetbtnDisplayed = forgetpasswordpage.Verify_resetmail();
		Assert.assertTrue(ResetbtnDisplayed, "Reset Password button is displayed");

		}
	
	//Verify if user is able to click on reset password button and is able to navigate to the required page
	@Test(priority=6)
	public void ResetPassword() throws InterruptedException{
				
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();		
		ForgetPasswordPage forgetpasswordpage = landingPage.ForgetPasswordOption();
		forgetpasswordpage.Enter_email(email);
		forgetpasswordpage.Nextbutton();
		forgetpasswordpage.Answerfield();
		forgetpasswordpage.Nextbutton();
		forgetpasswordpage.waitCode();
		boolean ResetbtnDisplayed = forgetpasswordpage.Verify_resetmail();
		Assert.assertTrue(ResetbtnDisplayed, "Reset Password button is displayed");	
		forgetpasswordpage.ResetPasswordbtn();

		}

	//Verify if user is able to enter the New and Confirm password 
	@Test(priority=7)
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
		forgetpasswordpage.Enter_NewandConfirmPassword();
		}
	
	String ExpectedSuccessmessage = "Success!";
	
	//Verify if user is able to click on submit button after entering the new and confirm password and get the success message
	@Test(priority=8)
	public void Verify_ClickOnSubmitButton() throws InterruptedException{
				
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
		forgetpasswordpage.Enter_NewandConfirmPassword();
		forgetpasswordpage.Click_submitbtn();
		String ActualSuccessmessage = forgetpasswordpage.SuccessMessage();
		Assert.assertEquals(ActualSuccessmessage, ExpectedSuccessmessage);
	    }	
	
}
