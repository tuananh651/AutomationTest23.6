package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day16_BTVN_Bai3_Testsuite extends CommonBase{
	
	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver(CT_PageURLs.URL_DEMOGURU99);
	}
	
	@Test
	public void testCombined() {
		driver.findElement(By.name("cusid")).sendKeys("12345678");
		click(By.name("submit"));
		waitAlertPresent();
		String actualMessage1 = driver.switchTo().alert().getText();
		assertEquals(actualMessage1, "Do you really want to delete this Customer?");
		driver.switchTo().alert().accept();
		waitAlertPresent();
		String actualMessage2 = driver.switchTo().alert().getText();
		assertEquals(actualMessage2, "Customer Successfully Delete!");
		driver.switchTo().alert().accept();
		assertTrue(driver.findElement(By.xpath("//td[text()='Delete Customer Form']")).isDisplayed());
	}

}
