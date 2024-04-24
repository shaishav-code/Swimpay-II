package SwimPay.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class balancepayOut extends abstractComponentsMethods {

	WebDriver driver;

	public balancepayOut(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// find balance payout field and perform required action
	@FindBy(xpath = "//input[@id='outlined-basic']")
	private WebElement Bal_Payout;

	public void balPayIn(String payout) {
		Bal_Payout.sendKeys(payout);
	}

	// find country data from table and perform required action
	@FindBy(xpath = "//div[@class='table-item']")
	private List<WebElement> CountryPriceTab;

	// find country name from Datalists country price tab
	@FindBy(xpath = "//div[@class='country']")
	private List<WebElement> CountrysName;

	public void countryPriceDataList() {
		CountryPriceTab.size();
		for (int i = 0; i < CountryPriceTab.size(); i++) {
			String countryPriceListName = CountryPriceTab.get(i).getText();
			if (CountryPriceTab.contains(countryPriceListName)) {
				System.out.println(countryPriceListName);
			}
		}
	}
	
	
	@FindBy(xpath = "//div[@class='price-country']/div[2]")
	private WebElement CountryName_Print;
	

	// cature country name from list and perform click action on country price tab
	// option from data list
	public void countryOPtionClick(String country_payOutOpt) {
		CountrysName.size();
	System.out.println(CountryName_Print);
		for (WebElement Country_Name : CountrysName) {
			String requestCountryName = Country_Name.getText();
			
			System.out.println(requestCountryName);
			if (requestCountryName.contains(country_payOutOpt)) {
				//System.out.println(Country_Name.getText()+" is Clicked");
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
	@FindBy(xpath = "(//button[contains(@class,'css-1yq5fb3-MuiButtonBase')])[1]")
	private WebElement PendingPayOutSettleFromDate;

	public void pendingPayOutSettlement_fromDate(String fromDate) {
		PendingPayOutSettleFromDate.click();;
	}

	// find payout Pending Transaction settlement To Date field and perform required action
	@FindBy(xpath = "(//button[contains(@class,'css-1yq5fb3-MuiButtonBase')])[2]")
	private WebElement PendingPayOutSettleToDate;

	public void pendingPayOUtSettlement_toDate() {
		PendingPayOutSettleToDate.click();
	}

	// find payout complete Transaction from Date field and perform required action
	@FindBy(xpath = "//div[@class='content2-container']/div/div[4]/div[2]/div[1]/div/div/button")
	private WebElement CompletePayOutTransFromDate;

	public void completePayOutTransaction_fromDate() {
		CompletePayOutTransFromDate.click();
	}

	// find complete Transaction To Date field and perform required action
	@FindBy(xpath = "//div[@class='content2-container']/div/div[4]/div[2]/div[2]/div/div/button")
	private WebElement CompletePayOutTransToDate;

	public void completePayOutTransaction_toDate() {
		CompletePayOutTransToDate.click();;
	}

	// find No Data Found caption and perform required action
	@FindBy(xpath = "//div[@class='sc-ivTmOn fwKvpK'] //div")
	private List<WebElement> NoDatafound;
	// find complete transaction data from displayed data list and perform capture
	// print action
	@FindBy(xpath = "(//div[@class='sc-fLlhyt ifOHjV'])[2]//div[contains(@class,'rdt_TableRow')]")
	private List<WebElement> CompletePayOutTransactionDataList;
	
	@FindBy(xpath="//nav[@class='sc-iIPllB jxflYm rdt_Pagination']")
	private WebElement PaginationFlex;

	public void completePayOutTransactionsDatas() {

		for (int i = 0; i < CompletePayOutTransactionDataList.size(); i++) {
			String completeTransaction = CompletePayOutTransactionDataList.get(i).getText();
			if (completeTransaction.contains(completeTransaction)) {
				System.out.println("Displayed Completed Transaction Data " + completeTransaction);
				//scrollToElement(CompletePayOutTransFromDate);
				
			}
			else
			{
				System.out.println(NoDatafound.get(1).getText());
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
	private WebElement StatementPayOutYearField;

	public void payOut_statementYear() {
		StatementPayOutYearField.click();
	}

	// find create statement button & perform click action
	@FindBy(xpath = "//div[@class='content2-container']/div/div[6]/div[1]/div[2]/button[2]")
	private WebElement StatementCreateBtn;

	public void statementYearCreateBtn() {
		StatementCreateBtn.click();
	}

	// find create statement month field and perform required action
	@FindBy(xpath = "(//div[@class='mb-3'])[3]/div/div/div/button")
	private WebElement StatementPayOutMonthField;

	public void payOut_statementMonth() {
		StatementPayOutMonthField.click();
	}

	// perform Month and Year Selection action from calendar Pop-up
	@FindBy(xpath = "//div[@class='PrivatePickersFadeTransitionGroup-root MuiCalendarPicker-viewTransitionContainer css-5c7sx6']/div/div/button")
	private List<WebElement> StatementMonths;
	@FindBy(xpath = "//Button[@class='PrivatePickersYear-yearButton css-m1gykc']")
	private List<WebElement> StatementYears;

	public void statementMonthSelect(String Month) {
		StatementMonths.size();
		for (WebElement monthName : StatementMonths) {
			String requestedMonth = monthName.getText();
			if (requestedMonth.contains(Month)) {
				System.out.println("Selected Month is " + requestedMonth);
				monthName.click();
				break;
			}
		}
	}

	public void selectStatementYear(String year) {
		StatementYears.size();
		for (WebElement yearName : StatementYears) {
			String requestedYear = yearName.getText();
			if (requestedYear.equals(year)) {
				System.out.println("Selected Year is " + requestedYear);
				yearName.click();
				break;
			}
		}

	}

	
	// find create statement from date field and perform required action
	@FindBy(xpath = "//div[@class='MuiDialogContent-root css-1ty026z']/div/div[3]/div[1]/div[2]/div/div/button")
	private WebElement StatementPayOutFromDateField;

	public void payOut_statementMonthFromDate() {
		StatementPayOutFromDateField.click();
	}

	// find create statement to date field and perform required action
	@FindBy(xpath = "//div[@class='MuiDialogContent-root css-1ty026z']/div/div[3]/div[2]/div[2]/div/div/button")
	private WebElement StatementPayOutToDateField;

	public void payOut_statementMonthToDate() {
		StatementPayOutToDateField.click();
	}

	// find Proceed statement button and perform required action
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthLg css-18i3v7t']/div[2]/button[2]")
	private WebElement StatementProceed;

	public void statementProceedBtn() {
		
		StatementProceed.click();
	}

	// find cancel statement button and perform required action
	@FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthLg css-18i3v7t']/div[2]/button[1]")
	private WebElement StatementCancel;

	public void statementCancelBtn() {
		StatementCancel.click();
	}

	// find Statement Months datalist and perform required action (click on View
	// Button)
	@FindBy(xpath = "//div[@class='content2-container']/div/div[6]/div[1]/div[1]/div[2]/div/div/div/button")
	private WebElement StatementCalClickPayOut;
	
	
	
	@FindBy(xpath = "//Button[@class='PrivatePickersYear-yearButton css-m1gykc']")
	private List<WebElement> StatementMonthsDataList;
	@FindBy(xpath = "(//div[@class='sc-fLlhyt ifOHjV'])[3]//div[contains(@class,'rdt_TableRow')]//button")
	private WebElement ViewStatementBtn;

	public void statementMonthViewOptionClickFromList(String yearPayout) {
		StatementCalClickPayOut.click();
		
		for (WebElement StatementyearPayout : StatementMonthsDataList) {

			String requestedyear = StatementyearPayout.getText();
			// System.out.println(requestedyear);

			if (requestedyear.equals(yearPayout)) {
				StatementyearPayout.click();
				System.out.println(StatementyearPayout);
				break;
			}
		}
	}

	//find statement data from list and perform required action 
	public void balOutStatementDataList()
	{
		for(int i=0; i<StatementMonthsDataList.size();i++)
		{
			String statementData=StatementMonthsDataList.get(i).getText();
			if(statementData.contains(statementData))
			{
				System.out.println(statementData);
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
	@FindBy(xpath = "(//div[contains(@class,'action-icon css-')])[1]")
	private WebElement PayCurrencyBtnOpt;

	public void payCurrencyOptionBtn() {
		PayCurrencyBtnOpt.click();
	}

	

	// Find convert currency Option and perform click action
	@FindBy(xpath = "(//div[contains(@class,'action-icon css-')])[2]")
	private WebElement ConvertCurrencyBtnOpt;

	public void convertCurrencyOptionBtn() {
		ConvertCurrencyBtnOpt.click();
	}

	//find refresh statementi table icon and peform click action 
	@FindBy(xpath="(//div[@class='react-dataTable position-relative'])[4]/div[1]/div[2]/i")
	private WebElement RefreshStatement;
	public void refreshStatement()
	{
		RefreshStatement.click();
	}
	
	
	@FindBy(xpath = "//div[@class='MuiDialog-root MuiModal-root css-126xj0f']/div[3]/div/h2/button")
	private WebElement Cancelclick;
	public void CancelClick() throws InterruptedException {
		Thread.sleep(2000);
		Cancelclick.click();
	}
}
