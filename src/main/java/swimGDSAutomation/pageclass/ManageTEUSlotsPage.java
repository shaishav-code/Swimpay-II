package swimGDSAutomation.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class ManageTEUSlotsPage extends AbstractComponentsMethods{

        WebDriver driver;	
	
	  public ManageTEUSlotsPage(WebDriver driver) {
	  super(driver);
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath="//*[@title='CSV File Upload']")  
	private WebElement csvfile_upload;
	
	@FindBy(xpath="//*[@title='CSV File List']")  
	private WebElement csvfile_list;
	
	@FindBy(xpath="//*[@title='Inventory Update']")  
	private WebElement inventoryupdate;
	
	//Verify if user is able to click on CSV File Upload sub-menu
	public void Click_CSVfileupload()
	{
		csvfile_upload.isDisplayed();
		if(csvfile_upload.isDisplayed()==true) {
			csvfile_upload.click();
		}
		else
		{
			System.out.println("Manage TEU Slots sub-menu are not visible");
		}
		
	}
	
	//Verify if user is able to click on CSV File List sub-menu
	public void Click_CSVfilelist()
	{
		csvfile_list.isDisplayed();
		if(csvfile_list.isDisplayed()==true) {
			csvfile_list.click();
		}
		else
		{
			System.out.println("Manage TEU Slots sub-menu are not visible");
		}
		
	}
	
	//Verify if user is able to click on CSV File List sub-menu
	public void Click_inventoryupdate()
	{
		inventoryupdate.isDisplayed();
		if(inventoryupdate.isDisplayed()==true) {
			inventoryupdate.click();
		}
		else
		{
			System.out.println("Manage TEU Slots sub-menu are not visible");
		}
		
	}
	
	    
}
