package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;

public class Day11_Practice_Bai1 extends CommonBase {

	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver("http://demo.seleniumeasy.com/basic-checkbox-demo.html ");
	}

	@Test
	public void testCombined() {
		WebElement thisCheckbox = driver.findElement(By.xpath("//label[(normalize-space()='Click on this check box')]/descendant::input"));
		System.out.println("thisCheckbox is oke");
		
		WebElement defaultCheck = driver.findElement(By.xpath("//label[(normalize-space()='Default Checked')]/descendant::input"));
		System.out.println("defaultCheck is oke");
		
		WebElement defaultDisable = driver.findElement(By.xpath("//label[(normalize-space()='Default Disabled')]/descendant::input"));
		System.out.println("defaultDisable is oke");
		
		WebElement option1Checkbox = driver.findElement(By.xpath("//label[(normalize-space()='Option 1')]//following-sibling::input"));
		System.out.println("option1Checkbox is oke");
		
		WebElement option2Checkbox = driver.findElement(By.xpath("//label[(normalize-space()='Option 2')]/descendant::input"));
		System.out.println("option2Checkbox is oke");
		
		WebElement option3Checkbox = driver.findElement(By.xpath("//label[(normalize-space()='Option 3')]/child::input"));
		System.out.println("option3Checkbox is oke");
		
		WebElement option4Checkbox = driver.findElement(By.xpath("//label[text()='Option 3']/following::input/ancestor::label[text()='Option 4']"));
		System.out.println("option4Checkbox is oke");

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}