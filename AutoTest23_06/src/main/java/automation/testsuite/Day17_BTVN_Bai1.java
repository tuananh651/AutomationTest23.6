package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day17_BTVN_Bai1 extends CommonBase {

	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver(CT_PageURLs.URL_MEDIAMART);
	}

	@Test
	public void handleGuiTinNhan() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Gửi tin nhắn']")));
		click(By.xpath("//div[text()='Gửi tin nhắn']"));
		if (driver.findElement(By.xpath("//button[text()='Để lại tin nhắn']")).isDisplayed()) {
			assertTrue(isElementVisibility(By.xpath("//button[text()='Để lại tin nhắn']")));
		} else {
			assertTrue(isElementVisibility(By.xpath("//button[text()='Tiếp tục chat']")));
		}

	}

}
