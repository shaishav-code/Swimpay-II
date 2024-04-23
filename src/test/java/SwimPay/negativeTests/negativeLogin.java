package SwimPay.negativeTests;

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
	String email2= "qa1@narola.email";
	String invalidCaseEmail="QA2@narola.email";
	String password= "123456789";
	String password1= "Pass@1234";

	//Login with Invalid (unregistered) User Email
	@Test(priority = 1)
	public void invalidUserEmailLogin() 
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.userEmail(inavlidemail1);
		LoginPage.loginEmailSubmit();
		LoginPage.messageToaster();
	}
	
	//Login with Invalid password Login 
	@Test(priority = 2)
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
	@Test(priority = 5)
	public void invalid_OTP_userLogin() throws InterruptedException
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.pauseRun();
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password1);
		LoginPage.loginSubmit();
		LoginPage.pauseRun();
		LoginPage.invalid_OTP_Value();
		LoginPage.otpSubmitBtn();
		LoginPage.messageToaster();
	}
	
	// Try to Login with Blank Email fields 
	@Test(priority = 3)
	public void blankEmailSubmit() throws InterruptedException
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.pauseRun();
		LoginPage.loginEmailSubmit();
		LoginPage.pauseRun();
		//LoginPage.messageToaster();
		
	}
	
	//try to login with Sensative email (provide sesnative format Value)
	@Test(priority =4)
	public void sensativeEmailLogin() throws InterruptedException
	{
		loginPage LoginPage = new loginPage(driver);
		LoginPage.pauseRun();
		LoginPage.userEmail(invalidCaseEmail);
		LoginPage.pauseRun();
		LoginPage.loginEmailSubmit();
		LoginPage.pauseRun();
		LoginPage.messageToaster();
		
	}

}
