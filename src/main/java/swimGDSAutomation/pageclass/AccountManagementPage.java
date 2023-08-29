package swimGDSAutomation.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class AccountManagementPage extends AbstractComponentsMethods {

    WebDriver driver;
	
	public AccountManagementPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@title='My Account']")
	private WebElement myaccount;
	
	@FindBy(xpath="//*[@title='Authorized Users']")
	private WebElement authorizeuser;
	
	@FindBy(xpath="//*[@title='SWiM Terms & Conditions']")
	private WebElement swimTnC;
	
	@FindBy(xpath="//*[@title='SWiM GDS Rules']")
	private WebElement swimRules;
	
	@FindBy(xpath="//*[@class='page-title-wrapper']")
	private WebElement textontitle;
	
	
	//Verify if user is able to click on My account sub-menu and capture the text
	public String Click_myaccount()
	{
		myaccount.click();
		return textontitle.getText();
	}
	
	//Verify if user is able to click on Authorize user sub-menu and capture the text
	public String Click_authorizeuser()
	{
		authorizeuser.click();
		return textontitle.getText();
	}
	
	//Verify if user is able to click on Swim GDS Terms & Condition sub-menu and capture the text
	public String Click_swimTnC()
	{
		swimTnC.click();
		return textontitle.getText();
	}
	
	//Verify if user is able to click on Swim GDS Rules sub-menu and capture the text
	public String Click_swimRules()
	{
		swimRules.click();
		return textontitle.getText();
	}
	
	             ///////////////My Account//////////////////////////
	
	@FindBy(xpath="//*[@title='My Account']")
	private WebElement Myaccount;
	

    public MyAccountPage MyAccountOption()
    {
    	Myaccount.click();
        MyAccountPage myaccountpage = new MyAccountPage(driver);
        return myaccountpage;
    }

	
                ///////////////My Account//////////////////////////

	@FindBy(xpath="//*[@title='Authorized Users']")
	private WebElement Authorizeuser;


    public AuthorizeUserPage AuthorizeUserOption()
    {
    	Authorizeuser.click();
        AuthorizeUserPage authorizeuserpage = new AuthorizeUserPage(driver);
        return authorizeuserpage;
    }   
    
    
   
}
