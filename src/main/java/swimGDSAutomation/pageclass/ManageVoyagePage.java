package swimGDSAutomation.pageclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class ManageVoyagePage extends AbstractComponentsMethods{

	WebDriver driver;
	
	public ManageVoyagePage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	                  //////////////////////List Voyage////////////////////////
	
	@FindBy(xpath="//*[@title='List Voyages']")
	private WebElement listvoyages;
	
	@FindBy(xpath="//*[@id='voyage-table']//tr//td")
	private List<WebElement> voyagecolumn;
	
	@FindBy(xpath="//*[@class='swm-cancel']")
	private WebElement cancelcross;
	
	@FindBy(xpath="//*[@class='swm-caret-up sorting active']")
	private WebElement descarrow;
	
	@FindBy(xpath="(//*[@class='swm-caret-down sorting'])[3]")
	private WebElement ascarrow;
	
	@FindBy(xpath="(//*[@class='pagination']//li)[6]")
	private WebElement pagination;
	
	@FindBy(xpath="//*[@class='btn dropdown-toggle action toggle']")
	private WebElement statusdropdown;
	
	@FindBy(xpath="//*[@class='dropdown-menu dropdown-menu-right show']//li")
	private List<WebElement> dropdownoptions;
	
	@FindBy(xpath="//*[@class='btn btn-primary d-flex justify-center items-center btn-load']")
	private WebElement loadbtn;
	
	//Click on List Voyage sub-menu
	public void Click_listvoyage()
	{
		listvoyages.isDisplayed();
		if(listvoyages.isDisplayed()==true) {
			listvoyages.click();
		}
		else
		{
			System.out.println("Manage Voyage sub-menu are not visible");
		}	
	}
	
    WebElement link;
	
	//Verify if user is able to view of Action Column
    public void Click_ViewOnActionColumn(String filename)
    {
    	voyagecolumn.size();
        for (WebElement referenceElement : voyagecolumn) 
    	 {
    		String getreferenceElement = referenceElement.getText().toString();
    		if (getreferenceElement.contains(filename)) 
    			{
    			link = driver.findElement(RelativeLocator.with(By.xpath("//*[@class='js-view-detail']")).toRightOf(referenceElement));
    			
    			}
         }
        link.click();
     }
    
    //Click cross to close the pop-up
    public void Click_crossicon()
    {
    	cancelcross.click();
    }
    
	//Verify if user is able to view of BCN Column
    public void Click_ViewOnBCNColumn(String filename) 
    {
    	voyagecolumn.size();
        for (WebElement referenceElement : voyagecolumn) 
    	 {
    		String getreferenceElement = referenceElement.getText().toString();
    		if (getreferenceElement.contains(filename)) 
    			{
    			link = driver.findElement(RelativeLocator.with(By.xpath("//*[@target='_blank']")).toRightOf(referenceElement));
    			}
         }
        link.click();
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
    
	//Click on status drop down
	public void Click_statusdropdown()
	{
		statusdropdown.click();
		for(int i=1;i<dropdownoptions.size();i++)
		{
			  String dropdownoption = driver.findElement(By.xpath("//*[@class='dropdown-item']["+i+"]")).getText();
		      System.out.println("Drop down list option :" +dropdownoption);
		}
	}
	
	//Verify if user is able to select the  Status from the dropdown
	public void Select_status(String status)
	{
		for(WebElement option:dropdownoptions)
		{
			String Status = option.getText();
			if(Status.contains(status))
			{
				option.click();
			}
		}
	}
	
	//Click on Load button
	public void Click_loadbtn()
	{
		loadbtn.click();
	}
	
	
	                  //////////////////////Cancel Voyage////////////////////////
	
	@FindBy(xpath="//*[@title='Cancel Voyage']")
	private WebElement cancelvoyage;
	
	@FindBy(xpath="//*[@class='form-control']")
	private WebElement voyagenofield;
	
	@FindBy(xpath="//*[@class='dropdown-item']")
	private List<WebElement> voyageoption;
	
	@FindBy(xpath="//*[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath="//*[text()='Submit']")
	private WebElement submitbtn;
	
	@FindBy(xpath="//*[text()='No']")
	private List<WebElement> NOoption;
	
	@FindBy(xpath="//*[text()='Yes']")
	private List<WebElement> Yesoption;
	
	public void Click_cancelvoyage()
	{
		cancelvoyage.isDisplayed();
		if(cancelvoyage.isDisplayed()==true) {
			cancelvoyage.click();
		}
		else
		{
			System.out.println("Manage Voyage sub-menu are not visible");
		}	
	}
	
	//Click on Enter Voyage number field
	public void Click_voyagenofield(String Voyage)
	{
		voyagenofield.click();
		voyagenofield.sendKeys(Voyage);
	}
	
	//Select on Voyage number from the dropdown
	public void Select_voyagenumber(String Voyagenumber)
	{
		voyagenofield.click();
		for(WebElement month:voyageoption)
		{
			String buyername = month.getText();
			if(buyername.contains(Voyagenumber))
			{
				month.click();
			}
		}
	}
	
	//Click on checkbox
	public void Select_Checkbox()
	{
		checkbox.click();
	}
	
	//Click on Submit button
	public void Click_submitbtn()
	{
		submitbtn.click();
	}
	
	//Click on Submit button
	public void Click_Nobtn(int i)
	{
		NOoption.get(i).click();
	}
	
	//Click on Submit button
	public void Click_Yesbtn(int i)
	{
		Yesoption.get(i).click();
	}
	
	
	
	
	                 ///////////////////////Change Voyage///////////////////////////
	
	
	@FindBy(xpath="//*[@title='Change Voyage Date']")
	private WebElement changevoyage;
	
	public void Click_changevoyage()
	{
		changevoyage.isDisplayed();
		if(changevoyage.isDisplayed()==true) {
			changevoyage.click();
		}
		else
		{
			System.out.println("Manage Voyage sub-menu are not visible");
		}	
	}
	
	
	
	
	
	
	
	                  /////////////////////Change Vessel//////////////////////////
	
	@FindBy(xpath="//*[@title='Change of Vessel']")
	private WebElement changevessel;
	
	public void Click_changevessel()
	{
		changevessel.isDisplayed();
		if(changevessel.isDisplayed()==true) {
			changevessel.click();
		}
		else
		{
			System.out.println("Manage Voyage sub-menu are not visible");
		}	
	}
	
	
	
	
	
}
