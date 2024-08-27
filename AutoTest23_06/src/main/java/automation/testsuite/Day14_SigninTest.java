package automation.testsuite;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.Day14_BTVN_signin;

public class Day14_SigninTest extends CommonBase
{
	Day14_BTVN_signin signinFactory;
	
	@BeforeMethod
	public void openBrowser()
	{
		driver = initChromeDriver(CT_PageURLs.URL_ALADA);
	}
	
	@Test
	public void signinSuccessfully() throws InterruptedException
	{
		signinFactory = new Day14_BTVN_signin(driver);
		Thread.sleep(10000);
		signinFactory.signinFunction("Nguyễn Tuấn Anh", "tuandaddy183@icloud.com", "tuandaddy183@icloud.com", "12345678", "12345678", "0334118297");
		Thread.sleep(10000);
		assertTrue(driver.findElement(By.xpath("//a[text()='Khóa học của tôi' and @class='fleft martop20 khct']")).isDisplayed());
	}
	
	@Test
	public void updateInfo() throws InterruptedException
	{
		signinFactory = new Day14_BTVN_signin(driver);
		signinFactory.loginFunction("tuandaddy183@icloud.com", "12345678");
		Thread.sleep(10000);
		signinFactory.updateInfo("12345678", "87654321", "87654321");
	}
	
	@Test
	public void loginWithNewPassword()
	{
		signinFactory = new Day14_BTVN_signin(driver);
		signinFactory.loginFunction("tuandaddy183@icloud.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//a[text()='Khóa học của tôi' and @class='fleft martop20 khct']")).isDisplayed());
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
