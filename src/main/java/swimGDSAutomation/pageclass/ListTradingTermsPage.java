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

public class ListTradingTermsPage extends AbstractComponentsMethods {

    WebDriver driver;

    public ListTradingTermsPage(WebDriver driver) {
    super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//*[@class='page-title-wrapper']")
    private WebElement pageheadline;
    
    @FindBy(xpath="//table[@class='table']/tbody/tr/td[1]")
    private List<WebElement> code;
    
    @FindBy(xpath="//*[@name='search']")
    private WebElement searchfield;  
    
    @FindBy(xpath="(//*[text()='Create New Terms'])[2]")
    private WebElement createnewitem_field;  
    
    @FindBy(xpath="//*[@id=\"active-confirm\"]/div/div/div/div/div[2]/h2")
    private WebElement validationonpopup; 
    
    @FindBy(xpath="(//*[text()='Yes'])[2]")
    private WebElement yesbtn;  
    
    @FindBy(xpath="(//*[text()='No'])[2]")
    private WebElement nobtn;  
    
    @FindBy(xpath="(//*[@class='page-link'])[5]")
    private WebElement pagination;  
    
    
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
    
	//Popup validation
	public String Getvalidationonpopup()
	{
		return validationonpopup.getText();
	}
	
    
    //Verify if user is able to search the terms created from the list
    public void Enterterms_search(String term)
    {
    	searchfield.sendKeys(term);
    	Actions act = new Actions(driver);
    	act.sendKeys(Keys.ENTER).perform();
    }
    
	//Verify if user is able to click on Yes button
	public void Click_yesbtn()
	{
		yesbtn.click();
	}
	
	//Verify if user is able to click on No button
	public void Click_nobtn()
	{
		nobtn.click();
	}

	//Verify if user is able to click on create new item button 
	public void Click_createnewitem()
	{
		createnewitem_field.click();
	}

	//Verify if user is able to click on pagination
	public void Click_pagination()
	{
/*		if(pagination.isEnabled()==true)
		{
			pagination.click();
		}
		else
		{
			System.out.println("No Pagination is present to click");
		}
   } */
	
	 while (true) 
	 {
	    if (!pagination.isEnabled()) 
	    {
	    	System.out.println(pagination.isEnabled());
	        break;
	    }
	    
        pagination.click();

     }
	
	}
}