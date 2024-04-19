package SwimPay.negativeTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;


public class negativeLogin extends baseClass {
	String inavlidemail1="qa24@narola.email";
	String email2= "qa2@narola.email";
	String invalidCaseEmail="QA2@narola.email";
	String password= "123456789";

	//Login with Invalid (unregistered) User Email
	@Test
	public void invalidUserEmailLogin() 
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(inavlidemail1);
		LoginPage.loginEmailSubmit();
		LoginPage.messageToaster();
	}
	
	//Login with Invalid password Login 
	@Test
	public void invalidUserPasswordLogin()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.messageToaster();
	}
	
	//Login with invalid OTP 
	@Test
	public void invalid_OTP_userLogin()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.invalid_OTP_Value();
		LoginPage.otpSubmitBtn();
		LoginPage.messageToaster();
	}
	
	// Try to Login with Blank Email fields
	@Test
	public void blankEmailSubmit() throws InterruptedException
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.pauseRun();
		LoginPage.loginEmailSubmit();
		//LoginPage.messageToaster();
		
	}
	
	//try to login with Sensative email (provide sesnative format Value)
	public void sensativeEmailLogin()
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(invalidCaseEmail);
		LoginPage.loginEmailSubmit();
		LoginPage.messageToaster();
		
	}

}
