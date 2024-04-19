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
		InvoiceMapOpt.click();
	}

	// Find BOL_CSV option
	@FindBy(xpath = "(//a[@class='search-link text-black'])[2]")
	private WebElement Bol_CsvOpt;

	public void bolCsv() {
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
	@FindBy(xpath = "(//input[@id='combo-box-demo'])[1]")
	private WebElement DateRangeOpt;

	public void dateRange(String Date) {
		DateRangeOpt.sendKeys(Date + Keys.DOWN + Keys.ENTER);
	}

	// Find Status Optin field
	@FindBy(xpath = "(//input[@id='combo-box-demo'])[1]")
	private WebElement StatusOPt;

	public void stautsOption(String Status) {
		DateRangeOpt.sendKeys(Status + Keys.DOWN + Keys.ENTER);
	}

	// Find Select Seller Option
	@FindBy(id = "seller-selector")
	private WebElement SellerOpt;

	public void sellerOption(String Seller) {
		SellerOpt.sendKeys(Seller + Keys.DOWN + Keys.ENTER);
	}

	// Find Select Buyer Option
	@FindBy(id = "buyer-selector")
	private WebElement BuyerOpt;

	public void buyerOption(String Buyer) {
		SellerOpt.sendKeys(Buyer + Keys.DOWN + Keys.ENTER);
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
