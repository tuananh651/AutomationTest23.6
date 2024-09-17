package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.Day15_UpdatePassword_PageFactory;

public class Day15_BTVN_Bai1 extends CommonBase
{
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_TEDU);
	}
	
	@Test(priority = 1)
	public void loginPageRise() throws InterruptedException
	{
		Day15_UpdatePassword_PageFactory updatePass = new Day15_UpdatePassword_PageFactory(driver);
		updatePass.loginFunction("tuananh.vss651@gmail.com", "87654321");
		Thread.sleep(2000);
		updatePass.updatePassword("87654321", "12345678");
		assertTrue(driver.findElement(By.xpath("//div[text()='Đổi mật khẩu thành công. Mời bạn đăng nhập lại.']")).isDisplayed());
	}
	
	@Test(priority = 2)
	public void searchASPNet() throws InterruptedException
	{
		Day15_UpdatePassword_PageFactory searchASPNet = new Day15_UpdatePassword_PageFactory(driver);
		searchASPNet.loginFunction("tuananh.vss651@gmail.com", "87654321");
		Thread.sleep(2000);
		searchASPNet.search("ASP Net");
		assertTrue(driver.findElement(By.xpath("//a[text()='Bài 52: Gửi phản hồi và gửi mail trong ASP NET sử dụng SMTP']")).isDisplayed());
		
	}
	
}
