package swimGDSAutomation.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class ForgetPasswordPage extends AbstractComponentsMethods{

	WebDriver driver;
	
	public ForgetPasswordPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Forgot Password?']")
	private WebElement assertion_forgetpage;
	
	@FindBy(xpath="//*[@name='email']")
	private WebElement forgetpassword_email;
	
	@FindBy(xpath="//*[text()='Next']")
	private WebElement nextbtn;
	
	@FindBy(xpath="//*[@class='question']")
	private WebElement assertion_securityQue;
	
	//Assertion on Forget page
	public String Forgetpage()
	{
		return assertion_forgetpage.getText();
    }
	
	//Verify if user is able to enter the Valid email Id in Forget password page
	public void Enter_email(String email)
	{
		forgetpassword_email.sendKeys(email);	
    }
	
	//click on Next button
	public void Nextbutton()
	{
		nextbtn.click();	
	}
	
	//Assertion on Security question page
	public boolean SecurityQues()
	{
		return assertion_securityQue.isDisplayed();
    }
		
	
	
}