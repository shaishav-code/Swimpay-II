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
	String password= "12345678";
	
	
	//Verify clicking on forgot password option
	@Test(priority = 1)
	public void clickForgotPasswordOpt() throws InterruptedException 
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		forgotPassword.loginClick();
		LoginPage.pauseRun();
		
	}
	
	//Verify submitting valid registered email for forgot password
	@Test(priority = 2)
	public void submitForgotPasswordEmail() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		LoginPage.pauseRun();
		forgotPassword.forgotPassword_Email(email2);
		LoginPage.pauseRun();
		forgotPassword.forgotPassword_EmailSubmit();
		forgotPassword.otpData();
		forgotPassword.otpSubmitBtn();
		LoginPage.pauseRun();
		forgotPassword.backToLogin();
		}
	
	//Verify reset password with valid specified format 
	@Test(priority = 3)
	public void ResetPassword() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.pauseRun();
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		//forgotPassword.loginClick();
		LoginPage.pauseRun();
		forgotPassword.forgotPassword_Email(email2);
		LoginPage.pauseRun();
		forgotPassword.forgotPassword_EmailSubmit();
		forgotPassword.otpData();
		forgotPassword.otpSubmitBtn();
		forgotPassword.resetPassword(password, password);
		forgotPassword.resetPasswordSubmit();
		LoginPage.pauseRun();
		forgotPassword.backToLogin();
	}
	
	//Verify clicking on back to login option from forgot or reset password page
	@Test(priority = 4)
	public void backToLoginPageFromForgotPasswordPage() throws InterruptedException 
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.pauseRun();
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		LoginPage.pauseRun();
		
	}
}

