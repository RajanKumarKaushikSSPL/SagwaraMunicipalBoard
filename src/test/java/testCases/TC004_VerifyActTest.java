package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ActAndCircularListPage;
import pageObjects.CitizenPage;
import testBase.BaseClass;

public class TC004_VerifyActTest extends BaseClass {

	@Test(groups={"Sanity","Master","Regression"})
	public void verify_ActPageIsExists() throws InterruptedException {
		
		logger.info("*****Starting TC004_ActTest*****");
		
		try {
		//CitizenPage
		CitizenPage cp=new CitizenPage(driver);
		
		cp.clickActLink();
		logger.info("Clicked on Act link..");
		
		Thread.sleep(3000);
		
		//ActAndCircularListPage
		ActAndCircularListPage aaclp=new ActAndCircularListPage(driver);
		
		boolean targetPage=aaclp.isAndActAndCircularListPageExists();
		logger.info("Validating acts & circular list page..");
		
		Assert.assertTrue(targetPage);
		
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.fail();
		}
		
		logger.info("*****Finished TC004_ActTest*****");
		
	}
}
