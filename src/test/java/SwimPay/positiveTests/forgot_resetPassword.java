package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.forgotPasswordPage;
import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class forgot_resetPassword extends baseClass{
	String email1="qa1@narola.email";
	String email2= "qa2@narola.email";
	String password= "Pass@12345";
	
	
	//Verify clicking on forgot password option
	@Test(priority = 1)
	public void clickForgotPasswordOpt() throws InterruptedException 
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.pauseRun2();
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		LoginPage.pauseRun2();
		
	}
	
	//Verify submitting valid registered email for forgot password
	@Test(priority = 2)
	public void submitForgotPasswordEmail() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		LoginPage.pauseRun2();
		forgotPassword.forgotPassword_Email(email2);
		LoginPage.pauseRun3();
		forgotPassword.forgotPassword_EmailSubmit();
		forgotPassword.otpData();
		forgotPassword.otpSubmitBtn();
		LoginPage.pauseRun2();
	
		}
	
	//Verify reset password with valid specified format 
	@Test(priority = 3)
	public void ResetPassword() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.pauseRun2();
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		//forgotPassword.loginClick();
		LoginPage.pauseRun2();
		forgotPassword.forgotPassword_Email(email1);
		LoginPage.pauseRun2();
		forgotPassword.forgotPassword_EmailSubmit();
		forgotPassword.otpData();
		forgotPassword.otpSubmitBtn();
		forgotPassword.resetPassword(password, password);
		forgotPassword.resetPasswordSubmit();
//		LoginPage.pauseRun2();
//		forgotPassword.backToLogin();
	}
	
	//Verify clicking on back to login option from forgot or reset password page
	@Test(priority = 4)
	public void backToLoginPageFromForgotPasswordPage() throws InterruptedException 
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.pauseRun2();
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		LoginPage.pauseRun2();
		
	}
}

