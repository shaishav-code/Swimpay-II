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

	//find Sell Currency option and define action 
	
//	@FindBy(xpath="//*[@id='root']/div/div[1]/div[2]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div/div/div/div/button")
//	WebElement sell_currency_drop_down_btn;
	
	@FindBy(xpath="(//*[@type='text'])[1]")
	private WebElement sell_currency_textbox;
	
	public void sellCurrency(String curency) throws InterruptedException
	{
		sell_currency_textbox.sendKeys(curency+Keys.DOWN+Keys.ENTER);
		Thread.sleep(3000);
	}
	
	//find buy currency option & perform define action
	@FindBy(xpath="(//*[@type='text'])[2]")
	WebElement buy_currency_textbox;
	public void buyCurrency(String currencyBuy) throws InterruptedException
	{
		buy_currency_textbox.sendKeys(currencyBuy+Keys.DOWN+Keys.ENTER);
		Thread.sleep(3000);
	}
	
//	@FindBy(xpath="//*[@id='root']/div/div[1]/div[2]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div/div/div/div/button")
//	WebElement buy_currency__drop_down_btn;
	
//find Amount To option and perform define action
	@FindBy(xpath="//div[@id='demo-simple-select']")
	private WebElement AmounToOpt;
	public void amountToOption()
	{
		AmounToOpt.click();
	}
	
	//find Amount to dropdown list options and perform required options
	@FindBy(xpath="//li[@data-value='buy']")
	private WebElement AmountBuyOpt;
	
	@FindBy(xpath="//li[@data-value='sell']")
	private WebElement AmountSellOpt;
	
	public void amountToBuy()
	{
		AmountBuyOpt.click();
	}
	public void amountToSell()
	{
		AmountSellOpt.click();
	}
	
	//find amount value field & perform define action
	@FindBy(xpath="//input[@id='amount']")
	private WebElement AmountValueBox;
	public void amountValue(String amount)
	{
		AmountValueBox.sendKeys(amount);
	}
	
	//find canccel button and perform define action
	@FindBy(xpath="(//div[@class='btn-group1']/button)[1]")
	private WebElement cancle_btn;
	public void cancelBtn()
	{
		cancle_btn.click();
	}
	
	//find Geta quote btn and perform define action
	@FindBy(xpath="(//div[@class='btn-group1']/button)[2]")
	private WebElement getQuoteBtnOpt;
	public void getQuote()
	{
		getQuoteBtnOpt.click();
	}
	
	//Find checkbox option and perform required action
	@FindBy(xpath="//input[@id='happywithquote']")
	private WebElement i_am_happy_checkbox;
	public void happyCheckbox()
	{
		i_am_happy_checkbox.click();
	}
	
	//find back button 7 perform required action 
	@FindBy(xpath="(//div[@class='btn-group1 row m-0'])/button[1]")
	private WebElement back_btn;
	public void backBtn()
	{
		back_btn.click();
	}
	
	//find cancel button & perform required action (cancel button from 2nd step)
	@FindBy(xpath="(//div[@class='btn-group1 row m-0'])/button[2]")
	private WebElement cancel_btn;
	public void cancelBtn_process()
	{
		cancel_btn.click();
	}
	
	//Find requote button and perform required action
	@FindBy(xpath="(//div[@class='btn-group1 row m-0'])/button[3]")
	private WebElement requote_btn;
	public void requoteBtn()
	{
		requote_btn.click();
	}
	
	//Find convert Button and perform required action
	@FindBy(xpath="(//div[@class='btn-group1 row m-0'])/button[3]")
	private WebElement convert_btn;
	public void convertBtn()
	{
		if(convert_btn.isEnabled())
		{
		convert_btn.click();
		}
		else
		{
			System.out.println(convert_btn.getText()+ " Button is not clickable");
		}
	}
	
	//find requote displayed Messgae
	@FindBy(xpath="//div[@class='result-box my-3']")
	private WebElement RequoteResultMsg;
	public void requoteResultMsg()
	{
		System.out.println(RequoteResultMsg.getText());
	}
	
	//find make a payment option and perform required action
	@FindBy(xpath="(//div[@class='row'])[2]/button[1]")
	private WebElement make_payment_btn;
	public void makePayment()
	{
		make_payment_btn.click();	
	}
	
	//find Pay later option and perform required action
	@FindBy(xpath="(//div[@class='row'])[2]/button[2]")
	private WebElement pay_later_btn;
	public void payLater()
	{
		pay_later_btn.click();
	}
	
	//find make another conversion & perform required action
	@FindBy(xpath="(//div[@class='row'])[2]/button[3]")
	private WebElement make_another_conversion_btn;
	public void makeAnotherConversion()
	{
		make_another_conversion_btn.click();
	}
	
	//find view Dashboard option and perform required action
	@FindBy(xpath="(//div[@class='row'])[2]/button[4]")
	private WebElement view_dashboard_btn;
	public void viewDashboardOpt()
	{
		view_dashboard_btn.click();
	}
	
	//find conversion Success message and grab
	@FindBy(xpath="//div[@class='complete-container mb-4']/p")
	private WebElement convertSuccessMsg;
	public void conversionSuccessmessage()
	{
		waitTimeForWebElementToAppear(convertSuccessMsg);
		System.out.println(convertSuccessMsg.getText());
	}
}
