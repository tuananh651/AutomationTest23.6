package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.Day16_BTVN_Bai1_Page;

public class Day16_BTVN_Bai1_Testsuite extends CommonBase{
	
	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver(CT_PageURLs.URL_LoginAlada);
	}
	
	@Test(priority = 1)
	public void loginPageSuccessfully() {
		Day16_BTVN_Bai1_Page login = new Day16_BTVN_Bai1_Page(driver);
		login.loginPage("tuananh.vss651@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//a[text()='Khóa học của tôi' and @class='fleft martop20 khct'] ")).isDisplayed());
	}
	
	@Test(priority = 2)
	public void changePasswordSuccessfully() throws InterruptedException {
		Day16_BTVN_Bai1_Page changePassword = new Day16_BTVN_Bai1_Page(driver);
		Day16_BTVN_Bai1_Page login = new Day16_BTVN_Bai1_Page(driver);
		changePassword.loginPage("tuananh.vss651@gmail.com", "12345678");
		Thread.sleep(5000);
		changePassword.switchInformation();
		changePassword.changePassword("12345678", "@@Monday111", "@@Monday111");
		waitAlertPresent();
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Cập nhật mật khẩu mới thành công!");
	}

}
