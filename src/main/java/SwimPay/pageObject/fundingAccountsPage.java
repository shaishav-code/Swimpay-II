package SwimPay.pageObject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class fundingAccountsPage extends abstractComponentsMethods {

	WebDriver driver;

	public fundingAccountsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Search text field Element and perform required action
	@FindBy(xpath = "//input[@class='form-control-lg w-100']")
	private WebElement SearchBox;

	public void searchBank(String bankName) {
		waitTimeForWebElementToAppear(SearchBox);
		SearchBox.sendKeys(bankName);
	}

	// Search submit Button find Element & perform required action
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SearchSubmitBtn;

	public void searchBankSubmit() {
		SearchSubmitBtn.click();
	}

	// Add bank Account Button Find Element & perform click action
	@FindBy(xpath = "//button[contains(@class,'MuiButton-containedSizeMedium mt-2 css')]")
	private WebElement AddBankAccOpt;

	public void addBankAccountBtn() {
		waitTimeForWebElementToAppear(AddBankAccOpt);
		AddBankAccOpt.click();
	}

	// find Data list details from displayed list and perform required action
	@FindBy(xpath = "//tr[@class='tr-list']")
	private List<WebElement> FundingDataList;

	// Find Edit button option from Data List
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	private List<WebElement> EditAccountBtn;
	// findPay Button option from data List
	@FindBy(xpath = "//button[contains(text(),'Pay')]")
	private List<WebElement> PayBtn;

	// findPay Button option from data List
	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	private List<WebElement> DeleteBtn;

	// find Users Account name from data list and per form required action
	@FindBy(xpath = "//tr[@class='tr-list']/td/div/a")
	private List<WebElement> AccountNames;

	// click requested user from data list
	public void accountNameClickFromDataList(String userName) throws InterruptedException {
		waitTimeForWebElementListToAppear(AccountNames);
		AccountNames.size();
		for (WebElement userAccountName : AccountNames) {
			String requestedUserName = userAccountName.getText();
			if (requestedUserName.contains(userName)) {
				System.out.println(requestedUserName + " user is clicked");
				userAccountName.click();
				break;
			} else {
				System.out.println("Requested Username >> " + userName + " Not found in List");
			}
		}
	}

	// perform click on pay button for requested user
	public paymentPage clickPayOptforRequestedUser(String reqUser) throws InterruptedException {
		Thread.sleep(15000);
		for (int i = 0; i < FundingDataList.size(); i++) {
			String requestedUser = AccountNames.get(i).getText();
			if (requestedUser.equals(reqUser)) {
				try {
					PayBtn.get(i).click();
					System.out.println("clicked for requested User " + reqUser);
				} catch (Exception e) {
					System.out.println("Failed to click on the Edit button for username: " + reqUser);
					e.printStackTrace();
				}
				break;
			}
		}
		paymentPage Payments = new paymentPage(driver);
		return Payments;
	}

	// perform click on Delete button for requested user
	public void clickDeleteOptforRequestedUser(String reqUserDelete) throws InterruptedException {
		waitTimeForWebElementListToAppear(FundingDataList);
		for (int i = 0; i < FundingDataList.size(); i++) {
			String requestedUser = AccountNames.get(i).getText();
			if (requestedUser.equals(reqUserDelete)) {
				try {
					DeleteBtn.get(i).click();
					System.out.println("clicked for requested User " + reqUserDelete);
				} catch (Exception e) {
					System.out.println("Failed to click on the Edit button for username: " + reqUserDelete);
					e.printStackTrace();
				}
				break;
			}
		}
	}

	/// perform click on Edit button for requested user
	public void clickEditOptforRequestedUser(String reqUserEdit) throws InterruptedException {
		waitTimeForWebElementListToAppear(FundingDataList);
		for (int i = 0; i < FundingDataList.size(); i++) {
			String requestedUser = AccountNames.get(i).getText();
			if (requestedUser.equals(reqUserEdit)) {
				try {
					EditAccountBtn.get(i).click();
					System.out.println("clicked for requested User " + reqUserEdit);
				} catch (Exception e) {
					System.out.println("Failed to click on the Edit button for username: " + reqUserEdit);
					e.printStackTrace();
				}
				break;
			}
		}
	}

	// find delete button and perform delete action
	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	private WebElement DeleteButton;

	public void deleteBtn() {
		// waitTimeForElementToClickable(DeleteButton);
		System.out.println(DeleteButton.getText() + " Button is clicked");
		DeleteButton.click();
	}

	// find edit button and perform Edit action
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	private WebElement EditBtn;

	public void editBtn() {
		waitTimeForElementToClickable(EditBtn);
		EditBtn.click();
	}

	// find Pay button and perform Edit action
	@FindBy(xpath = "//button[contains(text(),'Pay')]")
	private WebElement PayBtnOPt;

	public void payBtn() {
		waitTimeForElementToClickable(PayBtnOPt);
		PayBtnOPt.click();
	}

	// ======ADD New Page Actions=========//
	// find recipient payee nickname field and perform required action
	@FindBy(xpath = "//input[@name='beneficiaryAlias']")
	private WebElement Nickname;

	public void nickname(String nickName) {
		Nickname.click();
		clearField(Nickname);
		Nickname.sendKeys(nickName);
	}

	// find country field opt and perform required action
	@FindBy(xpath = "(//*[@type='text'])[1]")
	private WebElement CountryOpt;

	public void countryOption(String country) {

		CountryOpt.click();
		CountryOpt.sendKeys(country + Keys.DOWN + Keys.ENTER);
		// clearField(CountryOpt);

	}

	// find Currency field for details page & perform required action
	@FindBy(xpath = "(//*[@type='text'])[2]")
	private WebElement CurrencyOpt;

	public void currency(String currency) {
		CurrencyOpt.sendKeys(currency + Keys.DOWN + Keys.ENTER);
		// clearField(CountryOpt);
	}

	// find Country Opt1 field for details page & perform required action
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement CountryOpt1;

	public void countryOption1(String country1) {
		CountryOpt1.click();

		CountryOpt1.sendKeys(country1 + Keys.DOWN + Keys.ENTER);
		clearField(CountryOpt1);
	}

	// find Provide bank account detail click field
	@FindBy(xpath = "//div[@class='choose-content-beneficiary']/form/div[2]/div[3]")
	private WebElement bankaccount;

	public void BankAccount_Click() {
		bankaccount.click(); // clearField(CountryOpt);
	}

	@FindBy(id = "payout-LOCAL")
	private WebElement payout;

	public void PayOut_Click() {
		payout.click();
		// clearField(CountryOpt);

	}

	// find bank account holder name field and perform required action
	@FindBy(xpath = "//input[@name='beneficiaryName']")
	private WebElement BankAccountHolderName;
	@FindBy(xpath = "//div[@class='mb-3 position-relative']//div[@class='group-title mb-1']")
	private WebElement BankAccountName;

	public void AccountHoldersName(String accountName) {
		String AccountNameFieldTitle = BankAccountName.getText();
		System.out.println(AccountNameFieldTitle);

		if (AccountNameFieldTitle.contains("Bank Account Holder Name")) {
			BankAccountHolderName.click();
			clearField(BankAccountHolderName);
			BankAccountHolderName.sendKeys(accountName);
		}
	}

	// Find Bank Account Country option field and perform required action
	@FindBy(xpath = "(//*[@type='text'])[2]")
	private WebElement AccountCountryOpt;

	public void myBankAccountCountry(String countryName) {
		AccountCountryOpt.click();
		// clearField(AccountCountryOpt);
		AccountCountryOpt.sendKeys(countryName + Keys.DOWN + Keys.ENTER);
	}

	// find Bank Account type option and perform required action
	@FindBy(id = "inlineRadio1")
	private WebElement BankAccountType_CorporateOpt;

	public void bankAccountTypeCorporateOption() {
		System.out.println("Button Selection is " + BankAccountType_CorporateOpt.isEnabled());
		BankAccountType_CorporateOpt.click();
	}

	@FindBy(id = "inlineRadio2")
	private WebElement BankAccountType_IndividualOpt;

	public void bankAccountTypeIndividualOption() {
		System.out.println("Button Selection is " + BankAccountType_IndividualOpt.isEnabled());
		BankAccountType_IndividualOpt.click();
	}

	// find submit recipient payee bank Account details button and perform click
	// action
	@FindBy(xpath = "//button[contains(@class,'MuiButton-fullWidth css-')]")
	private WebElement BankAccoutsubmit;

	public void submitBankAccountDetails() {
		// waitTimeForElementToClickable(BankAccoutsubmit);
		System.out.println(BankAccoutsubmit.getText() + " Button is clicked");
		BankAccoutsubmit.click();
	}

	// ==================Bank Account Details Page======================//
	// find Bank Account Term checkbox and perform required action
	@FindBy(id = "TypeCheck")
	private WebElement RegularPaymentCheckBox;

	public void regularPaymentCheckBox() {
		// waitTimeForWebElementToAppear(RegularPaymentCheckBox);
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
			String BsbNum1 = "939200";
			BSBNumber.click();
			clearField(BSBNumber);
			BSBNumber.sendKeys(BsbNum1);
		} else if (labelTitle.contains("ACH CODE")) {
			waitTimeForWebElementToAppear(ACH_Code);
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
			String bsbNum = "2457125";
			BSBNumber.click();
			clearField(BSBNumber);
			BSBNumber.sendKeys(bsbNum);
		} else if (labelTitle.contains("ACH CODE")) {
			waitTimeForElementToClickable(ACH_Code);
			String Ach = "123456fd789";
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

	/// find state text box field and perform required action
	@FindBy(xpath = "(//div[@class='mt-3'])[5]/div[2]")
	private WebElement StateField;

	public void state(String state) {
		// StateField.click();
		clearField(StateField);
		StateField.sendKeys(state);
	}

	// find postcode text box field and perform required action
	@FindBy(xpath = "//input[@placeholder='Postcode']")
	private WebElement PostCodeField;

	public void postCode(String postcode) {
		PostCodeField.click();
		clearField(PostCodeField);
		PostCodeField.sendKeys(postcode);
	}

	// verify validate recipient Payee button and perform click action
	@FindBy(xpath = "//button[contains(@class,'MuiButton-fullWidth css-')]")
	private WebElement ValidateRecipientPayeeBtn;

	public void validate_N_createRecipientPayeeBtn() {
		// waitTimeForElementToClickable(ValidateRecipientPayeeBtn);
		ValidateRecipientPayeeBtn.click();
	}

	// verify validate recipient Payee button and perform click action
	@FindBy(xpath = "//div[@class=' text-black']/div[4]/div[3]")
	private WebElement CreateMyAcc;

	public void CreateMyAccont_click() {

		CreateMyAcc.click();
	}

	// update
	// verify validate recipient Payee button and perform click action
	@FindBy(xpath = "//div[@class='choose']/div/div[4]/div[3]")
	private WebElement UpdateMyAcc;

	public void UpdateMyAccont_click() {

		UpdateMyAcc.click();
	}

	// Find review details and capture review displayed data
	@FindBy(xpath = "//div[contains(@class,'text-black')]")
	private WebElement Review;

	public void reviewMyDetails() {
		System.out.println(Review.getText());
	}

	// verify validate recipient Payee button and perform click action
	@FindBy(xpath = "//div[@class='choose-content-beneficiary']/div[2]/div[2]/div[3]")
	private WebElement reviewClick;

	public void ReviewMyAccount_Click() {

		reviewClick.click();
	}

	// del code ===new code

	@FindBy(xpath = "//tr[@class='tr-list'])[2]/td[5]/div/span[2]/button")
	private WebElement delclick;

	public void DelClick() {

		delclick.click();
	}

}
