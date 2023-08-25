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
import org.openqa.selenium.support.ui.WebDriverWait;

import swimGDSAutomation.pageclass.ContactPage;
import swimGDSAutomation.pageclass.QuotesPage;

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
		js.executeScript("window.scrollBy(0, 300)");
	  //js.executeScript("window.scrollBy(0, -400)");
	}

	//Scrolling till prticular webelement
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
	
	public void ClickhiddenElement(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", ele);
	}
	
	//To get PageTitle
	public void titleOfPage()
	{
		 String Pagetitle = driver.getTitle();
		 System.out.println("Title of Current page is :" +Pagetitle);
	}	
	
	//Window handling
	public void Windowhandling(int j)
	{
	    String parentid = driver.getWindowHandle();
		System.out.println("Parent id is :"+parentid);
		Set<String> allwinid = driver.getWindowHandles();

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
	
	public void waitTimeForWebElementListToAppear(List<WebElement> eleListAppear) 
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElements(eleListAppear));
	}
	
	@FindBy(xpath="//*[text()='Next']")
	private WebElement nextbtn;
	
	//click on Next button
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
    
    
    @FindBy(xpath="//*[text()='Back']")
    private WebElement backbtn;
    
    //Click on Back button
    public void Clickback()
    {
    	backbtn.click();
    }
                     //////////Contact Us Page////////////////
     
    @FindBy(xpath="(//*[text()='Quotes'])[1]")
	private WebElement quotes_menu;
	
	public QuotesPage QuotesOption()
	{
		quotes_menu.click();
		QuotesPage quotespage = new QuotesPage(driver);
		return quotespage;
	}



}

	

	
