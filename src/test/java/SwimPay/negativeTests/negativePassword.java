package SwimPay.negativeTests;

import org.testng.annotations.Test;
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
	
	String inavlidemail1="qa24@narola.email";
	String email2= "qa2@narola.email";
	String invalidCaseEmail="QA2@narola.email";
	String password= "Pass@1234";
	String password2="Pass@12345";
	String invalidRangePassword="1234";
	
	
	@Test
	public void invalidEmailSubmit()
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		forgotPassword.forgotPassword_Email(inavlidemail1);
		forgotPassword.forgotPassword_EmailSubmit();	
	}
	
	@Test
	public void invalidPasswordValueRangeFormat()
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		forgotPassword.forgotPassword_Email(email2);
		forgotPassword.forgotPassword_EmailSubmit();
		forgotPassword.otpData();
		forgotPassword.otpSubmitBtn();
		forgotPassword.resetPassword(invalidRangePassword, invalidRangePassword);
		forgotPassword.resetPasswordSubmit();
		forgotPassword.messageToaster();
		
		
	}
	
	@Test
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
		forgotPassword.messageToaster();
	}
	
	@Test
	public void wrongOTP_for_forgotPasswordEmail_Submit()
	{
		loginPage LoginPage=new loginPage(driver);
		forgotPasswordPage forgotPassword= LoginPage.forgotPassword();
		forgotPassword.forgotPassword_Email(inavlidemail1);
		forgotPassword.forgotPassword_EmailSubmit();
		forgotPassword.invalid_OTP_Value();
		forgotPassword.otpSubmitBtn();
		forgotPassword.messageToaster();
	}
	
	//Try to Reset Password with White Space values
	@Test
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
		forgotPassword.messageToaster();
	}

}
