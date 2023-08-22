package swimGDSAutomation.AbstractComponents;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swimGDSAutomation.pageclass.ContactPage;

public class AbstractComponentsMethods{


	WebDriver driver;

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
	
	
	//To get PageTitle
	public void titleOfPage()
	{
		 String Pagetitle = driver.getTitle();
		 System.out.println(Pagetitle);
	}	
	
	//Window handling
	public void Windowhandling()
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
		
		driver.switchTo().window(winid[1]);
		
	}
	
	
	//Click on next button
	@FindBy(xpath="//*[text()='Next']")
	private WebElement nextbtn;
	
	public void Click_next()
	{
		nextbtn.click();
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


}

	

	
