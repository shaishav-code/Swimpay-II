package swimGDSAutomation.pageclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class ManageCouponPage extends AbstractComponentsMethods{

	WebDriver driver;
	
	public ManageCouponPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	      
	            //////////////////////////Create New Coupon///////////////////////
	

    @FindBy(xpath="//*[@title='Create New Coupon']")
    private WebElement createnewtcouponsubmenu;
    
    @FindBy(xpath="(//*[@class='collapse-btn'])[5]")
    private WebElement dropdownarrow;
    
	@FindBy(xpath="//*[@id='code']")
    private WebElement codefield;
    
    @FindBy(xpath="//*[@id='code-error']")
    private WebElement codefieldvalidation;
    
    @FindBy(xpath="//*[@id='name']")
    private WebElement couponnamefield;
    
    @FindBy(xpath="//*[@id='name-error']")
    private WebElement couponnamevalidation;
    
    @FindBy(xpath="//*[@id='value']")
    private WebElement discount;
    
    @FindBy(xpath="//*[@id='value-error']")
    private WebElement discountvalidation;
    
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
    
    
    //Verify if user is able to click on Create Coupon submenu
    public void Click_createnewcoupon()
    {
    	createnewtcouponsubmenu.click();
    }
    
    //Verify if user is able to close the Manage Coupon list
    public void Close_managecouponlist()
    {
    	dropdownarrow.click();
    }
    
    
    //Verify if user is able to enter the code
    public void Enter_code(String code)
    {
    	codefield.sendKeys(code);
    }
    
    //Validation on code field
    public boolean Validationoncode()
    {
    	return codefield.isDisplayed();
    }
    
    //Verify if user is able to enter the coupon name
    public void Enter_couponname(String coupon)
    {
    	couponnamefield.sendKeys(coupon);
    }
    
    //Validation on coupon name field
    public boolean Validationoncouponnamefield()
    {
    	return couponnamevalidation.isDisplayed();
    }
    

    //Verify if user is able to enter the discount
    public void Enter_discount(String coupon)
    {
    	discount.sendKeys(coupon);
    }
    
    //Validation on Discount field
    public boolean Validation_discountfield()
    {
    	return discountvalidation.isDisplayed();
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
    
    //Verify if create button is enabled or not
    public boolean Createbtn_isenabled()
    {
    	System.out.println("Create button is visible :" + createbtn.isEnabled());
    	return createbtn.isEnabled();
    	
    }
    //Verify if user is able to click on Create button
    public void Click_createbtn()
    {
    	createbtn.click();
    	
    }
                ////////////////////////////////Coupon List///////////////////////////
    
    @FindBy(xpath="//*[@title='Coupon List']")
	private WebElement listcoupon;
    
    @FindBy(xpath="//table[@class='table']/tbody/tr/td[1]")
    private List<WebElement> code;
    
    @FindBy(xpath="//*[@name='search']")
    private WebElement searchfield;  
    
    @FindBy(xpath="//*[@class='btn btn-primary btn-add-coupon d-flex justify-center items-center']")
    private WebElement createnewcouponbtn; 
    
    @FindBy(xpath="//*[text()='Cancel']")
    private WebElement canceltbn; 
    
	@FindBy(xpath="//*[text()='No']")
	private List<WebElement> no_btn;
    
  	@FindBy(xpath="//*[text()='Yes']")
	private List<WebElement> yes_btn;
    
    
    //Verify if user is able to click on List Coupon submenu
    public void listcouponsubmenu()
    {
    	listcoupon.click();
    }
    
	//Verify if user is able to click on create new coupon button 
	public void Click_createnewcoupontbn()
	{
		createnewcouponbtn.click();
	}
    
    WebElement toggleswitch;
    
    //Verify if user is able to see the created Terms in list trading page
    public void Entries(String Code)
    {
    	code.size();
        for (WebElement referenceElement : code) 
    	 {
    		String getreferenceElement = referenceElement.getText().toString();
    		if (getreferenceElement.contains(Code)) 
    			{
    				toggleswitch = driver.findElement(RelativeLocator.with(By.xpath("//*[@class='switch']")).toRightOf(referenceElement));
    			}
         }
    	    toggleswitch.click();
     }
    
    //Verify if user is able to search the terms created from the list
    public void Enterterms_search(String term)
    {
    	searchfield.sendKeys(term);
    	Actions act = new Actions(driver);
    	act.sendKeys(Keys.ENTER).perform();
    }
    
   //Verify if user is able to click on cancel button 
  	public void Click_canceltbn()
  	{
  		canceltbn.click();
  	}
  	
	//Verify if user is able to click on Yes button
	public void Click_yesbtn(int i)
	{
		yes_btn.get(i).click();
	}
	
	//Verify if user is able to click on No button
	public void Click_nobtn(int i)
	{
		no_btn.get(i).click();
	}   
      
    
    
}
