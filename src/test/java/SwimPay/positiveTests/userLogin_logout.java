package SwimPay.positiveTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
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
	String email2= "qa2@narola.email";
	String password= "Pass@12345";
	
	@Test(priority=0)
	public void userLogin() throws InterruptedException, IOException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		
	}
	
	//@Test(priority=1)
	public void userLogin_Logout() throws InterruptedException, IOException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		LoginPage.logout();
		
	}
	
	//Perform View & Hide Password Action for Password Field
	@Test
	public void showHidePassword() throws IOException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.actionClick();
		LoginPage.hideShowPassword();
		
	}
	
	@Test
	public void backToEmailfromPasswordpage() throws IOException
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.backToEmailPage();
	}

}
