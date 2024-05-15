package SwimPay.pageObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class BulkPaymentPage extends abstractComponentsMethods {

	public static WebDriver driver;

	public BulkPaymentPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ==================Filters===============================

	// Finding Reference Filter field
	@FindBy(id = "outlined-basic")
	private WebElement Referencefilter_field;

	public void reference_field(String referenceValue) {
		Referencefilter_field.sendKeys(referenceValue);

	}

	// Find List of reference Number
	@FindBy(xpath = "//div[@data-tag='allowRowEvents']//a")
	private List<WebElement> References;

	public void referencesNumberSelector(int ref) throws InterruptedException {
		Thread.sleep(15000);
		References.size();
		if (ref >= 0 && ref < References.size()) {
			String referenceNumberText = References.get(ref).getText();
			System.out.println("Selected Reference Number from Data List " + referenceNumberText);
			Referencefilter_field.sendKeys(referenceNumberText);
		} else {
			System.out.println("Invalid reference Number/Reference number not found  " + ref);
		}
	}

	@FindBy(xpath = "//div[@data-tag='allowRowEvents']//a")
	private List<WebElement> ReferencesNumber;

	// To fecth Data List's reference Numbers
	public void referencesNumberDataList() {
		waitTimeForWebElementListToAppear(ReferencesNumber);

		ReferencesNumber.size();
		for (int i = 0; i < ReferencesNumber.size(); i++) {
			String referenceDataListText = ReferencesNumber.get(i).getText();
			if (ReferencesNumber.contains(referenceDataListText)) {
				System.out.println("Result displayed for Searched reference Data " + referenceDataListText);
			} else {
				System.out.println("Data not displayed");
			}
		}

	}

// ============Find Search Button for Filter section & perform Click action==================

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitFilter;

	public void FilterSearch() {
		System.out.println("Filter Search Button Clicked");
		submitFilter.click();
	}

//============================Invalid From date===========================================

	@FindBy(xpath = "(//*[@class='MuiFormControl-root MuiTextField-root w-100 css-i44wyl'])[2]/div/input")
	private WebElement InvalidFromDate;

	public void ClickInvalidFromDate() {
		waitTimeForWebElementToAppear(InvalidFromDate);
		InvalidFromDate.click();
		InvalidFromDate.sendKeys("@@@@@");
		InvalidFromDate.clear();
	}

	// Invalid To date
	@FindBy(xpath = "(//*[@class='MuiFormControl-root MuiTextField-root w-100 css-i44wyl'])[3]/div/input")
	private WebElement InvalidToDate;

	public void ClickInvalidTODate() {
		InvalidToDate.click();
		InvalidToDate.sendKeys("####");
		InvalidFromDate.clear();
	}

	//
	@FindBy(xpath = "(//*[@type=\"button\"])[5]")
	private WebElement Calander;

	public void ClickCalander() {
		Calander.click();
	}

	//
	@FindBy(xpath = "//*[@class=\"MuiCalendarPicker-root css-1brzq0m\"]/div[1]/div[2]/button[1]")
	private WebElement PrvMonthicon;

	public void ClickPrvmonthicon() {
		PrvMonthicon.click();
	}

	//
	@FindBy(xpath = "//*[@class=\"MuiCalendarPicker-root css-1brzq0m\"]/div[2]/div/div[2]/div/div[2]/div[5]")
	private WebElement SelectfromDate;

	public void Select_fromDate() {
		SelectfromDate.click();
	}

	//
	@FindBy(xpath = "(//*[@type=\"button\"])[6]")
	private WebElement OpenCalendarforToDate1;

	public void Click_OpenCalendarNxtMonth1() {
		OpenCalendarforToDate1.click();
	}

	// Select the future date field
	@FindBy(xpath = "//*[@class='MuiCalendarPicker-root css-1brzq0m']/div[2]/div/div[2]/div/div[4]/div[7]")
	private WebElement SelecttheFutureDate;

	public void ClickSelecttheFutureDate() {
		SelecttheFutureDate.click();
	}

//=========Selecting Month & Date from dateCalendar Pop-up================

	// Open a calendar
	@FindBy(xpath = "(//*[@type=\"button\"])[5]")
	private WebElement OpenCalendar;

	public void Click_OpenCalendar() {
		OpenCalendar.click();
	}

	// Previous month Field
	@FindBy(xpath = "//*[@class=\"MuiCalendarPicker-root css-1brzq0m\"]/div[1]/div[2]/button[1]")
	private WebElement prevMonthIcon;

	public void ClickprevMonthIcon() {
		prevMonthIcon.click();
	}

	// Select the date
	@FindBy(xpath = "//*[@class=\"MuiCalendarPicker-root css-1brzq0m\"]/div[2]/div/div[2]/div/div[2]/div[5]")
	private WebElement SelectDate;

	public void ClickSelectDate() {
		SelectDate.click();
	}

	// Open a calendar For To
	@FindBy(xpath = "(//*[@type=\"button\"])[6]")
	private WebElement OpenCalendarforToDate;

	public void Click_OpenCalendarNxtMonth() {
		OpenCalendarforToDate.click();
	}

	// next month field
	@FindBy(xpath = "//*[@class=\"MuiCalendarPicker-root css-1brzq0m\"]/div[1]/div[2]/button[2]")
	private WebElement NxtMonthIcon;

	public void ClicknextmonthIcon() {
		NxtMonthIcon.click();
	}

	// Select Today button
	@FindBy(xpath = "//*[@class='MuiDialogActions-root MuiDialogActions-spacing css-14b29qc']/button")
	private WebElement TodayButton;

	public void ClickTodayButton() {
		TodayButton.click();
	}

//================Find the Resume field click =========================

	@FindBy(xpath = "(//*[@type=\"button\"])[9]")
	private WebElement Resume;

	public void ClickResume() {
		Resume.click();
	}

//================Find the Resume Payment select currency  =========================

	@FindBy(xpath = "id='currency-select-:roq:-label']")
	private WebElement CurrncyName;

	public void ClickCurrncyName(String currencySoldName) {
		AlternativeCurrencyOpt.sendKeys(currencySoldName + Keys.ARROW_DOWN + Keys.ENTER);
		AlternativeCurrencyOpt.click();
	}

//================Find the Resume Payment select currency  =========================

	@FindBy(xpath = "(//*[@type='text'])[2]")
	private WebElement AmountPay;

	public void ClickAmountPay() {
		AmountPay.click();
		AmountPay.sendKeys("");
	}

//================Find the Resume field click =========================

	@FindBy(xpath = "//*[@class=\"react-dataTable position-relative\"]/div[3]/nav/div[2]/button[3]")
	private WebElement NextPagearrow;

	public void ClickNextPagearrow() {
		waitTimeForWebElementToAppear(NextPagearrow);
		NextPagearrow.click();

	}

//=======================Find Status Field====================

	@FindBy(xpath = "(//*[@type=\"text\"])[4]")

	private WebElement StatusOpt;

	public void statusOption(String statusOPtions) {
		StatusOpt.click();
		StatusOpt.sendKeys(statusOPtions + Keys.ARROW_DOWN + Keys.ENTER);
	}

//=============== Find Search button perform click action ==========

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement Searchbutton;

	public void ClickSearchbutton() {
		Searchbutton.click();
	}

//========= Find Reset Filter Button option and perform click action===========

	@FindBy(xpath = "//div[contains(@class,'reset-filter')]")
	private WebElement ResetFilter;

	public void resetFilters() {
		ResetFilter.click();
	}

//=================== Find RefreaceTable perform click action ====================

	@FindBy(xpath = "//*[@class=\"sc-fEOsli kGIWTA rdt_TableHeader\"]/div[2]/i")
	private WebElement RefreaceTable;

	public void Click__RefreaceTable() {
		RefreaceTable.click();
	}

//==================== Find External Recipients  perform click action=============

	@FindBy(xpath = "(//*[@type=\"button\"])[3]")
	private WebElement Extranal_payment;

	public void Click__Extranal_Recipients() {
		waitTimeForWebElementToAppear(Extranal_payment);
		Extranal_payment.click();
	}

//=================== Find Amount payment perform click action ===========

	@FindBy(xpath = "(//*[@type='text'])[1]")
	private WebElement amountPay;

	public void Amount_Pay() {

		amountPay.click();
		amountPay.sendKeys("10");
	}

	// Amount pay Multipay

	@FindBy(xpath = "(//*[@type='text'])[5]")
	private WebElement amountPay1;

	public void Amount_Pay1() {

		amountPay1.click();
		amountPay1.sendKeys("10");
	}

//===================Find Alternative Currency Option and perform click action ===========  

	@FindBy(xpath = "(//*[@autocomplete=\"new-password\"])[1]")
	private WebElement AlternativeCurrencyOpt;

	public void selectAlternativeCurrencyOption(String currencySoldName) {
		AlternativeCurrencyOpt.sendKeys(currencySoldName + Keys.ARROW_DOWN + Keys.ENTER);
		AlternativeCurrencyOpt.click();

	}

	// Multipay amount

	@FindBy(xpath = "(//*[@autocomplete=\"new-password\"])[2]")
	private WebElement AlternativeCurrency;

	public void selectAlternativeCurrency(String currencySoldName1) {

		AlternativeCurrency.sendKeys(currencySoldName1 + Keys.ARROW_DOWN + Keys.ENTER);

	}

//===================Find Alternative currency amount the Get rate Option and perform click action ===========  

	@FindBy(xpath = "(//*[@data-tag='allowRowEvents'])[10]/div/button")
	private WebElement Getrate;

	public void getRate() {
		pauseRun5();
	//	System.out.println(Getrate.isEnabled());
		if (!Getrate.isEnabled()) {

			Assert.assertFalse(false);

		} else {

			Getrate.click();
			// Assert.assertFalse(true);
		}
	}

	public void getRateNegative() {
		pauseRun5();
//	System.out.println(Getrate.isEnabled());
		if(!Getrate.isEnabled()) {
		
		Assert.assertFalse(false);
		
	}else
	{
		
	//	Getrate.click();
		Assert.assertFalse(true);
	}
		}

	
	// MultiPay Get Rate

	@FindBy(xpath = "(//*[@data-tag='allowRowEvents'])[24]/div")
	private WebElement Getrate1;

	public void getRate1() {
		Getrate1.click();
	}

//===================Find Get rate Option open PopMessage click Cancel button and perform click action ===========  

	@FindBy(xpath = "//*[@role='dialog']/div[2]/button[1]")
	private WebElement PopMessageCancel;

	public void Click_CancleButton() {
		PopMessageCancel.click();
	}

	// Multipay Cancel pay

	@FindBy(xpath = "//*[@role='dialog']/div[2]/button[1]")
	private WebElement PopMessageCancel1;

	public void Click_CancleButton1() {
		PopMessageCancel1.click();
	}

//===================Find Get rate Option open PopMessage click Accept rate button and perform click action =========== 

	@FindBy(xpath = "//*[@role='dialog']/div[2]/button[2]")
	private WebElement PopMessageAccpctRate;

	public void Click_AccpctRateButton() {
		PopMessageAccpctRate.click();
	}

	// Accepct Rate Multipay

	@FindBy(xpath = "//*[@role='dialog']/div[2]/button[2]")
	private WebElement PopMessageAccpctRate1;

	public void Click_AccpctRateButton1() {
		PopMessageAccpctRate1.click();
	}

//===================Find mandatoryreference perform click action =========== 

	@FindBy(xpath = "//*[@name='bulkpayment.0.reference_number']")
	private WebElement mandatoryreference;

	public void Click_Mandatoryreference(String number) {
		mandatoryreference.click();
		mandatoryreference.sendKeys(number);
		}

	// Multipay mandatoryreference

	@FindBy(xpath = "//*[@name='bulkpayment.1.reference_number']")
	private WebElement mandatoryreference1;

	public void Click_Mandatoryreference1() {
		mandatoryreference1.click();
		mandatoryreference1.sendKeys("1234567");
	}

//===============Find ReasonCode perform click action=====================

	@FindBy(xpath = "(//*[@type=\"text\"])[4]")
	private WebElement ReasonCode;

	public void selectReasonCodeOption(String ReasonCode1) {
		ReasonCode.sendKeys(ReasonCode1 + Keys.ARROW_DOWN + Keys.ENTER);
		ReasonCode.click();
	}

	// Multipay ReasonCode

	@FindBy(xpath = "(//*[@type=\"text\"])[8]")
	private WebElement ReasonSelect;

	public void selectReasonCode(String Reason) {
		ReasonSelect.sendKeys(Reason + Keys.ARROW_DOWN + Keys.ENTER);
		ReasonSelect.click();
	}

//===============Find MultiPay perform click action=====================	

	@FindBy(xpath = "(//*[@type='button'])[6]")
	private WebElement ActionMultiPay;

	public void Click_MultiPAy() throws InterruptedException {
		scrollActionBulk(ActionMultiPay);
		Thread.sleep(2000);
		ActionMultiPay.click();
	}

// ================Find Pay now Button perform click action====================

	@FindBy(xpath = "//*[@class='css-smhx3']/div[2]/button[1]")
	private WebElement PayNow;

	public void Click_PaynowButton() {
		PayNow.click();
	}

//================Find Pay later Button perform click action====================

	@FindBy(xpath = "//*[@class='css-smhx3']/div[2]/button[2]")
	private WebElement Paylater;

	public void Click_PaylaterButton() {
		Paylater.click();
	}

//================Find Pay later Button open a drop down click the cancel button perform click action====================

	@FindBy(xpath = "//*[@class=\"MuiDialogActions-root MuiDialogActions-spacing css-14b29qc\"]/button[1]")
	private WebElement PaylaterCancel;

	public void Click_Paylatercancel() {
		PaylaterCancel.click();
	}

//================Find Pay later Button open a drop down click the Accpect button perform click action====================

	@FindBy(xpath = "//*[@class=\"MuiDialogActions-root MuiDialogActions-spacing css-14b29qc\"]/button[2]")
	private WebElement PaylaterAccpect;

	public void Click_PaylaterAccpect() {
		PaylaterAccpect.click();
	}

//================Find Pay later Button click the cancel button perform click action====================

	@FindBy(xpath = "//*[@class='css-smhx3']/div[1]")
	private WebElement Calcelbutton;

	public void Cancel_button() {
		Calcelbutton.click();
	}

//====================================Wallet To Wallet Module ===============================================

//==================== Find Wallet To Wallet Module perform click action=============

	@FindBy(xpath = "(//*[@type='button'])[4]")
	private WebElement Wallet_to_Wattet_payment;

	public void Click__Wallet_to_Wattet() {
		waitTimeForWebElementToAppear(Wallet_to_Wattet_payment);
		Wallet_to_Wattet_payment.click();
	}

//==================== Find Wallet To Wallet Module Payment currency perform click action=============

	@FindBy(xpath = "(//*[@autocomplete='new-password'])[1]")
	private WebElement AlternativeCurrencyOpt1;

	public void selectAlternativeCurrencyOption1(String currencySoldName) throws InterruptedException {
		AlternativeCurrencyOpt1.click();
		AlternativeCurrencyOpt1.sendKeys(currencySoldName);
		Thread.sleep(3000);
		AlternativeCurrencyOpt1.sendKeys(Keys.ARROW_DOWN);
		AlternativeCurrencyOpt1.sendKeys(Keys.ENTER);
		// AlternativeCurrencyOpt1.click();
	}

//=================== Find Amount payment perform click action ===========

	@FindBy(xpath = "(//*[@type=\"text\"])[2]")
	private WebElement AmountToPay;

	public void Amount_To_Pay() {
		AmountToPay.click();
		AmountToPay.sendKeys("10");
	}

//===================Find Get rate Option open PopMessage click Accept rate button and perform click action =========== 

	@FindBy(xpath = "(//*[@type=\"text\"])[3]")
	private WebElement Mandatoryreference;

	public void Mandatoryreference_Click() {
		Mandatoryreference.click();
		Mandatoryreference.sendKeys("123456");
	}

//===============Find ReasonCode perform click action=====================

	@FindBy(xpath = "(//*[@type=\"text\"])[4]")
	private WebElement ReasonCode1;

	public void selectReasonCodeOption1(String Reason) {
		ReasonCode.sendKeys(Reason + Keys.ARROW_DOWN + Keys.ENTER);
		ReasonCode.click();
	}

// ================Find Pay now Button perform click action====================

	@FindBy(xpath = "//*[@class='css-smhx3']/div[2]/button[1]")
	private WebElement pay_Now;

	public void Click_PayNow() {
		waitTimeForWebElementToAppear(pay_Now);
		pay_Now.click();
	}
		
	public void PayNowNegative() {
		pauseRun5();
	//System.out.println(pay_Now.isEnabled());
		if(!pay_Now.isEnabled()) {
		
		Assert.assertFalse(false);
		
	}else
	{
		
	//	pay_Now.click();
		Assert.assertFalse(true);
	}
		}

	
	
	
	
	
	
	

//================Find Pay later Button perform click action====================

	@FindBy(xpath = "//*[@class='css-smhx3']/div[2]/button[2]")
	private WebElement Paylater1;

	public void Click_Paylater1() {
		waitTimeForWebElementToAppear(Paylater1);
		Paylater1.click();
	}

//================Find Pay later Button open a drop down click the cancel button perform click action====================

	@FindBy(xpath = "//*[@class=\"MuiDialogActions-root MuiDialogActions-spacing css-14b29qc\"]/button[1]")
	private WebElement PaylaterCancel1;

	public void Click_Paylatercancel1() {
		PaylaterCancel1.click();
	}

//================Find Pay later Button open a drop down click the Accpect button perform click action====================

	@FindBy(xpath = "//*[@class=\"MuiDialogActions-root MuiDialogActions-spacing css-14b29qc\"]/button[2]")
	private WebElement PaylaterAccpect1;

	public void Click_PaylaterAccpect1() {
		PaylaterAccpect.click();
	}

//================Find Pay later Button click the cancel button perform click action====================

	@FindBy(xpath = "//*[@class='css-smhx3']/div[1]")
	private WebElement Calcelbutton1;

	public void Cancel_button1() {
		Calcelbutton1.click();
	}

//=================== Find The invalid data enter Successful gate rate accept ===========

	@FindBy(xpath = "(//*[@type=\"text\"])[1]")
	private WebElement InvalidAmountPay;

	public void Invalid_Amount_Pay() {

		InvalidAmountPay.click();
		InvalidAmountPay.sendKeys("@@@");
	}

//=================== Find Amount payment perform click action ===========

	@FindBy(xpath = "(//*[@type=\"text\"])[2]")
	private WebElement AmountToPay1;

	public void Amount_To_Pay1() {
		AmountToPay1.click();
		AmountToPay1.sendKeys("@@##");
	}

	
	
	
	


	
	
	
}