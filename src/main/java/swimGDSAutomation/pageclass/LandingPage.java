package swimGDSAutomation.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class LandingPage extends AbstractComponentsMethods{

	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void launchURL() 
	{
	// driver.get("https://demo.swimgds.com/");
	 //driver.get("https://demo.swimgds.com/seller/account-question");
	 driver.get("https://demo.swimgds.com/seller/login");
	}
	
	@FindBy(xpath ="//*[text()='Seller Login / Register']")
	private WebElement  sellerLogin;
	
	@FindBy(xpath ="//*[@class='btn btn-primary']")
	private WebElement  login;
	
	@FindBy(xpath="//*[text()='Seller Login']")
	private WebElement logintext;

	@FindBy(xpath ="//*[text()='Create Seller Account']")
	private WebElement registertext;
	
	@FindBy(xpath ="//*[@class='txt-back']")
	private WebElement backtext;
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement login_email;
	
	@FindBy(xpath="//*[@id='password']")
	private WebElement login_password;

	@FindBy(xpath="//*[@class='swim-icon swm-eye showPass']")
	private WebElement login_eyeicon;
	
	@FindBy(xpath="//*[@class='remember-me']")
	private WebElement login_rememberme;
	
	@FindBy(xpath="//*[@class='btn text-center d-inline-block btn-primary text-capitalize']")
	private WebElement loginbutton;
	
	
	
	                    //ContactPage//
//	@FindBy(xpath="//*[@class='collapsed sidebar-link']//span[text()='Contact Us']")
//	private WebElement contactus_menu;
	
	
	public void SellerLogin()
	{	
		
		sellerLogin.click();
		scrolling();
	}
	
	public void Loginpage()
	{
		login.click();
		String LogText = logintext.getText();
		System.out.println("Visible is " +  LogText);
		//driver.navigate().back();
	}
	
	
	@FindBy(xpath = "//*[@class='btn btn-secondary']")
	private WebElement registerbtn;
	
	public RegisterPage registerpage_Option() {
	registerbtn.click();
	RegisterPage registerpage = new RegisterPage(driver);
	return registerpage;
}
	public void Registerpage()
	{
		registerpage_Option();
		String RegText = registertext.getText();
		System.out.println("Visible is " + RegText);
		driver.navigate().back();
	}
	
	//Verify if user is able to click on back arrow
	public void Click_backarrow()
	{
		backtext.click();
	}
	
	//Login method
	public void Enter_logincredentials(String email)
	{
		login_email.sendKeys(email);
		login_password.sendKeys("Nikhil@86");
		login_eyeicon.click();
		login_rememberme.click();
	}
	
	
	//Verify if user is able to enter the Email Id
	public void Enter_useremail(String emailid)
	{
		login_email.sendKeys(emailid);
	}
	
	//verify if user is able to enter the Password
	public void Enter_password(String pass)
	{
		login_password.sendKeys(pass);
	}
	//Verify if User is able to do click on Password shown icon
	public void Click_PassEye()
	{
		login_eyeicon.click();
	}
	
	//Verify if user is able to click on forget password
	public void Forgetpassword()
	{
		forgetpasswordlink.click();
	}
	
	//Verify if user is able to select the remember me checkbox
	public boolean Select_rememberme()
	{
		login_rememberme.click();
		return login_rememberme.isSelected();
	}
	
	
	@FindBy(xpath="//*[@class='txt-back']")
	private WebElement backoption;
	
	public boolean Loginpage_assertion()
	{
		return backoption.isDisplayed();
	}
	
	@FindBy(xpath="(//*[text()='Home'])[1]")
	private WebElement assertion;
	
	//Assertion check on Dashboard
	public String Assertion_ondashboard()
	{
		return assertion.getText();
	}
	
	//Verify if user is able to do click on login button
    public void Loginbtn()
    {
    	loginbutton.click();
    }
    
    ////////////////Forget Password//////////////
    
    @FindBy(xpath="//*[@class='forgot-password text-decoration-none']")
	private WebElement forgetpasswordlink;
    
    public ForgetPasswordPage ForgetPasswordOption()
    {
    	forgetpasswordlink.click();
    	ForgetPasswordPage forgetpassword = new ForgetPasswordPage(driver);
    	return forgetpassword;
    }
    
    //////////Authorize User Forget Password///////////
    
    @FindBy(xpath="//*[@class='forgot-password text-decoration-none']")
    private WebElement authforgetpasswordlink;

    public AuthorizeUserForgetPasswordPage AuthForgetPasswordOption()
    {
        authforgetpasswordlink.click();
        AuthorizeUserForgetPasswordPage authforgetpassword = new AuthorizeUserForgetPasswordPage(driver);
        return authforgetpassword;
    }

    /*	public ContactPage ContactOption()
	{
		contactus_menu.click();
		ContactPage contactpage = new ContactPage(driver);
		return contactpage;
	} */

	public void reused()
	{
		Enter_useremail("nayan");
		
	}
}
