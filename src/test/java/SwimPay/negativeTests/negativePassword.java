package SwimPay.negativeTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import SwimPay.pageObject.forgotPasswordPage;
import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class negativePassword extends baseClass{
	String email1="qa1@narola.email";
	String inavlidemail1="qa24@narola.email";
	String email2= "qa2@narola.email";
	String invalidCaseEmail="QA2@narola.email";
	String password= "Pass@1234";
	String password2="Pass@12345";
	String invalidRangePassword="1234";
	
	//Verify submitting invalid/ unregistered user email for forgot password
	@Test(priority = 1)
	public void invalidEmailSubmit() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		forgotPassword.forgotPassword_Email(inavlidemail1);
		forgotPassword.forgotPassword_EmailSubmit();	
		forgotPassword.loginClick();
		LoginPage.pauseRun2();
	}
	
	//Verify submitting reset password with invalid data range[FAIL]
	@Test (priority = 2)
	public void invalidPasswordValueRangeFormat() throws InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		forgotPassword.forgotPassword_Email(email2);
		forgotPassword.forgotPassword_EmailSubmit();
		forgotPassword.otpData();
		forgotPassword.otpSubmitBtn();
		forgotPassword.resetPassword(invalidRangePassword, invalidRangePassword);
		LoginPage.pauseRun2();
		forgotPassword.resetPasswordSubmit();
		//forgotPassword.messageToaster();
		forgotPassword.backToLogin();
	}
	
	//Verify submitting reset password with invalid data range[FAIL]
	@Test (priority = 3)
	public void misMatchNew_ConfirmPasswordValue()
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		forgotPassword.forgotPassword_Email(email2);
		forgotPassword.forgotPassword_EmailSubmit();
		forgotPassword.otpData();
		forgotPassword.otpSubmitBtn();
		forgotPassword.resetPassword(password, password2);
		forgotPassword.resetPasswordSubmit();
		//forgotPassword.messageToaster();
		forgotPassword.backToLogin();
	}
	
	
	//Verify submitting invalid OTP while reset password[FAIL]
	@Test (priority = 4)
	public void wrongOTP_for_forgotPasswordEmail_Submit()
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		forgotPassword.forgotPassword_Email(email1);
		forgotPassword.forgotPassword_EmailSubmit();
		forgotPassword.invalid_OTP_Value();
		forgotPassword.otpSubmitBtn();
		forgotPassword.messageToaster();
		forgotPassword.backToLogin();
	}
	
	//Try to Reset Password with White Space values
	@Test (priority = 5)
	public void resetPassword_withWhiteSpaceData()
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		forgotPassword.forgotPassword_Email("qa1@narola.email");
		forgotPassword.forgotPassword_EmailSubmit();
		forgotPassword.otpData();
		forgotPassword.otpSubmitBtn();
		forgotPassword.resetPassword("        ", "        ");
		forgotPassword.resetPasswordSubmit();
	//	forgotPassword.messageToaster();
	}

}
