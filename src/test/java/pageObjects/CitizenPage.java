package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class CitizenPage extends BasePage {
	
	public CitizenPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='login_button_large'][normalize-space()='Official Login']")
	WebElement btnOfficialLogin;
	
	@FindBy(how=How.XPATH,using="//a[normalize-space()='Services']")
	WebElement drpDwnServices;
	
	@FindBy(how=How.XPATH,using="//li[@class='mega_menu_li']//a[normalize-space()='UDT - Apply Self Assesment']")
	WebElement optionUDTApplySelfAssessment;
	
	@FindBy(how=How.XPATH,using="//a[@class='nav-link'][normalize-space()='Act']")
	WebElement linkAct;
	
	@FindBy(how=How.XPATH,using="//a[@class='nav-link'][normalize-space()='Gallery']")
	WebElement linkGallery;
	
	@FindBy(how=How.XPATH,using="//a[@class='nav-link'][normalize-space()='Contact']")
	WebElement linkContact;
	
	@FindBy(how=How.XPATH,using="//a[@class='nav-link'][normalize-space()='Feedback']")
	WebElement linkFeedback;
	
	public void clickBtnOfficalLogin() {
		btnOfficialLogin.click();
	}
	
	public void clickOnUDTApplySelfAssessment() throws InterruptedException {
		Actions actions=new Actions(driver);
		actions.moveToElement(drpDwnServices).perform();
		Thread.sleep(2000);
		optionUDTApplySelfAssessment.click();
	}
	
	public void clickActLink() {
		linkAct.click();
	}
	
	public void clickGalleryLink() {
		linkGallery.click();
	}
	
	public void clickContactLink() {
		linkContact.click();
	}
	
	public void clickFeedbackLink() {
		linkFeedback.click();
	}
	
	/*
	public void selectDrpDwnServices(String option) {
		Select selectservicesdropdown=new Select(drpDwnServices);
		selectservicesdropdown.selectByVisibleText(option);
	}
	*/
	

}
