package SwimPay.pageObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class NewChange_PaymentPage extends abstractComponentsMethods {

	WebDriver driver;

	public NewChange_PaymentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Find Add Bank Account button and perform click action

		//@FindBy(xpath = "//button[contains(@class,'mt-2 css-1agp3zg-')]")
		@FindBy(xpath = "(//*[@type='button'])[3]")
		private WebElement ExternalRecipients;

		public void External_RecipientsBtn() {
			ExternalRecipients.click();
		}

		// Find recipient Data list and perform required actions
		// Find recipient Data from listing

		//@FindBy(xpath = "//tr[@class='tr-list']")
		@FindBy(xpath = "//tr[@class='tr-list']")
		private List<WebElement> RecipientPayeeData;

		// find recipient payee user name and perform required action
		
		//@FindBy(xpath = "//td[@class='pe-2']/a")
		@FindBy(xpath ="//*[@class='mt-3 external-recipient']/tbody/tr/td[1]")
		private List<WebElement> RecipientPayeeName;

		// Find Pay option button and perform click action
		
		//@FindBy(xpath = "//button[contains(text(),'Pay')]")
		@FindBy(xpath = "(//*[@type=\"button\"])[7]")
		private List<WebElement> RecipientPayeePayBtn;

		// Find Edit option button and perform click action
		@FindBy(xpath = "//button[@type='button' and text()='Edit']")
		private List<WebElement> RecipientPayeeEditBtn;
		//private WebElement RecipientPayeeEditBtn;

		// Find Delete option button and perform click action
		@FindBy(xpath = "//button[contains(text(),'Delete')]")
		private List<WebElement> RecipientPayeeDeleteBtn;

		//Perform recipient & payee data list capture action
		public void recipientPayee_DataList()
		{
			for (WebElement element : RecipientPayeeData) {
				String userdataList=element.getText();
				if(userdataList.contains(userdataList))
				{
					System.out.println(userdataList);
				}
			}
		}

		//perform click on recipient payee user from data list
		
		public void recipientPayee_userClickFrom_DataList(String usernameClick)
		{
			RecipientPayeeName.size();
			for(WebElement recipientPayeeUsername :RecipientPayeeName)
			{
				String requestedUserName=recipientPayeeUsername.getText();
				if(requestedUserName.contains(usernameClick))
				{
					System.out.println(recipientPayeeUsername.getText()+ " User is clicked");
					recipientPayeeUsername.click();
					break;
				}
			}
		}

		//perform click on Edit button according to Username from data list
		
		public void clickEditButtonForUsername_FromDataList(String requestedUsername) {
		    for (int i = 0; i < RecipientPayeeData.size(); i++) {
		        String username = RecipientPayeeName.get(i).getText();

		        if (username.equals(requestedUsername)) {
		            try {
		            	RecipientPayeeEditBtn.get(i).click();
		                System.out.println("Clicked on the Edit button for username: " + requestedUsername);
		            } catch (Exception e) {
		                System.out.println("Failed to click on the Edit button for username: " + requestedUsername);
		                e.printStackTrace();
		            }
		            break;
		        }
		    }
		}

		//perform click on Pay button according to Username from data list
		
			public void paymentPage_clickPayButtonForUsername_FromDataList(String requestedUsername) {
			    for (int i = 0; i < RecipientPayeeData.size(); i++) {
			        String username = RecipientPayeeName.get(i).getText();
			        if (username.equals(requestedUsername)) {
			            try {
			            	RecipientPayeePayBtn.get(i).click();
			                System.out.println("Clicked on the Edit button for username: " + requestedUsername);
			            } catch (Exception e) {
			                System.out.println("Failed to click on the Edit button for username: " + requestedUsername);
			                e.printStackTrace();
			            }
			            break;

			        }}

			    paymentPage Payments = new paymentPage(driver);
				//return Payments;
			}

	   //perform click on Delete button according to Username from data list
			
				public void clickDeleteButtonForUsername_FromDataList(String requestedUsername) {
					    for (int i = 0; i < RecipientPayeeData.size(); i++) {
					        String username = RecipientPayeeName.get(i).getText();
					        if (username.equals(requestedUsername)) {
					            try {
					            	RecipientPayeeDeleteBtn.get(i).click();
					                System.out.println("Clicked on the Edit button for username: " + requestedUsername);
					            } catch (Exception e) {
					                System.out.println("Failed to click on the Edit button for username: " + requestedUsername);
					                e.printStackTrace();
					            }
					            break;
					        }
					    }
					}

		// Select the new change payment RecipientPayee_currency Currency field

		@FindBy(xpath = "(//*[@autocomplete='new-password'])[1]")
			private WebElement RecipientPayee_currency;

		public void Select_currency(String Currency ) {
			RecipientPayee_currency.click();
			RecipientPayee_currency.sendKeys(Currency);
			RecipientPayee_currency.sendKeys(Keys.ARROW_DOWN);
			RecipientPayee_currency.sendKeys(Keys.ENTER);
			RecipientPayee_currency.click();
			
					}
		
		//Select the Bank Account Country field

			@FindBy(xpath = "(//*[@type='text'])[2]")
			private WebElement RecipientPayee_Bank_Account_Country;

			public void Select_Bank_Account_Country(String Country ) {
			RecipientPayee_Bank_Account_Country.sendKeys(Country  + Keys.DOWN + Keys.ENTER);
					}
		// Select the Corporate check-box

			@FindBy(xpath = "//*[@class='col-md-6']/div/div[1]/input]")
			private WebElement Click_Corporate;
			
			public void click_Corporate_checkBox() {
			Click_Corporate.click();
					}

		// Select the Individual check-box

			@FindBy(xpath = "(//*[@class='form-check form-check-inline'])[2]/input")
			private WebElement Click_Individual;

			public void click_Individual_checkBox() {
			Click_Individual.click();
					}

		// Click the Check Country/Currency Availablity

			@FindBy (xpath = "//*[@class='choose-content-beneficiary']/form/div[4]/div[2]")
			private WebElement Click_Check_Country;

			public void click_Check_Country_Currency_Availablity() {
			Click_Check_Country.click();
				}

	   // Find the Bank Account Holders Name field

			@FindBy(xpath = "//*[@class='choose-content-beneficiary']/form/div[1]/div[5]/div[2]/div/input")
			private WebElement BankAccountHoldersName;
			
			public void bankAccountHoldersName(String name) {
		   waitTimeForWebElementToAppear(BankAccountHoldersName);
			BankAccountHoldersName.sendKeys("jessica Robert");
					}

	      // Click the Local field check box button

			@FindBy(xpath = "(//*[@class=\"form-check form-check-inline\"])[3]/input")
			private WebElement Local_checkBox;

			public void Click_Local_checkBox() {
			Local_checkBox.click();
				}

		// Click the Provide Bank Account details button

			@FindBy (xpath = "(//*[@class='me-3'])[3]/button")
	        private WebElement Bank_Account_details ;

			public void Click_Bank_Account_details() {
			Bank_Account_details.click();
				}

		// find recipient payee nickname field and perform required action
			
		    @FindBy(xpath = "//input[@name='beneficiaryAlias']")
		    private WebElement Recipient_Payee_Nickname;

		    public void recipientPayeeSearch(String name) {
		    Recipient_Payee_Nickname.sendKeys(name);
		}


		    public void recipientPayeeNickname(String nickName) {
		    	  waitTimeForWebElementToAppear(Recipient_Payee_Nickname);
	        Recipient_Payee_Nickname.sendKeys(nickName);
		}

		// find recipient payee country field opt and perform required action
		    
		    @FindBy(xpath = "(//input[@role='combobox'])[1]")
	     	private WebElement RecipientPayee_countryOpt;

		    public void recipientPayee_country(String country) {
		    RecipientPayee_countryOpt.sendKeys(country + Keys.DOWN + Keys.ENTER);
		}

		// find wish to add a SWiM PAY Wallet as Recipient/Payee option and perform

		   // required action
		   //@FindBy(id = "isSwimPayWallet_yes")
		   @FindBy(xpath="//*[@class='page-wrapper-recipientPayees']/ul/li[2]/a")
		   private WebElement WalletAs_recipient_Payee_yesOpt;

		   public void walletAsRecipientPayee_yesOption() {
		   WalletAs_recipient_Payee_yesOpt.click();
		}

		   @FindBy(xpath="//*[@class='page-wrapper-recipientPayees']/ul/li[2]/a")
		   private WebElement WalletAs_recipient_Payee_noOpt;

		   public void walletAsRecipientPayee_noOption() {
		   WalletAs_recipient_Payee_noOpt.click();
		}

		// find Currency field for Recipient & payee details page & perform required action

		   @FindBy(xpath = "(//*[@type='text'])[1]")
		   private WebElement CurrencyOpt;

		   public void recipientPayee_currency(String currency) {
		   CurrencyOpt.sendKeys(currency + Keys.DOWN + Keys.ENTER);
		}

		// find bank account holder name field and perform required action
		
		   @FindBy(xpath = "//input[@name='beneficiaryName']")
		   private WebElement BankAccountHolderName;
		
		// find swimpay customer name
		
		  @FindBy(xpath = "(//input[@id='combo-box-demo'])[1]")
		  private WebElement SwimPayCustomerName;

	   // Click the SWiM PAY Customer Region field

		  @FindBy(xpath= "(//*[@type='text'])[1]")
		  private WebElement SWiMPAY_Customer_Region;

		  public void Click_SWiMPAY_Customer_Region(String Region) {
		  SWiMPAY_Customer_Region.click();
		  SWiMPAY_Customer_Region.sendKeys( Region + Keys.DOWN + Keys.ENTER);
	    }
		  
	//Find the Account id perform action click
		
		  @FindBy(xpath= "//*[@id='country-select-demo']")
		  private WebElement Account_Id;

		  public void Click_Account_Id (String Accountnum) throws InterruptedException {
			  Account_Id.click();
			  Account_Id.sendKeys(Accountnum);
				Thread.sleep(3000);
				Account_Id.sendKeys(Keys.ARROW_DOWN);
				Account_Id.sendKeys( Keys.ENTER);

		  }
	// Find The Hand a pop-up message Add swim pay wallet perform click action
		   @FindBy(xpath= "//*[@class='MuiDialogActions-root MuiDialogActions-spacing css-14b29qc']/button[2]")
		   private WebElement SWIMPAY_Wallat;

		   public void Click_ADD_SWIMPAY_Wallat () {
		   SWIMPAY_Wallat.click();
		}

		// find fields title lable and perform required action
//		@FindBy(xpath = "(//*[@type='text'])[4]")
	//
//		private WebElement BankAccountName;
	//
//		public void AccountHoldersName(String accountName) {
//			String AccountNameFieldTitle = BankAccountName.getText();
//			System.out.println(AccountNameFieldTitle);
	//
//			if (AccountNameFieldTitle.contains("Bank Account Holder Name")) {
//				BankAccountHolderName.click();
//				clearField(BankAccountHolderName);
//				BankAccountHolderName.sendKeys(accountName);
//			} else {
//				if (SwimPayCustomerName.isDisplayed()) {
//					SwimPayCustomerName.sendKeys(accountName + Keys.DOWN + Keys.ENTER);
//				}
	//
//			}
		//}

	// find fields title label and perform required action pop-up message handle

				@FindBy(xpath = "(//*[@role='presentation'])[2]/div/div[2]/button[2]")
				private WebElement Wallate_popup;

				public void PopUp_Message () {
					Wallate_popup.click();
			}

	// find swimpay account name field and perform required action
				
		    @FindBy(xpath = "(//input[@id='combo-box-demo'])[2]")
		    private WebElement Bank_Name;

		    public void swimpayBankName(String name) {
			Bank_Name.sendKeys(name + Keys.DOWN + Keys.ENTER);
		}

	// find Search Swimpay account button and perform required action
		    
		    @FindBy(xpath = "//button[contains(@class,'css-1agp3zg-MuiButtonBase-')]")
		    private WebElement AccountSearch;

		    public void searchSwimpayAccountBtn() {
			AccountSearch.click();
		}

	// Find Funding account option radio button and perform required action
		    
		    @FindBy(xpath = "//input[@name='funding_account_option']")
		    private WebElement FundingAccountRadioBtn;

		    public void fundingAccountSelection() {
			if (FundingAccountRadioBtn.isEnabled()) {
				FundingAccountRadioBtn.click();
			} else {
				System.out.println("No funding account available");
			}
		}

	// find recipient payee bank account country field opt and perform required
		// action
		    
		     @FindBy(xpath = "(//input[@role='combobox'])[3]")
		     private WebElement RecipientPayee_bankCountryOpt;

		    public void recipientPayee_bankCountry(String bankCountry) {
		   	RecipientPayee_bankCountryOpt.sendKeys(bankCountry + Keys.DOWN + Keys.ENTER);
		}

	// find Bank Account type option and perform required action
		    
		     @FindBy(id = "inlineRadio1")
		     private WebElement BankAccountType_CorporateOpt;

		    public void bankAccountTypeCorporateOption() {
			//System.out.println("Button Selection is "+ BankAccountType_CorporateOpt.isEnabled());
			BankAccountType_CorporateOpt.click();
		}

		    @FindBy(id = "inlineRadio2")
		    private WebElement BankAccountType_IndividualOpt;

		    public void bankAccountTypeIndividualOption() {
			System.out.println("Button Selection is "+BankAccountType_IndividualOpt.isEnabled());
			BankAccountType_IndividualOpt.click();
		}

	// find submit recipient payee bank Account details button and perform click action
		   
		  @FindBy(xpath = "//*[@class='choose-content-beneficiary']/div[3]/div[2]/div[3]")
		  private WebElement RecipientPayeesubmit;

		  public void recipientPayeesubmit() {
			//waitTimeForElementToClickable(RecipientPayeesubmit);
		  RecipientPayeesubmit.click();
		}

	// ==================Bank Account Details Page======================//

	// find Bank Account Term checkbox and perform required action

		//@FindBy(xpath = "//input[@class='form-check-input']")
		  @FindBy(xpath ="//*[@type='checkbox']")
		  private WebElement RegularPaymentCheckBox;
	 
		 public void regularPaymentCheckBox() {
		//waitTimeForWebElementToAppear(RegularPaymentCheckBox);
		//waitTimeForElementToClickable(RegularPaymentCheckBox);
		RegularPaymentCheckBox.click();
		}

	// find Transit Number or Swift number field text box field and perform required action
		      
		  @FindBy(xpath = "//input[@placeholder='TRANSIT NUMBER']")
		  private WebElement TransitNumberField;
		    
		  @FindBy(xpath = "//input[@placeholder='SWIFT']")
		  private WebElement SwiftNumberField;
		    
		  @FindBy(xpath = "//input[@placeholder='BSB CODE']")
		  private WebElement BSBNumber;
		    
		  @FindBy(xpath = "//input[@placeholder='ACH CODE']")
		  private WebElement ACH_Code;

	 // find lable title for tansit/swift/bsb fields
		    
		    @FindBy(xpath = "(//div[@class='group-title mb-1'])[1]/span")
		    private WebElement Trans_Swift_BSB_LabelTitle;

		    public void getLabelTitle() {
			Trans_Swift_BSB_LabelTitle.getText();
		}

		    public void transit_swiftBsbNumber() {
			//waitTimeForWebElementToAppear(Trans_Swift_BSB_LabelTitle);
			String labelTitle = Trans_Swift_BSB_LabelTitle.getText();
			waitTimeForWebElementToAppear(Trans_Swift_BSB_LabelTitle);
			System.out.println(labelTitle);

			if (labelTitle.contains("TRANSIT")) {
				waitTimeForWebElementToAppear(TransitNumberField);
				String TransitNum = "10102";
				TransitNumberField.click();
				clearField(TransitNumberField);
				TransitNumberField.sendKeys(TransitNum);
			} else if (labelTitle.contains("SWIFT")) {
				waitTimeForWebElementToAppear(SwiftNumberField);
				String SwiftNum = "SBININBB476";
				String SwiftNum2 = "SBININBB476";
				SwiftNumberField.click();
				clearField(SwiftNumberField);
				SwiftNumberField.sendKeys(SwiftNum);
			} else if (labelTitle.contains("BSB CODE")) {
				waitTimeForWebElementToAppear(BSBNumber);
				String BsbNum = "033547";
				BSBNumber.click();
				clearField(BSBNumber);
				BSBNumber.sendKeys(BsbNum);
			} else if (labelTitle.contains("ACH CODE")) {
				waitTimeForWebElementToAppear(BSBNumber);
				String Ach = "123456";
				ACH_Code.click();
				clearField(ACH_Code);
				ACH_Code.sendKeys(Ach);
			}
		}

	// provide invalid format values in respective BSB SWIFT or Transit fields
		    
		   public void invalid_Transit_swiftBsbNumber() {
			String labelTitle = Trans_Swift_BSB_LabelTitle.getText();

			if (labelTitle.contains("TRANSIT")) {
				waitTimeForWebElementToAppear(TransitNumberField);
				String TransitNum = "101";
				TransitNumberField.click();
				clearField(TransitNumberField);
				TransitNumberField.sendKeys(TransitNum);
			} else if (labelTitle.contains("SWIFT")) {
				waitTimeForWebElementToAppear(SwiftNumberField);
				String SwiftNum = "AZ18L";
				String SwiftNum2 = "SBININBB476";
				SwiftNumberField.click();
				clearField(SwiftNumberField);
				SwiftNumberField.sendKeys(SwiftNum);
			} else if (labelTitle.contains("BSB CODE")) {
				waitTimeForWebElementToAppear(BSBNumber);
				String BsbNum = "0334127";
				String bsbNum= "2457125";
				BSBNumber.click();
				clearField(BSBNumber);
				BSBNumber.sendKeys(bsbNum);
			} else if (labelTitle.contains("ACH CODE")) {
				waitTimeForWebElementToAppear(BSBNumber);
				String Ach = "123456";
				ACH_Code.click();
				clearField(ACH_Code);
				ACH_Code.sendKeys(Ach);
			}
		}

		// find Account Number text box field and perform required action
		   
		@FindBy(xpath = "//input[@placeholder='Account Number']")
		private WebElement AccountNumberField;

		public void accountNumber(String accountNum) {
		waitTimeForWebElementToAppear(AccountNumberField);
		AccountNumberField.sendKeys(accountNum);
		}
		
		@FindBy(xpath = "//input[@placeholder='Account Number']")
		private WebElement RandomAccountNumber;
		
		  public void RandomaccountNumber() {
		        Random random = new Random();
		        long generatedNumber = generateRandomNumber(random);
		        String accountNum = Long.toString(generatedNumber);
		        
		        RandomAccountNumber.click();
		        RandomAccountNumber.clear(); // Clear any existing text
		        RandomAccountNumber.sendKeys(accountNum);
		        
		        System.out.println("Generated Account Number: " + accountNum);
		    }

		    // Method to generate a random long number
		    public static long generateRandomNumber(Random random) {
		        return (long) (random.nextDouble() * 9_000_000_000L) + 1_000_000_000L;
		    }


		

		// find bank name text box field and perform required action
		
		@FindBy(xpath = "//input[@placeholder='Bank Name']")
		private WebElement BankNameField;

		public void bankName(String bankName) {
			waitTimeForWebElementToAppear(BankNameField);
		BankNameField.sendKeys(bankName);
		}

		// find bank code text box field and perform required action
		
		@FindBy(xpath = "//input[@placeholder='Bank Code']")
		private WebElement BankCodeField;

		public void bankCode(String bankCode) {
			waitTimeForWebElementToAppear(BankCodeField);
		BankCodeField.sendKeys(bankCode);
		}

		// find Address text box field and perform required action
		
		@FindBy(xpath = "//input[@placeholder='Address']")
		private WebElement AddressField;

		public void address(String Add) {
		
		AddressField.sendKeys(Add);
		}

		// find City text box field and perform required action
		
		@FindBy(xpath = "//input[@placeholder='City']")
		private WebElement CityField;

		public void city(String city) {
		waitTimeForWebElementToAppear(CityField);
		CityField.sendKeys(city);
		}

		// find State/Province text box field and perform required action
		
		@FindBy(xpath = "//input[@placeholder='State/Province']")
		private WebElement StateField;

		public void state(String state) {
			waitTimeForWebElementToAppear(StateField);
		StateField.sendKeys(state);
		}

		// find postcode text box field and perform required action
		
		@FindBy(xpath = "//input[@placeholder='Postcode']")
		private WebElement PostCodeField;

		public void postCode(String postcode) {
			waitTimeForWebElementToAppear(PostCodeField);
		PostCodeField.sendKeys(postcode);
			}

		// Click the Review Recipient/Payee field button

		@FindBy (xpath = "(//*[@class='me-3'])[3]/button")
		private WebElement Review_Recipient;

		public void Click_Review_Recipient() {
		Review_Recipient.click();

		}

		// Click the Update Recipient/Payees button

		@FindBy (xpath = "//*[@class='choose']/div/div[4]/div[3]/button")
		private WebElement Update_Recipient;

		public void Click_Update_Recipient() {
		Update_Recipient.click();
			}
			
		//Click the Create Recipient/Payees field button

		@FindBy(xpath="//*[@class=' text-black']/div[4]/div[3]")
		private WebElement Create_Recipient_Payees;

		public void Click_Create_Recipient_Payees() {
		Create_Recipient_Payees.click();

	}

		// verify validate recipient Payee button and perform click action
		
		@FindBy(xpath = "//button[contains(@class,'css-1n8bsxn-MuiButtonBase-root-MuiButton')]")
		private WebElement ValidateRecipientPayeeBtn;

		public void validate_N_createRecipientPayeeBtn() {
		//waitTimeForElementToClickable(ValidateRecipientPayeeBtn);
		ValidateRecipientPayeeBtn.click();
		}

		// find cancel button and perform click action
		
		@FindBy(xpath = "//button[contains(@class,'MuiButton-containedError')]")
		private WebElement CancelBtn;

		public void cancelBtn() {
		CancelBtn.click();
		}

		// find back button and perform click action
		
		@FindBy(xpath = "//button[contains(@class,'css-5vsnzl-MuiButtonBase')]")
		private WebElement BackBtn;

		public void backBtn() {
		BackBtn.click();
		}

		// Find Pay option button after recipient/payee details added
		
		@FindBy(xpath = "(//button[contains(@class,'containedSizeMedium css-5vsnzl-MuiButtonBase')])[2]")
		private WebElement PayOpt_afterRecipientPayeeAdded;

		public void payOptClick_after_recipientPayeeAdded() {
		PayOpt_afterRecipientPayeeAdded.click();
		}

		// Find Pay option button after recipient/payee details added
		
		@FindBy(xpath = "(//button[contains(@class,'containedSizeMedium css-5vsnzl-MuiButtonBase')])[1]")
		private WebElement EditOpt_afterRecipientPayeeAdded;

		public void editOptClick_after_recipientPayeeAdded() {
		EditOpt_afterRecipientPayeeAdded.click();
		}

		// find error message of account not selection
		
		@FindBy(xpath = "//div[@class='text-danger']")
		private WebElement ErrorMsgDisplay;

		public void errorMessageDisplay() {
		System.out.println(ErrorMsgDisplay.getText());
		}

		//Find Review recipient/payee details and perform required action
		
		@FindBy(xpath="//div[@class=' text-black']")
		private WebElement reviewDetails;
		
		public void recipientPayeeReviewDetails() {
		System.out.println(reviewDetails.getText());
		}

	//=======================================New Change======================================
		
		
		//===============================External Recipients=============================================
		
		// find back button and perform click action
		
		@FindBy(xpath = "(//*[@type='button'])[4]")
		private WebElement Backbutton;

		public void Click_backBtn() {
			Backbutton.click();
		}
		
	// find Pay button and perform click action	

		@FindBy(xpath = "//*[@class='item-group d-flex']/div[3]/button")
		private WebElement Paybutton;

		public void Click_PayBtn() {
			Paybutton.click();
		}
		

		// find amount field & perform required action
		
		@FindBy(xpath = "//input[@id='amount']")
		private WebElement AmountFieldOpt;

		public void enterAmount(String amount) {
		AmountFieldOpt.sendKeys(amount);
		}
		
		// find select recipient/payee details preview and performe required action

		@FindBy(xpath = "//div[@class='well recipient_display_wrapper text-black mb-3']")
		private WebElement Recipient_PayeeNameDetails;

		public void recipient_payeeDetailPreview() {
		System.out.println(Recipient_PayeeNameDetails.getText());
		}
		
		// find currency detail submit button and perform click action
	 
		@FindBy(xpath = "//button[@type='submit']")
		private WebElement PaymentDetailNextBtn;

		public void paymentDetailNextBtn() {
			PaymentDetailNextBtn.click();
		}
		
		// find currency detail cancel button and perform click action

			@FindBy(xpath = "//button[contains(@class,'MuiButton-containedError')]")
			private WebElement PaymentDetailCancelBtn;

			public void paymentDetailCancelBtn() {
			PaymentDetailCancelBtn.click();
			}
			// find Reference Number field and perform required action

			@FindBy(xpath = "//input[@name='customerComments']")
			private WebElement ReferenceNumber;

			public void referenceNumberValue(String referenceNum) {
			ReferenceNumber.sendKeys(referenceNum);
			}

			// find Payment Purpose field and perform required action

			@FindBy(xpath = "//*[@id='select-:r29:']")
			private WebElement PaymentPurposeField;

			public void paymentPurpiose(String paymentPurpose) {
				PaymentPurposeField.click();
			PaymentPurposeField.sendKeys(paymentPurpose + Keys.DOWN + Keys.ENTER);
			
			}

			// find Source of fund field and perform required action

			@FindBy(xpath = "(//input[@id='select-:rh:'])[1]")
			private WebElement SourceOfFundsFieldOpt;

			public void souceOfFunds() {
			System.out.println(SourceOfFundsFieldOpt.getText());
			}

			// find review payment button option and perform click action

			@FindBy(xpath = "//button[@type='submit']")
			private WebElement ReviewPaymentBtn;

			public void reviewPayment() {
			if (ReviewPaymentBtn.isEnabled()) {
			ReviewPaymentBtn.click();
				}
			else {
			System.out.println(ReviewPaymentBtn.getText() + " Button is disabled or not clickabled");
				}
			}

	// find Back payment button option and perform click action

			@FindBy(xpath = "(//button[contains(@class,'MuiButton-containedPrimary')])[1]")
			private WebElement BackBtnOpt;

			public void backButton() {
			waitTimeForElementToClickable(BackBtnOpt);
			BackBtnOpt.click();
			}
			
	// find Back payment button option and perform click action

			@FindBy(xpath = "//*[@class='row m-2']/button[2]")
		    private WebElement CancelBtnOpt;

			public void cancelButton() {
			waitTimeForElementToClickable(CancelBtnOpt);
			CancelBtnOpt.click();
			}
			
	// find Create payment button option and perform click action

			@FindBy(xpath = "(//button[contains(@class,'MuiButton-containedPrimary')])[2]")
			private WebElement CreatePaymentBtn;

			public void createPayment() {
			CreatePaymentBtn.click();
			}
			
	// find DashBoard button option and perform click action

			@FindBy(xpath = "//*[@class='row m-2']/button[2]")
			private WebElement DashBoardBtn;

			public void DashBoard() {
			DashBoardBtn.click();
			}	
			
			//Find PAy button perform action click
			
			@FindBy(xpath = " //*[@style='overflow-x: auto;']/table/tbody/tr[5]/td[5]/div/button")
			private WebElement Paybtn;

			public void Click_Paybtn() {
				Paybtn.click();
			}
			
	//Find Pay button PaymentPurpose perform action click For 	
			
			
			@FindBy(xpath = "(//*[@type='text'])[2]")
			private WebElement PaymentPurpose;
			
			public void paymentPurpiose_For_CreatePayemnt(String paymentPurpose) {
				PaymentPurpose.click();
			PaymentPurpose.sendKeys(paymentPurpose + Keys.DOWN + Keys.ENTER);
			
			}
			
	//Find the click the Pay field button perform action click
		
			   
	    @FindBy(xpath= "//div[@class='recipientPayees-container']/div[3]/table/tbody/tr/td[1]")
	    List<WebElement> allname;

	    public void payclick(String name)
	    {
	    	for(int i=1;i<allname.size();i++)
	    	{
	    		
	    		scrollActionBulk(allname.get(i));
	    		String nametxt = allname.get(i).getText();
	    		//System.out.println(nametxt);
	    		if(nametxt.equals(name))
	    		{
	    			System.out.println(name);
	    			driver.findElement(By.xpath("//div[@class='recipientPayees-container']/div[3]/table/tbody/tr["+ (i+1) +"]/td[5]/div/button")).click();
	    			break;
	    		}
	    	}
	    	
//	    	for(WebElement name : allname)
//	    	{
//	    		scrollAction(name);
//	    		String nametxt = name.getText();
//	    		System.out.println(nametxt);
//	    		if(nametxt.equals(Asher))
//	    		{
//	    			name.findElement(By.xpath("//div[@class='recipientPayees-container']/div[3]/table/tbody/tr/td[5]/div/button")).click();
//	    		}
//	    	}
	    }
			
	//Find the pay field not account sufficient fund and select the Alternative country select
	    
		@FindBy(xpath = "(//*[@autocomplete='new-password'])[2]")
		private WebElement Alternativecurrency_for_Payfield;
		
		public void pay_For_Alternativecurrency(String Alternativecurrency) {
			Alternativecurrency_for_Payfield.click();
			Alternativecurrency_for_Payfield.sendKeys(Alternativecurrency+ Keys.DOWN + Keys.ENTER);
		
		}
	//Find the Pop-up message accepect Rate and cancel button click handel for Pay field in 
		
		
		@FindBy(xpath = "//*[@class='MuiDialogActions-root MuiDialogActions-spacing css-14b29qc']/button[2]")
		private WebElement  Accpectrate;

		public void Click_PaybtnAccpectrate() {
			 Accpectrate.click();
		}


		
	//Find the click the Pay field Edit button perform action click
		 @FindBy(xpath= "//div[@class='recipientPayees-container']/div[3]/table/tbody/tr/td[1]")
	     List<WebElement> Edit;

	  public void Editclick(String name )
	    {
	    	for(int i=1;i<Edit.size();i++)
	    	{
	    		
	    		scrollActionBulk(Edit.get(i));
	    		String nametxt = Edit.get(i).getText();
	    		System.out.println(nametxt);
	    		if(nametxt.equals(name ))
	    		{
	    			System.out.println(name );
		 driver.findElement(By.xpath("//div[@class='recipientPayees-container']/div[3]/table/tbody/tr["+ (i+1) +"]/td[5]/div/span[1]/button")).click();
	       break; 
	         }
	      }
	     }
	  

	//Find the click the Pay field Delete button perform action click
	        @FindBy(xpath= "//div[@class='recipientPayees-container']/div[3]/table/tbody/tr/td[1]")
	         List<WebElement> DeleteBtn;

	       public void Deleteclick(String Delete){

	              for(int i=1;i<DeleteBtn.size();i++)
	    {
	            	  scrollActionBulk(DeleteBtn.get(i));
	          String delete = DeleteBtn.get(i).getText();
	      	if(delete.equals(Delete)) {
	      		
	      		System.out.println(Delete);   
	      driver.findElement(By.xpath("//div[@class='recipientPayees-container']/div[3]/table/tbody/tr["+ (i+1) +"]/td[5]/div/span[2]/button")).click();
	     }
	   }
	}
	     
	//Find the click the Pay field click Delete button handel the pop message perform action click

	             @FindBy(xpath = "//*[@class='MuiDialogActions-root MuiDialogActions-spacing css-14b29qc']/button[2]")
	             private WebElement Okbtn;

	              public void Click_Okbtn() {
		          Okbtn.click();
	} 
	              
	// Find the Search field perform action click   
	              
		         	@FindBy(xpath = "//*[@placeholder='Search Recipient/Payees']")
		         	private WebElement searchfield;

		         	public void Click_searchfield(String name) {
		         		 searchfield.click();
		         		 searchfield.sendKeys(name);
		         	}	
		         	
	// Find the Search button field perform action click   	
		         	
		         	@FindBy(xpath = "//*[@type='submit']")
		         	private WebElement searchbtn;

		         	public void Click_searchbtn() {
		         		 searchbtn.click();
		         		
		         	}	
			
	//===============================SWiM PAY Wallets=============================================
			
			
	// Find SWiM PAY Wallets perform click action

			
			@FindBy(xpath = "//*[@class='page-wrapper-recipientPayees']/ul/li[2]")
			private WebElement SWiMPAYWallets;

			public void Click_SWiMPAYWallets() {
				SWiMPAYWallets.click();
			}
			
	// Find Add SWiM PAY Wallets perform click action	
			

			@FindBy(xpath = " (//*[@type='button'])[3]")
			private WebElement AddSWiMPAYWallets;

			public void Click_AddSWiMPAYWallets() {
				AddSWiMPAYWallets.click();
			}
			
	// Find Add SWiM PAY Wallets cancel button perform click action	
			@FindBy(xpath = "  //*[@class='MuiDialogActions-root MuiDialogActions-spacing css-14b29qc']/button[1]")
			private WebElement AddSWiMPAYWalletsCancel;

			public void Click_CancelbtnAddSWiMPAYWallets() {
				AddSWiMPAYWalletsCancel.click();
			}
			
	    // Pagination
			
			@FindBy(xpath = "//*[@data-testid='KeyboardArrowRightIcon']")
			private WebElement nextpage;
			
			public void pagination(int pagenumber) {

			for(int i = 0 ; i< pagenumber ; i++ ) {
				
				nextpage.click();
			}
			
			}
			
	//Find the click the Pay field SWiM PAY Wallets perform action click	
			
			   
	 @FindBy(xpath= "//div[@class='recipientPayees-container']/div[3]/table/tbody/tr/td[1]")
	 List<WebElement> SWiMPAYWalletsallname;

	 public void SWiMPAYWalletspayclick(String SWiMPAYWalletname)
	 {
	 		
	 	for(int i=1;i<SWiMPAYWalletsallname.size();i++)
	 	{
	 		
	 		scrollActionBulk(SWiMPAYWalletsallname.get(i));
	 		String nametxt = SWiMPAYWalletsallname.get(i).getText();
	 		//System.out.println(nametxt);
	 		if(nametxt.equals(SWiMPAYWalletname))
	 		{
	 			System.out.println(SWiMPAYWalletname);
	 			driver.findElement(By.xpath("//div[@class='recipientPayees-container']/div[3]/table/tbody/tr/td[4]/div/button")).click();
	 			break;
	 		}
	 	}

	}
	 

	// Select the new change select the currency payment SWiM PAY Wallets field

		@FindBy(xpath = "(//*[@autocomplete='new-password'])[1]")
			private WebElement currencyName;

		public void Click_currency(String Currency ) {
			currencyName.click();
			currencyName.sendKeys(Currency+ Keys.DOWN + Keys.ENTER);
	}
		
	// Find the amount bank detail payment SWiM PAY Wallets field
		

		@FindBy(xpath = "//*[@name='amount']")
		private WebElement SWiMPAYWalletsAmount;

		public void Click_SWiMPAYWalletsAmount(String amount) {
			SWiMPAYWalletsAmount.click();
			SWiMPAYWalletsAmount.sendKeys("20");
		}

	// Find the amount bank detail Reference number payment SWiM PAY Wallets field
		

			@FindBy(xpath = "//*[@placeholder='Reference Number']")
			private WebElement SWiMPAYWalletsreferncenum;

			public void Click_SWiMPAYWalletsreferncenum() {
				SWiMPAYWalletsreferncenum.click();
				SWiMPAYWalletsreferncenum.sendKeys("123456");
			}
			
	// Find the amount bank detail  Payment Purpose payment SWiM PAY Wallets field
			
			@FindBy(xpath = "(//*[@type='text'])[5]")
			private WebElement SWiMPAYWalletsPaymentPurpose;

			public void Click_SWiMPAYWalletsPaymentPurpose(String PaymentPurpose) {
				SWiMPAYWalletsPaymentPurpose.click();
				SWiMPAYWalletsPaymentPurpose.sendKeys(PaymentPurpose+ Keys.DOWN + Keys.ENTER);
			}
				
	// Find the amount bank detail  Payment Purpose payment SWiM PAY Wallets field
				

					@FindBy(xpath = "//*[@class='d-flex']/button[2]")
					private WebElement SWiMPAYWalletsPayNextbtn;

					public void Click_SWiMPAYWalletsPayNextbtn() {
						SWiMPAYWalletsPayNextbtn.click();
						
					}
				
	//Find the click the Pay field Delete button perform action click for SWiM PAY Wallets page

			           @FindBy(xpath= "//div[@class='recipientPayees-container']/div[3]/table/tbody/tr/td[1]")
			                List<WebElement> SWiMPAYWalletsDeleteBtn;

			             public void SWiMPAYWalletsDeleteBtn(String Viraj2){
			              for(WebElement name : SWiMPAYWalletsDeleteBtn)
			                {
			                    String nametxt = name.getText();
			                  if(nametxt.equals(Viraj2))
			               {
				name.findElement(By.xpath("//div[@class='recipientPayees-container']/div[3]/table/tbody/tr/td[4]/div/span")).click();
			    }
			  }
			}
			             
					   	// find currency detail submit button and perform click action
			             
			         	@FindBy(xpath = "//*[@type='submit']")
			         	private WebElement PaymentNextBtn;

			         	public void Click_paymentNextBtn() {
			         		PaymentNextBtn.click();
			         	}	
			         	
			         	
	// Find the Search field perform action click   
			              
			         	@FindBy(xpath = "//*[@placeholder='Search Wallet']")
			         	private WebElement SWiMPAYWalletssearchfield;

			         	public void Click_SWiMPAYWalletssearchfield(String SearchName) {
			         		SWiMPAYWalletssearchfield.click();
			         		SWiMPAYWalletssearchfield.sendKeys(SearchName);
			         	}	
			         	
	// Find the Search button field for SWiM PAY Wallets  perform action click   	
			         	
			         	@FindBy(xpath = "//*[@type='submit']")
			         	private WebElement SWiMPAYWalletssearchbtn;

			         	public void Click_SWiMPAYWalletssearchbtn() {
			         		SWiMPAYWalletssearchbtn.click();
			         		
			         	}	
					
	// Find the make a payment button field for SWiM PAY Wallets  perform action click
			         	
			         	@FindBy(xpath = "//*[@class='row m-2']/button[1]")
			         	private WebElement makeAnotherpayment;

			         	public void Click_makeApayment() {
			         		makeAnotherpayment.click();
			         		
			         	}	
			         	
			         	
	}
			
			
			
		