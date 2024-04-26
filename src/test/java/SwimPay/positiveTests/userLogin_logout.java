package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.loginPage;
import SwimPay.testComponents.baseClass;

public class userLogin_logout extends baseClass{
	String email1="qa1@narola.email";
	String email2="qa2@narola.email";
	String email3= "qa3@narola.email";
	String password3= "Pass@1234";
	String password2= "Pass@12345";
	String password1= "Pass@1234";
	
	//Verify login with valid user credentials
	@Test(priority=1)
	public void userLogin() throws InterruptedException, IOException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.pauseRun2();
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password3);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.pauseRun5();
		
	
	
	}
	//Verify login with valid user credentials & perform logout action
	@Test(priority=2)
	public void userLogin_Logout() throws InterruptedException, IOException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.pauseRun2();
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password3);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
			
	}
	
	//Perform View & Hide Password Action for Password Field
	@Test(priority=4)
	public void showHidePassword() throws IOException, InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.pauseRun2();
		LoginPage.userEmail(email3);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password3);
		LoginPage.actionClick();
		LoginPage.hideShowPassword();
		
	}
	
	//Verify clicking on back to email once navigated to password fill step
	@Test(priority=3)
	public void backToEmailfromPasswordpage() throws IOException, InterruptedException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.pauseRun2();
		LoginPage.userEmail(email1);
		LoginPage.pauseRun2();
		LoginPage.loginEmailSubmit();
		LoginPage.pauseRun5();
		LoginPage.backToEmailPage();
	}

}
