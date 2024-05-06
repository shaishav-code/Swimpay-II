package SwimPay.negativeTests;

import org.testng.annotations.Test;

import SwimPay.pageObject.NewChange_PaymentPage;
import SwimPay.pageObject.recipient_payeePage;
import SwimPay.testComponents.baseClass;

public class negativeNewchangePayment {
	
	public class External_Recipients extends baseClass {
		String email1 = "qa2@narola.email";
		String password = "Pass@12345";

// Verify submitExternal_Recipients detail form with blank fields
		
		    @Test (priority = 1)
		    public void addNew_External_Recipients_detailsSubmit_asBlank() throws InterruptedException {
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			NewChange_PaymentPage New_Change_Payment =new NewChange_PaymentPage(driver);
			LoginPage.pauseRun3();
			New_Change_Payment.PaymentOptions();
			New_Change_Payment.External_RecipientsBtn();
			New_Change_Payment.click_Check_Country_Currency_Availablity();;
			New_Change_Payment.errorsDisplay();
		}
		    
// Verify submit ExternalRecipients detail form with white space value in field
		    
		    @Test (priority = 2)
	    	public void addNewExternal_Recipients_BankAccountDetailsSubmit_withoutPaymentCheckboxSelected() throws InterruptedException {
			LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			NewChange_PaymentPage New_Change_Payment =new NewChange_PaymentPage(driver);
			LoginPage.pauseRun2();
			New_Change_Payment.PaymentOptions();
			New_Change_Payment.External_RecipientsBtn();		
			New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
			LoginPage.pauseRun5();
			New_Change_Payment.Select_Bank_Account_Country("Canada");
			LoginPage.pauseRun2();
			//Recipient_Payee.click_Corporate_checkBox();
			New_Change_Payment.click_Individual_checkBox();
			New_Change_Payment.click_Check_Country_Currency_Availablity();
			//Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
			New_Change_Payment.recipientPayeeNickname("Narola1");
			New_Change_Payment.recipientPayee_country("Canada");
			New_Change_Payment.bankAccountHoldersName("Viraj");
			LoginPage.pauseRun2();
			New_Change_Payment.scrollBy();
			LoginPage.pauseRun2();
			New_Change_Payment.Click_Local_checkBox();
			New_Change_Payment.Click_Bank_Account_details();
			New_Change_Payment.errorsDisplay();
		}
		 

	// Verify click on Validate recipient/payee button from Bank Account details section without selecting Regular payment option checkbox
    
	 @Test (priority = 3)
 	public void addNew_External_Recipients_detailsSubmit_withWhiteSpaceValues() throws InterruptedException {
		LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment =new NewChange_PaymentPage(driver);
		LoginPage.pauseRun2();
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();		
		New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
		LoginPage.pauseRun5();
		New_Change_Payment.Select_Bank_Account_Country("Canada");
		LoginPage.pauseRun2();
		//Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		//Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		New_Change_Payment.recipientPayeeNickname("Narola1");
		New_Change_Payment.recipientPayee_country("Canada");
		New_Change_Payment.bankAccountHoldersName("!!!!!!");
		LoginPage.pauseRun2();
		New_Change_Payment.scrollBy();
		New_Change_Payment.Click_Bank_Account_details();
		New_Change_Payment.errorsDisplay();
	 }    
	
	
	// Verify submitting add new recipient/payee bank account details with blank form fields
    
    @Test (priority = 4)
    public void addNewExternal_Recipients_BankAccountDetailsSubmit_withBlankFormfields() throws InterruptedException {
	LoginPage.userEmail(email1);
	LoginPage.loginEmailSubmit();
	LoginPage.userPassword(password);
	LoginPage.loginSubmit();
	LoginPage.otpData();
	LoginPage.otpSubmitBtn();
	NewChange_PaymentPage New_Change_Payment =new NewChange_PaymentPage(driver);
	LoginPage.pauseRun2();
	New_Change_Payment.PaymentOptions();
	New_Change_Payment.External_RecipientsBtn();
	New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
	LoginPage.pauseRun2();
	New_Change_Payment.Select_Bank_Account_Country("Canada");
	LoginPage.pauseRun2();
	//Recipient_Payee.click_Corporate_checkBox();
	New_Change_Payment.click_Individual_checkBox();
	New_Change_Payment.click_Check_Country_Currency_Availablity();
	//Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
	New_Change_Payment.recipientPayeeNickname("Narola5");
	New_Change_Payment.recipientPayee_country("Canada");
	New_Change_Payment.bankAccountHoldersName("jessica Robert");
	LoginPage.pauseRun2();
	New_Change_Payment.scrollBy();
	LoginPage.pauseRun2();
	New_Change_Payment.Click_Local_checkBox();
	New_Change_Payment.Click_Bank_Account_details();
	New_Change_Payment.regularPaymentCheckBox();
	New_Change_Payment.transit_swiftBsbNumber();
	New_Change_Payment.accountNumber(" @@@  ");
	New_Change_Payment.errorsDisplay();
	New_Change_Payment.bankName(" $$$$   ");
	New_Change_Payment.bankCode("!!!!!  ");
	New_Change_Payment.address("  ~~~~   ");
	New_Change_Payment.city("  **** ");
	New_Change_Payment.state("&&");
	New_Change_Payment.scrollBy();
	New_Change_Payment.postCode("+++++");
	New_Change_Payment.scrollBy();
	New_Change_Payment.Click_Review_Recipient();
	
    New_Change_Payment.errorsDisplay();
    LoginPage.pauseRun2();
  
    
} 

 // Verify submitting add new recipient/payee bank account details with providing invalid format data values in fields
    
    @Test (priority = 5)
    public void Add_Invaliddata_External_Recipients_BankAccountDetail_page() throws InterruptedException {
    
  	        LoginPage.userEmail(email1);
			LoginPage.loginEmailSubmit();
			LoginPage.userPassword(password);
			LoginPage.loginSubmit();
			LoginPage.otpData();
			LoginPage.otpSubmitBtn();
			NewChange_PaymentPage New_Change_Payment =new NewChange_PaymentPage(driver);
			LoginPage.pauseRun2();
			New_Change_Payment.PaymentOptions();
			New_Change_Payment.External_RecipientsBtn();
			New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
			LoginPage.pauseRun2();
			New_Change_Payment.Select_Bank_Account_Country("Canada");
			LoginPage.pauseRun2();
			//Recipient_Payee.click_Corporate_checkBox();
			New_Change_Payment.click_Individual_checkBox();
			New_Change_Payment.click_Check_Country_Currency_Availablity();
			//Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
			New_Change_Payment.recipientPayeeNickname("Narola5");
			New_Change_Payment.recipientPayee_country("Canada");
			New_Change_Payment.bankAccountHoldersName("jessica Robert");
			LoginPage.pauseRun2();
			New_Change_Payment.scrollBy();
			LoginPage.pauseRun2();
			New_Change_Payment.Click_Local_checkBox();
			New_Change_Payment.Click_Bank_Account_details();
			New_Change_Payment.regularPaymentCheckBox();
			New_Change_Payment.transit_swiftBsbNumber();
			New_Change_Payment.accountNumber("654987622");
			New_Change_Payment.bankName("Toronto-Dominion Bank");
			New_Change_Payment.bankCode("004");
			New_Change_Payment.address("55 King St W, Toronto, ON M5K 1A2, Canada");
			New_Change_Payment.city("Toronto");
			New_Change_Payment.state("Ontario");
			New_Change_Payment.scrollBy();
			LoginPage.pauseRun5();
			New_Change_Payment.postCode("@@@@");
			New_Change_Payment.scrollBy();
			New_Change_Payment.Click_Review_Recipient();
            New_Change_Payment.errorsDisplay();            
    } 
    
  //Verify user click  the pay button and navigate the Bank detail and update page the  External Recipients page

    @Test (priority = 6)
    public void Click_Paybtn_and_navigate_the_Bank_detail_and_update_page() throws InterruptedException {
    	LoginPage.userEmail(email1);
		LoginPage.loginEmailSubmit();
		LoginPage.userPassword(password);
		LoginPage.loginSubmit();
		LoginPage.otpData();
		LoginPage.otpSubmitBtn();
		NewChange_PaymentPage New_Change_Payment =new NewChange_PaymentPage(driver);
		LoginPage.pauseRun2();
		New_Change_Payment.PaymentOptions();
		New_Change_Payment.External_RecipientsBtn();
		New_Change_Payment.Select_currency("Canadian Dollar (CAD)");
		LoginPage.pauseRun2();
		New_Change_Payment.Select_Bank_Account_Country("Canada");
		LoginPage.pauseRun2();
		//Recipient_Payee.click_Corporate_checkBox();
		New_Change_Payment.click_Individual_checkBox();
		New_Change_Payment.click_Check_Country_Currency_Availablity();
		//Recipient_Payee.recipientPayeeNickname("Chiris Homeshworth");
		New_Change_Payment.recipientPayeeNickname("krunal");
		New_Change_Payment.recipientPayee_country("Canada");
		New_Change_Payment.bankAccountHoldersName("jessica Robert");
		New_Change_Payment.scrollBy();
		LoginPage.pauseRun2();
		New_Change_Payment.Click_Local_checkBox();	
		New_Change_Payment.Click_Bank_Account_details();
		New_Change_Payment.regularPaymentCheckBox();
		New_Change_Payment.transit_swiftBsbNumber();
		New_Change_Payment.accountNumber("   !!!");
		New_Change_Payment.bankName("Toronto-Dominion Bank");
		New_Change_Payment.bankCode("004");
		New_Change_Payment.address("55 King St W, Toronto, ON M5K 1A2, Canada");
		New_Change_Payment.city("Toronto");
		New_Change_Payment.state("Ontario");
		New_Change_Payment.scrollBy();
		New_Change_Payment.postCode("1246");
		New_Change_Payment.Click_Review_Recipient();
		//New_Change_Payment.Click_Create_Recipient_Payees();
		New_Change_Payment.errorMsgDisplay();       
    }   

//	Verify click the Pay button and fill up invalid  amount perform action click form External Recipients page
    
    @Test (priority = 7)
    public void Enter_invalid_amount_data() throws InterruptedException {
	LoginPage.userEmail(email1);
	LoginPage.loginEmailSubmit();
	LoginPage.userPassword(password);
	LoginPage.loginSubmit();
	LoginPage.otpData();
	LoginPage.otpSubmitBtn();
	NewChange_PaymentPage New_Change_Payment =new NewChange_PaymentPage(driver);
	LoginPage.pauseRun2();
	New_Change_Payment.PaymentOptions();
	LoginPage.pauseRun2();
	New_Change_Payment.pagination(4);
	//New_Change_Payment.RecipientPayname("Steve Disney");
	New_Change_Payment.payclick("Narola6");
	New_Change_Payment.enterAmount("##");
	LoginPage.pauseRun2();
	New_Change_Payment. paymentDetailNextBtn();	
   
}
    
//	Verify click the Pay button and fill up bank detail perform action click form External Recipients page
    
    @Test (priority = 8)
    public void Enter_ivalid_babk_detail_for_External_Recipients_pay() throws InterruptedException {
	LoginPage.userEmail(email1);
	LoginPage.loginEmailSubmit();
	LoginPage.userPassword(password);
	LoginPage.loginSubmit();
	LoginPage.otpData();
	LoginPage.otpSubmitBtn();
	NewChange_PaymentPage New_Change_Payment =new NewChange_PaymentPage(driver);
	LoginPage.pauseRun2();
	New_Change_Payment.PaymentOptions();
	LoginPage.pauseRun2();
	New_Change_Payment.pagination(4);
	//New_Change_Payment.RecipientPayname("Steve Disney");
	New_Change_Payment.payclick("Narola6");
	New_Change_Payment.enterAmount("10");
	New_Change_Payment.recipient_payeeDetailPreview();
	New_Change_Payment. paymentDetailNextBtn();
	New_Change_Payment.recipient_payeeDetailPreview();
	New_Change_Payment.referenceNumberValue("@@@@@");
	New_Change_Payment. paymentPurpiose_For_CreatePayemnt("Transfer to own account");	
    New_Change_Payment.reviewPayment(); 
    New_Change_Payment.createPayment();
	New_Change_Payment.errorMsgDisplay();  
     
}
    
 //==================================================SWiM PAY Wallets========================================  
    
    
  //Verify user click add wallet button and open pop-up and fill up all invalid details form Add Swim wallet page   
	
	@Test (priority = 9)
	public void click_SWiMPAYCustomerRegion_and_AccountId_invalid_Data() throws InterruptedException {
	LoginPage.userEmail(email1);
	LoginPage.loginEmailSubmit();
	LoginPage.userPassword(password);
	LoginPage.loginSubmit();
	LoginPage.otpData();
	LoginPage.otpSubmitBtn();
	NewChange_PaymentPage New_Change_Payment =new NewChange_PaymentPage(driver);
	LoginPage.pauseRun2();
	New_Change_Payment.PaymentOptions();
	LoginPage.pauseRun2();
	New_Change_Payment.Click_SWiMPAYWallets();
	New_Change_Payment.Click_AddSWiMPAYWallets();
	New_Change_Payment.Click_SWiMPAY_Customer_Region("@@@");
	New_Change_Payment.Click_Account_Id("$$$");
    New_Change_Payment.Click_ADD_SWIMPAY_Wallat();
	New_Change_Payment.Click_CancelbtnAddSWiMPAYWallets();
      
}
	
	// Verify click the Pay button and fill up all invalid data enter bank detail and submit the form Swim wallet page  
	
	@Test (priority = 10)
	public void click_Paybtn_Fillup_Invild_data_bank_Details_and_Submitbtn_click() throws InterruptedException {
	LoginPage.userEmail(email1);
	LoginPage.loginEmailSubmit();
	LoginPage.userPassword(password);
	LoginPage.loginSubmit();
	LoginPage.otpData();
	LoginPage.otpSubmitBtn();
	NewChange_PaymentPage New_Change_Payment =new NewChange_PaymentPage(driver);
	LoginPage.pauseRun2();
	New_Change_Payment.PaymentOptions();
	//New_Change_Payment.External_RecipientsBtn();	
	LoginPage.pauseRun2();
	//New_Change_Payment.RecipientPayname("Steve Disney");
	New_Change_Payment.Click_SWiMPAYWallets();
	New_Change_Payment.SWiMPAYWalletspayclick("NISL00051");
	LoginPage.pauseRun2();
	New_Change_Payment.Click_currency("@@@");
	LoginPage.pauseRun2();
	New_Change_Payment.Click_SWiMPAYWalletsAmount("!!!");
	New_Change_Payment.Click_SWiMPAYWalletsreferncenum();
	New_Change_Payment.errorsDisplay();
	New_Change_Payment.Click_SWiMPAYWalletsPayNextbtn();
  	 
}
}
}



