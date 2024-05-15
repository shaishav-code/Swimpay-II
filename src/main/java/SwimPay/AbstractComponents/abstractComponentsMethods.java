package SwimPay.AbstractComponents;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import SwimPay.pageObject.BulkPaymentPage;
import SwimPay.pageObject.InvoicingPage;
import SwimPay.pageObject.NewChange_PaymentPage;
import SwimPay.pageObject.accountInfoPage;
import SwimPay.pageObject.balancepayIn;
import SwimPay.pageObject.balancepayOut;
import SwimPay.pageObject.dashboardPage;
import SwimPay.pageObject.fundingAccountsPage;
import SwimPay.pageObject.fxConversionPage;
import SwimPay.pageObject.paymentPage;
import SwimPay.pageObject.profilePage;
import SwimPay.pageObject.recipient_payeePage;
import SwimPay.pageObject.reportsPage;
import SwimPay.pageObject.searchPage;
import SwimPay.pageObject.settingsPage;

public class abstractComponentsMethods {
	WebDriver driver;
	WebDriverWait wait;

	public abstractComponentsMethods(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[contains(@class,'otpInput')]")
	private List<WebElement> loginOTP;

	// Provide Values for OTP fields
	public void invalid_OTP_Value() {
		waitTimeForWebElementListToAppear(loginOTP);
		for (int i = 0; i < loginOTP.size(); i++) {
			if (loginOTP.equals(loginOTP)) {
				String otpValue = "111222";
				String[] otpCharcters = otpValue.split("");
				loginOTP.get(i).sendKeys(otpCharcters);
				break;
			}
		}
	}

	public void otpData() {

		loginOTP.size();
		loginOTP.get(0).click();
		for (int i = 0; i < loginOTP.size(); i++) {
			if (loginOTP.equals(loginOTP)) {
				String otpValue = "123456";
				String[] otpCharcters = otpValue.split("");
				loginOTP.get(i).sendKeys(otpCharcters);
				break;
			}
		}
	}

	// OTP Submit Button Click Action
	// @FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root MuiButton-root
	// MuiLoadingButton')]")
	@FindBy(xpath = "//button[text()='Verify OTP']")
	private WebElement OTPVerify;

	public void otpVerify() {
		waitTimeForElementToClickable(OTPVerify);
		OTPVerify.click();
	}

	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement OTPContinue;

	public void otpSubmitBtn() {
		waitTimeForElementToClickable(OTPContinue);
		OTPContinue.click();
	}

	// find cancel OTP button and perform required action
	@FindBy(xpath = "//button[contains(@class,'MuiButton-outlinedError')]")
	private WebElement OTPCancel;

	public void otpCancelBtn() {
		waitTimeForElementToClickable(OTPCancel);
		System.out.println(OTPCancel.getText() + " Button Clicked");
		OTPCancel.click();
	}

	// Logout Button Option
	@FindBy(xpath = "//div[@class='ms-auto']/i")
	private WebElement logoutBtn;

	// Capture Displayed validation Message for Wrong Input
	@FindBy(xpath = "//div[contains(@class,'Toastify__toast-body')]")
	private WebElement MsgToaster;

	// Grab Toast Message Text when Invalid Login done
	public void messageToaster() {
		waitTimeForWebElementToAppear(MsgToaster);
		MsgToaster.getText();
		System.out.println(MsgToaster.getText());

	}

	// Grab error message when error dispplayes
	@FindBy(xpath = "//span[@class='small text-danger']")
	private WebElement ErrorMessageDisplay;

	public void errorMsgDisplay() {
		if (ErrorMessageDisplay.isDisplayed()) {
			waitTimeForWebElementToAppear(ErrorMessageDisplay);
			System.out.println(ErrorMessageDisplay.getText());
		} else {
			System.out.println("No Message displayed");
		}
	}

	// Grab error message when error dispplayes
	@FindBy(xpath = "//span[@class='small text-danger']")
	private List<WebElement> ErrorMessageDisplays;

	public void errorsDisplay() {
		// waitTimeForWebElementListToAppear(ErrorMessageDisplays);
		for (int i = 0; i < ErrorMessageDisplays.size(); i++) {
			String errorMessage = ErrorMessageDisplays.get(i).getText();
			if (errorMessage.contains(errorMessage)) {
				System.out.println(errorMessage);
			} else {
				System.out.println("No Message displayed");
			}
		}
	}

	// Find Errors message with astrick mark field
	// Grab error message when error dispplayes
	@FindBy(xpath = "//li[@class='text-danger']")
	private List<WebElement> FieldsErrorMessageDisplays;

	public void fieldserrorsDisplay() {
		// waitTimeForWebElementListToAppear(FieldsErrorMessageDisplays);
		for (int i = 0; i < FieldsErrorMessageDisplays.size(); i++) {
			String errorMessage = FieldsErrorMessageDisplays.get(i).getText();
			if (errorMessage.contains(errorMessage)) {
				System.out.println(errorMessage);
			} else {
				System.out.println("No Message displayed");
			}
		}
	}

	// After Login ReUsable options
	// Options for Menu and Profile mentioed here

	// Dashboard option from menu
	@FindBy(xpath = "(//a[contains(@href,'dashboard')])[4]")
	private WebElement DashboardOpt;

	public dashboardPage dashboardOption() {
		waitTimeForWebElementToAppear(DashboardOpt);
		DashboardOpt.click();
		dashboardPage Dashboard = new dashboardPage(driver);
		return Dashboard;
	}

	// Funding Account option from menu
	@FindBy(xpath = "(//a[contains(@href,'funding_account')])[2]")
	private WebElement FundingAccountOpt;

	public fundingAccountsPage fundingAccountOption() {
		waitTimeForWebElementToAppear(FundingAccountOpt);
		FundingAccountOpt.click();
		fundingAccountsPage FundingAccount = new fundingAccountsPage(driver);
		return FundingAccount;

	}

	// Balance option from Menu
	@FindBy(xpath = "(//div[@class='has_sub'])[3]")
	private WebElement BalanceOpt;

	public void balanceOption() {
		waitTimeForWebElementToAppear(BalanceOpt);
		BalanceOpt.click();
	}

	// Balance payin option from Menu
	@FindBy(xpath = "(//ul[@id='support_drop'])[2]/li")
	private WebElement Bal_PayInOpy;

	public balancepayIn balanePayInOption() {
		waitTimeForWebElementToAppear(Bal_PayInOpy);
		Bal_PayInOpy.click();
		balancepayIn BalPayIn = new balancepayIn(driver);
		return BalPayIn;
	}

	// Balance payout option from Menu
	@FindBy(xpath = "(//ul[@id='support_drop'])[2]/li[2]")
	private WebElement Bal_PayOutOpy;

	public balancepayOut balanePayOutOption() {
		waitTimeForWebElementToAppear(Bal_PayOutOpy);
		Bal_PayOutOpy.click();
		balancepayOut BalPayOut = new balancepayOut(driver);
		return BalPayOut;
	}

	// Payment Option from Side Menu
	@FindBy(xpath = "(//a[contains(@href,'recipients_payees')])[2]")
	private WebElement PaymentOption;

	public paymentPage paymentsOption() {
		waitTimeForWebElementToAppear(PaymentOption);
		PaymentOption.click();
		paymentPage Payments = new paymentPage(driver);
		return Payments;
	}

	// Fx Conversion option from Side Menu
	@FindBy(xpath = "(//a[contains(@href,'fxconversion')])[2]")
	private WebElement FxConversionOpt;

	public fxConversionPage fxConversionOption() {
		waitTimeForWebElementToAppear(FxConversionOpt);
		FxConversionOpt.click();
		fxConversionPage FX_Conversion = new fxConversionPage(driver);
		return FX_Conversion;
	}

	// Recipients/Payees option from Side Menu
	@FindBy(xpath = "(//a[contains(@href,'recipient')])[2]")
	private WebElement Recipient_PayeeOpt;

	public recipient_payeePage Recipients_PayeesOptions() {
		waitTimeForWebElementToAppear(Recipient_PayeeOpt);
		Recipient_PayeeOpt.click();
		recipient_payeePage Recipient_Payee = new recipient_payeePage(driver);
		return Recipient_Payee;
	}

	// Account Info option from Side Menu
	@FindBy(xpath = "(//a[contains(@href,'accounts')])[2]")
	private WebElement AccountInfoOpt;

	public accountInfoPage accountInformationOption() {
		waitTimeForWebElementToAppear(AccountInfoOpt);
		AccountInfoOpt.click();
		accountInfoPage AccountInfo = new accountInfoPage(driver);
		return AccountInfo;
	}

	// Search option from Side Menu
	@FindBy(xpath = "(//a[contains(@href,'search')])[2]")
	private WebElement SearchOpt;

	// click on Search option from Menu
	public searchPage searchOption() {
		waitTimeForWebElementToAppear(SearchOpt);
		SearchOpt.click();
		searchPage SearchPage = new searchPage(driver);
		return SearchPage;
	}

	// Find Reports Option
	@FindBy(xpath = "(//a[@href='/reports'])[2]")
	private WebElement ReportsOpt;

	public reportsPage reportsOption() {
		waitTimeForWebElementToAppear(ReportsOpt);
		ReportsOpt.click();
		reportsPage ReportPage = new reportsPage(driver);
		return ReportPage;
	}

	@FindBy(xpath = "(//a[@href='/rates_configuration'])[2]")
	private WebElement SettingOPt;

	public settingsPage settingOption() {
		waitTimeForWebElementToAppear(SettingOPt);
		SettingOPt.click();
		settingsPage SettingPage = new settingsPage(driver);
		return SettingPage;
	}

	// Find Profile button and perform click action
	@FindBy(xpath = "//div[@class='topbar']/div/div/a")
	private WebElement ProfileOpt;

	public profilePage profileOption() {
		waitTimeForWebElementToAppear(ProfileOpt);
		ProfileOpt.click();
		profilePage ProfilePage = new profilePage(driver);
		return ProfilePage;
	}

	// find Sucess message and perform print message action
	@FindBy(xpath = "//div[@class='alert-success']")
	private WebElement SuccessMsg;

	@FindBy(xpath = "//div[@class='complete-result d-flex']")
	private WebElement ErrorMsg;

	@FindBy(xpath = "//p[@class='complete-result d-flex']")
	private WebElement successMessage;

	public void getMsg() {
		waitTimeForWebElementToAppear(SuccessMsg);
		System.out.println(SuccessMsg.getText());
	}

	public void getMessage() {
		//
		scrollActionTop();

		if (successMessage.isDisplayed()) {
			waitTimeForWebElementToAppear(successMessage);
			System.out.println(successMessage.getText());
		}
//		 else if (SuccessMsg.isDisplayed())
//		 {
//			 System.out.println(SuccessMsg.getText());
//		 }
		else {
			System.out.println(ErrorMsg.getText());
		}
	}

	// find Yes option from leave page pop-up and perform click action
	@FindBy(xpath = "//button[contains(@class,'css-sghohy-MuiButtonBase')]")
	private WebElement YesOpt;
	@FindBy(xpath = "//button[text()='OK'] ")
	private WebElement yesOpt;

	public void yesAction() {
		waitTimeForElementToClickable(yesOpt);
		yesOpt.click();

	}

	// find No option from leave page pop-up and perform click action
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/button[1]")
	private WebElement NoOpt;

	public void noAction() {
		waitTimeForWebElementToAppear(NoOpt);
		NoOpt.click();
	}

	@FindBy(xpath = "//i[@class='bi bi-power text-light fw-bold']")
	private WebElement logout;

	public void Logout() throws InterruptedException {
		// waitTimeForWebElementToAppear(logout);
		try {
			if (logout.isDisplayed()) {
				Thread.sleep(3000);
				logout.click();
				// System.out.println("Logout Display");
				driver.quit();
			} else {
				Thread.sleep(5000);
				logout.sendKeys(Keys.ESCAPE);
				System.out.println("Escapre is clicked");
				if (logout.isDisplayed()) {
					Thread.sleep(3000);
					logout.click();
					System.out.println("afetr escape click then Logout clicked");
					driver.quit();
				} else {
					System.out.println("Already Logout");
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		driver.quit();
	}

	public void waitTimeForWebElementToAppear(WebElement eleAppear) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(eleAppear));
	}

	public void waitTimeForWebElementListToAppear(List<WebElement> eleListAppear) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfAllElements(eleListAppear));
	}

	public void waitTimeForElementToClickable(WebElement eleClick) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(eleClick));
	}

	public void waitTimeForElementToTextPresent(WebElement Numberfield) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.textToBePresentInElementValue(Numberfield, ""));
	}

	public void waitUntilFieldCleared(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
		wait.until(ExpectedConditions.attributeToBe(element, "value", ""));
	}

	public void pauseRun2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void pauseRun3() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void pauseRun5() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void pauseRun25() {
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void actionClick() {
		// Perform the random screen click using Actions class
		Actions actions = new Actions(driver);
		actions.moveByOffset(200, 500).click().perform();
	}

	// find Footer for Scroll view action
	@FindBy(xpath = "//div[@id='search-wrapper text-black']/div[2]/div/div[3]")
	private WebElement footerView;

	// Find No Data View action
	// Find No Data View action
	@FindBy(xpath = "//div[@class='sc-ivTmOn fwKvpK']//div")
	private WebElement NoDatatoDisplay;

	public void scrollAction() {

		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("scrollBy(0,500)");
		scroll.executeScript("arguments[0].scrollIntoView();", footerView);

		if (footerView.isDisplayed()) {
			scroll.executeScript("arguments[0].scrollIntoView();", footerView);
		} else if (NoDatatoDisplay.isDisplayed()) {
			scroll.executeScript("arguments[0].scrollIntoView();", NoDatatoDisplay);
		}
	}

	// find Footer for Scroll view action
	@FindBy(xpath = "//div[@class='react-dataTable position-relative']/div[3]/nav")
	private WebElement footerViewMaster;

	// Find No Data View action
	// Find No Data View action
	@FindBy(xpath = "//div[@class='sc-ivTmOn fwKvpK']//div")
	private WebElement NoDatatoDisplay1;

	public void scrollActionMaster() {

		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("scrollBy(0,500)");
		scroll.executeScript("arguments[0].scrollIntoView();", footerViewMaster);

		if (footerViewMaster.isDisplayed()) {
			scroll.executeScript("arguments[0].scrollIntoView();", footerViewMaster);
		} else if (NoDatatoDisplay1.isDisplayed()) {
			scroll.executeScript("arguments[0].scrollIntoView();", NoDatatoDisplay);
		}
	}

	public void scrollActionTop() {
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollTo(1000, 0);");
	}

	public void scrollBy() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");

	}

	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	// perform scrolling action using action method
	public void scroll() {
		// Scroll to the bottom of the page using Actions class
		Actions actions = new Actions(driver);
		WebElement body = driver.findElement(By.tagName("body"));
		actions.moveToElement(body).clickAndHold().moveByOffset(0, 3000).release().perform();

	}

	// perfom clear action for textboxes fields
	public void clearField(WebElement fieldElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '';", fieldElement);
		js.executeScript("var event = new Event('input'); arguments[0].dispatchEvent(event);", fieldElement);
	}

	// ==Selecting Month & Date from Calendar Pop-up==

	// find Next arrow button and perform click action
	@FindBy(xpath = "//div[@class='css-1mtsuo7 MuiPopperUnstyled-root']/div/div[1]/div/div/div[1]/div[2]/button[2]")
	private WebElement NextMonthArrowOpt;

	@FindBy(xpath = "//div[@class='css-1mtsuo7 MuiPopperUnstyled-root']/div/div[1]/div/div/div[1]/div[2]/button[1]")
	private WebElement PreviousMonthArrowOpt;

	// Find Month and perform required action
	@FindBy(xpath = "//div[@class='css-1mtsuo7 MuiPopperUnstyled-root']/div/div[1]/div/div/div[1]/div[1]/div")
	private WebElement CalendarMonth;

	// find Dates lists from calendar pop-up
	@FindBy(xpath = "//div[@class='css-1mtsuo7 MuiPopperUnstyled-root']/div/div[1]/div/div/div[2]/div/div[2]/div/div/div")
	private List<WebElement> DateLists;

	public void selectNextMonth(String month) {

		String currentMonth = CalendarMonth.getText();
		System.out.println(currentMonth);
		while (!currentMonth.equals(month)) {
			NextMonthArrowOpt.click();
			currentMonth = CalendarMonth.getText();
			System.out.println("Selected Month is " + currentMonth);
		}
	}

	public void selectPreviousMonth(String month) {
		String currentMonth = CalendarMonth.getText();
		while (!currentMonth.equals(month)) {
			PreviousMonthArrowOpt.click();
			currentMonth = CalendarMonth.getText();
			System.out.println("Selected Month is " + currentMonth);
		}
	}

	public void dateSelect(String indx) throws InterruptedException {
		for (WebElement date : DateLists) {
			String datestr = date.getText();
			// System.out.println(datestr);
			if (datestr.equals(indx)) {
				date.click();
				break;
			}
		}

//		DateLists.size();
//		Thread.sleep(3000);
//		System.out.println(DateLists);
//		for(int i=0; i<DateLists.size();i++)
//		{
//			waitTimeForWebElementListToAppear(DateLists);
//			DateLists.get(indx).click();
//			System.out.println();
//			break;
//		}
	}

	// find satement close icon and perform click action
	@FindBy(xpath = "//button[@aria-label='close']")
	private WebElement Close;

	public void previewCloseBtn() {
		waitTimeForWebElementToAppear(Close);
		Close.click();
	}

	// find Confirm Pop-up message description and perform required action
	@FindBy(xpath = "//h2[@id='alert-dialog-title']")
	private WebElement ConrimHeading;
	@FindBy(xpath = "//p[@id='alert-dialog-description']")
	private WebElement ConrimDescription;

	public void confirmActionMessagePopup() {
		waitTimeForWebElementToAppear(ConrimHeading);
		System.out.println(ConrimHeading.getText());
		System.out.println(ConrimDescription.getText());
	}

	public void Navigate_Login() {
		driver.navigate().to("https://demo.swimpay.com/auth/login");
	}

	// Completed Transaction Scroll PAY IN OUT

	@FindBy(xpath = "(//div[@class='react-dataTable position-relative'])[1]")
	private WebElement footerViewPayINOUT;

	// Find No Data View action
	// Find No Data View action
	@FindBy(xpath = "//div[@class='sc-ivTmOn fwKvpK']//div")
	private WebElement NoDatatoDisplayPayINOUT;

	public void scrollActionPayINOUT() {

		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("scrollBy(0,500)");
		scroll.executeScript("arguments[0].scrollIntoView();", footerViewPayINOUT);

		if (footerViewPayINOUT.isDisplayed()) {
			scroll.executeScript("arguments[0].scrollIntoView();", footerViewPayINOUT);
		} else if (NoDatatoDisplayPayINOUT.isDisplayed()) {
			scroll.executeScript("arguments[0].scrollIntoView();", NoDatatoDisplayPayINOUT);
		}
	}

	// Statement Transaction Scroll

	@FindBy(xpath = "(//div[@class='react-dataTable position-relative'])[4]")
	private WebElement footerViewstatementPAYINOUT;

	// Find No Data View action
	// Find No Data View action
	@FindBy(xpath = "//div[@class='sc-ivTmOn fwKvpK']//div")
	private WebElement NoDatatoDisplayPAYINOUT1;

	public void scrollActionStatementPAYINOUT() {

		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("scrollBy(0,500)");
		scroll.executeScript("arguments[0].scrollIntoView();", footerViewstatementPAYINOUT);

		if (footerViewstatementPAYINOUT.isDisplayed()) {
			scroll.executeScript("arguments[0].scrollIntoView();", footerViewstatementPAYINOUT);
		} else if (NoDatatoDisplayPAYINOUT1.isDisplayed()) {
			scroll.executeScript("arguments[0].scrollIntoView();", NoDatatoDisplayPAYINOUT1);
		}
	}

	@FindBy(xpath = "//div[@class='content2-container']/div/div[4]/div[2]/div[1]/div/input")
	private WebElement CalendarMonthFromDateString;

	@FindBy(xpath = "	//div[@class='content2-container']/div/div[4]/div[2]/div[2]/div/input")
	private WebElement CalendarMonthFromToString;

	public void InvalidDate_CompletedTransactions(String mon) throws InterruptedException {
		pauseRun2();
		// CalendarMonthString.click();
		CalendarMonthFromDateString.clear();
		pauseRun5();
		CalendarMonthFromDateString.sendKeys(mon);
		
		String FromDatestr = CalendarMonthFromDateString.getAttribute("value").toString();
		System.out.println(FromDatestr);

		pauseRun2();
		CalendarMonthFromToString.clear();
		pauseRun5();
		CalendarMonthFromToString.sendKeys(mon);

		String ToDatestr = CalendarMonthFromToString.getAttribute("value").toString();
		System.out.println(ToDatestr);
		
		if (FromDatestr.contains(mon) && ToDatestr.contains(mon)) {
			Assert.assertFalse(true);	
		}
		else {
		}
	}

	/////////////////////////// NDA ABSTRACT CODE////////////////////////////

	public void waitcode() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Get Title
	public String GetTitle() {
		return driver.getTitle();
	}

	public void Actions() {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	// Get Title
	public String GetCurrentURL() {
		return driver.getCurrentUrl();
	}

	// Invoicing option from Side Menu
	@FindBy(xpath = "(//*[@class='has_sub'])[4]")
	private WebElement invoicingpage;

	public InvoicingPage InvoicingOption() {
		waitTimeForWebElementToAppear(invoicingpage);
		invoicingpage.click();
		InvoicingPage invoicingPage = new InvoicingPage(driver);
		return invoicingPage;
	}

	////////////////// Code Viraj//////////////////
	// Bulk payment option from Side Menu

	@FindBy(xpath = "(//*[@href='/bulkpayments'])[2]")
	private WebElement BulkPayment;

	public BulkPaymentPage Bulkpaymentformenu() {
		waitTimeForWebElementToAppear(BulkPayment);
		BulkPayment.click();
		BulkPaymentPage BulkpaymentOption = new BulkPaymentPage(driver);
		return BulkpaymentOption;
	}

	@FindBy(xpath = "//div[@class='sc-ivTmOn fwKvpK']//div")
	private WebElement NoDatatoDisplay5;

	public void scrollActionBulk(WebElement ele) {

		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		// scroll.executeScript("scrollBy(0,1000)");
		scroll.executeScript("arguments[0].scrollIntoView();", ele);

		/*
		 * if (footerView.isDisplayed()) {
		 * scroll.executeScript("arguments[0].scrollIntoView();", footerView); } else if
		 * (NoDatatoDisplay.isDisplayed()) {
		 * scroll.executeScript("arguments[0].scrollIntoView();", NoDatatoDisplay); }
		 */
	}

	// PAyment option from Side Menu

	@FindBy(xpath = "//*[@class='sidebar-container']/div[2]/div[5]/a")
	private WebElement Paymentopt;

	public NewChange_PaymentPage PaymentOptions() {
		Paymentopt.click();
		NewChange_PaymentPage New_Change_Payment = new NewChange_PaymentPage(driver);
		return New_Change_Payment;
	}

}
