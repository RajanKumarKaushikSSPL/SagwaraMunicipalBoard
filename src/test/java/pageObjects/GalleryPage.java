package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GalleryPage extends BasePage{

	public GalleryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//body/div[1]")
	WebElement txtPlainHomeAndGallery;
	
	public boolean isGalleryPageExists() {
		try {
		return (txtPlainHomeAndGallery.isDisplayed());
		}catch(Exception e) {
			return false;
		}
    }

}
