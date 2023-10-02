package swimGDSAutomation.NegativeTC;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageVoyagePage;

public class NegativeManageVoyagesTest extends BaseClass{

	 String email = "cma@gmail.com";
     String password ="Admin@123";
	 String Email = "nda.norala@gmail.com";
     String Password ="Nikhil@86";
	
                  //////////////////////List Voyages//////////////////////
     
     //Verify if user is able to get the Completed voyage list without clicking on Load button
	 @Test(priority=1)
	 public void SelectCompletedStatusFromDropdown_WithoutClickingOnLoadButton() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_statusdropdown();
	 managevoyagepage.Select_status("Completed");
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
 	 //Verify if user is able to get the Cancelled voyage list without clicking on Load button
	 @Test(priority=2)
	 public void SelectCancelledStatusFromDropdown_WithoutClickingOnLoadButton() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_statusdropdown();
	 managevoyagepage.Select_status("Cancelled");
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
		 
	 }
	 
	 //Verify if user is able to Logout from List Voyage sub-menu
	 @Test(priority=3)
	 public void ClickOnLogoutFromListVoyagesSubmenu() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.waitCode();
	 managevoyagepage.Logoutbtn();
	 
	 }
	 
	                  ///////////////////Cancel Voyage////////////////////
	 
	 
	 //Verify if user is able to cancel the Voyage number without selecting the Checkbox in Cancel Voyage sub-menu
	 @Test(priority=4)
	 public void ClickOnSubmitBtnWithoutSelectingCheckBox() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_cancelvoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Click_submitbtn();
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block: Submit button is disabled please select the checkbox first");
     }
	 
	 }
	 
	 //Verify if user is able to cancel the already cancelled Voyage number in Cancel Voyage sub-menu
	 @Test(priority=5)

	 public void CancelAlreadyCancelledVoyageNumber() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_cancelvoyage();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_voyagenofield("V00012-S");	  
	 managevoyagepage.waitCode();
	 Actions action = new Actions(driver);
	 action.sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 Assert.assertTrue(managevoyagepage.failed_message());	
	 
	 }
	 
	 //Verify if user is able to cancel the invalid Voyage number in the Cancel Voyage Sub-menu
	 @Test(priority=6)

	 public void CancelInvalidVoyageNumber() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_cancelvoyage();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_voyagenofield("V1@#@-8");	  
	 managevoyagepage.waitCode();
	 Actions action = new Actions(driver);
	 action.sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 Assert.assertTrue(managevoyagepage.failed_message(),"Invalid Voyage number");	
	 
	 }
	 
	//Verify if user is able to do Logout from Cancel Voyage sub-menu
	@Test(priority=7)
	 public void clickOnLogoutFromListVoyagesSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_cancelvoyage();
	 managevoyagepage.waitCode();
	 managevoyagepage.Logoutbtn();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 
	}
	
	               ///////////////////Change Voyage Date///////////////////
	
	 //Verify if user is able to click on submit button without selecting the ETD & ETA date in Change voyage Date sub-menu
	 @Test(priority=8)
	 public void SelectDateOnETDField() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
	     } 
	 catch (Exception e) 
         {
		    System.out.println("Executing corresponding Catch block");
	     }
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Click_SubmitonChangeVoyagedatesubmenu();
	     } 
	 catch (Exception e) 
         {
		    System.out.println("Executing corresponding Catch block");
	     }
	 
	 }
	 
	 //Verify if user is able to select the past date in ETD field in Change voyage Date sub-menu
	 @Test(priority=9)
	 public void SelectThePastDateInETDField() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
	     } 
	 catch (Exception e) 
         {
		    System.out.println("Executing corresponding Catch block");
	     }
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.SelectdatenMonth(0,"October 2023","1"); 
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 
	 }
	 
	 //Verify if user is able to select the before date from current selected date in ETA field in Change voyage Date sub-menu
	 @Test(priority=10)
	 public void SelectThePastDateInETAField() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
	     } 
	 catch (Exception e) 
         {
		    System.out.println("Executing corresponding Catch block");
	     }
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.SelectdatenMonth(1,"October 2023","1"); 
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 
	 }
	 
	 //Verify if user is able to select the future date in ETD field from the current selected date in ETA field in Change voyage Date sub-menu
	 @Test(priority=11)
	 public void SelectTheFutureDateInETAFieldFromCurrentETDDate() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_changevoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
	     } 
	 catch (Exception e) 
         {
		    System.out.println("Executing corresponding Catch block");
	     }
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.SelectdatenMonth(0,"December 2023","20"); 
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.Click_SubmitonChangeVoyagedatesubmenu();
	 managevoyagepage.waitCode();
	 Assert.assertTrue(managevoyagepage.Validation_behindETDfield(), "Validation is displayed on ETD field");
	 
	 }
	 
	 //Verify if user is able to do Logout from Change voyage Date sub-menu
	 @Test(priority=12)
	 public void clickOnLogoutFromChangeVoyageDateSubmenu() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevoyage();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (Exception e) 
         {
		    System.out.println("Executing corresponding Catch block");
	     }
	 managevoyagepage.Logoutbtn();
	 
	 }
	 
	             //////////////////////Change Vessel Details///////////////////
	 
	 //Verify if user is able to Enter the invalid Voyage number in the field in Change of Vessel sub-menu
	 @Test(priority=13)
	 public void ChangeVesselDetailsForInvalidVoyageNumber_InChangeOfVesselSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevessel();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_voyagenofield("V1@#@-8");	  
	 managevoyagepage.waitCode();
	 Actions action = new Actions(driver);
	 action.sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 Assert.assertTrue(managevoyagepage.failed_message(),"Invalid Voyage number");	
	 
	 }
	 
	 //Verify if user is able to change the vessel details for already cancelled Voyage number in Change of Vessel sub-menu
	 @Test(priority=14)
	 public void ChangeVesselDetailsForAlreadyCancelledVoyageNumber_InChangeOfVesselSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevessel();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_voyagenofield("V00016-S");	  
	 managevoyagepage.waitCode();
	 Actions action = new Actions(driver);
	 action.sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 Assert.assertTrue(managevoyagepage.failed_message(),"Invalid Voyage number");	
	 
	 }
	 
	 //Verify if user is able to click on Submit button without Entering required details in the fields in Change of Vessel sub-menu
	 @Test(priority=15)
	 public void ClickSubmitBtnWithoutInsertingRequiredDetails_InChangeVesselSubmenu() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_changevessel();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
         } 
	 catch (Exception e) 
	     {
		    System.out.println("Executing corresponding Catch block");
	     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Enter_newvesselname("");
	 managevoyagepage.Enter_newIMOnumber("");
	 try {
		 managevoyagepage.Click_submitbtn();
	     } 
	 catch (Exception e) 
         {
		    System.out.println("Executing corresponding Catch block");
	     }
	 	 
	 
	 }
	 
	 //Verify if user is able to click on Submit button by Entering Blank space in the fields in Change of Vessel sub-menu
	 @Test(priority=16)
	 public void ClickSubmitBtnByInsertingblankspace_InChangeVesselSubmenu() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_changevessel();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
         } 
	 catch (Exception e) 
	     {
		    System.out.println("Executing corresponding Catch block");
	     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Enter_newvesselname("  ");
	 managevoyagepage.Enter_newIMOnumber("   ");
	 try {
		 managevoyagepage.Click_submitbtn();
	     } 
	 catch (Exception e) 
         {
		    System.out.println("Executing corresponding Catch block");
	     } 
	 managevoyagepage.waitCode();
	 
	 }
	 
	 //Verify if user is able to enter invalid details in the new Vessel name field in Change of Vessel sub-menu - Fail
	 @Test(priority=17)
	 public void EnterInvalidDetailsInNewVesselNameField() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_changevessel();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
         } 
	 catch (Exception e) 
	     {
		    System.out.println("Executing corresponding Catch block");
	     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Enter_newvesselname("@!@3d:/>");
	 managevoyagepage.Click_submitbtn();
	 managevoyagepage.waitCode();
	 Assert.assertFalse(managevoyagepage.failed_message(),"Invalid Voyage number");		 
	 }
	 
	 //Verify if user is able to enter invalid details in the new IMO number field in Change of Vessel sub-menu
	 @Test(priority=18)
	 public void EnterInvalidDetailsInNewIMONumberField() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_changevessel();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
         } 
	 catch (Exception e) 
	     {
		    System.out.println("Executing corresponding Catch block");
	     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Enter_newIMOnumber("demo!@./");
	 try {
		 managevoyagepage.Click_submitbtn();
	     } 
	 catch (Exception e) 
         {
		    System.out.println("Executing corresponding Catch block");
         }	 
	 }
}
