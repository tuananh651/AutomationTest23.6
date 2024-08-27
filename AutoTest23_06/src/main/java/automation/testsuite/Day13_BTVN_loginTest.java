package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.Day13_BTVN_loginPage;

public class Day13_BTVN_loginTest extends CommonBase
{
	Day13_BTVN_loginPage login;
	Day13_BTVN_loginPage logout;
	
	@BeforeMethod
	public void openBrowser()
	{
		driver = initFirefoxDriver(CT_PageURLs.URL_CODESTAR);
	}
	
	@Test
	public void loginSuccessfully()
	{
		login = new Day13_BTVN_loginPage(driver);
		login.Function("admin@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//p[text()='Quản lý người dùng']")).isDisplayed());
	}
	
	@Test
	public void loginFail_EmailNotExist()
	{
		login = new Day13_BTVN_loginPage(driver);
		login.Function("login@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//p[text()='Đăng nhập để truy cập vào hệ thống kho hàng']")).isDisplayed());
	}
	
	@Test
	public void loginFail_PasswordNotExist()
	{
		login = new Day13_BTVN_loginPage(driver);
		login.Function("admin@gmail.com", "12345623");
		assertTrue(driver.findElement(By.xpath("//p[text()='Đăng nhập để truy cập vào hệ thống kho hàng']")).isDisplayed());
	}
	
	@Test
	public void loginFail_EmailAndPasswordNotExist()
	{
		login = new Day13_BTVN_loginPage(driver);
		login.Function("login@gmail.com", "12345623");
		assertTrue(driver.findElement(By.xpath("//p[text()='Đăng nhập để truy cập vào hệ thống kho hàng']")).isDisplayed());
	}
	
	@Test
	public void logoutSuccessfully() throws InterruptedException
	{
		login = new Day13_BTVN_loginPage(driver);
		logout = new Day13_BTVN_loginPage(driver);
		login.Function("admin@gmail.com", "12345678");
		Thread.sleep(12000);
		logout.FunctionLogout();
		assertTrue(driver.findElement(By.xpath("//p[text()='Đăng nhập để truy cập vào hệ thống kho hàng']")).isDisplayed());
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
