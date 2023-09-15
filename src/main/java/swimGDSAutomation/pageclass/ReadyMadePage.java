package swimGDSAutomation.pageclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class ReadyMadePage extends AbstractComponentsMethods {

    WebDriver driver;
	
	public ReadyMadePage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	  
	            ///////////////////Balance Payable////////////////////
	
	@FindBy(xpath="//*[@title='Balances Payable']")
	private WebElement bal_payable;
	
	@FindBy(xpath="//*[@id='select-user-dropdown']")
	private WebElement selectbuyerdropdownfield;
	
	@FindBy(xpath="//*[@id='company-name']")
	private WebElement buyername;
	
	@FindBy(xpath="//*[@class='dropdown-item company-id']")
	private List<WebElement> selectbuyerdropdownlist;
	
	@FindBy(xpath="//*[@id='btn-view']")
	private WebElement viewbtn;
	
	//Verify if user is able to pass the buyername in the entry buyer field
	public void Enter_buyer(String enterbuyer)
	{
		buyername.sendKeys(enterbuyer);
	}
	
	//Verify if user is able to click on Balances payable sub-menu
	public void Click_balpayable()
	{
		bal_payable.click();
	}
	
	  //Verify if user is able to click on dropdown and print the drop down options in console
    public void Click_dropdown()
    {
       selectbuyerdropdownfield.click();
       for(int i=1; i<selectbuyerdropdownlist.size(); i++)
		{
	      String dropdownotpions = driver.findElement(By.xpath("//*[@class='dropdown-item company-id']["+i+"]")).getText();
	      System.out.println("Drop down list option :" +dropdownotpions);
		}
    }
    
	//Verify if user is able to select the buyer name from the select Buyer drop down list
	public String Selectbuyer(String Buyername) 
	{
		for(WebElement Buyer:selectbuyerdropdownlist)
		{
			String buyername = Buyer.getText();
			//System.out.println(buyername);
			if(buyername.contains(Buyername))
			{
				Buyer.click();
			}
		}
        String actual = buyername.getAttribute("value");
		return actual;
	}
	
	//Verify if view button is enabled
	public boolean Viewbtn_enabled()
	{
		return viewbtn.isEnabled();
	}
	
	//Verify if user is able to click on view button
	public void Click_viewbtn()
	{
		 viewbtn.click();
	}
	
	
	             ////////////////Sellers Inventory Position Report//////////
	
	@FindBy(xpath="//*[@title='Sellers Inventory Position Report']")
	private WebElement sellersinventory;
	
	@FindBy(xpath="//*[@class='btn btn-primary']")
	private WebElement downloadreportbtn;
	
	//Verify if user is able to click on seller inventory position report
	public void click_sellerinventory()
	{
		sellersinventory.click();
	}
	
	//Verify if download seller inventory position report button is displayed
	public boolean Verifyreportbtn_isdisplayed()
	{
		return downloadreportbtn.isDisplayed();
	}
	
	//Verify if user is able to click on download seller inventory position report button
	public void click_downloadsellersreportbtn()
	{
		downloadreportbtn.click();
	}
	
	           //////////////////Sellers Slot Availability Trend Report/////////////
	
	@FindBy(xpath="//*[@title='Sellers Slot Availability Trend Report']")
	private WebElement sellers_slotreport;
	
	@FindBy(xpath="(//*[@class='swm-caret-up'])[1]")
	private WebElement desc_arrow;
	
	@FindBy(xpath="(//*[@class='swm-caret-down'])[1]")
	private WebElement asc_arrow;
	
	
    //Verify if user is able to click on Sellers Slot Availability Trend Report
    public void Click_sellerslotreport()
    {
        sellers_slotreport.click();
    }
    
    //Verify if user is able to click on ascending and descending arrows
    public void click_ASCnDESC()
    {
    	asc_arrow.click();
    	try {
			waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	desc_arrow.click();
    }
	
	          ///////////////Bill Of Lading & Objections Report///////////
    
	@FindBy(xpath="//*[@title='Bill Of Lading & Objections Report']")
	private WebElement Billreport;
	
	@FindBy(xpath="//*[@class='action toggle dropdown-toggle']")
	private WebElement forwarderdropdown;
	
	@FindBy(xpath="//*[@class='list-status dropdown-item']")
	private List<WebElement> forwarderdropdownlist;
	
	@FindBy(xpath="//*[text()='Download a CSV']")
	private WebElement downloadCSVbtn;
	
	@FindBy(xpath="(//*[@class='swm-caret-up sorting-js '])[1]")
	private WebElement uparrow;
	
	@FindBy(xpath="(//*[@class='swm-caret-down sorting-js '])[1]")
	private WebElement downarrow;
	
	//Verify if user is able to click on Bill of lading & Objections report
	public void Click_billreport()
	{
		Billreport.click();
	}
	
    public void click_updownarrow()
    {
    	uparrow.click();
    	try {
			waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	downarrow.click();
    }
	
	//Verify if user is able to click on Forwarder dropdown field
	public void Click_forwarderdropdown()
	{
		forwarderdropdown.click();
	}
	
	//Verify if user is able to select the options from Forwarder dropdown list
	public void Selecttheoptionsfromlist(String Buyer) 
	{
		for(WebElement value:forwarderdropdownlist)
		{
			String buyer = value.getText();
			if(buyer.equals(Buyer))
			{
				value.click();
			}
		}
	}
	
	//Verify if user is able to click on Download a CSV button
	public void Click_downloadCSV()
	{
		downloadCSVbtn.click();
	}
    
}
