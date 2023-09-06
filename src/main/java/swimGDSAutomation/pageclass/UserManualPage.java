package swimGDSAutomation.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class UserManualPage  extends AbstractComponentsMethods{

    WebDriver driver;
	
	public UserManualPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="(//*[text()='User Manual'])[4]")
    private WebElement usermanualbtn;
    
    //Verify if user manual button is enable
    public boolean Usermanualbtn_visible()
    {
    	System.out.println("User Manual button is Enabled :" +usermanualbtn.isEnabled());
    	return usermanualbtn.isEnabled();
    }
    
    //Verify if user is able to click on User Manual button 
    public void Click_usermanualbtn()
    {
    	usermanualbtn.click();
    }
	

}
