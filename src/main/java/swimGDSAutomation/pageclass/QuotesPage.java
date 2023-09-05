package swimGDSAutomation.pageclass;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class QuotesPage extends AbstractComponentsMethods {

	WebDriver driver;


	public QuotesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='nav-cocs-tab']")
	private WebElement carriercontainer;
	
	@FindBy(xpath="//*[@id='nav-soc-tab']")
	private WebElement shippercontainer;
	
	@FindBy(xpath="//*[@class='buyer_name']")
	private WebElement quotes;
	
	@FindBy(xpath="(//*[@class='js-scroll-table'])[1]")
	private WebElement slider;
	
	@FindBy(xpath="//*[@class='btn dropdown-toggle action toggle']")
	private WebElement dropdown;
	
	@FindBy(xpath="//*[@class='dropdown-item']")
	private List<WebElement> dropdownoptions;
	
	@FindBy(xpath="//*[@class='table table-listing']//*[@class='quote_bcn_id']")//(//*[@class='table table-listing']//*[@class='quote_bcn_id'])[1]
	private List<WebElement> carrierquote;
	
	@FindBy(xpath="(//*[@id='soc-table']//*[@class='voyage_number'])[1]")//*[@class='table table-listing'])[2]
	private WebElement shipperquotes;
	
	@FindBy(xpath="(//*[@class='type'])[33]")
	private WebElement scrollvertical;
	
	@FindBy(xpath="(//*[@class='js-scroll-table'])[1]")
	private WebElement scroll;
	
	@FindBy(xpath="//*[text()='Submit Quote']")
	private WebElement submitbtn;
	
	@FindBy(xpath="//*[text()='Origin Charges is required']")
	private WebElement error_origincharge;
	
	@FindBy(xpath="//*[text()='Ocean Freight is required']")
	private WebElement error_oceanfreight;
	
	@FindBy(xpath="//*[text()='Destination Charges is required']")
	private WebElement error_destinationcharges;
	
    @FindBy(xpath="(//*[@class='collapse-btn collapsed'])[1]")
    private WebElement arrowbtn;

    //Click on Carrier section
    public void Click_carriercontainer()
    {
    	carriercontainer.click();
    }
    
    //Click on Shipped section
    public void Click_shippercontainer()
    {
    	shippercontainer.click();
    }
    

    public void Available_carriercontainer_quotes()
    {
    	if(quotes.isDisplayed()==true) 
    	{
    		System.out.println("Quotes are available in Carrier Container");
    	}
    	else
    	{
    		System.out.println("No quotes are available in Carrier Container");
    	}
    }
    
    //Click on Carrier quotes
	public void Carrierquotes(int i)
	{
		carrierquote.get(i).click();
	}
 	
	//Click on Shipped quotes
	public void Shipperquotes()
	{
		shipperquotes.click();
	}
    
    //click on dropdown
    public void Click_dropdown()
    {
    	dropdown.click();
    }
    
    //Print the drop down options in console
    public void Select_dropdown()
    {
    	Click_dropdown();
    	for(int i=1; i<6; i++)
		{
	      String dropdownotpions = driver.findElement(By.xpath("//*[@class='dropdown-item']["+i+"]")).getText();
	      
	      System.out.println(dropdownotpions);
		
		}
    }
    
    //Selecting the dropdown by options
    public void SelectDropdownOption(String option)
    {
    	for(WebElement value:dropdownoptions)
    		{
    			String options = value.getText();    		
    			
    			if(options.equals(option))
    			{
    				value.click();
    			}
    		}
    }
    
    //Scrolling till Submit button
    public void ScrollingVertically()
    {
    	scrollToElement(scrollvertical);
        boolean enabled = submitbtn.isEnabled();
    	System.out.println("Submit button is displayed :" +enabled);
    }
    //Clicn on submit button
    public void Click_Submitbtn()
    {
    	submitbtn.click();
    }
    
    //Validation on Origin field
	public String Validation_origincharge()
	{
		return error_origincharge.getText();
	}
	
	//Validation on Ocean field
	public String Validation_oceanfrieght()
	{
		return error_oceanfreight.getText();
	}
	
	//Validation on Destination field
	public String Validation_destinationcharge()
	{
		return error_destinationcharges.getText();
	}

}

