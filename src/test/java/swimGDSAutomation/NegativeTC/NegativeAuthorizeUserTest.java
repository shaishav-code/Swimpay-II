package swimGDSAutomation.NegativeTC;

import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.AccountManagementPage;
import swimGDSAutomation.pageclass.AuthorizeUserPage;
import swimGDSAutomation.pageclass.LandingPage;

public class NegativeAuthorizeUserTest extends BaseClass {
	
	 String email = "nda.norala@yopmail.com";
     String password ="Dilip@07";

	 //Verify if user is able to get the searched list by keeping search field blank and click on submit button
	 @Test(priority=1)
	 public void WithoutInsertingValues_ClickOnSubmitButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	 authorizeuserpage.titleOfPage();
	 authorizeuserpage.Enterdetails_searchtab("");
	 authorizeuserpage.Click_submitbtn();
    }
	 
	     String user="virat";
	     //Verify if user is able to edit the details without inserting First & Last name in Edit details popup
		 @Test(priority=2)
		 public void WithoutInsertingValueInEditDetails_clickSaveBtn() {
			
		 LandingPage landingPage = new LandingPage(driver);
		 landingPage.SellerLogin();	
		 landingPage.Loginpage();
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
		 authorizeuserpage.Enter_firstname("");
		 authorizeuserpage.Enter_lastname("");
		 authorizeuserpage.Enter_emailId("");
		 authorizeuserpage.Click_savechanges();
		 try {
			    authorizeuserpage.waitCode();
		     } 
		 catch (InterruptedException e) 
		     {
			    e.printStackTrace();
		     }
		 
	    }
		 
		 //Verify if user is able to add the new Authorized user without inserting any required details in field and click on create button 
		 @Test(priority=3)
		 public void WithoutInsertingDetailsInAddUser_ClickCreateBtn() {
			
		 LandingPage landingPage = new LandingPage(driver);
		 landingPage.SellerLogin();	
		 landingPage.Loginpage();
		 landingPage.Enter_useremail(email);
		 landingPage.Enter_password(password);
		 landingPage.Loginbtn();
		 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
		 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	     authorizeuserpage.Click_addnewuser();
	     authorizeuserpage.Enter_firstname("");
	     authorizeuserpage.Enter_lastname("");
	     authorizeuserpage .Enter_emailId("");
	     authorizeuserpage.Enter_mobilenumber("");
	     authorizeuserpage.Click_createbtn();
	     try {
			    authorizeuserpage.waitCode();
		     } 
		 catch (InterruptedException e) 
		     {
			    e.printStackTrace();
		     }
	     
	    }
		 
		 //Verify if user is able to add the new Authorized user without inserting the email id in field and click on create button 
		 @Test(priority=4)
		 public void WithoutInsertingEmail_ClickCreateBtn() {
			
		 LandingPage landingPage = new LandingPage(driver);
		 landingPage.SellerLogin();	
		 landingPage.Loginpage();
		 landingPage.Enter_useremail(email);
		 landingPage.Enter_password(password);
		 landingPage.Loginbtn();
		 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
		 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	     authorizeuserpage.Click_addnewuser();
	     authorizeuserpage.Enter_firstname("August");
	     authorizeuserpage.Enter_lastname("August");
	     authorizeuserpage .Enter_emailId("");
	     authorizeuserpage.Enter_mobilenumber("73488973hh");
	     authorizeuserpage.Click_createbtn();
	     try {
			    authorizeuserpage.waitCode();
		     } 
		 catch (InterruptedException e) 
		     {
			    e.printStackTrace();
		     }
	     
	    }
		 
		 
		 //Verify if user is able to add the new Authorized user by inserting the invalid details in field and click on create button 
		 @Test(priority=5)
		 public void InsertingEmail_ClickCreateBtn() {
			
		 LandingPage landingPage = new LandingPage(driver);
		 landingPage.SellerLogin();	
		 landingPage.Loginpage();
		 landingPage.Enter_useremail(email);
		 landingPage.Enter_password(password);
		 landingPage.Loginbtn();
		 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
		 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	     authorizeuserpage.Click_addnewuser();
	     authorizeuserpage.Enter_firstname("Nayan");
	     authorizeuserpage.Enter_lastname("Akojwar");
	     authorizeuserpage .Enter_emailId("test20@yopmail.com");
	     authorizeuserpage.Enter_mobilenumber("7846823787");
	     authorizeuserpage.Click_createbtn();
	     try {
			    authorizeuserpage.waitCode();
		     } 
		 catch (InterruptedException e) 
		     {
			    e.printStackTrace();
		     }
	    }
		 
		 //Verify if user is able to add the new Authorized user by inserting the Already registered email address in field and click on create button 
		 @Test(priority=6)
		 public void InsertingAlreadyRegisteredEmail_ClickCreateBtn() {
			
		 LandingPage landingPage = new LandingPage(driver);
		 landingPage.SellerLogin();	
		 landingPage.Loginpage();
		 landingPage.Enter_useremail(email);
		 landingPage.Enter_password(password);
		 landingPage.Loginbtn();
		 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
		 AuthorizeUserPage authorizeuserpage= accountmanagement.AuthorizeUserOption();
	     authorizeuserpage.Click_addnewuser();
	     authorizeuserpage.Enter_firstname("@$@Edd21");
	     authorizeuserpage.Enter_lastname("@$@Edd21");
	     authorizeuserpage .Enter_emailId("!@##ds");
	     authorizeuserpage.Enter_mobilenumber("!@##ds");
	     authorizeuserpage.Click_createbtn();
	     try {
			    authorizeuserpage.waitCode();
		     } 
		 catch (InterruptedException e) 
		     {
			    e.printStackTrace();
		     }
	    }
		 
		 
		 String Email1="test25@yopmail.com";
		 String Password1="Prabha@07";
		 
		 //Verify if user is able to do login without Email verification of Authorize User 
		 @Test(priority=7)
		 public void WithPendingEmailVerificationStatus_TryToDoLogin() {
			
		 LandingPage landingPage = new LandingPage(driver);
		 landingPage.SellerLogin();	
		 landingPage.Loginpage();
		 landingPage.Enter_useremail(Email1);
		 landingPage.Enter_password(Password1);
		 landingPage.Loginbtn();
	    }
		 
		 
		 String Email2="test26@yopmail.com";
		 String Password2="Prabha@07";
		 
		 //Verify if user is able to do login by Cancelled Authorize user  
		 @Test(priority=8)
		 public void WithCancelledStatus_TryToDoLogin() {
			
			 LandingPage landingPage = new LandingPage(driver);
			 landingPage.SellerLogin();	
			 landingPage.Loginpage();
			 landingPage.Enter_useremail(Email2);
			 landingPage.Enter_password(Password2);
			 landingPage.Loginbtn();
	    }
		 
		 
		 String Email3="test27@yopmail.com";
		 String Password3="Prabha@07";
		 
		 //Verify if user is able to do login by inactice Authorize user  
		 @Test(priority=9)
		 public void WithDeletedStatus_TryToDoLogin() {
			
			 LandingPage landingPage = new LandingPage(driver);
			 landingPage.SellerLogin();	
			 landingPage.Loginpage();
			 landingPage.Enter_useremail(Email3);
			 landingPage.Enter_password(Password3);
			 landingPage.Loginbtn();
	    }
}
