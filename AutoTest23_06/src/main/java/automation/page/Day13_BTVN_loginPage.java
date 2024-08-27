package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day13_BTVN_loginPage 
{
	private WebDriver driver;

	public Day13_BTVN_loginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void Function(String email, String password)
	{
		WebElement tbEmail = driver.findElement(By.name("email"));
		if(tbEmail.isDisplayed()) tbEmail.sendKeys(email);
		
		WebElement tbPassword = driver.findElement(By.name("password"));
		if(tbPassword.isDisplayed()) tbPassword.sendKeys(password);
		
		WebElement btnDangNhap = driver.findElement(By.name("signin"));
		if(btnDangNhap.isDisplayed()) btnDangNhap.click();
	}

}
