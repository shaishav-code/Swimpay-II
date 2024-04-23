package SwimPay.pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class paymentPage extends abstractComponentsMethods {

	WebDriver driver;

	public paymentPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// find currency field and perform required action
	@FindBy(xpath = "(//input[contains(@id,'currency-select-')])[1]")
	private WebElement CurrencyFieldOpt;

	public void chooseCurrency(String currency) {
		CurrencyFieldOpt.click();
		CurrencyFieldOpt.sendKeys(currency + Keys.DOWN + Keys.ENTER);
	}

	// find amount field & perform required action
	@FindBy(xpath = "//input[@id='amount']")
	private WebElement AmountFieldOpt;

	public void enterAmount(String amount) {
		AmountFieldOpt.sendKeys(amount);
	}

	// find recipent/payee field and perform required action
	@FindBy(xpath = "(//input[contains(@id,'select')])[2]")
	private WebElement Recipient_PayeeNameOpt;

	public void recipient_payeeName(String name) {
		Recipient_PayeeNameOpt.click();
		Recipient_PayeeNameOpt.sendKeys(name + Keys.DOWN + Keys.ENTER);
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
		if (PaymentDetailNextBtn.isEnabled()) {
			PaymentDetailNextBtn.click();
		} else  //(AddRecipientBtn.isDisplayed()) 
			{
			AddRecipientBtn.click();
		}

	}

	public void paymentDetailNextButton() {
		if (PaymentDetailNextBtn.isEnabled()) {
			PaymentDetailNextBtn.click();
		} else {
			System.out.println(PaymentDetailNextBtn.getText() + " Button is not Displayed ");
		}

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
	@FindBy(xpath = "(//div[@class='MuiAutocomplete-root MuiAutocomplete-hasPopupIcon css-9i3kzy'])[1]/div/div/input")
	private WebElement PaymentPurposeField;
	
	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-b52kj1']")
	WebElement PaymentPurposeField1;
	
	@FindBy(xpath = "")
	List<WebElement> paymentPur;

	public void paymentPurpiose(String paymentPurpose) throws InterruptedException {
		PaymentPurposeField.click();
		pauseRun();
		PaymentPurposeField1.sendKeys(paymentPurpose);
		PaymentPurposeField1.sendKeys(Keys.DOWN); 
		PaymentPurposeField1.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
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
		} else {
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

	// find Create payment button option and perform click action
	@FindBy(xpath = "(//button[contains(@class,'MuiButton-containedPrimary')])[2]")
	private WebElement CreatePaymentBtn;

	public void createPayment() {
		CreatePaymentBtn.click();
	}

	// find add recipient button and perform click action
	@FindBy(xpath = "//button[contains(@class,'MuiButton-containedSizeMedium css')]")
	private WebElement AddRecipientBtn;

	public void addRecipientBtn() {
		AddRecipientBtn.click();
	}

	// ===========================ADD RECIPIENT
	// PAGE================================//
	// find recipient payee nickname field and perform required action
	@FindBy(xpath = "//input[@name='beneficiaryAlias']")
	private WebElement Recipient_Payee_Nickname;

	public void recipientPayeeNickname(String nickName) {
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

	// find Currency field for Recipient & payee details page & perform required
	// action
	@FindBy(xpath = "(//input[contains(@id,'currency-select-')])[1]")
	private WebElement CurrencyOpt;

	public void recipientPayee_currency(String currency) {
		CurrencyOpt.sendKeys(currency + Keys.DOWN + Keys.ENTER);
	}

	// find bank account holder name field and perform required action
	@FindBy(xpath = "//input[@name='beneficiaryName']")
	private WebElement BankAccountHolderName;
	// find swimpay customer name
	@FindBy(xpath = "(//input[@id='country-select-demo'])")
	private WebElement SwimPayCustomerName;

	// find fields title lable and perform required action
	@FindBy(xpath = "//div[@class='mb-3 position-relative']//div[@class='group-title mb-1']")
	private WebElement BankAccountName;
	@FindBy(xpath="//div[@class='mb-3 position-relative']//label[@class='group-title']")
	private WebElement SwimpayCustomerNameLable;

	public void AccountHoldersName(String accountName) {
//		String AccountNameFieldTitle = BankAccountName.getText();
//		System.out.println(AccountNameFieldTitle);

		if (BankAccountName.getText().contains("Bank Account Holder Name")) {
			BankAccountHolderName.sendKeys(accountName);
		} else {
			if (SwimpayCustomerNameLable.getText().contains("SWiM PAY Customer Name")) {
				SwimPayCustomerName.sendKeys(accountName );
				SwimPayCustomerName.sendKeys( Keys.DOWN, Keys.ENTER);
			}
		}
	}
	
	
	public void AccountHoldersNames(String accountName) {
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds for elements to be visible
//
//	    // Wait for BankAccountName element to be visible
//	    wait.until(ExpectedConditions.visibilityOf(BankAccountName));
		String namelable=BankAccountName.getText();
	    if (namelable.contains(namelable)) {
	        BankAccountHolderName.sendKeys(accountName);
	    } else {
	        System.out.println("requested Condition not found");
	    }

	}
	
	public void swimPayAccountHolderName(String SwimpayAccount) throws InterruptedException
	{
		String lable=SwimpayCustomerNameLable.getText();
		System.out.println(lable);
	        if (lable.contains("SWiM PAY Customer Name")) {
	        	SwimPayCustomerName.click();
	            SwimPayCustomerName.sendKeys(SwimpayAccount);
	            Thread.sleep(3000);
	            SwimPayCustomerName.sendKeys(Keys.DOWN, Keys.ENTER);
	        }
	    
	}

	// find swimpay account name field and perform required action
	@FindBy(xpath = "(//input[@id='combo-box-demo'])[1]")
	private WebElement Bank_Name;

	public void swimpayBankName(String name) {
		Bank_Name.sendKeys(name + Keys.DOWN + Keys.ENTER);
	}

	// find Search Swimpay account button and perform required action
	@FindBy(xpath = "//button[contains(@class,'MuiButton-containedSizeMedium css-1xti34q')]")
	private WebElement AccountSearch;

	public void searchSwimpayAccountBtn() {
		waitTimeForElementToClickable(AccountSearch);
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
		BankAccountType_CorporateOpt.click();
	}

	@FindBy(id = "inlineRadio2")
	private WebElement BankAccountType_IndividualOpt;

	public void bankAccountTypeIndividualOption() {
		BankAccountType_IndividualOpt.click();
	}

	// find submit recipient payee bank Account details button and perform click
	// action
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement RecipientPayeesubmit;

	public void recipientPayeesubmit() {
		RecipientPayeesubmit.click();
	}

	// ==================Bank Account Details Page======================//
	// find Bank Account Term checkbox and perform required action
	@FindBy(id = "TypeCheck")
	private WebElement RegularPaymentCheckBox;

	public void regularPaymentCheckBox() {
		waitTimeForWebElementToAppear(RegularPaymentCheckBox);
		RegularPaymentCheckBox.click();
	}

	// find Transit Number or Swift number field text box field and perform required
	// action
	@FindBy(xpath = "//input[@placeholder='TRANSIT NUMBER']")
	private WebElement TransitNumberField;
	@FindBy(xpath = "//input[@placeholder='SWIFT']")
	private WebElement SwiftNumberField;
	@FindBy(xpath = "//input[@placeholder='BSB CODE']")
	private WebElement BSBNumber;
	@FindBy(xpath = "//input[@placeholder='ACH CODE']")
	private WebElement ACH_Code;

	// find lable title for tansit/swift/bsb fields
	@FindBy(xpath = "(//div[@class='group-title mb-1'])[1]")
	private WebElement Trans_Swift_BSB_LabelTitle;

	public void getLabelTitle() {
		Trans_Swift_BSB_LabelTitle.getText();
	}

	public void transit_swiftBsbNumber() {
		String labelTitle = Trans_Swift_BSB_LabelTitle.getText();

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

	// find Account Number text box field and perform required action
	@FindBy(xpath = "//input[@placeholder='Account Number']")
	private WebElement AccountNumberField;

	public void accountNumber(String accountNum) {
		waitTimeForElementToTextPresent(AccountNumberField);
		AccountNumberField.sendKeys(accountNum);
	}

	// find bank name text box field and perform required action
	@FindBy(xpath = "//input[@placeholder='Bank Name']")
	private WebElement BankNameField;

	public void bankName(String bankName) {
		waitTimeForElementToTextPresent(BankNameField);
		BankNameField.sendKeys(bankName);
	}

	// find bank code text box field and perform required action
	@FindBy(xpath = "//input[@placeholder='Bank Code']")
	private WebElement BankCodeField;

	public void bankCode(String bankCode) {
		waitTimeForElementToTextPresent(BankCodeField);
		BankCodeField.sendKeys(bankCode);
	}

	// find Address text box field and perform required action
	@FindBy(xpath = "//input[@placeholder='Address']")
	private WebElement AddressField;

	public void address(String Add) {
		waitTimeForElementToTextPresent(AddressField);
		AddressField.sendKeys(Add);
	}

	// find City text box field and perform required action
	@FindBy(xpath = "//input[@placeholder='City']")
	private WebElement CityField;

	public void city(String city) {
		waitTimeForElementToTextPresent(CityField);
		CityField.sendKeys(city);
	}

	// find State/Province text box field and perform required action
	@FindBy(xpath = "//input[@placeholder='State/Province']")
	private WebElement StateField;

	public void state(String state) {
		waitTimeForElementToTextPresent(StateField);
		StateField.sendKeys(state);
	}

	// find postcode text box field and perform required action
	@FindBy(xpath = "//input[@placeholder='Postcode']")
	private WebElement PostCodeField;

	public void postCode(String postcode) {
		waitTimeForElementToTextPresent(PostCodeField);
		PostCodeField.sendKeys(postcode);
	}

	// verify validate recipient Payee button and perform click action
	@FindBy(xpath = "//button[contains(@class,'MuiButton-fullWidth css-')]")
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
}
