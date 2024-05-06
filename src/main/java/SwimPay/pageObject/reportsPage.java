package SwimPay.pageObject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class reportsPage extends abstractComponentsMethods {

	WebDriver driver;

	public reportsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Find Invoice Map option
	@FindBy(xpath = "(//a[@class='search-link text-black'])[1]")
	private WebElement InvoiceMapOpt;

	public void invoiceMap() {
		waitTimeForWebElementToAppear(InvoiceMapOpt);
		InvoiceMapOpt.click();
	}

	// Find BOL_CSV option
	@FindBy(xpath = "(//a[@class='search-link text-black'])[2]")
	private WebElement Bol_CsvOpt;

	public void bolCsv() {
		waitTimeForWebElementToAppear(Bol_CsvOpt);
		Bol_CsvOpt.click();
	}

	// Find Deposit Invoice option
	@FindBy(xpath = "(//a[@class='search-link text-black'])[3]")
	private WebElement DepoInvOpt;

	public void depoInvoce() {
		DepoInvOpt.click();
	}

	// Find balance Invoice Map option
	@FindBy(xpath = "(//a[@class='search-link text-black'])[4]")
	private WebElement BalInvOpt;

	public void balInvoice() {
		BalInvOpt.click();
	}

	// Find Refund option
	@FindBy(xpath = "(//a[@class='search-link text-black'])[5]")
	private WebElement RefundOPt;

	public void refund() {
		RefundOPt.click();
	}

	// Find Search Field
	@FindBy(id = "invoice_search")
	private WebElement SearchField;

	public void searchOpt(String searchdata) {
		SearchField.sendKeys(searchdata);
	}

	// Find Date Range field
	@FindBy(xpath = "//div[@class='MuiAutocomplete-root MuiAutocomplete-hasClearIcon MuiAutocomplete-hasPopupIcon css-9i3kzy']/div/div/input")
	private WebElement DateRangeOpt;

	@FindBy(xpath = "(//div[@class='MuiAutocomplete-endAdornment css-2iz2x6'])[1]/button[2]")
	WebElement dropdownDateRangeOpt;
	
	public void dateRange(String Date) throws InterruptedException {
		
		String dateRangeOptStr = DateRangeOpt.getAttribute("value").toString();
		//System.out.println(dateRangeOptStr);
		if(dateRangeOptStr.equals(Date))
		{
			
		}
		else
		{
			DateRangeOpt.clear();
			dropdownDateRangeOpt.click();
//			DateRangeOpt.click();
			Thread.sleep(2000);
//			DateRangeOpt.sendKeys(Date);
			dropdownDateRangeOpt.sendKeys(Keys.DOWN);
			dropdownDateRangeOpt.sendKeys(Keys.DOWN);
			Thread.sleep(2000);
			dropdownDateRangeOpt.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
		}	
	}
	
	// Find Status Optin field
	@FindBy(xpath = "(//input[@id='combo-box-demo'])[1]")
	private WebElement StatusOPt;

	public void stautsOption(String Status) {
		DateRangeOpt.sendKeys(Status + Keys.DOWN + Keys.ENTER);
	}

	// Find Select Seller Option
	@FindBy(id = "buyer-seller-selector-seller")
	private WebElement SellerOpt;

	public void sellerOption(String Seller) throws InterruptedException {
		SellerOpt.sendKeys(Seller);
		
		SellerOpt.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		SellerOpt.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	
	}
	
	// Find Select Buyer Option
	@FindBy(id = "buyer-seller-selector-buyer")
	private WebElement BuyerOpt;

	public void buyerOption(String Buyer) throws InterruptedException {
		BuyerOpt.sendKeys(Buyer);
		BuyerOpt.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		BuyerOpt.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	// find Submit Button
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SubmitBtn;

	public void submit() {
		SubmitBtn.click();
	}

	// find Reset Button
	@FindBy(xpath="//button[contains(@class,'css-15urka2')]")
				private WebElement ResetBtn;

	public void resetBtn() {
		ResetBtn.click();
	}

	// Find List of invoce/BCN Number
		@FindBy(xpath = "//div[@class='py-2']")
		private List<WebElement> numbers;

		public void dataNumberSelector(int dataNums) {
			numbers.size();
			if (dataNums >= 0 && dataNums < numbers.size()) {
				String DataNumberText = numbers.get(dataNums).getText();
				System.out.println("Selected Reference Number from Data List " + DataNumberText);
				SearchField.sendKeys(DataNumberText);
			} else {
				System.out.println("Invalid reference Number/Reference number not found  " + dataNums);
			}
		}
		
		// Find Conversion Data from data List
		@FindBy(xpath = "//div[@class='sc-jqUVSM hjBMSB rdt_TableRow']")
		private List<WebElement> ReportsDataList;

		// Find No Data View action
			@FindBy(xpath = "//div[@class='sc-ivTmOn iYWPft']//div")
			private WebElement NoDatatoDisplay;

		// TO Fetch Dispalyed Data List
		public void reportDataList() {
			waitTimeForWebElementListToAppear(ReportsDataList);
			int dataSize = ReportsDataList.size();

			if (dataSize > 0)
				for (int i = 0; i < dataSize; i++) {

					System.out.println(ReportsDataList.get(i).getText());
				}
			else {

				System.out.println("There are no records to display " + NoDatatoDisplay.getText());
			}
		}


}
