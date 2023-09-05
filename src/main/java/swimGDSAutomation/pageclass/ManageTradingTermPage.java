package swimGDSAutomation.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class ManageTradingTermPage extends AbstractComponentsMethods{

	    WebDriver driver;

	    public ManageTradingTermPage(WebDriver driver) {
	    super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	    
	    @FindBy(xpath="(//*[@class='collapse-btn'])[6]")
	    private WebElement dropdownarrow;
	    
	    @FindBy(xpath="//*[@title='Create New Trading Terms']")
	    private WebElement createtradingterms;
	    
	    @FindBy(xpath="//*[@title='List Trading Terms']")
	    private WebElement listtradingterms;
	    
	    //Verify if user is able to close the Manage Trading Terms list
	    public void Close_managetradinglist()
	    {
	    	dropdownarrow.click();
	    }
	    
	    //Verify if user is able to click on Create Manage Trading Terms list
	    public void Click_createmanageterms()
	    {
	    	createtradingterms.click();
	    }
	    
	    //Verify if user is able to click on List Trading terms
	    public void Click_listterms()
	    {
	    	listtradingterms.click();
	    }
	    
		
             //////////Create New Trading Terms////////////////

       @FindBy(xpath="//*[@title='Create New Trading Terms']")
       private WebElement createnewtradingterms;

       public CreateNewTradingTermsPage CreateNewTradingTermsOption()
       {
    	   createnewtradingterms.click();
           CreateNewTradingTermsPage createnewtradingterms = new CreateNewTradingTermsPage(driver);
           return createnewtradingterms;
       }
       
             ////////////List Trading Terms////////////////

	  @FindBy(xpath="//*[@title='List Trading Terms']")
	  private WebElement Listtradingterms;

      public ListTradingTermsPage ListTradingTermsPageOptions()
      {
          Listtradingterms.click();
          ListTradingTermsPage listtradingterms = new ListTradingTermsPage(driver);
          return listtradingterms;
      }
      
      
}
