package SwimPay.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class fxConversionPage extends abstractComponentsMethods {

	WebDriver driver;

	public fxConversionPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// find Sell Currency option and define action

//	@FindBy(xpath="//*[@id='root']/div/div[1]/div[2]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div/div/div/div/button")
//	WebElement sell_currency_drop_down_btn;

	@FindBy(xpath = "(//*[@type='text'])[1]")
	private WebElement sell_currency_textbox;

	public void sellCurrency(String curency) throws InterruptedException {
	waitTimeForWebElementToAppear(sell_currency_textbox);
		sell_currency_textbox.sendKeys(curency + Keys.DOWN + Keys.ENTER);
		Thread.sleep(3000);
	}

	// find buy currency option & perform define action
	@FindBy(xpath = "(//*[@type='text'])[2]")
	WebElement buy_currency_textbox;

	public void buyCurrency(String currencyBuy) throws InterruptedException {
		waitTimeForWebElementToAppear(buy_currency_textbox);
		buy_currency_textbox.sendKeys(currencyBuy + Keys.DOWN + Keys.ENTER);
		Thread.sleep(3000);
	}

//	@FindBy(xpath="//*[@id='root']/div/div[1]/div[2]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div/div/div/div/button")
//	WebElement buy_currency__drop_down_btn;

//find Amount To option and perform define action
	@FindBy(xpath = "//div[@id='demo-simple-select']")
	private WebElement AmounToOpt;

	public void amountToOption() {
		waitTimeForWebElementToAppear(AmounToOpt);
		AmounToOpt.click();
	}

	// find Amount to dropdown list options and perform required options
	@FindBy(xpath = "//li[@data-value='buy']")
	private WebElement AmountBuyOpt;

	@FindBy(xpath = "//li[@data-value='sell']")
	private WebElement AmountSellOpt;

	public void amountToBuy() {
		waitTimeForWebElementToAppear(AmountBuyOpt);
		AmountBuyOpt.click();
	}

	public void amountToSell() {
		waitTimeForWebElementToAppear(AmountSellOpt);
		AmountSellOpt.click();
	}

	// find amount value field & perform define action
	@FindBy(xpath = "//input[@id='amount']")
	private WebElement AmountValueBox;

	public void amountValue(String amount) {
		waitTimeForWebElementToAppear(AmountValueBox);
		AmountValueBox.sendKeys(amount);
	}

	// find canccel button and perform define action
	@FindBy(xpath = "(//div[@class='btn-group1']/button)[1]")
	private WebElement cancle_btn;

	public void cancelBtn() {
		waitTimeForWebElementToAppear(cancle_btn);
		cancle_btn.click();
	}

	// find Geta quote btn and perform define action
	@FindBy(xpath = "(//div[@class='btn-group1']/button)[2]")
	private WebElement getQuoteBtnOpt;

	public void getQuote() {
		waitTimeForWebElementToAppear(getQuoteBtnOpt);
		getQuoteBtnOpt.click();
	}

	// Find checkbox option and perform required action
	@FindBy(xpath = "//input[@id='happywithquote']")
	private WebElement i_am_happy_checkbox;

	public void happyCheckbox() {
		waitTimeForWebElementToAppear(i_am_happy_checkbox);
		i_am_happy_checkbox.click();
	}

	// find back button 7 perform required action
	@FindBy(xpath = "(//div[@class='btn-group1 row m-0'])/button[1]")
	private WebElement back_btn;

	public void backBtn() {
		waitTimeForWebElementToAppear(back_btn);
		back_btn.click();
	}

	// find cancel button & perform required action (cancel button from 2nd step)
	@FindBy(xpath = "(//div[@class='btn-group1 row m-0'])/button[2]")
	private WebElement cancel_btn;

	public void cancelBtn_process() {
		waitTimeForWebElementToAppear(cancel_btn);
		cancel_btn.click();
	}

	// Find requote button and perform required action
	@FindBy(xpath = "(//div[@class='btn-group1 row m-0'])/button[3]")
	private WebElement requote_btn;

	public void requoteBtn() {
		waitTimeForWebElementToAppear(requote_btn);
		requote_btn.click();
	}

	// Find convert Button and perform required action
	@FindBy(xpath = "(//div[@class='btn-group1 row m-0'])/button[3]")
	private WebElement convert_btn;

	public void convertBtn() {
		waitTimeForWebElementToAppear(convert_btn);
		if (convert_btn.isEnabled()) {
			convert_btn.click();
		} else {
			System.out.println(convert_btn.getText() + " Button is not clickable");
		}
	}

	// find requote displayed Messgae
	@FindBy(xpath = "//div[@class='result-box my-3']")
	private WebElement RequoteResultMsg;

	public void requoteResultMsg() {
		waitTimeForWebElementToAppear(RequoteResultMsg);
		System.out.println(RequoteResultMsg.getText());
	}

	// find make a payment option and perform required action
	@FindBy(xpath = "(//div[@class='row'])[2]/button[1]")
	private WebElement make_payment_btn;

	public void makePayment() {
		waitTimeForWebElementToAppear(make_payment_btn);
		make_payment_btn.click();
	}

	// find Pay later option and perform required action
	@FindBy(xpath = "(//div[@class='row'])[2]/button[2]")
	private WebElement pay_later_btn;

	public void payLater() {
		waitTimeForWebElementToAppear(pay_later_btn);
		pay_later_btn.click();
	}

	// find make another conversion & perform required action
	@FindBy(xpath = "(//div[@class='row'])[2]/button[3]")
	private WebElement make_another_conversion_btn;

	public void makeAnotherConversion() {
		waitTimeForWebElementToAppear(make_another_conversion_btn);
		make_another_conversion_btn.click();
	}

	// find view Dashboard option and perform required action
	@FindBy(xpath = "(//div[@class='row'])[2]/button[4]")
	private WebElement view_dashboard_btn;

	public void viewDashboardOpt() {
		waitTimeForWebElementToAppear(view_dashboard_btn);
		view_dashboard_btn.click();
	}

	// find conversion Success message and grab
	@FindBy(xpath = "//div[@class='complete-container mb-4']/p")
	private WebElement convertSuccessMsg;

	public void conversionSuccessmessage() {
		waitTimeForWebElementToAppear(convertSuccessMsg);
		System.out.println(convertSuccessMsg.getText());
	}

	// =========================NEW CHANGE CODE BY VRS===================

	// Find the Convert from pay out currency

	@FindBy(xpath = "//*[@class=\"page-wrapper-recipientPayees\"]/ul/li[2]/a")
	private WebElement convertPayoutcurrencyOption;

	public void Click_convertPayoutcurrency() {
		waitTimeForWebElementToAppear(convertPayoutcurrencyOption);
		convertPayoutcurrencyOption.click();

	}

	// find Sell Currency option and define action

	@FindBy(xpath = "(//*[@type='text'])[1]")
	private WebElement CurrncyName;

	public void ClickCurrncyName(String currencySellName) {
		waitTimeForWebElementToAppear(CurrncyName);
		CurrncyName.click();
		CurrncyName.sendKeys(currencySellName + Keys.ARROW_DOWN + Keys.ENTER);

	}

	// find Buy Currency option and define action

	@FindBy(xpath = "(//*[@type='text'])[2]")
	private WebElement BuyCurrncyName;

	public void ClickBuyCurrncyName(String BuycurrencyName) {
		waitTimeForWebElementToAppear(BuyCurrncyName);
		BuyCurrncyName.click();

		BuyCurrncyName.sendKeys(BuycurrencyName + Keys.ARROW_DOWN + Keys.ENTER);
	}

	// find the Amount To field perform click action (Buy or Sell)

	@FindBy(xpath = "//*[@id='demo-simple-select']")
	private WebElement AmountToopenDropDown;

	public void SelectAmountToopenDropDown() {
		waitTimeForWebElementToAppear(AmountToopenDropDown);
		AmountToopenDropDown.click();
	}

	@FindBy(xpath = "//*[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li[1]")
	private WebElement AmountToBuyOpt;

	public void SelectamountToBuy() {
		waitTimeForWebElementToAppear(AmountBuyOpt);
		AmountToBuyOpt.click();
	}

	// find the Amount To write amount field perform click action

	@FindBy(xpath = "//input[@id='amount']")
	private WebElement Amount;

	public void Write_amount(String amount) {
		waitTimeForWebElementToAppear(AmountValueBox);
		AmountValueBox.sendKeys(amount);
	}

	// find canccel button and perform define action

	@FindBy(xpath = "(//div[@class='btn-group1']/button)[1]")
	private WebElement cancle_Button;

	public void cancelButton() {
		waitTimeForWebElementToAppear(cancle_btn);
		cancle_btn.click();
	}

	// find Geta quote btn and perform define action

	@FindBy(xpath = "(//div[@class='btn-group1']/button)[2]")
	private WebElement getQuoteButton;

	public void ClickgetQuoteButton() {
		waitTimeForWebElementToAppear(getQuoteButton);
		getQuoteButton.click();
	}
}
