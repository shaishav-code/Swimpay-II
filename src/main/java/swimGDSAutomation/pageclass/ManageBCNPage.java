package swimGDSAutomation.pageclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class ManageBCNPage extends AbstractComponentsMethods{

	WebDriver driver;
	
	public ManageBCNPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	           ////////////////////Enter BCN Number Range////////////////
	
	@FindBy(xpath="//*[@title='Enter BCN Number Range']")
	private WebElement BCN_range;
	
	@FindBy(xpath="//*[@name='start_number']")
	private WebElement startnumberfield;
	
	@FindBy(xpath="//*[@name='end_number']")
	private WebElement endnumberfield;
	
	@FindBy(xpath="//*[text()='Submit']")
	private WebElement Submitbtn;
	
	//Click on Enter BCN Number Range sub-menu
	public void Click_BCNrangesubmenu()
	{
		BCN_range.click();
	}
	
	//Enter Starting number in the field
	public void Enter_startingnumber(String startingno)
	{
		startnumberfield.sendKeys(startingno);
	}
	
	//Enter Ending number in the field
	public void Enter_Endingnumber(String endingno)
	{
		startnumberfield.sendKeys(endingno);
	}
	
	//Click on Submit button
	public void Click_submitBtn()
	{
		Submitbtn.click();
	}
		
	
	         ////////////////////Manage BCN Numbers////////////////
	
	@FindBy(xpath="//*[@title='Manage BCN Numbers']")
	private WebElement ManageBCNno;
	
	@FindBy(xpath="//*[@class='action-menu dropdown-toggle']")
	private WebElement menubutton;
	
	@FindBy(xpath="//*[@class='btn btn-primary btn-add-range']")
	private WebElement addBCNrange_btn;
	
	@FindBy(xpath="//*[text()='Add']")
	private WebElement addbutton;
	
	@FindBy(xpath="//*[text()='Cancel']")
	private WebElement cancelbutton;
	
	@FindBy(xpath="//*[text()='Save']")
	private WebElement savebutton;
	
	@FindBy(xpath="//*[text()='No']")
	private WebElement nobtbn;
	
	@FindBy(xpath="//*[text()='Yes, Delete it']")
	private WebElement deletebtbn;
	
	@FindBy(xpath="//*[@class='dropdown-item js-change-status']")
	private List<WebElement> Actionmenu_dropdownoptions;
	
	//Click on Manage BCN number sub-menu
	public void Click_manageBCNno()
	{
		ManageBCNno.click();
	}
	
	//Click on Add BCN Number Range button
	public void Click_AddBCNRangeBtn()
	{
		addBCNrange_btn.click();
	}
	
	//Click on Add button
	public void Click_AddBtn()
	{
		addbutton.click();
	}
	
	//Click on Cancel button
	public void Click_CancelBtn()
	{
		cancelBCN.click();
	}
	
	//Click on menu button
	public void Click_menubtn()
	{
		menubutton.click();
	}	

	//Verify if user is able to select the options from the dropdown
    public void Select_dropdownoption(String action)
	{
    	menubutton.click();
    	
    	for(WebElement options:Actionmenu_dropdownoptions)
		{
			String option = options.getText();
			if(option.contains(action))
			{
				options.click();
			}
		}
	}
    
	//Click on Save button
	public void Click_SaveBtn()
	{
		savebutton.click();
	}
	
	//Click on No button
	public void Click_Nobtn()
	{
		nobtbn.click();
	}
	
	//Click on Yes button
	public void Click_Yesbtn()
	{
		deletebtbn.click();
	}
	
	
	            //////////////////////Cancel BCN///////////////
	            
	@FindBy(xpath="//*[@title='Cancel BCN']")
	private WebElement cancelBCN;
	
	@FindBy(xpath="//*[@name='bcn_number']")
	private WebElement enterBCNno;
	
	@FindBy(xpath="//*[@id='cancel-type-select']")
	private WebElement cancellationtypefield;
		
	@FindBy(xpath="//*[text()='Yes']")
	private WebElement yesbtn;
	
	@FindBy(xpath="(//*[text()='No'])[3]")
	private WebElement nobtn;
	
	//Click on Cancel BCN sub-menu
	public void Click_cancelBCN()
	{
		cancelBCN.click();
	}
	
	//Enter BCN Number in the field
	public void Enter_BCNno(String BCNno)
	{
		enterBCNno.sendKeys(BCNno);
	}
	
	//Click on  BCN Number in the field
	public void Click_BCNnofield(String BCNno)
	{
		enterBCNno.click();
	}
	
	//Click on cancellation type field
	public void click_cancellationtypedropdown()
	{
		cancellationtypefield.click();
	}
	
	//Click on No button
	public void click_Nobtn()
	{
		nobtbn.click();
	}
	
	//Click on Yes button
	public void click_Yesbtn()
	{
		yesbtn.click();
	}
	
	
              /////////////////////View BCN/////////////////
	
	@FindBy(xpath="//*[@title='View BCN']")
	private WebElement viewBCN;
	
	@FindBy(xpath="(//*[text()='View BCN'])[3]")
	private WebElement viewBCNbtn;
	
	//Click on View BCN sub-menu
	public void Click_viewBCN()
	{
		viewBCN.click();
	}
	
	//Click on View BCN button
	public void click_ViewBCNbtn()
	{
		viewBCNbtn.click();
	}
	
	 
	         /////////////////////Manage BCN////////////////
	
	@FindBy(xpath="(//*[@title='Manage BCN'])[2]")
	private WebElement manageBCNsubmenu;
	
	@FindBy(xpath="//*[@class='action toggle dropdown-toggle']")
	private List<WebElement> dropdownsfield;	

	@FindBy(xpath="//*[@class='dropdown-item booking-status ']")
	private List<WebElement> status_dropdownoptions;
	
	@FindBy(xpath="//*[@class='dropdown-item company-name ']")
	private List<WebElement> selectbuyer_dropdownoptions;
	
	@FindBy(xpath="//*[@class='dropdown-item js-action-manage']")
	private List<WebElement> menu_options;
	
	@FindBy(xpath="//*[@aria-label='Next »']")
	private WebElement pagination;
	
	@FindBy(xpath="//*[@class='swm-caret-up sorting active']")
	private WebElement descarrow;
	
	@FindBy(xpath="(//*[@class='swm-caret-down sorting'])[3]")
	private WebElement ascarrow;
	
	@FindBy(xpath="//*[@class='close']")
	private WebElement closebtn;
	
	//Click on Manage BCN sub-menu
	public void Click_manageBCNsubmenu()
	{
		manageBCNsubmenu.click();
	}
	
	//Click on Status and Select buyer field
	public void Click_dropdownfield(int i)
	{
		dropdownsfield.get(i).click();
	}
	
	//Verify if user is able to select the options from the status dropdown
    public void Select_menudropdownoption(String menuoption)
	{
    	
    	for(WebElement options:menu_options)
		{
			String status = options.getText();
			if(status.contains(menuoption))
			{
				options.click();
			}
		}
	}
	
	//Verify if user is able to select the options from the status dropdown
    public void Select_statusdropdownoption(String action)
	{ 	
    	for(WebElement options:status_dropdownoptions)
		{
			String status = options.getText();
			if(status.contains(action))
			{
				options.click();
			}
		}
	}
    
	//Verify if user is able to select the options from the Select Buyer dropdown
    public void Select_buyerdropdownoption(String action)
	{
    	menubutton.click();
    	
    	for(WebElement options:selectbuyer_dropdownoptions)
		{
			String buyername = options.getText();
			if(buyername.contains(action))
			{
				options.click();
			}
		}
	}
    
    //Verify if user is able to click on Page Navigation Arrows
  	public void Click_PageNavigationArrow()
  	{
  		try {
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
  		 catch(Exception e){
  			 System.out.println("Executing the catch block");
  		 }     
  	}
    
  //Click on Asc Arrow
    public void Click_Ascarrow()
    {
    	ascarrow.click();
    }
    
	//Click on Asc Arrow
    public void Click_Descarrow()
    {
    	descarrow.click();
    }
    
	//Click on cross icon to close the screen
	public void Click_crossicon()
	{
		closebtn.click();
	}
	
	
        /////////////////////Review Balance Shift///////////////////
	
	@FindBy(xpath="//*[@title='Review Balance Shift']")
	private WebElement reviewbalanceshift;
	
	@FindBy(xpath="//*[@class='balance-shift-top collapsed']")
	private List <WebElement> details;
	
	@FindBy(xpath="//*[@class='btn btn-secondary']")
	private WebElement declinebtbn;
	
	@FindBy(xpath="//*[@class='btn btn-primary']")
	private WebElement acceptbtbn;
	
	//Click on menu to see the details
	public void Click_toseethedetails(int i)
	{
		for(int j=0;j<details.size();j++)
		{
			details.get(j).click();
		}
	}

	//Click on Decline button
	public void Click_declinebtn()
	{
		declinebtbn.click();
	}
	
	//Click on Accept button
	public void Click_acceptbtn()
	{
		acceptbtbn.click();
	}
	
	
	
	
	
	
	
	
	@FindBy(xpath="//*[@title='Manage Alternative Voyage']")
	private WebElement manageAlternatevoyage;
	

	

	

	

	

	
	//Click on Review Balance shift sub-menu
	public void Click_reviewbalanceshift()
	{
		reviewbalanceshift.click();
	}
	
	//Click on Manage Alternate Voyage sub-menu
	public void Click_manageAlternatevoyage()
	{
		manageAlternatevoyage.click();
	}
	
}
