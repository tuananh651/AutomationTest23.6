package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.loginPageFactory;

public class Day14_loginTestFactory extends CommonBase
{
	loginPageFactory loginFactory;
	@BeforeMethod
	public void openFirefox()
	{
		driver = initFirefoxDriver(CT_PageURLs.URL_CODESTAR);
	}
	
	@Test
	public void loginSuccessfully()
	{
		loginFactory = new loginPageFactory(driver);
		loginFactory.loginFunction("admin@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//p[text()='Quản lý người dùng']")).isDisplayed());
		
	}
	
	@Test
	public void loginFail_IncorrectPass()
	{
		loginFactory = new loginPageFactory(driver);
		loginFactory.loginFunction("admin@gmail.com", "123_incorrect");
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
		
	}

}
