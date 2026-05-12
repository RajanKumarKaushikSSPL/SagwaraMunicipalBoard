package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SearchPropertyPage extends BasePage {

	public SearchPropertyPage(WebDriver driver) {
		super(driver);
	}
	
	JavascriptExecutor js;
	
	@FindBy(how=How.XPATH,using="//select[@id='ward_no']")  
	WebElement drpDwnWardNo;
	
	@FindBy(how=How.XPATH,using="//input[@id='Search']")  
	WebElement btnSearch;
	
	public void selectWardNoDropDown(String option) {
		Select s=new Select(drpDwnWardNo);
		s.selectByVisibleText(option);
	}
	
	public void scrollTillSearchButton() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", btnSearch);
	}
	
	public void clickSearch() {
		btnSearch.click();
	}
	

}
