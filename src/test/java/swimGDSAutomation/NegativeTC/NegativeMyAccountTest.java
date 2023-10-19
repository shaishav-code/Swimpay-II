package swimGDSAutomation.NegativeTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.AccountManagementPage;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.MyAccountPage;

public class NegativeMyAccountTest extends BaseClass {

	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
   
	 //Verify if user is able to click on save changes button without inserting details in Edit company info pop-up
	 @Test(priority=1)
	 public void WithoutInsertingValues_clickSaveBtn() {
		
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
	 myaccountpage.Click_Companysavebtn();
	 
	 }	 
	 
	 //Verify if user is able to enter the blank in all mandatory fields and click on save changes button in Edit company info pop-up
	 @Test(priority=2)
	 public void EnterBlankInAllField_ClickSaveBtn() {
		
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
	 myaccountpage.Insert_companyname("");
	 myaccountpage.Insert_address("", "");
	 myaccountpage.Insert_region("");
	 myaccountpage.Insert_postcode("");
	 myaccountpage.Insert_state("");
	 myaccountpage.Insert_SCACcode("");
	 try {
			myaccountpage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 myaccountpage.Click_Companysavebtn();
	 
	 }
	 
     //Verify if user is able to enter the blankspace in all mandatory fields and click on save changes button in Edit company info pop-up
	 @Test(priority=3)
	 public void EnterBlankSpaceInAllField_ClickSaveBtn() {
		
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
	 myaccountpage.Insert_companyname(" ");
	 myaccountpage.Insert_address(" ", " ");
	 myaccountpage.Insert_region(" ");
	 myaccountpage.Insert_postcode(" ");
	 myaccountpage.Insert_state(" ");
	 myaccountpage.Insert_mobilenumber("        ");
	 myaccountpage.Insert_companywebsite(" ");
	 myaccountpage.Insert_SCACcode(" ");
	 try {
			myaccountpage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 myaccountpage.Click_Companysavebtn();
	 boolean validation = myaccountpage.Validation_mobilefield();
	 Assert.assertTrue(validation);
	 
	 }
	 
	 //Verify if user is able to enter the number in all mandatory fields and click on save changes button in Edit company info pop-up
	 @Test(priority=4)
	 public void EnterNumberInAllField_ClickSaveBtn() {
		
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
	 myaccountpage.Insert_companyname("1221");
	 myaccountpage.Insert_address("1221", "1221");
	 myaccountpage.Insert_region("1221");
	 myaccountpage.Insert_postcode("1221");
	 myaccountpage.Insert_state("1221"); 
	 myaccountpage.Insert_companywebsite("1212");
	 myaccountpage.Insert_SCACcode("1221");
	 try {
			myaccountpage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 myaccountpage.Click_Companysavebtn();
	boolean valid = myaccountpage.Validation_state();
	Assert.assertTrue(valid, "Validation has been displayed");
	 
	 }
	
	 //Verify if user is able to enter the letters in Mobile field and click on save changes button in Edit company info pop-up
	 @Test(priority=5)
	 public void EnterCharacterInMobileField_ClickSaveBtn() {
		
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
	 myaccountpage.Insert_mobilenumber("ABCDFEG");
	 try {
			myaccountpage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 myaccountpage.Click_Companysavebtn();
	 
	 }
	 
	 
	 //Verify if user is able to enter the special Character in all the fields and click on save changes button in Edit company info pop-up
	 @Test(priority=6)
	 public void EnterCharInAllField_ClickSaveBtn() {
		
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
		 myaccountpage.Insert_companyname("@#@$)+_");
		 myaccountpage.Insert_address("@#@$)+_", "@#@$)+_");
		 myaccountpage.Insert_region("@#@$)+_");
		 myaccountpage.Insert_postcode("@#@$)+_");
		 myaccountpage.Insert_state("@#@$)+_");
		 myaccountpage.Insert_mobilenumber("@#@$)+_");
		 myaccountpage.Insert_companywebsite("@#@$)+_");
		 myaccountpage.Insert_SCACcode("@#@$)+_");
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 myaccountpage.Click_Companysavebtn();
	 
	 }
	 
	     //Verify if user is able to insert the blank in required fields in edit Account info popup and click on Save button
		 @Test(priority=7)
		 public void InsertBlankInAllField_ClickSaveBtn() {
			
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
		 myaccountpage.Enter_firstndlastname("","");
		 myaccountpage.Enter_email("");
		 myaccountpage.selectdialcode_account();
		 myaccountpage.Enter_mobile("");
		 myaccountpage.Click_Accountsavebtn();
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 
	     //Verify if user is able to insert the blankspace in required fields in edit Account info popup and click on Save button
		 @Test(priority=8)
		 public void InsertBlankSpaceInAllFields_ClickSaveBtn() {
			
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
		 myaccountpage.Enter_firstndlastname("  "," ");
		 myaccountpage.Enter_email("  ");
		 myaccountpage.Enter_mobile("  ");
		 myaccountpage.Click_Accountsavebtn();
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 
	     //Verify if user is able to insert the numbers in required fields in edit Account info popup and click on Save button
		 @Test(priority=9)
		 public void InsertNumbersInAllFields_ClickSaveBtn() {
			
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
		 myaccountpage.Enter_firstndlastname("2123","2123");
		 myaccountpage.Enter_email("2123");
		 myaccountpage.Enter_mobile("2123");
		 myaccountpage.Click_Accountsavebtn();
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 
	     //Verify if user is able to insert the numbers in mobile field without selecting the dial code in edit Account info popup and click on Save button
		 @Test(priority=10)
		 public void InsertNumbersInMobileField_WithoutSelectingDialCode_ClickSaveBtn() {
			
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
		 myaccountpage.selectdialcode_account();
		 myaccountpage.Enter_mobile("1213311332");
		 myaccountpage.Click_Accountsavebtn();
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 
	     //Verify if user is able to select the dial code without inserting the mobile number in edit Account info popup and click on Save button
		 @Test(priority=11)
		 public void SelectDialCode_WithoutInsertingMobileNumber_ClickSaveBtn() {
			
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
		 myaccountpage.Enter_mobile("");
		 myaccountpage.Click_Accountsavebtn();
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 
	     //Verify if user is able to insert the special character in all fields in edit Account info popup and click on Save button
		 @Test(priority=12)
		 public void InsertingSpecialCharacter_ClickSaveBtn() {
			
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
		 myaccountpage.Enter_firstndlastname("@#$@&$%>[","@#$@&$%>[");
		 myaccountpage.Enter_email("@#$@&$%>[");
		 myaccountpage.Enter_mobile("@#$@&$%>[");
		 myaccountpage.Click_Accountsavebtn();

		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 
		 //Verify if user is able to change the password without inserting Old, New and Confirm password in Change password and Security Details pop-up
		 @Test(priority=13)
		 public void ClickSaveBtnWithoutInsertingPasswordDetails() {
			
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
		 myaccountpage.Click_changePasswordbtn();
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		 }
		 
		 //Verify if user is able to change the password with inserting Incorrect Old Password but without entering the New and Confirm password in Change password and Security Details pop-up
		 @Test(priority=14)
		 public void ClickSaveBtn_WithoutInsertingNewNConfirmPasswordDetails_ButInsertingInCorrectOldPassword() {
			
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
		 myaccountpage.Enter_oldpasssword("Narola@07");    
		 myaccountpage.Click_changePasswordbtn();
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		 }
		 
		 
	 	//Verify if user is able to change the password with inserting correct Old Password but without entering the New and Confirm password in Change password and Security Details pop-up
		 @Test(priority=15)
		 public void ClickSaveBtn_WithoutInsertingNewNConfirmPasswordDetails_ButInsertingCorrectOldPassword() {
			
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
		 myaccountpage.Enter_oldpasssword("Dilip@07");    
		 myaccountpage.Click_changePasswordbtn();
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		 }
		 
		 //Verify if user is able to change the password by entering Incorrect old password in Change password and Security Details pop-up
		 @Test(priority=16)
		 public void ChangePasswordByInserting_IncorrectOldPassword() {
			
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
		 myaccountpage.Enter_oldpasssword("Narola@07");                   //Incorrect Password
		 myaccountpage.Enter_NewnConfirmPassword("Mohit@07","Mohit@07");
		 myaccountpage.Click_changePasswordbtn();
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		 }
		 
		 //Verify if user is able to change the password by entering mismatched New & Confirm password in Change password and Security Details pop-up
		 @Test(priority=17)
		 public void ChangePasswordByInserting_Misma() {
			
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
		 myaccountpage.Enter_oldpasssword("Dilip@07");
		 myaccountpage.Enter_NewnConfirmPassword("Mohit@07","Mohit@70");        //Mismatched Password
		 myaccountpage.Click_changePasswordbtn();
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		 }
		 
		 
		//Verify if user is able to Change the Security details without inserting the required details in change & Security popup
		 @Test(priority=18)
		 public void VerifySecurityDetailsChange() {
			
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
	     myaccountpage.Click_updatedetailsbtn();	 
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 
		 }
		 
	    //Verify if user is able to Change the Security details without inserting the Security answer 1 & 2 details in Change & Security pop-up
		 @Test(priority=19)
		 public void InsertOnlyCurrentPassword_ClickUpdateBtn() {
			
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
	     myaccountpage.Enter_currentpassword("Dilip@07");
	     myaccountpage.Selectquest1_EnterAns1("");
	     myaccountpage.Selectquest2_EnterAns2("");
	     myaccountpage.Click_updatedetailsbtn();
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 
		 }
		 
		    //Verify if user is able to Change the Security details by inserting Incorrect password in Change & Security pop-up
			 @Test(priority=20)
			 public void InsertInCorrectPassword_ClickUpdateBtn() {
				
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
		     myaccountpage.Enter_currentpassword("Narola@07");
		     myaccountpage.Selectquest1_EnterAns1("Jaguar");
		     myaccountpage.Selectquest2_EnterAns2("MSD");
		     myaccountpage.Click_updatedetailsbtn();
			 try {
					myaccountpage.waitCode();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 
			 }
		 
		 
		 
		 //Verify if user is able to insert the Blank in all required fields and is able to save the changes in Billing info popup
		 @Test(priority=21)
		 public void InsertBlankInAllFields_ClickSaveBtn() {
			
		 LandingPage landingPage = new LandingPage(driver);
		 landingPage.SellerLogin();	
		 landingPage.Loginpage();
		 landingPage.Enter_useremail(email);
		 landingPage.Enter_password(password);
		 landingPage.Loginbtn();
		 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
		 accountmanagement.Click_myaccount();
		 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
		 myaccountpage.scrolling();
		 myaccountpage.Click_editbankinfo();	
		 myaccountpage.Enter_bank("");
		 myaccountpage.Enter_Address1_bank("");
		 myaccountpage.Enter_Address2_bank("");
		 myaccountpage.Enter_region_bank("");
		 myaccountpage.Enter_postcode_bank("");
		 myaccountpage.Enterstate_bank("");
		 myaccountpage.Selectcountry_bank();
		 myaccountpage.Enter_accountname("");
		 myaccountpage.Enter_accountnumber("");
		 myaccountpage.Enter_Swiftcode("");
		 myaccountpage.Enter_IBANcode("");
		 myaccountpage.Click_banksavebtn();
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	     }
		 
		 //Verify if user is able to insert the Blankspace in all required fields and is able to save the changes in edit bank info popup
		 @Test(priority=22)
		 public void InsertBlankSpaceInAllFields_ClickSaveBankBtn() {
			
		 LandingPage landingPage = new LandingPage(driver);
		 landingPage.SellerLogin();	
		 landingPage.Loginpage();
		 landingPage.Enter_useremail(email);
		 landingPage.Enter_password(password);
		 landingPage.Loginbtn();
		 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
		 accountmanagement.Click_myaccount();
		 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
		 myaccountpage.scrolling();
		 myaccountpage.Click_editbankinfo();	
		 myaccountpage.Enter_bank("  ");
		 myaccountpage.Enter_Address1_bank("  ");
		 myaccountpage.Enter_Address2_bank("  ");
		 myaccountpage.Enter_region_bank("  ");
		 myaccountpage.Enter_postcode_bank("  ");
		 myaccountpage.Enterstate_bank("  ");
		 myaccountpage.Selectcountry_bank();
		 myaccountpage.Enter_accountname("  ");
		 myaccountpage.Enter_accountnumber("  ");
		 myaccountpage.Enter_Swiftcode("  ");
		 myaccountpage.Enter_IBANcode("  ");
		 myaccountpage.Click_banksavebtn();
		
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	     }
		 
		 //Verify if user is able to insert the numbers in all required fields and is able to save the changes in Edit Bank info info popup
		 //Passed
		 @Test(priority=23)
		 public void InsertNumbersInAllFields_ClickSaveBankBtn() {
			
		 LandingPage landingPage = new LandingPage(driver);
		 landingPage.SellerLogin();	
		 landingPage.Loginpage();
		 landingPage.Enter_useremail(email);
		 landingPage.Enter_password(password);
		 landingPage.Loginbtn();
		 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
		 accountmanagement.Click_myaccount();
		 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
		 myaccountpage.scrolling();
		 myaccountpage.Click_editbankinfo();	
		 myaccountpage.Enter_bank("@#@!##$");
		 myaccountpage.Enter_Address1_bank("1221211");
		 myaccountpage.Enter_Address2_bank("1221211");
		 myaccountpage.Enter_region_bank("1221211");
		 myaccountpage.Enter_postcode_bank("1221211");
		 myaccountpage.Enterstate_bank("1221211");
		 myaccountpage.Selectcountry_bank();
		 myaccountpage.Enter_accountname("1221211");
		 myaccountpage.Enter_accountnumber("1221211");
		 myaccountpage.Enter_Swiftcode("1221211");
		 myaccountpage.Enter_IBANcode("1221211");
		 myaccountpage.Click_banksavebtn();
		 myaccountpage.Validationbank();
		
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	     }
 
		 //Verify if user is able to insert the Special characters in all required fields and is able to save the changes in Edit Bank info info popup
		 //Passed
		 @Test(priority=24)
		 public void InsertSpecialCharactersNumbersInAllFields_ClickSaveBankBtn() {
			
		 LandingPage landingPage = new LandingPage(driver);
		 landingPage.SellerLogin();	
		 landingPage.Loginpage();
		 landingPage.Enter_useremail(email);
		 landingPage.Enter_password(password);
		 landingPage.Loginbtn();
		 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
		 accountmanagement.Click_myaccount();
		 MyAccountPage myaccountpage= accountmanagement.MyAccountOption();
		 myaccountpage.scrolling();
		 myaccountpage.Click_editbankinfo();	
		 myaccountpage.Enter_bank("@#@!##$");
		 myaccountpage.Enter_Address1_bank("@#@!##$");
		 myaccountpage.Enter_Address2_bank("@#@!##$");
		 myaccountpage.Enter_region_bank("@#@!##$");
		 myaccountpage.Enter_postcode_bank("@#@!##$");
		 myaccountpage.Enterstate_bank("@#@!##$");
		 myaccountpage.Selectcountry_bank();
		 myaccountpage.Enter_accountname("@#@!##$");
		 myaccountpage.Enter_accountnumber("@#@!##$");
		 myaccountpage.Enter_Swiftcode("@#@!##$");
		 myaccountpage.Enter_IBANcode("@#@!##$");
		 myaccountpage.Click_banksavebtn();
		 myaccountpage.Validationbank();
		
		 try {
				myaccountpage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	     }
}