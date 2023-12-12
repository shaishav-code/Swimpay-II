package swimGDSAutomation.pageclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class BCNDocumentsPage extends AbstractComponentsMethods{

	WebDriver driver;
	
	public BCNDocumentsPage(WebDriver driver)
	
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id='bcn']")
	private WebElement enterbcnfield;
	
	@FindBy(xpath="//*[@class='label_suggest']")
	private List<WebElement> bcndoropdown_options;
	
	@FindBy(xpath="//*[@id='btn-view']")
	private WebElement viewbtn;
	
	@FindBy(xpath="//*[@class='upload_link']")
	private List<WebElement> links;
	
	@FindBy(xpath="//*[@id='datatable-bcn']//td[1]")
	private List<WebElement> documenttype;	
	
	@FindBy(xpath="//*[@id='check-mail']")
	private WebElement enteremailfield;
	
	@FindBy(xpath="//*[@id='btn-send']")
	private WebElement sendbtn;
	
	@FindBy(xpath="//*[@id='login']")
	private WebElement loginid;
	
	@FindBy(xpath="//*[@id='ifmail']")
	private WebElement iframe;
	
	@FindBy(xpath="//*[text()='Cancel']")
	private WebElement cancelbtn;
	
	@FindBy(xpath="//*[@class='md but pj text f24 nw']")
	private WebElement attachmentbtn;
	
	
	//Click on Enter BCN field
	public void Click_onBCNfield()
	{
		enterbcnfield.click();
	}
	
	//Enter BCN number in the field 
	public void Enter_BCNnumber(String BCN)
	{
		enterbcnfield.sendKeys(BCN);
	}
	
	//Verify if user is able to select the  BCN number from the dropdown
	public void Select_bcnnumber(String bcn)
	{
		for(WebElement option:bcndoropdown_options)
		{
			String Status = option.getText();
			if(Status.contains(bcn))
			{
				option.click();
			}
		}
	}

	//Verify if user is able to click on the links to upload the documents
	public void ClickOnActionRequiredLink(String documentname)
	{
		for(WebElement option:links)
		{
			String Status = option.getText();
			if(Status.contains(documentname))
			{
				option.click();
			}
		}
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
  	
	//Click on view button
	public boolean Enabled_viewbtn()
	{
		return viewbtn.isEnabled();
	}  	
	
	//Click on view button
	public void Clickonviewbtn()
	{
		viewbtn.click();
	}
	
	WebElement emailboxicon;
	    
    //Verify if user is able to click on Emailbox icon
    public void ClickOnEmailAction(String documentname)
	{
    	documenttype.size();
	    for (WebElement referenceElement : documenttype) 
	    {
	    	String getreferenceElement = referenceElement.getText().toString();
	    	if (getreferenceElement.contains(documentname)) 
	    		{
	    		emailboxicon = driver.findElement(RelativeLocator.with(By.xpath("//*[@class='mailLink swm-email text-blue swm-ico']")).toRightOf(referenceElement));
	    		}
	      }
	    emailboxicon.click();
	  }
    
    //Enter email address in the popup
    public void Enter_emailaddress(String email)
    {
    	enteremailfield.sendKeys(email);
    	enteremailfield.sendKeys(Keys.ENTER);
    }
    
    //Click on Cancel button in popup
    public void Click_cancelbtn()
    {
    	cancelbtn.click();;
    } 
    
    //Enable Send button 
    public boolean Enable_sendbtn()
    {
        return sendbtn.isEnabled();
    }
    
    //Click on Send button in popup
    public void Click_sendbtn()
    {
    	sendbtn.click();;
    } 
    
    //Verify if user is able to click on the attachment
 	public void Verify_attachment() throws InterruptedException
 	{
 		driver.get("https://yopmail.com/en/");
 		loginid.sendKeys("narola@yopmail.com");
 		loginid.sendKeys(Keys.ENTER);
 		driver.switchTo().frame(iframe);
 		waitCode();
 		attachmentbtn.click();
 		
 	}
    
    WebElement downloadicon;
    
    //Verify if user is able to click on download icon
    public void ClickOnDownloadAction(String documentname)
	{
    	documenttype.size();
	    for (WebElement referenceElement : documenttype) 
	    {
	    	String getreferenceElement = referenceElement.getText().toString();
	    	if (getreferenceElement.contains(documentname)) 
	    		{
	    		downloadicon = driver.findElement(RelativeLocator.with(By.xpath("//*[@class='swm-download text-blue swm-ico']")).toRightOf(referenceElement));
	    		}
	      }
	    downloadicon.click();
	  }
    
    WebElement viewicon;
    
    //Verify if user is able to click on View icon
    public void ClickOnviewAction(String documentname)
	{
    	documenttype.size();
	    for (WebElement referenceElement : documenttype) 
	    {
	    	String getreferenceElement = referenceElement.getText().toString();
	    	if (getreferenceElement.contains(documentname)) 
	    		{
	    		viewicon = driver.findElement(RelativeLocator.with(By.xpath("//*[@class='checkFile swm-eye text-blue swm-ico']")).toRightOf(referenceElement));
	    		}
	      }
	    viewicon.click();
	  }
    
    WebElement deleteicon;
    
    //Verify if user is able to click on Delete icon
    public void ClickOnDeleteAction(String documentname)
	{
    	documenttype.size();
	    for (WebElement referenceElement : documenttype) 
	    {
	    	String getreferenceElement = referenceElement.getText().toString();
	    	if (getreferenceElement.contains(documentname)) 
	    		{
	    		deleteicon = driver.findElement(RelativeLocator.with(By.xpath("//*[@class='deleteLink swm-recycle-bin text-blue swm-ico']")).toRightOf(referenceElement));
	    		}
	      }
	    deleteicon.click();
	  }
	
	
}
