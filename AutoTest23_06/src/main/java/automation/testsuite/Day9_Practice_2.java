package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;

public class Day9_Practice_2 extends CommonBase {

	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
	}

	@Test
	public void TestCombined() {

		// Test case 0
		WebElement txtJohnSmith = driver.findElement(By.xpath("//tr[@class='usr_acn'][3]"));
		System.out.println("Txt JohnSmith is oke" + txtJohnSmith);
		// Test case 1
		WebElement txtJordanMathews = driver.findElement(By.xpath("//tr[@class='plan rit'][2]"));
		System.out.println("Txt JordanMathews is oke" + txtJordanMathews);
		// Test case 2
		WebElement txtKevinMathews = driver.findElement(By.xpath("//tr[@class='plan rit'][3]"));
		System.out.println("Txt KevinMathews is oke" + txtKevinMathews);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
