package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CitizenPage;
import pageObjects.ContactPage;
import testBase.BaseClass;

public class TC006_VerifyContactTest extends BaseClass{
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_ContactPageIsExists() throws InterruptedException {
		
		logger.info("*****Starting TC006_ContactTest*****");
		
		try {
		//CitizenPage
		CitizenPage cp=new CitizenPage(driver);
		
		cp.clickContactLink();
		logger.info("Clicked on Contact link..");
		
		Thread.sleep(3000);
		
		//ContactPage
		ContactPage contactpage=new ContactPage(driver);
		
		boolean targetPage=contactpage.isContactPageExists();
		logger.info("Validating contact page..");
		
		Assert.assertTrue(targetPage);
		
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.fail();
		}
		
		logger.info("*****Finished TC006_ContactTest*****");
		
	}

}
