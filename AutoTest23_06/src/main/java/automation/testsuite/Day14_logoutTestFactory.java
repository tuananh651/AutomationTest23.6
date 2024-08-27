package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.loginPageFactory;

public class Day14_logoutTestFactory extends CommonBase
{
	loginPageFactory loginFactory;
	loginPageFactory logoutFactory;

	@BeforeMethod
	public void openFirefox() {
		driver = initFirefoxDriver(CT_PageURLs.URL_CODESTAR);
	}

	@Test
	public void logout() throws InterruptedException {
		loginFactory = new loginPageFactory(driver);
		logoutFactory = new loginPageFactory(driver);
		loginFactory.loginFunction("admin@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//p[text()='Quản lý người dùng']")).isDisplayed());
		Thread.sleep(10000);
		logoutFactory.logoutFunction();
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());

	}

}
