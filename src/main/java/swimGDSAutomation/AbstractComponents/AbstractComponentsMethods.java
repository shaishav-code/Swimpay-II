package swimGDSAutomation.AbstractComponents;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import swimGDSAutomation.pageclass.ContactPage;
import swimGDSAutomation.pageclass.ManageTEUSlotsPage;
import swimGDSAutomation.pageclass.ManageTradingTermPage;
import swimGDSAutomation.pageclass.AccountManagementPage;
import swimGDSAutomation.pageclass.QuotesPage;
import swimGDSAutomation.pageclass.SellerReportPage;
import swimGDSAutomation.pageclass.UserManualPage;

public class AbstractComponentsMethods{


	WebDriver driver;
	WebDriverWait wait;

	public AbstractComponentsMethods(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Scrolling from top to bottom
	public void scrolling() {
		
       JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");
	  //js.executeScript("window.scrollBy(0, -400)");
	}

	//Scrolling till particular webelement
	public void scrollToElement(WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	//For Holding the code
	public void waitCode() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	
	//Scrolling
	public void scrollBy() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
	}
	
	//Click hidden element
	public void ClickhiddenElement(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].click();", ele);
	}
	
	//To get PageTitle
	public String titleOfPage()
	{
		 String Pagetitle = driver.getTitle();	 
		 return Pagetitle;
	}	
	
	//To get currentURL
	public String CurrentURLOfPage()
	{
		 String URL = driver.getCurrentUrl();
		 return URL;
	}	
	
	//Window handling
	public void Windowhandling(int j)
	{
	    String parentid = driver.getWindowHandle();
		System.out.println("Parent id is :"+parentid);
		Set<String> allwinid = driver.getWindowHandles();
	    System.out.println("All windows ID :" +driver.getWindowHandles());

        int numberofid = allwinid.size();
		
		int i =0;
		String [] winid = new String[numberofid];
		
		for(String id:allwinid)
		{
			winid[i]=id;
			i++;
		}
		
		driver.switchTo().window(winid[j]);//1
		
	}
	
	//Select dropdown
	public void Selectdropdown(WebElement ele, String s)
	{
		Select select = new Select(ele);
		select.selectByVisibleText(s);
	}
	
    //Verify Validation on page
    @FindBy(xpath="//*[@class='page-title-wrapper']")
    private WebElement pageheadline;
    
    public String Validationonpage()
    {
    	return pageheadline.getText();
    }
	
    //Verify if user got the success message
    @FindBy(xpath="//*[@class='alert alert-success']")
    private WebElement successmessage;

    public boolean Success_message()
    {
    	return successmessage.isDisplayed();
    }
	
    //Verify if user got the failed validation
    @FindBy(xpath="//*[@class='alert alert-danger']")
    private WebElement failmessage;

    public boolean failed_message()
    {
    	return failmessage.isDisplayed();
    }
    
   
	public void waitTimeForWebElementListToAppear(List<WebElement> eleListAppear) 
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElements(eleListAppear));
	}
	
    public void waitTimeForElementToClickable(WebElement eleClick) 
    {
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(eleClick));
	}

	
	//click on Next button
	@FindBy(xpath="//*[text()='Next']")
	private WebElement nextbtn;
	
	public void Nextbutton()
	{
		nextbtn.click();	
	}
	
	//Verify if Next button is enabled or not
	public boolean Nextbtn_enabled()
	{
		return nextbtn.isEnabled();
	}
	
	//Click on Logout Button
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	private WebElement logoutbutton;
	
	public void Logoutbtn()
	{
		logoutbutton.click();
	}
	
	//Click on back button
	@FindBy(xpath="//*[@class='txt-back']")
	private WebElement backoption;
	
	public void Backoption()
	{
		backoption.click();
	}
	            //////////Contact Us Page////////////////
	
	@FindBy(xpath="//*[@class='collapsed sidebar-link']//span[text()='Contact Us']")
	private WebElement contactus_menu;
	
	public ContactPage ContactOption()
	{
		contactus_menu.click();
		ContactPage contactpage = new ContactPage(driver);
		return contactpage;
	}
	
	@FindBy(xpath="//*[@id='summary']")
    private WebElement validation;
    
    //Validation on Loginpage
    public String Validation_Loginpage()
    {
    	return validation.getText();
    }
    
    //Click on Back button
    @FindBy(xpath="//*[text()='Back']")
    private WebElement backbtn;
    
    public void Clickback()
    {
    	backbtn.click();
    }
    
    //Click on cross arrow to cancel the popup
    @FindBy(xpath="//*[@class='close']")
    private List<WebElement> crossarrow;
    
    public void Click_crossarrow(int i)
    {
    	crossarrow.get(i).click();
    }
    
	@FindBy(xpath="//*[text()='Yes']")
	private WebElement yes_btn;
	
	//Verify if user is able to click on Yes button
	public void Click_yes_btn()
	{
		yes_btn.click();
	}
	
	@FindBy(xpath="//*[text()='No']")
	private WebElement no_btn;
	
	//Verify if user is able to click on No button
	public void Click_no_btn()
	{
		no_btn.click();
	}    
    
                     ////////////Quotes Page///////////////////////
     
    @FindBy(xpath="(//*[text()='Quotes'])[1]")
	private WebElement quotes_menu;
	
	public QuotesPage QuotesOption()
	{
		quotes_menu.click();
		QuotesPage quotespage = new QuotesPage(driver);
		return quotespage;
	}
	
	
                     //////////My Account Management Page////////////////
    
    @FindBy(xpath="//*[text()='Account Management']")
    private WebElement accountmanagement_menu;

    public AccountManagementPage AccountManagementOption()
    {
    	accountmanagement_menu.click();
        AccountManagementPage accountmanagement = new AccountManagementPage(driver);
        return accountmanagement;
    }
    
	
                    //////////Manage Trading Terms////////////////

    @FindBy(xpath="//*[@title='Manage Trading Terms']")
    private WebElement managetradingterms;

    public ManageTradingTermPage ManageTradingTermOption()
    {
    	managetradingterms.click();
        ManageTradingTermPage managetradingterms = new ManageTradingTermPage(driver);
        return managetradingterms;
    }

                    ////////////User Manual////////////////////

    @FindBy(xpath="//*[@title='User Manual']")
    private WebElement usermanual;

    public UserManualPage UserManualOption()
    {
    	usermanual.click();
        UserManualPage usermanualpage = new UserManualPage(driver);
        return usermanualpage;
    }
    
                  ////////////Seller Reports////////////////////

    @FindBy(xpath="//*[@title='Seller Reports']")
    private WebElement sellerreports;

    public SellerReportPage SellerReportPageOption()
    {
    	sellerreports.click();
        SellerReportPage sellerreportspage = new SellerReportPage(driver);
        return sellerreportspage;
    }
    
    
                  ////////////Manage TEU Slots////////////////////

    @FindBy(xpath="//*[text()='Manage TEU Slots']")
    private WebElement manageTEUslots;

    public ManageTEUSlotsPage ManageTEUSlotsPageOption()
    {
    	manageTEUslots.click();
        ManageTEUSlotsPage manageTEUslotspage = new ManageTEUSlotsPage(driver);
        return manageTEUslotspage;
    }

}

	

	
