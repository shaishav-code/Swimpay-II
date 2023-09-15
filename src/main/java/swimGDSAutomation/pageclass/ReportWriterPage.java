package swimGDSAutomation.pageclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swimGDSAutomation.AbstractComponents.AbstractComponentsMethods;

public class ReportWriterPage extends AbstractComponentsMethods{

    WebDriver driver;
	
	public ReportWriterPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@title='Report Writer']")
	private WebElement reportwriter;
	
	@FindBy(xpath="//*[@id='export_type']")
	private WebElement selectexporttype_dropdown;
	
	@FindBy(xpath="//*[@id='column_select']")
	private WebElement selectexportcol_dropdown;
	
	@FindBy(xpath="//*[@class='btn btn-xs btn-success']")
	private List<WebElement> rulegroup;
	
	@FindBy(xpath="//*[@class='btn btn-xs btn-primary active']")
	private WebElement and_btn;
	
	@FindBy(xpath="//*[@class='btn btn-xs btn-primary']")
	private WebElement or_btn;
	
	@FindBy(xpath="//*[@class='btn btn-xs btn-danger']")
	private List<WebElement> deletebtn;
	
	@FindBy(xpath="//select[@class='form-control']")
	private List<WebElement> exportdropdown;
	
	@FindBy(xpath="//select[@class='form-control ']")
	private List<WebElement> logicoperatordropdown;
	
	@FindBy(xpath="//input[@class='form-control']")
	private List<WebElement> enterfield;
	
	@FindBy(xpath="//*[@id='btn-get-sql']")
	private WebElement exportquerybtn;

	@FindBy(xpath="//*[@id='btn-reset']")
	private WebElement resetquerybtn;
	
	//Verify if user is able to click on Report Writer Menu
	public void Click_reportwriter()
	{
		reportwriter.click();
	}
	
	//Verify if user is able to select the options from Export type dropdown
	public void Select_exporttype()
	{
		Selectdropdown(selectexporttype_dropdown, "Coupon Report");
	}
	
	//Verify if user is able to select the options from Column to export
	public void Select_columntoexport()
	{
		Selectdropdown(selectexportcol_dropdown, "coupon code");
	}
	
	//Verify if user is able to click on delete button
	public void Click_deletebtn(int i)
	{
		deletebtn.get(i).click();
	}
	
	//Verify if user is able to click on Add rule and Add Group button
	public void addrule_group(int i)
	{
		rulegroup.get(i).click();
	}
	
	//Verify if user is able to click on AND button
	public void Click_ANDbtn()
	{
		and_btn.click();
	}
	
	//Verify if user is able to click on OR button
	public void Click_ORbtn()
	{
		or_btn.click();
	}
	
	//Verify if user is able to select the options from the Export column
	public void Select_exportoption(int i, String Export)
	{
		Selectdropdown(exportdropdown.get(i), Export);
	}
	
	//Verify if user is able to select the options from the Export column
	public void Select_logicoperator(int i, String logicoperator)
	{
		Selectdropdown(logicoperatordropdown.get(i), logicoperator);
	}
	
	//Verify if user is able to enter the value in the field
	public void Enter_valueinfield(int i, String value)
	{
		enterfield.get(i).sendKeys(value);
	}
	
	//Verify if user is able to click on Export By Query button
	public void Click_Exportbyquerybtn()
	{
		exportquerybtn.click();
	}
	
	//Verify if user is able to click on Reset Query Builder button
	public void Click_Resetquerybtn()
	{
		resetquerybtn.click();
	}
}
