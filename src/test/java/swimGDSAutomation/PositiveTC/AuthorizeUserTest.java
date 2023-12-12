package swimGDSAutomation.PositiveTC;

import org.testng.annotations.Test;
import org.testng.Assert;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.AccountManagementPage;
import swimGDSAutomation.pageclass.AuthorizeUserPage;
import swimGDSAutomation.pageclass.LandingPage;

public class AuthorizeUserTest extends BaseClass {

	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
	 String emailid = "cma@gmail.com";
     String Password1 ="Admin@123";
     String user ="demo";
    
    
	 //Verify if user is able to click on Authorize menu and is able to navigate between the section pages(Pagination)
	 @Test(priority=1)
	 public void ClickOnEditBankInfo() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(emailid);
	 landingPage.Enter_password(Password1);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	 authorizeuserpage.titleOfPage();
	 authorizeuserpage.scrolling();
	 authorizeuserpage.Click_PageNavigationArrow(3);
	 try {
		    authorizeuserpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 authorizeuserpage.scrolling();
	 authorizeuserpage.Click_PageNavigationArrow(1);

     }
	 
	 
	 //Verify if user is able to enter the existing authorize user detail in Search field in Authorize User menu
	 @Test(priority=2)
	 public void EnterValidDetailsInSearchfield() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	 authorizeuserpage.titleOfPage();
	 authorizeuserpage.Enterdetails_searchtab(user);
	 
     }
	 
	 //Verify after entering the user details in search field then user is able to click on submit button
	 @Test(priority=3)
	 public void ClickOnSubmitButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	 authorizeuserpage.titleOfPage();
	 authorizeuserpage.Enterdetails_searchtab(user);
	 authorizeuserpage.Click_submitbtn();
     }
	 
	 //Verify if user is able to see all the search results after clicking on Submit button 
	 @Test(priority=4)
	 public void ViewSearchResults() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	 authorizeuserpage.titleOfPage();
	 authorizeuserpage.Enterdetails_searchtab(user);
	 authorizeuserpage.Click_submitbtn();
	 authorizeuserpage.Searchresults();
     }
	 
	 //Verify if user is able to click on menu icon and select the view details option
	 @Test(priority=5)
	 public void SelectViewDetailOption() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	 authorizeuserpage.titleOfPage();
	 authorizeuserpage.Enterdetails_searchtab(user);
	 authorizeuserpage.Click_submitbtn();
	 authorizeuserpage.Searchresults();
	 authorizeuserpage.Click_menu(0);                      //Select first menu result
	 authorizeuserpage.Select_menu_option("View Details");
	 try {
		    authorizeuserpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
    }
	 
	 //Verify if user is able to select the Edit Details option and able to edit the details
	 @Test(priority=6)
	 public void EditAccountInformation() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	 authorizeuserpage.titleOfPage();
	 authorizeuserpage.Enterdetails_searchtab(user);
	 authorizeuserpage.Click_submitbtn();
	 authorizeuserpage.Searchresults();
	 authorizeuserpage.Click_menu(0);
	 authorizeuserpage.Select_menu_option("Edit Details");
	 try {
		    authorizeuserpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 authorizeuserpage.Enter_mobilenumber("9838278022");
	 authorizeuserpage.Click_savechanges();
	 
     }
	
	 
	
	 //Verify if user is able to select the Cancel User option and click on No button
	 @Test(priority=7)
	 public void SelectCancelUserOption_ClickNoButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	 authorizeuserpage.titleOfPage();
	 authorizeuserpage.Enterdetails_searchtab(user);
	 authorizeuserpage.Click_submitbtn();
	 authorizeuserpage.Searchresults();
	 authorizeuserpage.Click_menu(0);
	 authorizeuserpage.Select_menu_option("Cancel User");
	 try {
		    authorizeuserpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 authorizeuserpage.Click_no_btn();
	 
    }
	 
	 //Verify if user is able to select the Cancel User option and click on Yes button
	 @Test(priority=8)
	 public void SelectCancelUserOption_ClickYesButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	 authorizeuserpage.titleOfPage();
	 authorizeuserpage.Enterdetails_searchtab(user);
	 authorizeuserpage.Click_submitbtn();
	 authorizeuserpage.Searchresults();
	 authorizeuserpage.Click_menu(0);
	 authorizeuserpage.Select_menu_option("Cancel User");
	 authorizeuserpage.Click_yes_btn();
     try {
		    authorizeuserpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 boolean displayed = authorizeuserpage.Success_message();
     Assert.assertTrue(displayed, "Success message has been displayed");
	 
    }
	 
   	 String user1="VRS Narola";
	
	 //Verify if user is able to select the Delete User option and click on No button
	 @Test(priority=9)
	 public void SelectDeleteUserOption_ClickNoButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	 authorizeuserpage.titleOfPage();
	 authorizeuserpage.Enterdetails_searchtab(user1);
	 authorizeuserpage.Click_submitbtn();
	 authorizeuserpage.Searchresults();
	 authorizeuserpage.Click_menu(0);
	 authorizeuserpage.Select_menu_option("Delete User");
	 try {
		    authorizeuserpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 authorizeuserpage.Click_no_btn();
	 
	 
    }
	 
	 
	 //Verify if user is able to select the Delete User option and click on Yes button
	 @Test(priority=9)
	 public void SelectDeleteUserOption_ClickYesButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	 authorizeuserpage.titleOfPage();
	 authorizeuserpage.Enterdetails_searchtab(user1);
	 authorizeuserpage.Click_submitbtn();
	 authorizeuserpage.Searchresults();
	 authorizeuserpage.Click_menu(0);
	 authorizeuserpage.Select_menu_option("Delete User");
	 authorizeuserpage.Click_yes_btn();
     try {
		    authorizeuserpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 boolean displayed = authorizeuserpage.Success_message();
    Assert.assertTrue(displayed, "Success message has been displayed");
	 
    }
	 
	 String user2="testing";
	 
		 
	 //Verify if user is able to select the Set Inactive option and click on No button
	 @Test(priority=11)
	 public void SelectSetInactiveOption_ClickNoButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	 authorizeuserpage.titleOfPage();
	 authorizeuserpage.Enterdetails_searchtab(user2);
	 authorizeuserpage.Click_submitbtn();
	 authorizeuserpage.Searchresults();
	 authorizeuserpage.Click_menu(0);
	 authorizeuserpage.Select_menu_option("Set Inactive");
	 try {
		    authorizeuserpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 authorizeuserpage.Click_no_btn();
	 
    }

	 
	 //Verify if user is able to select the Set Inactive option and click on Yes button
	 @Test(priority=12)
	 public void SelectSetInactiveOption_ClickYesButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	 authorizeuserpage.titleOfPage();
	 authorizeuserpage.Enterdetails_searchtab(user2);
	 authorizeuserpage.Click_submitbtn();
	 authorizeuserpage.Searchresults();
	 authorizeuserpage.Click_menu(0);
	 authorizeuserpage.Select_menu_option("Set Inactive");
	 authorizeuserpage.Click_yes_btn();
     try {
		    authorizeuserpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 boolean displayed = authorizeuserpage.Success_message();
     Assert.assertTrue(displayed, "Success message has been displayed");
	 
    }
	 
	 
	 String Email = "nda.norala@yopmail.com";
     String Password ="Dilip@07";
	 
	 //Verify if user is able to click on Add New User and then click on cancel button
	 @Test(priority=13)
	 public void ClickAddNewUserButton_ClickCancelButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
     authorizeuserpage.Click_addnewuser();
     authorizeuserpage.Click_cancelbtn();
    }
	 
	 //Verify if user is able to insert the valid details in Create New Authorized Admin User pop-up and click on Cancel button
	 @Test(priority=14)
	 public void InsertDetails_ClickCancelButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
     authorizeuserpage.Click_addnewuser();
     authorizeuserpage.Enter_firstname("Mohit");
     authorizeuserpage.Enter_lastname("Paul");
     authorizeuserpage .Enter_emailId("testingOct29@yopmail.com");
     authorizeuserpage.Enter_mobilenumber("9838278022");
     try {
		    authorizeuserpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
     authorizeuserpage.Click_cancelbtn();     
     
    }

	 
	 //Verify if user is able to add the new Authorized user successfully
	 @Test(priority=15)
	 public void CreateNewAuthorizedUser() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
     authorizeuserpage.Click_addnewuser();
     authorizeuserpage.Enter_firstname("Mohit");
     authorizeuserpage.Enter_lastname("Paul");
     authorizeuserpage .Enter_emailId("testingOct29@yopmail.com");
     authorizeuserpage.Enter_mobilenumber("9838278022");
     authorizeuserpage.Click_createbtn();
     try {
		    authorizeuserpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 boolean displayed = authorizeuserpage.Success_message();
     Assert.assertTrue(displayed, "Success message has been displayed");
     
    }
	 
	 
	 //Verify if the aurthorize user's request has been successfully created and is getting displayed in search result with status as pending email verification
	 @Test(priority=16)
	 public void Verify_AuthorizeUserRequestCreated() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	 authorizeuserpage.titleOfPage();
	 authorizeuserpage.Enterdetails_searchtab("Mohit");
	 authorizeuserpage.Click_submitbtn();
	 authorizeuserpage.Searchresults();
	 
	 }

}
