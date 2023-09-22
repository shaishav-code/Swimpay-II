package swimGDSAutomation.pageclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import java.awt.event.KeyEvent;
import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class ManageTEUSlotsPage extends AbstractComponentsMethods{

    WebDriver driver;	
	
	public ManageTEUSlotsPage(WebDriver driver) {
	super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	  
	         /////////////////CSV File Upload////////////////
	 
	@FindBy(xpath="//*[@title='CSV File Upload']")  
	private WebElement csvfile_upload;
	
	@FindBy(xpath="//*[text()='Download CSV template file']")  
	private WebElement downloadCSVtemplates;
	
	@FindBy(xpath="//*[@id='upload_date']")  
	private WebElement specifyyearfield;
	
	@FindBy(xpath="//*[@class='dropdown-item']")  
	private List<WebElement> specifyyeardropdown;
	
	@FindBy(xpath="//*[text()='Choose File']")  
	private WebElement choosefilefield;
	
	@FindBy(xpath="//*[text()='Upload CSV']")  
	private WebElement uploadcsvbtn;
	
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
	
	//Verify if user is able to hover on the sample CSV template file button
	public void HoveronCSVtemplatefile()
	{
		Actions act = new Actions(driver);
		act.moveToElement(downloadCSVtemplates).perform();
	}
	
	//Verify if user is able to click on the sample CSV template file button
	public void DownloadCSVtemplatefile()
	{
		downloadCSVtemplates.click();
	}
	
	//Verify if user is insert the month in the field to upload CSV
	public void Enter_monthinCSVfilefield(String month)
	{
		//specifyyearfield.click();
		specifyyearfield.sendKeys(month);
	}
	
	//getAttribute
	public String Attributeondropdown()
	{
		//specifyyearfield.click();
		return specifyyearfield.getAttribute("value");
		
	}

	//Verify if user is able to click on Specify Month/Year field and print the drop down options in console
    public int Click_specifymonthfield()
    {
    	specifyyearfield.click();
       for(int i=1; i<specifyyeardropdown.size(); i++)
		{
	      String dropdownoptions = driver.findElement(By.xpath("//*[@class='dropdown-item']["+i+"]")).getText();
	      System.out.println("Drop down list option :" +dropdownoptions);
	      
		}
       return specifyyeardropdown.size();    
     }
	
	//Verify if user is able to select the  Month/Year from the dropdown
	public void Select_monthfromdropdown(String monthnyear)
	{
		for(WebElement month:specifyyeardropdown)
		{
			String buyername = month.getText();
			if(buyername.contains(monthnyear))
			{
				month.click();
			}
		}
	}
	
	//Verify if user is able to click on choose file option
	public void Click_choosefilefield()
	{
		choosefilefield.click();
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
	
/*    Verify if user is able to upload the needed file
	public void Uploadfile()
	{
		 String filePath = "/Users/c100-96/Desktop/Validfile.csv";
		choosefilefield.sendKeys(filePath);
	}  */
	
	@FindBy(xpath="//*[@class='file-name active']")
	private WebElement filenametext;
	
	//Uploaded Filename text
	public String Filename_gettext()
	{
		return filenametext.getText();
	}
	
	//Verify if user is able to click on Upload CSV button
	public void Click_uploadCSVbtn()
	{
		uploadcsvbtn.click();
	}	
	
	        ////////////////CSV File List//////////////
	
	@FindBy(xpath="//*[@title='CSV File List']")  
	private WebElement csvfile_list;
	
	@FindBy(xpath="//*[@class='file_upload']")  
	private List<WebElement> uploadfilenamecol;
	
	@FindBy(xpath="(//*[@class='swm-caret-up '])[1]")  
	private WebElement month_uparrow;
	
	@FindBy(xpath="(//*[@class='swm-caret-down active'])[1]")  
	private WebElement month_downarrow;
	
	@FindBy(xpath="(//*[@class='page-link'])[6]")
	private WebElement pagination;
	
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
	
	//Verify if user is able to click on Up arrow of month column
	public void click_uparrow()
	{
		month_uparrow.click();
	}
	
	//Verify if user is able to click on down arrow of month column
	public void click_downarrow()
	{
		month_downarrow.click();
	}

	WebElement downloadlink;
	
	//Verify if user is able to see the created Terms in list trading page
    public void Click_DownloadCSVfilelink(String filename)
    {
    	uploadfilenamecol.size();
        for (WebElement referenceElement : uploadfilenamecol) 
    	 {
    		String getreferenceElement = referenceElement.getText().toString();
    		if (getreferenceElement.contains(filename)) 
    			{
    			downloadlink = driver.findElement(RelativeLocator.with(By.xpath("//*[text()='Download CSV File']")).toRightOf(referenceElement));
    			}
         }
        downloadlink.click();
     }
	
	        ////////////////Inventory Update//////////////////
	
	@FindBy(xpath="//*[@title='Inventory Update']")  
	private WebElement inventoryupdate;
	
	@FindBy(xpath="//*[@id='voyage-number-js']")  
	private WebElement voyagefield;
	
	@FindBy(xpath="//*[@id='search-btn-js']")  
	private WebElement searchbtn;
	
	@FindBy(xpath="//*[text()='Submit']")  
	private List<WebElement> submitbtn;
	
	@FindBy(xpath="//*[@title='Up']")  
	private List<WebElement> increasearrow;
	
	@FindBy(xpath="//*[@title='Down']")  
	private List<WebElement> decreasearrow;
	
	@FindBy(xpath="//*[@id='price-tab']")  
	private WebElement priceoption;

	@FindBy(xpath="//*[@class='form-control qty-input form-number']")  
	private List<WebElement> newqty;
	
	@FindBy(xpath="//*[@class='form-control only-number-js']")  
	private List<WebElement> chargefield;
	
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
	
	//Verify if user is able to enter the voyage in the field
	public void Enter_voyage(String voyage)
	{
		voyagefield.sendKeys(voyage);
	}
	
	//Verify if user is able to click on search button
	public void Click_searchbtn()
	{
		searchbtn.click();
	}
	
	//Verify if user is able to click Arrow to increase the quantity
	public void Click_increaseqty()
	{	
		for(int j=0;j<increasearrow.size();j++)
		{
			increasearrow.get(j).click();
		}	
	}
	
	//Verify if user is able to click Arrow to increase the quantity
	public void Click_decreaseqty()
	{
		for(int j=0;j<decreasearrow.size();j++)
		{
			decreasearrow.get(j).click();
		}
		
	}
	
	
	
	//Verify if user is able to entser the new qty in the fields
	public void Enter_newqty(String quantity)
	{
		for(int i=0;i<newqty.size();i++)
		{
			newqty.get(i).sendKeys(quantity);
		}
	}
	
	//Verify if user is able to click on Submit button
	public void Click_submitbtn(int i)
	{
		submitbtn.get(i).click();
	}
	
	//Verify if user is able to click on Price option
	public void Click_Priceoption()
	{
		priceoption.click();
	}
	
	//Verify if user is able to enter the charges in the fields
	public void Enter_newcharge(String price)
	{
		for(int i=1;i<chargefield.size();i++)
		{
			System.out.println(chargefield.size());
			chargefield.get(i).sendKeys(price);
		}
	}
	

}
