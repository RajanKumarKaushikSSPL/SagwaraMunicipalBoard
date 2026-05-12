package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SAFReportPage extends BasePage {

	public SAFReportPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Saf Report']")  
	WebElement textPlainSAFReport;
	
	public boolean displayPlainTextSAFReport() {
		try {
			return textPlainSAFReport.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}


}
