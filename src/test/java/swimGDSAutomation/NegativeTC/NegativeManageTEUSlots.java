package swimGDSAutomation.NegativeTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageTEUSlotsPage;

public class NegativeManageTEUSlots extends BaseClass{
	
	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
	
	 //Verify if user is able to find the search by insert the Month which is not listed in the dropdown option in specify Month / Year to upload CSV files field and can able to search the same
     @Test(priority=1)
	 public void ClickOnSpecifyMonthOrYearField() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.Enter_monthinCSVfilefield("July 2022");
	 try {
		 manageTEUslotspage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
		
	 }
     
	 //Verify if user is able to find the Autosuggetion list for the matching month in the Month/Year field
     // Failed: Here, after entering the July Month in the field, it should only display the option which is matching with July
     @Test(priority=2)
	 public void AutosuggestionForTheMatchingMonth() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.Enter_monthinCSVfilefield("July");
	 try {
		 manageTEUslotspage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 Assert.assertEquals(manageTEUslotspage.Click_specifymonthfield(), 2);
	 }
     
     //Verify if user is able to change the month by simply clicking on the dropdown field again
     // Failed: User is not able to change the month option
     @Test(priority=3)
	 public void ChangeTheMonth_ByClickingOnDropdownAgain() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.Click_specifymonthfield();
	 manageTEUslotspage.Select_monthfromdropdown("December 2023");
	 try {
		 manageTEUslotspage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 manageTEUslotspage.Click_specifymonthfield();
	 manageTEUslotspage.HoveronCSVtemplatefile();
	 try {
		 manageTEUslotspage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 manageTEUslotspage.Click_specifymonthfield();
	 manageTEUslotspage.Select_monthfromdropdown("July 2023");
	 Assert.assertEquals( manageTEUslotspage.Attributeondropdown(), "July 2023");
	 
	 }
	 
}
