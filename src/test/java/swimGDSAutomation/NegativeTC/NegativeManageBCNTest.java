package swimGDSAutomation.NegativeTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageBCNPage;

public class NegativeManageBCNTest extends BaseClass{


	 String Email = "cma@gmail.com";
     String Password ="Admin@123";
	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86"; 
    
    
                  ////////////////////Enter BCN Number Range////////////////
     
     //Verify if the user is able to enter the character in Starting & Ending number field in Enter BCN Number Range sub-menu--Fail
   	 //Pass: https://prnt.sc/VKb_pi5jxaXX
     @Test(priority=1)
   	 public void EnterTheCharacterInStartingAndEndingNumberField() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
   	 managebcnpage.waitCode();
   	 managebcnpage.Click_BCNrangesubmenu();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("test");
   	 managebcnpage.Enter_Endingnumber("test");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
     Assert.assertTrue( managebcnpage.Enabled_submitBtn(), "Submit button is enabled");
     
   	 }
     
     //Verify if the user is able to enter the Special character in Starting & Ending number field in Enter BCN Number Range sub-menu
   	 @Test(priority=2)
   	 public void EnterTheSpecialCharacterInStartingAndEndingNumberField() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
   	 managebcnpage.waitCode();
   	 managebcnpage.Click_BCNrangesubmenu();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("@#@#$$?<>");
   	 managebcnpage.Enter_Endingnumber("&%&%^><:}");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   	Assert.assertFalse( managebcnpage.Enabled_submitBtn(), "Submit button is enabled");
 	 
   	 }
     
   	 //Verify if the user is able to click on submit button without inserting Starting & Ending number in Enter BCN Number Range sub-menu
   	 @Test(priority=3)
   	 public void WithoutInsertingNumbersInField_ClickOnSubmitButton() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
   	 managebcnpage.waitCode();
   	 managebcnpage.Click_BCNrangesubmenu();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("");
   	 managebcnpage.Enter_Endingnumber("");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   	 System.out.println("submit button is enabled :" + managebcnpage.Enabled_submitBtn());
   	 Assert.assertFalse( managebcnpage.Enabled_submitBtn(), "Submit button is enabled");
   	 managebcnpage.Click_submitBtn();
   	
   	 }
   	 
   	 //Verify if the user is able to enter only the Starting number in the field and can click on submit button in Enter BCN Number Range sub-menu
   	 @Test(priority=4)
   	 public void InsertOnlyStartingNumber_AndClickOnSubmitButton() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
   	 managebcnpage.waitCode();
   	 managebcnpage.Click_BCNrangesubmenu();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("100");
   	 managebcnpage.Enter_Endingnumber("");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   	 System.out.println("submit button is enabled :" + managebcnpage.Enabled_submitBtn());
   	 Assert.assertFalse( managebcnpage.Enabled_submitBtn(), "Submit button is enabled");
   	 managebcnpage.Click_submitBtn();
   	
   	 }

     //Verify if the user is able to enter only the Ending number in the field and can click on submit button in Enter BCN Number Range sub-menu
   	 @Test(priority=5)
   	 public void InsertOnlyEndingNumber_AndClickOnSubmitButton() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
   	 managebcnpage.waitCode();
   	 managebcnpage.Click_BCNrangesubmenu();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("");
   	 managebcnpage.Enter_Endingnumber("500");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   	 System.out.println("submit button is enabled :" + managebcnpage.Enabled_submitBtn());
   	 Assert.assertFalse( managebcnpage.Enabled_submitBtn(), "Submit button is enabled");
   	 managebcnpage.Click_submitBtn();
   	
   	 }
   	 
     //Verify if the user is able to enter the same/identical number in starting & Ending number field and can click on submit button in Enter BCN Number Range sub-menu
   	 @Test(priority=6)
   	 public void EnterIdenticalNumberInBothFields_AndClickOnSubmitButton() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
   	 managebcnpage.waitCode();
   	 managebcnpage.Click_BCNrangesubmenu();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("1");
   	 managebcnpage.Enter_Endingnumber("1");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   	 managebcnpage.Click_submitBtn();
     managebcnpage.waitCode();
   	 Assert.assertTrue(managebcnpage.Validation_onendingnumber());
   	
   	 }
   	 
     //Verify if the user is able to enter the Negative value in Starting & Ending number field in Enter BCN Number Range sub-menu
   	 @Test(priority=7)
   	 public void EnterNegativeValuesInStartingAndEndingNumberField() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
   	 managebcnpage.waitCode();
   	 managebcnpage.Click_BCNrangesubmenu();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("-11");
   	 managebcnpage.Enter_Endingnumber("-12121");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
  	 managebcnpage.Click_submitBtn();
   	 Assert.assertTrue(managebcnpage.Validation_onstartingnumber());
     Assert.assertTrue(managebcnpage.Validation_onendingnumber());
     
   	 }

   	 
   	 //Verify if the user is able to enter "nth" number of digit in the field and can click on submit button in Enter BCN Number Range sub-menu
   	 @Test(priority=8)
   	 public void EnterMaximumNumbersInField_AndClickOnSubmitButton() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
   	 managebcnpage.waitCode();
   	 managebcnpage.Click_BCNrangesubmenu();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("1111111111111111");
   	 managebcnpage.Enter_Endingnumber("1111212222212122");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   	 managebcnpage.Click_submitBtn();
   	 managebcnpage.waitCode();
   	 Assert.assertTrue(managebcnpage.Validation_onstartingnumber());
     Assert.assertTrue(managebcnpage.Validation_onendingnumber());
   	
   	 }
   	 
     //Verify if the user is to able to enter a duplicate number i.e. a number that is already in a current range for me on my system in Enter BCN Number Range sub-menu   	 
   	 //Pass: https://gjp-narola.tinytake.com/msc/ODg1MzE2OV8yMjI5NTU0Nw
   	 @Test(priority=9)
   	 public void EnterDuplicateBCNNumberRange_AndVerifySubmittion() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
   	 managebcnpage.Click_BCNrangesubmenu();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("7");
   	 managebcnpage.Enter_Endingnumber("10");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   	 managebcnpage.Click_submitBtn();
   	 managebcnpage.waitCode();
   	 Assert.assertTrue(managebcnpage.Validation_onstartingnumber());
     Assert.assertTrue(managebcnpage.Validation_onendingnumber());
     	
   	 }  
   	 
	 
              ///////////////////////Manage BCN Numbers/////////////////////////// 

     //Verify if the user is able to enter the character in Starting & Ending number field in Manage BCN number sub-menu--Fail
  	 // https://nda-narola.tinytake.com/msc/ODc5NzQ1Ml8yMjIyMTA0Nw
   	 @Test(priority=10)
   	 public void EnterTheCharacterInStartingAndEndingNumberField_InManageBCNNumberSubmenu() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.Click_AddBCNRangeBtn();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("test");
   	 managebcnpage.Enter_Endingnumber("test");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
     Assert.assertTrue( managebcnpage.Enabled_AddBtn(), "Add button is enabled");
     
   	 }
     
     //Verify if the user is able to enter the Special character in Starting & Ending number field in Manage BCN number sub-menu
   	 @Test(priority=11)
	 void EnterTheSpecialCharacterInStartingAndEndingNumberField_InManageBCNNumberSubmenu() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.Click_AddBCNRangeBtn();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("@#@#$$?<>");
   	 managebcnpage.Enter_Endingnumber("&%&%^><:}");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
     Assert.assertFalse( managebcnpage.Enabled_AddBtn(), "Add button is enabled");
 	 
   	 }
     
   	 //Verify if the user is able to click on submit button without inserting Starting & Ending number in Manage BCN number sub-menu
   	 @Test(priority=12)
   	 public void WithoutInsertingNumbersInField_ClickOnSubmitButton_InManageBCNNumberSubmenu() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.Click_AddBCNRangeBtn();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("");
   	 managebcnpage.Enter_Endingnumber("");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   	 System.out.println("Add button is enabled :" + managebcnpage.Enabled_AddBtn());
   	 Assert.assertFalse( managebcnpage.Enabled_AddBtn(), "Add button is enabled");
   	 managebcnpage.Click_AddBtn();
   	
   	 }
   	 
   	 //Verify if the user is able to enter only the Starting number in the field and can click on submit button in Manage BCN number sub-menu
   	 @Test(priority=13)
   	 public void InsertOnlyStartingNumber_AndClickOnSubmitButton_InManageBCNNumberSubmenu() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
   	 managebcnpage.waitCode();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.Click_AddBCNRangeBtn();;
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("100");
   	 managebcnpage.Enter_Endingnumber("");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   	 System.out.println("Add button is enabled :" + managebcnpage.Enabled_AddBtn());
   	 Assert.assertFalse( managebcnpage.Enabled_AddBtn(), "Add button is enabled");
   	 managebcnpage.Click_AddBtn();
   	
   	 }

     //Verify if the user is able to enter only the Ending number in the field and can click on submit button in Manage BCN number sub-menu
   	 @Test(priority=14)
   	 public void InsertOnlyEndingNumber_AndClickOnSubmitButton_InManageBCNNumberSubmenu() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.Click_AddBCNRangeBtn();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("");
   	 managebcnpage.Enter_Endingnumber("500");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   	 System.out.println("Add button is enabled :" + managebcnpage.Enabled_AddBtn());
   	 Assert.assertFalse( managebcnpage.Enabled_AddBtn(), "Add button is enabled");
   	 managebcnpage.Click_AddBtn();
   	
   	 }
   	 
     //Verify if the user is able to enter the same/identical number in starting & Ending number field and can click on submit button in Manage BCN number sub-menu
   	 @Test(priority=15)
   	 public void EnterIdenticalNumberInBothFields_AndClickOnSubmitButton_InManageBCNNumberSubmenu() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.Click_AddBCNRangeBtn();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("1");
   	 managebcnpage.Enter_Endingnumber("1");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
     managebcnpage.Click_AddBtn();
     managebcnpage.waitCode();
   	 Assert.assertTrue(managebcnpage.Validation_onendingnumber());
   	
   	 }
   	 
     //Verify if the user is able to enter the character Negative value in Starting & Ending number field in Manage BCN number sub-menu
   	 @Test(priority=16)
   	 public void EnterNegativeValuesInStartingAndEndingNumberField_InManageBCNNumberSubmenu() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.Click_AddBCNRangeBtn();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("-11");
   	 managebcnpage.Enter_Endingnumber("-12121");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
  	 managebcnpage.Click_AddBtn();
   	 Assert.assertTrue(managebcnpage.Validation_onstartingnumber());
     Assert.assertTrue(managebcnpage.Validation_onendingnumber());
     
   	 }

   	 
   	 //Verify if the user is able to enter "nth" number of digit in the field and can click on submit button in Manage BCN number sub-menu
   	 @Test(priority=17)
   	 public void EnterMaximumNumbersInField_AndClickOnSubmitButton_InManageBCNNumberSubmenu() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.Click_AddBCNRangeBtn();
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("1111111111111111");
   	 managebcnpage.Enter_Endingnumber("1111212222212122");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   	 managebcnpage.Click_AddBtn();
   	 managebcnpage.waitCode();
   	 Assert.assertTrue(managebcnpage.Validation_onstartingnumber());
     Assert.assertTrue(managebcnpage.Validation_onendingnumber());
   	
   	 }
   	 
     //Verify if the user is to able to enter a duplicate number i.e. a number that is already in a current range for me on my system in Manage BCN number sub-menu   	 
   	 //Pass: https://gjp-narola.tinytake.com/msc/ODg1MzI2N18yMjI5NTY4NQ
     @Test(priority=18)
   	 public void EnterDuplicateBCNNumberRange_AndVerifySubmittion_InManageBCNNumberSubmenu() throws InterruptedException {
   			 
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.Click_AddBCNRangeBtn();        
   	 managebcnpage.waitCode();
   	 managebcnpage.Enter_startingnumber("8");
   	 managebcnpage.Enter_Endingnumber("13");
   	 try {
   			managebcnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   	 managebcnpage.Click_AddBtn();
   	 managebcnpage.waitCode();
   	 Assert.assertTrue(managebcnpage.Validation_onstartingnumber());
     Assert.assertTrue(managebcnpage.Validation_onendingnumber());
     	
   	 } 
     
               ///////////////////////////Cancel BCN/////////////////////////
   	 
   	 //Verify if the user is able to enter the invalid BCN number and able to click on submit button in Cancel BCN sub-menu-Suggestion
	 @Test(priority=19)
	 public void ClickOnSubmitButtonToCancelBCN() throws InterruptedException {
				 
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_cancelBCN();
	 managebcnpage.Click_BCNnofield();
	 managebcnpage.waitCode();
	 managebcnpage.Enter_BCNno("MMCU099"); 
	 managebcnpage.waitCode();
	 managebcnpage.click_cancellationtypedropdown();
	 managebcnpage.waitCode();
	 managebcnpage.Select_cancellationtypeoption("1. Before CRN Issued");
	 managebcnpage.waitCode();
	 managebcnpage.Click_submitBtn();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
	     }
	 Assert.assertTrue(managebcnpage.failed_message());	 	
	 		
	 }
	 
	 //Verify if the user is able to only enter the BCN number and able to click on submit button in Cancel BCN sub-menu
	 @Test(priority=20)
	 public void EnterOnlyBCNNumber_AndClickOnSubmitButtonToCancelBCN() throws InterruptedException {
					 
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_cancelBCN();
	 managebcnpage.Click_BCNnofield();
	 managebcnpage.waitCode();
	 managebcnpage.Select_BCNNumberFromoption("MMCU0000253");
	 managebcnpage.waitCode();
	 Assert.assertFalse( managebcnpage.Enabled_submitBtn(), "Submit button is enabled");
	 managebcnpage.Click_submitBtn();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
	     }
		 		
	 }
	 
	 
	 //Verify if the user is able to only select the Cancellation type and able to click on submit button in Cancel BCN sub-menu
	 @Test(priority=21)
	 public void SelectOnlyCancellationType_AndClickOnSubmitButtonToCancelBCN() throws InterruptedException {
					 
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_cancelBCN();
	 managebcnpage.waitCode();
	 managebcnpage.click_cancellationtypedropdown();
	 managebcnpage.waitCode();
	 managebcnpage.Select_cancellationtypeoption("1. Before CRN Issued");
	 managebcnpage.Click_submitBtn();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
	     }
		 		
	 }
	 
	 //Verify if the user is able to directly click on submit button without inserting the required details in Cancel BCN sub-menu
	 @Test(priority=22)
	 public void WithoutInsertingDetails_DirectlyClickOnSubmitButtonToCancelBCN() throws InterruptedException {
					 
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_cancelBCN();
	 managebcnpage.waitCode();
   	 Assert.assertFalse( managebcnpage.Enabled_submitBtn(), "Submit button is enabled");
   	 managebcnpage.Click_submitBtn();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
	     }
		 		
	 }
	 
	 //Verify if the user is able to do logout from the Cancel BCN page from the middle of the process in Cancel BCN sub-menu
	 @Test(priority=23)
	 public void ClickLogoutFromMiddleOfProcess() throws InterruptedException {
					 			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 managebcnpage.Click_cancelBCN();
	 managebcnpage.waitCode();
	 managebcnpage.Click_BCNnofield();
	 managebcnpage.waitCode();
	 managebcnpage.Select_BCNNumberFromoption("MMCU0000837"); 
	 managebcnpage.click_cancellationtypedropdown();
	 managebcnpage.waitCode();
	 managebcnpage.Select_cancellationtypeoption("1. Before CRN Issued");
	 managebcnpage.Click_submitBtn();
	 managebcnpage.waitCode();
	 managebcnpage.Logoutbtn();
	 	
	 } 
	 

              ///////////////////////////View BCN/////////////////////////
	 
	 //Verify if the user is able to enter the invalid BCN number and is able to click on view button in View BCN sub-menu
	 @Test(priority=24)
	 public void EnterInvalidBCN_AndClickOnViewButton() throws InterruptedException {
					 
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_viewBCN();
	 managebcnpage.waitCode();
	 managebcnpage.Click_BCNnofield();
	 managebcnpage.waitCode();
	 managebcnpage.Enter_BCNno("MMCU99999");
	 managebcnpage.click_ViewBCNbtn();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
	     }
     Assert.assertTrue(managebcnpage.failed_message());	 	
     
	 }
	 
	 //Verify if the user is able to do logout from the view BCN page and can go back to previous page in View BCN sub-menu --
	 @Test(priority=25)
	 public void ClickViewButtonInViewSubmenu() throws InterruptedException {
						 			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 managebcnpage.Click_cancelBCN();
	 managebcnpage.waitCode();
	 managebcnpage.Click_BCNnofield();
	 managebcnpage.waitCode();
	 managebcnpage.Select_BCNNumberFromoption("MMCU0000837"); 
	 managebcnpage.click_cancellationtypedropdown();
	 managebcnpage.waitCode();
	 managebcnpage.Select_cancellationtypeoption("1. Before CRN Issued");
	 managebcnpage.Click_submitBtn();
	 managebcnpage.waitCode();
	 managebcnpage.Logoutbtn();
	 managebcnpage.waitCode();
	 driver.navigate().back();
	 managebcnpage.waitCode();
	 landingPage.ManageBCNPageOption();
	 managebcnpage.waitCode();
	 Assert.assertEquals(managebcnpage.CurrentURLOfPage(), "https://demo.swimgds.com/");
		 				
     } 
}
