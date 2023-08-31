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
	 myaccountpage.Insert_companyname("narola infotech");
	 myaccountpage.Insert_address("ca road", "ca road");
	 myaccountpage.Insert_region("surat");
	 myaccountpage.Insert_postcode("1212");
	 myaccountpage.Insert_state("gujarat");
	 myaccountpage.Select_country();
	 myaccountpage.Insert_SCACcode("ABCD");
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
	 myaccountpage.Insert_companyname("narola infotech");
	 myaccountpage.Insert_address("ca road","ca road");
	 myaccountpage.Insert_region("surat");
	 myaccountpage.Insert_postcode("1212");
	 myaccountpage.Insert_state("gujarat");
	 myaccountpage.Select_country();
	 myaccountpage.Insert_SCACcode("ABCD");
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
	 myaccountpage.Enter_firstndlastname("narola","infotech");
	 myaccountpage.Enter_email("nda.norala@yopmail.com");
	 myaccountpage.Enter_mobile("22232543");
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
	 myaccountpage.Enter_firstndlastname("narola","infotech");
	 myaccountpage.Enter_email("nda.norala@yopmail.com");
	 myaccountpage.Enter_mobile("22232543");
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
	 myaccountpage.Enter_oldpasssword("Akojwar@07");
	 myaccountpage.Enter_NewnConfirmPassword("Dilip@07","Dilip@07");
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
     myaccountpage.Enter_currentpassword("Dilip@07");
     myaccountpage.Selectquest1_EnterAns1("i20");
     myaccountpage.Selectquest2_EnterAns2("MSD");
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
	 myaccountpage.Enter_bank("SBI");
	 myaccountpage.Enter_Address1_bank("adajan");
	 myaccountpage.Enter_Address2_bank("adajan");
	 myaccountpage.Enter_region_bank("surat");
	 myaccountpage.Enter_postcode_bank("2121");
	 myaccountpage.Enterstate_bank("gujarat");
	 myaccountpage.Selectcountry_bank();
	 myaccountpage.Enter_accountname("nda");
	 myaccountpage.Enter_accountnumber("3122207823821");
	 myaccountpage.Enter_Swiftcode("AXISINBB250");
	 myaccountpage.Enter_IBANcode("AL47 2121 1009 0000 0002");
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
	 myaccountpage.Enter_bank("SBI");
	 myaccountpage.Enter_Address1_bank("adajan");
	 myaccountpage.Enter_Address2_bank("adajan");
	 myaccountpage.Enter_region_bank("surat");
	 myaccountpage.Enter_postcode_bank("2121");
	 myaccountpage.Enterstate_bank("gujarat");
	 myaccountpage.Selectcountry_bank();
	 myaccountpage.Enter_accountname("nda");
	 myaccountpage.Enter_accountnumber("3122207823821");
	 myaccountpage.Enter_Swiftcode("AXISINBB250");
	 myaccountpage.Enter_IBANcode("AL47 2121 1009 0000 0002");
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