package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HouseTaxEntryViewPage extends BasePage {

	public HouseTaxEntryViewPage(WebDriver driver) {
		super(driver);
	}
	
    JavascriptExecutor js;
	
	@FindBy(how=How.XPATH,using="//button[@id='Save']")
	WebElement btnSave;
	
	public void scrollTillSaveButton() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", btnSave);
	}
	
	public void clickSave() {
		btnSave.click();
	}

}
