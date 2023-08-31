package swimGDSAutomation.pageclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class AuthorizeUserPage extends AbstractComponentsMethods{

	WebDriver driver;
	 
	public AuthorizeUserPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
             ////////////////////////Search result/////////////////////////
	
	@FindBy(xpath="//*[@id='search']")
	private WebElement searchfield;
	
	@FindBy(xpath="//*[@id='btn-search']")
	private WebElement submitbtn;
	
	@FindBy(xpath="//*[@id='listing-content-js']")
	private WebElement searchresults;
	
	@FindBy(xpath="//*[@class='btn dropdown-toggle']")
	private List<WebElement> menu_icon;
	
	@FindBy(xpath="//*[@class='dropdown-menu dropdown-menu-right show']//li")
	private List<WebElement> menu_options;
	
	@FindBy(xpath="//*[text()='Yes']")
	private WebElement yes_btn;
	
	@FindBy(xpath="//*[text()='No']")
	private WebElement no_btn;
	
	@FindBy(xpath="//*[@class='page-link']")
	private List<WebElement> pagenavigation_arrow;
	
	@FindBy(xpath="//*[@class='btn btn-primary btn-create']")
	private WebElement savechangesbtn;

	
    //verify if user is able to enter the details in search tab
	public void Enterdetails_searchtab(String user)
	{
		searchfield.sendKeys(user);
	}
	
	//verify if user is able to click on Submit button
	public void Click_submitbtn()
	{
		submitbtn.click();
	}
	
	//Verify user gets the search list after clicking on submit
	public void Searchresults()
	{
		System.out.println("Find the search list displayed :" +searchresults.getText());
	}
	//Verify if user is able to click on menu icon
	public void Click_menu(int i)
	{
		menu_icon.get(i).click();
	}
	//Verify if user is able to select the menu options
	public void Select_menu_option(String option)
	{
		for(WebElement value:menu_options)
		{
			String options = value.getText();
			System.out.println("List of menu options :" +options);

			if(options.equals(option))
			{
				value.click();
			}
		}
	}
	
	//Verify if user is able to click on Yes button
	public void Click_yes_btn()
	{
		yes_btn.click();
	}
	
	//Verify if user is able to click on No button
	public void Click_no_btn()
	{
		no_btn.click();
	}
	
	//Verify if user is able to click on Page Navigation Arrows
	public void Click_PageNavigationArrow(int i)
	{
		pagenavigation_arrow.get(i).click();
	}
	
	//Verify if user is able to edit the details and click on save changes button
	public void Click_savechanges()
	{
		savechangesbtn.click();
	}

	            ///////////////// Add New User//////////////////////
	
	@FindBy(xpath="//*[@id='create-new-js']")
	private WebElement addnewuser;
	
	@FindBy(xpath="//*[@id='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath="//*[@id='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@id='dial_code']")
	private WebElement dialcode;
	
	@FindBy(xpath="//*[@id='phone']")
	private WebElement mobilenumber;
	
	@FindBy(xpath="//*[text()='Create']")
	private WebElement createbtn;
	
	@FindBy(xpath="//*[text()='Cancel']")
	private WebElement cancelbtn;
	
	//Verify if user is able to click on add new user button on page
	public void Click_addnewuser()
	{
		addnewuser.click();
	}
	
	//Verify if user is able to enter the first name
	public void Enter_firstname(String fname)
	{
		firstname.clear();
		firstname.sendKeys(fname);
	}
	
	//Verify if user is able to enter the last name
	public void Enter_lastname(String lname)
	{
		lastname.clear();
		lastname.sendKeys(lname);
	}
	
	//Verify if user is able to enter the  email address
	public void Enter_emailId(String mail)
	{
		email.clear();
		email.sendKeys(mail);
	}
	
	//Verify if user is able to select the dial code and enter the mobile number
	public void Enter_mobilenumber(String mobile)
	{
		
		Selectdropdown(dialcode, "+213");
		mobilenumber.sendKeys(mobile);
	}	
	
	//Verify if user is able to click on Create button
	public void Click_createbtn()
	{
		createbtn.click();
	}
	
	//Verify if user is able to click on cancel button
	public void Click_cancelbtn()
	{
		cancelbtn.click();
	}

}
