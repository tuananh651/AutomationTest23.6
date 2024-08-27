package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.*;

public class loginPageFactory 
{
	private WebDriver driver;
	
	@FindBy(id="email") WebElement textEmail;
	@FindBy(id="password") WebElement textPassword;
	@FindBy(name="signin") WebElement buttonLogin;
	
	@FindBy(xpath = "//a[(normalize-space()='Admin')]")WebElement buttonAdmin;
	@FindBy(xpath = "//form[@id='logout']")WebElement buttonLogout;
	@FindBy(xpath = "//button[text()='Đăng xuất' and @class='btn btn-success']")WebElement buttonExit;
	
	public loginPageFactory(WebDriver _driver) 
	{
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void loginFunction(String email, String pass)
	{
		textEmail.sendKeys(email);
		textPassword.sendKeys(pass);
		buttonLogin.click();
	}
	
	public void logoutFunction()
	{
		buttonAdmin.click();
		buttonLogout.click();
		buttonExit.click();
	}

}
