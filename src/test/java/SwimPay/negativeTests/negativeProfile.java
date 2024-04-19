package SwimPay.negativeTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import SwimPay.pageObject.loginPage;
import SwimPay.pageObject.profilePage;
import SwimPay.testComponents.baseClass;

public class negativeProfile extends baseClass{
	
	String email1="qa1@narola.email";
	String email2= "qa2@narola.email";
	String password= "Pass@12345";
	String password1= "Pass@123456";
	String contact1="1687";
	
	//Verify updating profile in invalid contact number range
	@Test(priority=0)
	public void profileUpdateByInvalidContact() throws InterruptedException
	{

		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		profilePage ProfilePage=LoginPage.profileOption();
		ProfilePage.updateContactInfoBtn();
		ProfilePage.phoneNumber(contact1);
		ProfilePage.mobileNumber(contact1);
		ProfilePage.submitBtn();
		ProfilePage.otpData();
		ProfilePage.otpSubmitBtn();
		ProfilePage.messageToaster();
	}
	
	//Verify update profile with invalid date of birth (future date)
	@Test(priority=1)
	public void profileUpdateByInvalidFutureDateOfBirth()
	{


		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		profilePage ProfilePage=LoginPage.profileOption();
		ProfilePage.updateContactInfoBtn();
		ProfilePage.dateOfBirth("16 Jun 2024");
		ProfilePage.submitBtn();
		ProfilePage.errorMsgDisplay();
	}
	//Verify update profile with invalid Password format for new & confirm password
	@Test(priority=2)
	public void profileUpdateByInvalidPasswordFormat()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		profilePage ProfilePage=LoginPage.profileOption();
		ProfilePage.updatePasswordBtn();
		ProfilePage.oldPassword(password);
		ProfilePage.newPassword("123456789");
		ProfilePage.confirmPassword("123456789");
		ProfilePage.errorMsgDisplay();
		//ProfilePage.ChangePasswordSubmit();
	}
	
	//Verify change password by providing Old password as invalid/wrong
	@Test
	public void profileChangePasswordBy_providingWrongOldPassword()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		profilePage ProfilePage=LoginPage.profileOption();
		ProfilePage.updatePasswordBtn();
		ProfilePage.oldPassword(password1);
		ProfilePage.newPassword(password);
		ProfilePage.confirmPassword(password);
		ProfilePage.ChangePasswordSubmit();
		ProfilePage.otpData();
		ProfilePage.otpSubmitBtn();
		ProfilePage.messageToaster();
	}
	//Verify change password by mis-match in new password & Confirm password
	@Test
	public void profileChangePasswordByMis_MatchPasswordValues()
	{
		loginPage LoginPage=new loginPage(driver);
		LoginPage.userEmail(email2);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		profilePage ProfilePage=LoginPage.profileOption();
		ProfilePage.updatePasswordBtn();
		ProfilePage.oldPassword(password);
		ProfilePage.newPassword("Pass@1234");
		ProfilePage.confirmPassword("Pass@1224");
		ProfilePage.errorMsgDisplay();
	}
}
