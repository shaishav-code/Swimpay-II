package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
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
	
	
	
	@Test(priority=1)
	public void clickForgotPasswordOpt() 
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		
	}
	
	@Test(priority=2)
	public void submitForgotPasswordEmail() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		forgotPassword.forgotPassword_Email(email2);
		forgotPassword.forgotPassword_EmailSubmit();
		forgotPassword.otpData();
		forgotPassword.otpSubmitBtn();
		Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void ResetPassword()
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		forgotPassword.forgotPassword_Email(email2);
		forgotPassword.forgotPassword_EmailSubmit();
		forgotPassword.otpData();
		forgotPassword.otpSubmitBtn();
		forgotPassword.resetPassword(password, password);
		forgotPassword.resetPasswordSubmit();
	}
	
	public void backToLoginPageFromForgotPasswordPage() 
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		forgotPassword.backToLogin();
	}
}

