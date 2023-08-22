package swimGDSAutomation.NegativeTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;

public class NegativeLoginTest extends BaseClass{

	
	String email = "cosco@gmail.com";
	String password ="Admin@123";
	String invalidemail="cosco1@gmail.com";
	String invalidpassword ="Admin@1234";
	
	String expectedvalidtion1 ="Email is a required field";
	
	//Verify if user is able to do login without inserting Email and Password
	@Test(priority=1)
	public void Loginwithout_EmailPassword()
	{
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Loginbtn();
		
		String actualvalidtion1 = landingPage.Validation_Loginpage();
		Assert.assertEquals(actualvalidtion1, expectedvalidtion1);
	}
	
	
	String expectedvalidtion2 ="Invalid Email Address and Password.";
	
	//Verify if user is able to do login with invalid credentials(both email & pass)
	@Test(priority=2)
	public void loginWithInvalidCred()
	{
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_useremail(invalidemail);
		landingPage.Enter_password(invalidpassword);
		landingPage.Loginbtn();
		
		String actualvalidtion1 = landingPage.Validation_Loginpage();
		Assert.assertEquals(actualvalidtion1, expectedvalidtion2);
	}
	
	
	String expectedvalidtion3 ="Wrong Password";
	
	//Verify if user is able to do login with valid email and invalid password
	@Test(priority=3)
	public void loginWithInvalidPassword()
	{
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_useremail(email);
		landingPage.Enter_password(invalidpassword);
		landingPage.Loginbtn();
		
		String actualvalidtion1 = landingPage.Validation_Loginpage();
		Assert.assertEquals(actualvalidtion1, expectedvalidtion3);
	}
	
    String expectedvalidtion4 ="Invalid Email Address.";

	//Verify if user is able to do login with invalid Email and valid Password
	@Test(priority=4)
	public void loginWithInvalidEmail()
	{
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_useremail(invalidemail);
		landingPage.Enter_password(password);
		landingPage.Loginbtn();
		
		String actualvalidtion1 = landingPage.Validation_Loginpage();
		Assert.assertEquals(actualvalidtion1, expectedvalidtion4);
	}
	
	String expectedvalidtion5 = "Password is a required field";

	//Verify if user is able to do login with valid Email and blank in password field
	@Test(priority=5)
	public void loginWithoutPassword()
	{
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_useremail(email);
		landingPage.Loginbtn();
			
		String actualvalidtion1 = landingPage.Validation_Loginpage();
		Assert.assertEquals(actualvalidtion1, expectedvalidtion5);
		}
	
	
	//Verify if user is able to do login with valid Password and blank in Email field
	@Test(priority=6)
	public void loginWithoutEmail()
	{
		LandingPage landingPage = new LandingPage(driver);
		landingPage.SellerLogin();	
		landingPage.Loginpage();
		landingPage.Enter_password(password);
		landingPage.Loginbtn();
			
		String actualvalidtion1 = landingPage.Validation_Loginpage();
		Assert.assertEquals(actualvalidtion1, expectedvalidtion1);
		}

}
