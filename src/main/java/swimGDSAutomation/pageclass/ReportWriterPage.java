package swimGDSAutomation.pageclass;

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
	
	
}
