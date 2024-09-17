package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day17_BTVN_Bai2 extends CommonBase{
	
	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver(CT_PageURLs.URL_MEDIAMART);
	}
	
	@Test
	public void handleIframeZalo() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Gửi tin nhắn']")));
		click(By.xpath("//div[@class='widget-preview--btn-close']"));
		
		WebElement iframeZalo = getElementPresentDOM(By.xpath("//div[@class='za-chat__head-box'"));
		driver.switchTo().frame(iframeZalo);
		System.out.println("Switch tới iframe Zalo thành công");
		click(By.xpath("//div[@class='za-chat__head-box'"));
		assertTrue(isElementVisibility(By.xpath("//div[text()='Chat bằng Zalo']")));
	}

}
