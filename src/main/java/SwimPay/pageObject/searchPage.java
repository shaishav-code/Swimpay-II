package SwimPay.pageObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SwimPay.AbstractComponents.abstractComponentsMethods;

public class searchPage extends abstractComponentsMethods {

	WebDriver driver;

	public searchPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Finding conversion Option
	@FindBy(xpath = "//a[@href='/search/conversion']")
	private WebElement ConversionOPt;

	// click on Conversion category OPtion
	public void conversionOption() {
		ConversionOPt.click();
	}

	// Find payment Option
	@FindBy(xpath = "//a[@href='/search/payments']")
	private WebElement PaymentsOPt;

	// Click on Payments category option
	public void paymentOption() {
		PaymentsOPt.click();
	}

	// Find Transaction Option
	@FindBy(xpath = "//a[@href='/search/transactions']")
	private WebElement TransactionsOpt;

	// Click on Transactiom category option
	public void transactionsOption() {
		TransactionsOpt.click();
	}

	// Filters

	// Finding Reference Filter field
	@FindBy(id = "outlined-basic")
	private WebElement Referencefilter_field;

	public void reference_field(String referenceValue) {
		Referencefilter_field.sendKeys(referenceValue);

	}

	// Find date Filter
	@FindBy(xpath = "//*[@class='MuiAutocomplete-root MuiAutocomplete-hasClearIcon MuiAutocomplete-hasPopupIcon css-9i3kzy]/div/div")
	private WebElement DateFilter;

	public void dateType() {
		DateFilter.click();




		//DateFilter.sendKeys(dateType + Keys.ARROW_DOWN + Keys.ENTER);
	}

	// Find From date field
	@FindBy(xpath = "(//button[@aria-label='Choose date'])[1]")
	private WebElement FromDate;

	// calendar window
	@FindBy(xpath = "//button[contains(@class,' MuiPickersDay-root')]")
	private List<WebElement> Dates;

	@FindBy(xpath = "//div[@class='css-1dozdou']/div[2]/button[1]")
	private WebElement CalendarPreMonth;

	@FindBy(xpath = "//div[@class='css-1dozdou']/div[2]/button[2]")
	private WebElement CalendarNextMonth;

	@FindBy(xpath = "//div[@class='MuiCalendarPicker-root css-1brzq0m']")
	private WebElement datePicker;

	public void selectFromDate(int fromDate) {
		FromDate.click();

		// Calculate the desired past date
		int daysToSubtract = fromDate;
		LocalDate currentDate = LocalDate.now();
		LocalDate pastDate = currentDate.minusDays(daysToSubtract);

		// Format the desired past date
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String pastDateFormatted = pastDate.format(dateFormat);

		// Find the date picker and iterate over the dates to find the desired one
		WebElement datePicker = driver.findElement(By.xpath("//div[@class='MuiCalendarPicker-root css-1brzq0m']"));
		List<WebElement> dates = datePicker.findElements(By.xpath("//button[contains(@class,' MuiPickersDay-root')]"));

		for (WebElement date : dates) {
			if (date.getText().equals(pastDateFormatted)) {
				date.click();
				System.out.println("Selected Date is >> " + pastDateFormatted);
				break;
			}
		}
	}

//
//		//desired Past Date format
//		int daysToSubtract=fromDate;
//		LocalDate currentDate=LocalDate.now();
//		LocalDate pastDates=currentDate.minusDays(daysToSubtract);
//		//selected Desired date from Calendar
//		DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		String pastDateFormatted=pastDates.format(dateFormat);
//		WebElement datepicker=datePicker;
//		for(WebElement date: Dates)
//		{
//			if(date.getText().equals(pastDateFormatted))
//			{
//				date.click();
//				System.out.println("Selected Date is >> "+ date);
//				break;
//			}
//		}
//
////		List<WebElement> desiredDate=Dates;
////		desiredDate.
//	}

	// Find To Date field
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement ToDate;

	public void DateOption(String SettelmentOPtions) {
		ToDate.click();
		ToDate.sendKeys(SettelmentOPtions + Keys.ARROW_DOWN + Keys.ENTER);
	}



	// Find Status Field

	@FindBy(xpath = "(//input[@type='text'])[5]")

	private WebElement StatusOpt;

	public void statusOption(String statusOPtions) {
		StatusOpt.click();
		StatusOpt.sendKeys(statusOPtions + Keys.ARROW_DOWN + Keys.ENTER);

	}

//
//    @FindBy(xpath= "(//*[@class='MuiAutocomplete-endAdornment css-2iz2x6'])[2]/button")
//    private List<WebElement> dropdown;
//
//    public void Select_Status(String Approved)
//{
//	  for(WebElement option:dropdown)
//	{
//	  String Status = option.getText();
//
//	       if(Status.contains(Approved))
//		{
//			option.click();
//		}
//	}
//}

	// Find Search Button for Filter section & perform Click action
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitFilter;

	public void FilterSearch() {
	System.out.println("Filter Search Button Clicked");
	submitFilter.click();


	}

	// Find Reset Filter Button option and perform click action
	@FindBy(xpath = "//div[contains(@class,'reset-filter')]")
	private WebElement ResetFilter;

	public void resetFilters() {
	ResetFilter.click();
	}

	// ====================================================================================//
	// CONVERSION/PAYEMTNS/TRANSACTIONS SEARCH PAGE ACTIONS

	//Find Sold Currency Option and perform click action

	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement SoldCurrencyOpt;

	public void selectSoldCurrencyOption(String currencySoldName) {
    SoldCurrencyOpt.sendKeys(currencySoldName + Keys.ARROW_DOWN + Keys.ENTER);
    SoldCurrencyOpt.click();
    }

	// Find Sold Minimum amount field
	
	//@FindBy(id = "conversion_sold_min_amount")
	@FindBy (xpath ="(//*[@type='number'])[1]")
	private WebElement MinSold;

	public void minimumSoldAmount(String minsold) {
	MinSold.sendKeys(minsold);
	}

	// Find Sold Maximum amount field
	
	//@FindBy(id = "conversion_sold_max_amount")
	@FindBy (xpath ="(//*[@type='number'])[2]")
	private WebElement MaxSold;

	public void maximumSoldAmount(String maxsold) {
	MaxSold.sendKeys(maxsold);
	}

	// Find Baught Currency Option and perform click action
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement BoughtCurrencyOpt;

	public void selectBoughtCurrencyOption(String currencyBaughtName) {
	BoughtCurrencyOpt.click();
	BoughtCurrencyOpt.sendKeys(currencyBaughtName + Keys.DOWN + Keys.ENTER);
	}

	// Find Baught Minimum amount field
	
	@FindBy(xpath="(//*[@type='number'])[3]")
	private WebElement MinBought;

	public void minimumBaughtAmount(String min_baught) {
	MinBought.sendKeys(min_baught);
	}

	// Find Bought Maximum amount field
	
	@FindBy(xpath="(//*[@type='number'])[4]")
	private WebElement MaxBought;

	public void maximumBaughtAmount(String max_bought) {
	MaxBought.sendKeys(max_bought);
	}

	// Find List of reference Number
	@FindBy(xpath = "//div[@data-tag='allowRowEvents']//a")
	private List<WebElement> References;

	public void referencesNumberSelector(int ref) {
	References.size();
	if (ref >= 0 && ref < References.size()) {
			String referenceNumberText = References.get(ref).getText();
			System.out.println("Selected Reference Number from Data List " + referenceNumberText);
			Referencefilter_field.sendKeys(referenceNumberText);
		} else {
			System.out.println("Invalid reference Number/Reference number not found  " + ref);
		}
	}
//

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

	// Find Conversion Data from data List
	
	@FindBy(xpath = "//div[contains(@class,'rdt_TableRow')]")
	private List<WebElement> DataList;

	// Find No Data View action
	
	@FindBy(xpath = "//div[@class='sc-ivTmOn fwKvpK']//div")
	private WebElement NoDatatoDisplay;

	// TO Fetch Dispalyed Data List
	
	public void DataList()  {
	int dataSize = DataList.size();

	if (dataSize>0)
		{
		for (int i = 0; i < dataSize; i++) {
				if(i<DataList.size())
				{

				//waitTimeForWebElementListToAppear(DataList);
				System.out.println(DataList.get(i).getText());
				}
			}
		}
		else
		{
			//waitTimeForWebElementToAppear(NoDatatoDisplay);
			//System.out.println("There are no records to display " + NoDatatoDisplay.getText());
			System.out.println("There are no records to display ");
		}
	}

	// Find Refresh Table button element & perform action
	
	@FindBy(xpath = "(//i[@role='button'])[2]")
	private WebElement RefreshTable;

	public void refershTable() {
	RefreshTable.click();
	}
}
