package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.UserManualPage;

public class UserManualTest extends BaseClass{

	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
   
	 //Verify if user is able to click on User Manual menu and then is able to click on Logout button
     @Test(priority=1)
	 public void ClickOnUserManualMenuAndLogout()  {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 UserManualPage usermanualpage = landingPage.UserManualOption();
	 usermanualpage.titleOfPage();
	 try {
		usermanualpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 usermanualpage.Logoutbtn();
     }
     
	 //Verify if user is able to click on User Manual button and is able to view the guide page
     @Test(priority=2)
	 public void ClickOnUserManualButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 UserManualPage usermanualpage = landingPage.UserManualOption();
	 Assert.assertTrue(usermanualpage.Usermanualbtn_visible(), "Button is enabled"); 
	 usermanualpage.Click_usermanualbtn();
     }   
     
}
