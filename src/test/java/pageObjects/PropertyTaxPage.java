package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PropertyTaxPage extends BasePage {

	public PropertyTaxPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='search_prop']")
	WebElement btnSearch;

    public void clickBtnSearch() {
    	btnSearch.click();
    }







}
