package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;

public class practiceXpathDay8 extends CommonBase {

	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver("https://automationfc.github.io/basic-form/index.html");
	}

	@Test
	public void testCombined() {
		// Test case 0
		WebElement txtNested = driver.findElement(By.id("nested"));
		System.out.println(txtNested);
		
		WebElement txtHacker = driver.findElement(By.id("hacker"));
		System.out.println(txtHacker);
		
		WebElement txtOne = driver.findElement(By.id("one"));
		System.out.println(txtOne);
		
		WebElement txtTwo = driver.findElement(By.id("two"));
		System.out.println(txtTwo);
		
		WebElement txtThree = driver.findElement(By.id("three"));
		System.out.println(txtThree);
		
		WebElement txtFour = driver.findElement(By.id("four"));
		System.out.println(txtFour);
		
		WebElement txtFive = driver.findElement(By.id("five"));
		System.out.println(txtFive);
		
		WebElement txtSix = driver.findElement(By.id("six"));
		System.out.println(txtSix);
		
		WebElement txtSeven = driver.findElement(By.id("seven"));
		System.out.println(txtSeven);
		
		WebElement txtEight = driver.findElement(By.id("eight"));
		System.out.println(txtEight);
		
		WebElement txtNine = driver.findElement(By.id("nine"));
		System.out.println(txtNine);
		
		WebElement linkQuangNam = driver.findElement(By.linkText("Quảng Nam"));
		System.out.println(linkQuangNam);
		
		WebElement linkQuangBinh = driver.findElement(By.partialLinkText("Bình"));
		System.out.println(linkQuangBinh);
		
		WebElement txtPopulation = driver.findElement(By.id("population"));
		System.out.println(txtPopulation);

		// Test case 1
		
		WebElement tbMail = driver.findElement(By.id("mail"));
		System.out.println(tbMail);

		WebElement tbMailName = driver.findElement(By.name("user_email"));
		System.out.println(tbMailName);
		
		WebElement tbPasswordId = driver.findElement(By.id("disable_password"));
		System.out.println(tbPasswordId);

		WebElement tbPasswordName = driver.findElement(By.name("disable_password"));
		System.out.println(tbPasswordName);
		
		WebElement tbNumberId = driver.findElement(By.id("number"));
		System.out.println(tbNumberId);

		WebElement tbNumberName = driver.findElement(By.name("number"));
		System.out.println(tbNumberName);
		
		WebElement rdAge1 = driver.findElement(By.id("under_18"));
		System.out.println(rdAge1);
		
		WebElement rdAge2 = driver.findElement(By.id("over_18"));
		System.out.println(rdAge2);
		
		WebElement rdAge3 = driver.findElement(By.id("radio-disabled"));
		System.out.println(rdAge3);
		
		// Test case 2
		
		WebElement txteEducation = driver.findElement(By.id("edu"));
		System.out.println(txteEducation);
		
		WebElement slider01 = driver.findElement(By.id("slider-1"));
		System.out.println(slider01);
		
		WebElement slider02 = driver.findElement(By.id("slider-2"));
		System.out.println(slider02);
		
		WebElement buttonIsDisabled = driver.findElement(By.tagName("button"));
		System.out.println(buttonIsDisabled);
			
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
