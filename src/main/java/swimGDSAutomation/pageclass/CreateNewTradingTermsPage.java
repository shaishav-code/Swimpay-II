package swimGDSAutomation.pageclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class CreateNewTradingTermsPage extends AbstractComponentsMethods {

    WebDriver driver;

    public CreateNewTradingTermsPage(WebDriver driver) {
    super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//*[@id='code']")
    private WebElement codefield;
    
    @FindBy(xpath="//*[@id='code-error']")
    private WebElement codefieldvalidation;
    
    @FindBy(xpath="//*[@id='name']")
    private WebElement couponnamefield;
    
    @FindBy(xpath="//*[@class='action toggle dropdown-toggle']")
    private WebElement daysdropdown;
    
    @FindBy(xpath="//*[@class='dropdown-menu list-term_days dropdown-menu-right show']//li")
    private List<WebElement> daysdropdownlist;
    
    @FindBy(xpath="//*[@class='form-control js-datepicker hasDatepicker']")
    private WebElement expirationdatefield;

	//Month
	@FindBy(xpath = "//div[@class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all']/div[1]/div[2]")
	private WebElement month1;

	//next button
	@FindBy(xpath = "//div[@class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all']/div[1]/div[3]/a[1]")
	private WebElement nextbtn;

	// date picker
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td/a")
	private List<WebElement> Dates;
    
    @FindBy(xpath="//*[@id='btn-save']")
    private WebElement createbtn;
    
    //Verify if user is able to enter the code
    public void Enter_code(String code)
    {
    	codefield.sendKeys(code);
    }
    
    //Verify if user is able to enter the code
    public boolean Validationoncode()
    {
    	return codefield.isDisplayed();
    }
    
    //Verify if user is able to enter the coupon name
    public void Enter_couponname(String coupon)
    {
    	couponnamefield.sendKeys(coupon);
    }
    
    //Verify if user is able to select the days from dropdown
    public void Select_dropdowndays(String day)
    {
    	daysdropdown.click();
		for(WebElement value:daysdropdownlist)
		{
			String dayvalue  = value.getText();			
			if(dayvalue.equals(day))
			{
				value.click();
			}
		}	
    }
    
    //Terms dropdown close
    public void closedropdown()
    {
    	daysdropdown.click();
    }
    
    //Verify if user is able to click on Expiry date picker and able to select the date
    public void SelectdatenMonth(String month, String day) {
		expirationdatefield.click();
		while (!month1.getText().equalsIgnoreCase(month)) {
			waitTimeForElementToClickable(nextbtn);
			nextbtn.click();
		}
		for(WebElement value:Dates)
		{
			String dayvalue  = value.getText();	
			if(dayvalue.equals(day))
			{
				value.click();
			}
		}
	}    
    
    //Verify if user is able to see the create button on DOM
    public boolean Createbtn_isdisplayed()
    {
    	System.out.println("Create button is visible :" + createbtn.isDisplayed());
    	return createbtn.isDisplayed();
    	
    }
    //Verify if user is able to click on Create button
    public void Click_createbtn()
    {
    	createbtn.click();
    	
    }
    
}
