package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;

public class Day9_Practice_1 extends CommonBase {

	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
	}

	@Test
	public void TestCombined() {

		// Test case 0
		WebElement tbUserName = driver.findElement(By.xpath("//input[@class='selectors-input jsSelector'][1]"));
		System.out.println("Textbox UserName is oke" + tbUserName);
		// Test case 1
		WebElement tbPassWord = driver.findElement(By.xpath("//input[@class='selectors-input jsSelector'][2]"));
		System.out.println("Textbox PassWord is oke" + tbPassWord);
		// Test case 2
		WebElement tbCompany = driver.findElement(By.xpath("//div[2]//input[@name='company']"));
		System.out.println("Textboxn Company is oke" + tbCompany);
		// Test case 3
		WebElement tbMobileNumber = driver.findElement(By.xpath("//div[2]//input[@name='mobile number']"));
		System.out.println("Textbox Mobile number is oke" + tbMobileNumber);
		// Test case 4
		WebElement btnSubmit = driver.findElement(By.xpath("//div[2]//input[@name='company']"));
		System.out.println("Button Submit is oke" + btnSubmit);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
