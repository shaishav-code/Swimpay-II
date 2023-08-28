package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.AccountManagementPage;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.MyAccountPage;

public class MyAccountTest extends BaseClass {

	
     String email = "nda.norala@yopmail.com";
     String password ="Akojwar@07";
    
	 //Verify if user is able to click on Edit Company information and cancel the popup
	 @Test(priority=1)
	 public void ClickOnEditBankInfo() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 accountmanagement.Click_myaccount();
	 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
	 myaccountpage.Click_editcompanyinfo();	
	 myaccountpage.Click_Companycancelbtn();
     }
	 
	 //Verify if user is able to insert the mandatory details in Company info popup and click on cancel button
	 @Test(priority=2)
	 public void InsertDetailsIn_EditCompanyInfoPopup_ClickCancelBtn() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 accountmanagement.Click_myaccount();
	 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
	 myaccountpage.Click_editcompanyinfo();
	 myaccountpage.Insert_companyname();
	 myaccountpage.Insert_address();
	 myaccountpage.Insert_region();
	 myaccountpage.Insert_postcode();
	 myaccountpage.Insert_state();
	 myaccountpage.Select_country();
	 myaccountpage.Click_Companycancelbtn();
     }
	 
	 //Verify if user is able to insert the mandatory details in Company info popup and click on submit button
	 @Test(priority=3)
	 public void InsertDetailsIn_EditCompanyInfoPopup_ClickSubmitBtn() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 accountmanagement.Click_myaccount();
	 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
	 myaccountpage.Click_editcompanyinfo();
	 myaccountpage.Insert_companyname();
	 myaccountpage.Insert_address();
	 myaccountpage.Insert_region();
	 myaccountpage.Insert_postcode();
	 myaccountpage.Insert_state();
	 myaccountpage.Select_country();
	 myaccountpage.Click_Companysavebtn();
	 try {
		myaccountpage.waitCode();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	 boolean displayed = myaccountpage.Success_message();
     Assert.assertTrue(displayed, "Success message has been displayed");
    }
	 
	 
	 //Verify if user is able to click on edit Account info link and click on cancel button
	 @Test(priority=4)
	 public void ClickOnEditAccountInfo() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 accountmanagement.Click_myaccount();
	 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
	 myaccountpage.Click_editaccount();
	 try {
			myaccountpage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 myaccountpage.Click_accountCancelbtn();;
    }
	 
	 //Verify if user is able to insert the mandatory details in edit Account info popup and click on cancel button
	 @Test(priority=5)
	 public void InsertDetailsIn_EditAccountInfoPopup_ClickCancelBtn() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 accountmanagement.Click_myaccount();
	 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
	 myaccountpage.Click_editaccount();
	 myaccountpage.Enter_firstndlastname();
	 myaccountpage.Enter_email();
	 myaccountpage.Enter_mobile();
	 myaccountpage.Click_accountCancelbtn();
    }
	 
	 //Verify if user is able to insert the mandatory details in edit Account info popup and click on Save button
	 @Test(priority=6)
	 public void InsertDetailsIn_EditAccountInfoPopup_ClickSaveBtn() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 accountmanagement.Click_myaccount();
	 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
	 myaccountpage.Click_editaccount();
	 myaccountpage.Enter_firstndlastname();
	 myaccountpage.Enter_email();
	 myaccountpage.Enter_mobile();
	 myaccountpage.Click_Accountsavebtn();
	 try {
			myaccountpage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 boolean displayed = myaccountpage.Success_message();
	     Assert.assertTrue(displayed, "Success message has been displayed");
    }
	 
	 //Verify if user is able to click on Change Password & Security details link
	 @Test(priority=7)
	 public void ClickOnChangePasswordnSecurityDetails() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 accountmanagement.Click_myaccount();
	 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
	 myaccountpage.Click_changePasswordnSecurity();
	 }
	 
	 //Verify if user is able to enter the required details in the field and able to change the password details for login
	 @Test(priority=8)
	 public void VerifyPasswordChange() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 accountmanagement.Click_myaccount();
	 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
	 myaccountpage.Click_changePasswordnSecurity();
	 myaccountpage.Enter_oldpasssword();
	 myaccountpage.Enter_NewnConfirmPassword();
	 myaccountpage.Click_changePasswordbtn();
	 try {
			myaccountpage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 boolean displayed = myaccountpage.Success_message();
	     Assert.assertTrue(displayed, "Success message has been displayed");
	 }

     String updatedpassword ="Dilip@07";
     
	 //Verify if user is able to enter the required details in the field and able to Change the Security details 
	 @Test(priority=9)
	 public void VerifySecurityDetailsChange() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(updatedpassword);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 accountmanagement.Click_myaccount();
	 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
	 myaccountpage.Click_changePasswordnSecurity();
     myaccountpage.Enter_currentpassword();
     myaccountpage.Selectquest1_EnterAns1();
     myaccountpage.Selectquest2_EnterAns2();
     myaccountpage.Click_updatedetailsbtn();	 
	 try {
			myaccountpage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 boolean displayed = myaccountpage.Success_message();
	     Assert.assertTrue(displayed, "Success message has been displayed");
	 }
	 
	 //Verify if user is able to click on Edit Bank information link and cancel the popup
	 @Test(priority=10)
	 public void ClickOnAccountManagementDropDown() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(updatedpassword);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 accountmanagement.Click_myaccount();
	 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
	 myaccountpage.scrolling();
	 myaccountpage.Click_editbankinfo();	
	 try {
			myaccountpage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 myaccountpage.Click_bankcancelbtn();
     }
	 
	 //Verify if user is able to insert the details in Billing info popup and click on cancel button
	 @Test(priority=11)
	 public void InsertDetailsIn_EditBankAccountInfoPopup_ClickCancelBtn() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(updatedpassword);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 accountmanagement.Click_myaccount();
	 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
	 myaccountpage.scrolling();
	 myaccountpage.Click_editbankinfo();	
	 myaccountpage.Enter_bank();
	 myaccountpage.Enter_Address1_bank();
	 myaccountpage.Enter_Address2_bank();
	 myaccountpage.Enter_region_bank();
	 myaccountpage.Enter_postcode_bank();
	 myaccountpage.Enterstate_bank();
	 myaccountpage.Selectcountry_bank();
	 myaccountpage.Enter_accountname();
	 myaccountpage.Enter_accountnumber();
	 myaccountpage.Enter_Swiftcode();
	 myaccountpage.Enter_IBANcode();
	 try {
			myaccountpage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 myaccountpage.Click_bankcancelbtn();
     }
	 
	 //Verify if user is able to insert the details in Billing info popup and click on Save button
	 @Test(priority=12)
	 public void InsertDetailsIn_EditBankAccountInfoPopup_ClickSaveBtn() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(updatedpassword);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 accountmanagement.Click_myaccount();
	 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
	 myaccountpage.scrolling();
	 myaccountpage.Click_editbankinfo();	
	 myaccountpage.Enter_bank();
	 myaccountpage.Enter_Address1_bank();
	 myaccountpage.Enter_Address2_bank();
	 myaccountpage.Enter_region_bank();
	 myaccountpage.Enter_postcode_bank();
	 myaccountpage.Enterstate_bank();
	 myaccountpage.Selectcountry_bank();
	 myaccountpage.Enter_accountname();
	 myaccountpage.Enter_accountnumber();
	 myaccountpage.Enter_Swiftcode();
	 myaccountpage.Enter_IBANcode();
	 try {
			myaccountpage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 myaccountpage.Click_banksavebtn();
	 boolean displayed = myaccountpage.Success_message();
     Assert.assertTrue(displayed, "Success message has been displayed"); 
     }
	 
 
}