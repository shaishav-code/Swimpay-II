package swimGDSAutomation.pageclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class StandardDocumentsPage extends AbstractComponentsMethods{

	WebDriver driver;
	
	public StandardDocumentsPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	      
	            //////////////////////////Upload T&C's///////////////////////
	
	@FindBy(xpath="//*[@title=\"Upload T&C's\"]")
	private WebElement uploadTnCsubmenu;
	
	@FindBy(xpath="//*[@id='version']")
	private WebElement versionnofield;
	
	@FindBy(xpath="//*[@id='version-error']")
	private WebElement validation_versionfield;
	
	@FindBy(xpath="//*[@id='effect_date']")
	private WebElement datefield;
	
	@FindBy(xpath = "//div[@class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all']/div[1]/div[2]")
	private WebElement month1;
	
	@FindBy(xpath = "//div[@class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all']/div[1]/div[3]/a[1]")
	private WebElement nextbtn;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td/a")
	private List<WebElement> Dates;
	
	@FindBy(xpath = "//*[@class='custom-file-label']")
	private WebElement fileuploadfield;
	
	@FindBy(xpath = "//*[@id='upload-btn']")
	private WebElement uploadfilebtn;
	
	//Click on Upload T&C's submenu
	public void Click_uploadTnCsubmenu()
	{
		uploadTnCsubmenu.click();
	}
	
	//Enter Version in field
	public void Enter_version(String version)
	{
		versionnofield.sendKeys(version);
	} 
	
	//Validation on enter Version field
	public String Validation_versionnield()
	{
		return validation_versionfield.getText();
	} 
	
	//Click on Effective date field
	public void Click_datefield()
	{
		datefield.click();
	} 
	
	//Click on Effective date field
	public void Enterdateinfield(String date)
	{
		datefield.sendKeys(date);
	} 
	
	//Verify if user is able to click on date picker and able to select the date
    public void SelectdatenMonth(String month, String day) {
		while (!month1.getText().equalsIgnoreCase(month)) {
			waitTimeForElementToClickable(nextbtn);
			nextbtn.click();
		}
		for(WebElement value:Dates)
		{
			String dayvalue  = value.getText();	
			if(dayvalue.equals(day))
			{
				value.click();
			}
		}
	}
    
    //Click on file upload field
    public void Click_uploadfilefield()
    {
    	fileuploadfield.click();
    }
    
    //Verify if user is able to upload the needed file
  	public void Uploadfile(String filePath) throws AWTException
  	{
  		   Robot robot = new Robot();
  	       String localFilePath = filePath;
  		   // Copy the file path to the clipboard
  		   StringSelection stringSelection = new StringSelection(localFilePath);
  	       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
  	       //Use Command (⌘) + V to paste the file path (adjust for Mac)
  	       robot.keyPress(KeyEvent.VK_CONTROL); // Command key
  	       robot.keyPress(KeyEvent.VK_V); // V key
  	       robot.keyRelease(KeyEvent.VK_V); // Release V key
  	       robot.keyRelease(KeyEvent.VK_CONTROL); // Release Command key       
  	       // Press Enter to confirm the file selection (adjust for Mac)
  	       robot.keyPress(KeyEvent.VK_ENTER);
  	       robot.keyRelease(KeyEvent.VK_ENTER);
  	}	
  	
    //Upload T&C btn is enabled or not
    public boolean Enabled_uploadBtn()
    {
    	return uploadfilebtn.isEnabled();
    }
    
    //Click on upload T&C btn
    public void Click_uploadTnCbtn()
    {
    	uploadfilebtn.click();
    }
	
	                   ///////////////////View T&C's History////////////////////////
	
	@FindBy(xpath="//*[@title=\"View T&C's History\"]")
	private WebElement viewTnCsubmenu;
	
	@FindBy(xpath = "//*[@id=\"document__view-standard\"]//td")
	private List<WebElement> eachrow;
	
	//Click on View T&C's History submenu
	public void Click_viewTnCsubmenu()
	{
		viewTnCsubmenu.click();
	}
	
	
	WebElement viewicon;
	
	//Verify if user is able to click on eye icon
    public void Click_eyeicon(String version)
    {
    	eachrow.size();
        for (WebElement referenceElement : eachrow) 
    	 {
    		String getreferenceElement = referenceElement.getText().toString();
    		if (getreferenceElement.contains(version)) 
    			{
    			viewicon = driver.findElement(RelativeLocator.with(By.xpath("//*[@class='checkFile swm-eye tooltip-wrap']")).toRightOf(referenceElement));
    			}
         }
        viewicon.click();
     }
	
    WebElement downloadicon;
	
	//Verify if user is able to click on download icon
    public void Click_Downloadicon(String version)
    {
    	eachrow.size();
        for (WebElement referenceElement : eachrow) 
    	 {
    		String getreferenceElement = referenceElement.getText().toString();
    		if (getreferenceElement.contains(version)) 
    			{
    			downloadicon = driver.findElement(RelativeLocator.with(By.xpath("//*[@class='swm-download tooltip-wrap']")).toRightOf(referenceElement));
    			}
         }
        downloadicon.click();
     }
	
	
	          ////////////////////////////Upload Forms//////////////////////////
    
	@FindBy(xpath="//*[@title='Upload Forms']")
	private WebElement uploadformssubmenu;
	
	@FindBy(xpath="//select[@id='document_type']")
	private WebElement selectdocfield;
	
	
	//Click on Upload Form submenu
	public void Click_uploadformssubmenu()
	{
		uploadformssubmenu.click();
	}
	
	//Click on Select document form field 
	public void Click_Selectdocumentfield()
	{
		selectdocfield.click();
	}
	
	//Select options from Select document dropdown
	public void Selectoptionsfromdropdown(String formtype)
	{
		Selectdropdown(selectdocfield, formtype);
	}
	
                //////////////////////////////View Forms History/////////////////////////////
	
	
	
	@FindBy(xpath="//*[@title='View Forms History']")
	private WebElement viewformsubmenu;
	
	@FindBy(xpath="//*[@id='tab-view-rules-1']")
	private WebElement tab1;
	
	@FindBy(xpath="//*[@id='view-rules-1']//td")
	private List<WebElement> commonrow_tab1;
	
	@FindBy(xpath="//*[@id='tab-view-rules-2']")
	private WebElement tab2;
	
	@FindBy(xpath="//*[@id='view-rules-2']//td")
	private List<WebElement> commonrow_tab2;
	
	@FindBy(xpath="//*[@id='tab-view-rules-3']")
	private WebElement tab3;
	
	@FindBy(xpath="//*[@id='view-rules-3']//td")
	private List<WebElement> commonrow_tab3;
	
	@FindBy(xpath="//*[@id='tab-view-rules-4']")
	private WebElement tab4;
	
	@FindBy(xpath="//*[@id='view-rules-4']//td")
	private List<WebElement> commonrow_tab4;
	
	//Click on View Form submenu
	public void Click_viewformsubmenu()
	{
		viewformsubmenu.click();
	}
	
	//Click on SOC CSC Certification & Identity Form tab
	public void Click_SOCtab1()
	{
		tab1.click();
	}
	
	//Click on SOC Indemmnity Form tab
	public void Click_SOCtab2()
	{
		tab2.click();
	}
	
	//Click on Hazardous Goods Declaration tab
	public void Click_SOCtab3()
	{
		tab3.click();
	}
	
	//Click on Forwarding Instructions Form tab
	public void Click_SOCtab4()
	{
		tab4.click();
	}
	
	WebElement viewiconinViewformsubmenu;
	
	//Verify if user is able to click on eye icon
    public void Click_eyeiconinViewformsubmenu(List<WebElement> ele, String version)
    {
    	ele.size();
        for (WebElement referenceElement : ele) 
    	 {
    		String getreferenceElement = referenceElement.getText().toString();
    		if (getreferenceElement.contains(version)) 
    			{
    			viewiconinViewformsubmenu = driver.findElement(RelativeLocator.with(By.xpath("//*[@class='checkFile swm-eye tooltip-wrap']")).toRightOf(referenceElement));
    			}
         }
        viewiconinViewformsubmenu.click();
     }
	
    WebElement downloadicon_inViewformsubmenu;
	
	//Verify if user is able to click on download icon
    public void Click_DownloadiconinViewformsubmenu(List<WebElement> ele, String version)
    {
    	ele.size();
        for (WebElement referenceElement : ele) 
    	 {
    		String getreferenceElement = referenceElement.getText().toString();
    		if (getreferenceElement.contains(version)) 
    			{
    			downloadicon_inViewformsubmenu = driver.findElement(RelativeLocator.with(By.xpath("//*[@class='swm-download tooltip-wrap']")).toRightOf(referenceElement));
    			}
         }
        downloadicon_inViewformsubmenu.click();
     }
	
    //Click on Eye icon in Tab1
  	public void Click_eyeicon_inTab1(String version)
  	{
  		Click_eyeiconinViewformsubmenu(commonrow_tab1,version);
  	}
  	
   //Click on download icon in Tab1
  	public void Click_downlaodicon_inTab1(String version)
  	{
  		Click_DownloadiconinViewformsubmenu(commonrow_tab1,version);
  	}
  	
    //Click on Eye icon in Tab2
  	public void Click_eyeicon_inTab2(String version)
  	{
  		Click_eyeiconinViewformsubmenu(commonrow_tab2,version);
  	}
  	
    //Click on download icon in Tab2
  	public void Click_downlaodicon_inTab2(String version)
  	{
  		Click_DownloadiconinViewformsubmenu(commonrow_tab2,version);
  	}
  	
  	 //Click on Eye icon in Tab3
  	public void Click_eyeicon_inTab3(String version)
  	{
  		Click_eyeiconinViewformsubmenu(commonrow_tab3, version);
  	}
  	
    //Click on download icon in Tab3
  	public void Click_downlaodicon_inTab3(String version)
  	{
  		Click_DownloadiconinViewformsubmenu(commonrow_tab3,version);
  	}
  	
  	 //Click on Eye icon in Tab4
  	public void Click_eyeicon_inTab4(String version)
  	{
  		Click_eyeiconinViewformsubmenu(commonrow_tab4,version);
  	}
  	
    //Click on download icon in Tab4
  	public void Click_downlaodicon_inTab4(String version)
  	{
  		Click_DownloadiconinViewformsubmenu(commonrow_tab4,version);
  	}
}
