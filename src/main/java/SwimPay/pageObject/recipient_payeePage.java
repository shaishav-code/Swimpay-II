package SwimPay.pageObject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class recipient_payeePage extends abstractComponentsMethods {

	WebDriver driver;

	public recipient_payeePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Find Add Bank Account button and perform click action
 	//@FindBy(xpath = "//button[contains(@class,'mt-2 css-1agp3zg-')]")
	@FindBy(xpath = "(//*[@type='button'])[3]")
	private WebElement AddRecipientPayee;

	public void addRecipientPayeeBtn() {
		AddRecipientPayee.click();
	}


	// Find recipient Data list and perform required actions
	// Find recipient Data from listing
	@FindBy(xpath = "//tr[@class='tr-list']")
	private List<WebElement> RecipientPayeeData;

	// find recipient payee user name and perform required action
	@FindBy(xpath = "//td[@class='pe-2']/a")
	private List<WebElement> RecipientPayeeName;

	// Find Pay option button and perform click action
	@FindBy(xpath = "//button[contains(text(),'Pay')]")
	private List<WebElement> RecipientPayeePayBtn;

	// Find Edit option button and perform click action
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	private List<WebElement> RecipientPayeeEditBtn;
	//private WebElement RecipientPayeeEditBtn;

	// Find Delete option button and perform click action
	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	private List<WebElement> RecipientPayeeDeleteBtn;
	
	//Perform recipient & payee data list capture action
	public void recipientPayee_DataList()
	{
		for (int i=0;i<RecipientPayeeData.size();i++)
		{
			String userdataList=RecipientPayeeData.get(i).getText();
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
		public paymentPage clickPayButtonForUsername_FromDataList(String requestedUsername) {
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
		        }
		    }
		    paymentPage Payments = new paymentPage(driver);
			return Payments;
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
	
	
	// find recipient payee nickname field and perform required action
	@FindBy(xpath = "//input[@name='beneficiaryAlias']")
	private WebElement Recipient_Payee_Nickname;

	public void recipientPayeeSearch(String name) {
		Recipient_Payee_Nickname.sendKeys(name);
	}

	public void recipientPayeeNickname(String nickName) {
		Recipient_Payee_Nickname.click();
		clearField(Recipient_Payee_Nickname);
		
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
	@FindBy(id = "isSwimPayWallet_yes")
	private WebElement WalletAs_recipient_Payee_yesOpt;

	public void walletAsRecipientPayee_yesOption() {
		WalletAs_recipient_Payee_yesOpt.click();
	}

	@FindBy(id = "isSwimPayWallet_no")
	private WebElement WalletAs_recipient_Payee_noOpt;

	public void walletAsRecipientPayee_noOption() {
		WalletAs_recipient_Payee_noOpt.click();
	}

	// find Currency field for Recipient & payee details page & perform required action
	@FindBy(xpath = "(//input[@id='country-select-demo'])[2]")
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

	// find fields title lable and perform required action
	@FindBy(xpath = "//div[@class='mb-3 position-relative']//div[@class='group-title mb-1']")
	private WebElement BankAccountName;

	public void AccountHoldersName(String accountName) {
		String AccountNameFieldTitle = BankAccountName.getText();
		System.out.println(AccountNameFieldTitle);

		if (AccountNameFieldTitle.contains("Bank Account Holder Name")) {
			BankAccountHolderName.click();
			clearField(BankAccountHolderName);
			BankAccountHolderName.sendKeys(accountName);
		} else {
			if (SwimPayCustomerName.isDisplayed()) {
				SwimPayCustomerName.sendKeys(accountName + Keys.DOWN + Keys.ENTER);
			}
		}
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
		System.out.println("Button Selection is "+BankAccountType_CorporateOpt.isEnabled());
		BankAccountType_CorporateOpt.click();
	}

	@FindBy(id = "inlineRadio2")
	private WebElement BankAccountType_IndividualOpt;

	public void bankAccountTypeIndividualOption() {
		System.out.println("Button Selection is "+BankAccountType_IndividualOpt.isEnabled());
		BankAccountType_IndividualOpt.click();
	}

	// find submit recipient payee bank Account details button and perform click action
	@FindBy(xpath = "//button[contains(@class,'MuiButton-fullWidth css-')]")
	private WebElement RecipientPayeesubmit;

	public void recipientPayeesubmit() {
		waitTimeForElementToClickable(RecipientPayeesubmit);
		RecipientPayeesubmit.click();
	}

	// ==================Bank Account Details Page======================//
	// find Bank Account Term checkbox and perform required action
	@FindBy(xpath = "//input[@class='form-check-input']")
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
			String SwiftNum = "AZ12345678L";
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
		
		AccountNumberField.click();
		clearField(AccountNumberField);
		AccountNumberField.sendKeys(accountNum);
	}

	// find bank name text box field and perform required action
	@FindBy(xpath = "//input[@placeholder='Bank Name']")
	private WebElement BankNameField;

	public void bankName(String bankName) {
		
		BankNameField.click();
		clearField(BankNameField);
		BankNameField.sendKeys(bankName);
	}

	// find bank code text box field and perform required action
	@FindBy(xpath = "//input[@placeholder='Bank Code']")
	private WebElement BankCodeField;

	public void bankCode(String bankCode) {
		
		BankCodeField.click();
		clearField(BankCodeField);
		BankCodeField.sendKeys(bankCode);
	}

	// find Address text box field and perform required action
	@FindBy(xpath = "//input[@placeholder='Address']")
	private WebElement AddressField;

	public void address(String Add) {
		
		AddressField.click();
		clearField(AddressField);
		AddressField.sendKeys(Add);
	}

	// find City text box field and perform required action
	@FindBy(xpath = "//input[@placeholder='City']")
	private WebElement CityField;

	public void city(String city) {
		
		CityField.click();
		clearField(CityField);
		CityField.sendKeys(city);
	}

	// find State/Province text box field and perform required action
	@FindBy(xpath = "//input[@placeholder='State/Province']")
	private WebElement StateField;

	public void state(String state) {
		
		StateField.click();
		clearField(StateField);
		StateField.sendKeys(state);
	}

	// find postcode text box field and perform required action
	@FindBy(xpath = "//input[@placeholder='Postcode']")
	private WebElement PostCodeField;

	public void postCode(String postcode) {
		
		PostCodeField.click();
		PostCodeField.clear();
		PostCodeField.sendKeys(postcode);
	}

	// verify validate recipient Payee button and perform click action
	@FindBy(xpath = "//button[contains(@class,'css-1n8bsxn-MuiButtonBase-root-MuiButton')]")
	private WebElement ValidateRecipientPayeeBtn;

	public void validate_N_createRecipientPayeeBtn() {
		waitTimeForElementToClickable(ValidateRecipientPayeeBtn);
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
	public void recipientPayeeReviewDetails()
	{
		System.out.println(reviewDetails.getText());
	}

}
