package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;

public class Day10_Practice_Bai3 extends CommonBase {

	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver("https://rise.fairsketch.com/events");
	}

	@Test
	public void testCombined() {
		WebElement testEvent = driver
				.findElement(By.xpath("//span[(normalize-space()='Job Training Fair')]/../../../.."));
		System.out.println("testEvent is oke");

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
