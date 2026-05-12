package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllModuleReportPage extends BasePage {

	public AllModuleReportPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='All Module Report']")  
	WebElement textPlainAllModuleReport;
	
	@FindBy(how=How.XPATH,using="//input[@id='search']")  
	WebElement btnSearch;
	
	public boolean displayPlainTextAllModuleReport() {
		try {
			return textPlainAllModuleReport.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void clickSearch() {
		btnSearch.click();
	}
	
}
