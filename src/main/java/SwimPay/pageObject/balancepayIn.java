package SwimPay.pageObject;

import java.io.Writer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class balancepayIn extends abstractComponentsMethods {

	WebDriver driver;

	public balancepayIn(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// find balance payin field and perform required action
	@FindBy(xpath = "//input[@id='outlined-basic']")
	private WebElement Bal_PayIn;

	public void balPayIn(String payin) {
		waitTimeForWebElementListToAppear(CountryPriceTab);
		Bal_PayIn.sendKeys(payin);
	}

	// find country data from table and perform required action
	@FindBy(xpath = "//div[@class='table-item']")
	private List<WebElement> CountryPriceTab;

	// find country name from Datalists country price tab
	@FindBy(xpath = "//div[@class='country']")
	private List<WebElement> CountrysName;

	public void countryPriceDataList() {
		waitTimeForWebElementListToAppear(CountryPriceTab);
		CountryPriceTab.size();
		for (int i = 0; i < CountryPriceTab.size(); i++) {
			String countryPriceListName = CountryPriceTab.get(i).getText();
			if (CountryPriceTab.contains(countryPriceListName)) {
				System.out.println(countryPriceListName);
			}
		}
	}

	// cature country name from list and perform click action on country price tab
	// option from data list
	public void countryOPtionClick(String countryOpt) {
		CountrysName.size();
		for (WebElement Country_Name : CountrysName) {
			String requestCountryName = Country_Name.getText();
			if (requestCountryName.contains(countryOpt)) {
				System.out.println(Country_Name.getText()+" is clicked");
				Country_Name.click();
				break;
				}
		}
	}
	
	

	// find Balance data from details page & perform print data action
	@FindBy(xpath = "//div[@class='price-country']")
	private WebElement BalanceDetails;

	public void countryBalanceData_inDetailsPage()

	{
		System.out.println(BalanceDetails.getText());
	}

	// find Pending Transaction settlement from Date field and perform required
	// action
	@FindBy(xpath = "(//input[contains(@class,'css-19qh8xo-MuiInputBase')])[1]")
	private WebElement PendingSettleFromDate;

	public void pendingSettlement_fromDate(String fromDate) {
		PendingSettleFromDate.sendKeys(fromDate);
	}

	// find Pending Transaction settlement To Date field and perform required action
	@FindBy(xpath = "(//input[contains(@class,'css-19qh8xo-MuiInputBase')])[2]")
	private WebElement PendingSettleToDate;

	public void pendingSettlement_toDate(String toDate) {
		PendingSettleToDate.sendKeys(toDate);
	}

	// find complete Transaction from Date field and perform required action
	@FindBy(xpath = "(//button[contains(@class,'css-1yq5fb3-MuiButtonBase')])[3]")
	private WebElement CompleteTransFromDate;

	public void completeTransaction_fromDate() {
		CompleteTransFromDate.click();
	}

	// find complete Transaction To Date field and perform required action
	@FindBy(xpath = "(//button[contains(@class,'css-1yq5fb3-MuiButtonBase')])[4]")
	private WebElement CompleteTransToDate;

	public void completeTransaction_toDate() {
		waitTimeForElementToClickable(CompleteTransToDate);
		CompleteTransToDate.click();
	}
		

	// find No Data Found caption and perform required action
	@FindBy(xpath = "//div[@class='sc-ivTmOn fwKvpK'] //div")
	private WebElement NoDatafound;
	// find complete transaction data from displayed data list and perform capture
	// print action
	@FindBy(xpath = "(//div[@class='sc-fLlhyt ifOHjV'])[2]//div[contains(@class,'rdt_TableRow')]")
	private List<WebElement> CompleteTransactionDataList;

	public void completeTransactionsDatas() {

		for (int i = 0; i < CompleteTransactionDataList.size(); i++) {
			String completeTransaction = CompleteTransactionDataList.get(i).getText();
			if (completeTransaction.contains(completeTransaction)) {
				System.out.println("Displayed Completed Transaction Data " + completeTransaction);
			}
			else
			{
				System.out.println(NoDatafound.getText());
			}
		}
	}
	
	//find row per page option and perform required action
		@FindBy(xpath="(//select[@class='sc-cxabCf kJrhuj'])[1]")
		private WebElement RowOpt;
		@FindBy(xpath="(//select[@class='sc-cxabCf kJrhuj'])[1]/option")
		private List<WebElement> OPtions;
		public void selectRowsOptions()
		{
			RowOpt.click();
			System.out.println(OPtions.get(4).getText()+ " Row option is selected");
			OPtions.get(4).click();
		}
		

	// find statement year field and perform required action
	@FindBy(xpath = "(//button[contains(@class,'css-1yq5fb3-MuiButtonBase')])[5]")
	private WebElement StatementYearField;

	public void statementYear(String year) {
		StatementYearField.sendKeys(year);
	}

	// find create statement button & perform click action
	@FindBy(xpath = "//button[contains(@class,'css-8fujfr-MuiButtonBase')]")
	private WebElement StatementCreateBtn;

	public void statementYearCreateBtn() {
		waitTimeForElementToClickable(StatementCreateBtn);
		StatementCreateBtn.click();
	}
	
	//Find statement Month field from pop-up and perform click action 
	@FindBy(xpath="(//button[contains(@class,'css-1yq5fb3-MuiButtonBase')])[6]")
	private WebElement SelectStatementMonth;
	public void selectStatementMonth()
	{
		SelectStatementMonth.click();
	}
	//find statement months from create statement pop-up

		@FindBy(xpath="//button[contains(@class,'PrivatePickersMonth')]")
		private List<WebElement> StatementMonths;
		@FindBy(xpath="//button[contains(@class,'PrivatePickersYear-yearButton')]")
		private List<WebElement> StatementYears;
		public void statementMonthSelect(String Month)
		{
			StatementMonths.size();
			for(WebElement monthName:StatementMonths)
			{
				String requestedMonth=monthName.getText();
				if (requestedMonth.contains(Month))
				{
					System.out.println("Selected Month is "+ requestedMonth);
					monthName.click();
					break;
				}
			}
			}
		
		public void selectStatementYear(String year)
		{
			StatementYears.size();
			for(WebElement yearName:StatementYears)
			{
				String requestedYear =yearName.getText();
						if(requestedYear.equals(year))
						{
							System.out.println("Selected Year is "+ requestedYear);
							yearName.click();
							break;
						}
			}
		
		}

//	// find create statement month field and perform required action
//	@FindBy(xpath = "//input[@id=':r5j:']")
//	private WebElement StatementMonthField;
//	
//	
//
//	////button[contains(@class,'PrivatePickersMonth')]
//	public void statementMonth(String month) {
//		StatementMonthField.sendKeys(month);
//	}

	// find create statement from date field and perform required action
	@FindBy(xpath = "(//button[contains(@class,'css-1yq5fb3-MuiButtonBase')])[7]")
	private WebElement StatementFromDateField;

	public void statementMonthFromDate() {
		StatementFromDateField.click();
	}

	// find create statement to date field and perform required action
	@FindBy(xpath = "(//button[contains(@class,'css-1yq5fb3-MuiButtonBase')])[8]")
	private WebElement StatementToDateField;

	public void statementMonthToDate() {
		StatementToDateField.click();;
	}

	// find Proceed statement button and perform required action
	@FindBy(xpath = "(//button[contains(@class,'me-2 css-1etaikj-MuiButtonBase')])[5]")
	private WebElement StatementProceed;

	public void statementProceedBtn() {
		StatementProceed.click();
	}

	// find cancel statement button and perform required action
	@FindBy(xpath = "//button[contains(@class,'css-1azb8y9-MuiButtonBase-')]")
	private WebElement StatementCancel;

	public void statementCancelBtn() {
		StatementCancel.click();
	}
	

	// find Statement Months datalist and perform required action (click on View
	// Button)
	@FindBy(xpath = "(//div[@class='sc-fLlhyt ifOHjV'])[3]//div[contains(@class,'rdt_TableRow')]")
	private List<WebElement> StatementMonthsDataList;
	@FindBy(xpath = "(//div[@class='sc-fLlhyt ifOHjV'])[3]//div[contains(@class,'rdt_TableRow')]//button")
	private WebElement ViewStatementBtn;

	public void statementMonthViewOptionClickFromList(String statementMonth) {
		for (WebElement StatementMonth : StatementMonthsDataList) {
			String requestedMonth = StatementMonth.getText();
			if (requestedMonth.contains(statementMonth)) {
				ViewStatementBtn.click();
			}
		}
	}

	// find back to balance button and perform required action
	@FindBy(xpath = "//button[contains(@class,'css-5vsnzl-MuiButtonBase')]")
	private WebElement BackToBalances;

	public void backToBalancesBtn() {
		BackToBalances.click();
	}

	// Find pay currency Option and perform click action
	@FindBy(xpath = "(//div[contains(@class,'action-icon css-')])[2]")
	private WebElement PayCurrencyBtnOpt;

	public void payCurrencyOptionBtn() {
		PayCurrencyBtnOpt.click();
	}

	// Find Add currency Option and perform click action
	@FindBy(xpath = "(//div[contains(@class,'action-icon css-')])[1]")
	private WebElement AddCurrencyBtnOpt;

	public void addCurrencyOptionBtn() {
		AddCurrencyBtnOpt.click();
	}

	// Find convert currency Option and perform click action
	@FindBy(xpath = "(//div[contains(@class,'action-icon css-')])[3]")
	private WebElement ConvertCurrencyBtnOpt;

	public void convertCurrencyOptionBtn() {
		ConvertCurrencyBtnOpt.click();
	}

	// Find My currency account Option and perform click action
	@FindBy(xpath = "//a[contains(@href,'account_details')]")
	private WebElement MyCurrencyAccount;

	public void myCurrencyAccountOption() {
		MyCurrencyAccount.click();
	}
	
	//find my currency Account details and perform required action
	@FindBy(xpath="//div[@class='my-5 p-3 balance-account-detail']")
	private List <WebElement> CurrencyAccountDetails;
	public void currencyAccountDetails()
	{
		CurrencyAccountDetails.size();
		for(int i=0;i<CurrencyAccountDetails.size();i++)
		{
			
			System.out.println("Currency Account Details >>"
					+CurrencyAccountDetails.get(i).getText());
		}
	}
}
