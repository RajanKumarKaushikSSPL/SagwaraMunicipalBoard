package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CitizenPage;
import pageObjects.FeedbackPage;
import testBase.BaseClass;

public class TC007_VerifyFeedbackTest extends BaseClass {
	
	@Test(groups={"Sanity","Master","Regression"})
	public void verify_FeedbackPageIsExists() throws InterruptedException {
		
		logger.info("*****Starting TC007_FeedbackTest*****");
		
		try {
		//CitizenPage
		CitizenPage cp=new CitizenPage(driver);
		
		cp.clickFeedbackLink();
		logger.info("Clicked on Feedback link..");
		
		Thread.sleep(3000);
		
		//FeedbackPage
		FeedbackPage feedbackpage=new FeedbackPage(driver);
		
		boolean targetPage=feedbackpage.isFeedbackPageExists();
		logger.info("Validating feedback page..");
		
		Assert.assertTrue(targetPage);
		
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.fail();
		}
		
		logger.info("*****Finished TC007_FeedbackTest*****");
		
	}

}
