package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day16_BTVN_Bai2_Testsuite extends CommonBase{
	
	@BeforeMethod
	public void openBrowser() {
		driver = initFirefoxDriver(CT_PageURLs.URL_SELENIUMPRACTISE);
	}
	
	@Test
	public void checkAlert() {
		click(By.xpath("//button[text()='Try it']"));
		waitAlertPresent();
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Welcome to Selenium WebDriver Tutorials");
//		driver.switchTo().alert().accept();
//		pause(3000);
//		driver.switchTo().alert().dismiss();
	}

}
