package automation.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.*;

public class Day15_UpdatePassword_PageFactory 
{
	private WebDriver driver;
	
	@FindBy(name="UserName") WebElement textEmail;
	@FindBy(name="Password") WebElement textPassword;
	@FindBy(xpath="//button[text()='Đăng nhập']") WebElement buttonLogin;
	@FindBy(id="onesignal-slidedown-cancel-button") WebElement cancelButton;
	@FindBy(xpath="//li[@id='my_account']") WebElement btnMyAcount;
	@FindBy(xpath="//a[@title='Đổi mật khẩu']") WebElement btnDoiMatKhau;
	
	@FindBy(name="OldPassword") WebElement txtOldPassword;
	@FindBy(name="NewPassword") WebElement txtNewPassword;
	@FindBy(name="ConfirmNewPassword") WebElement txtCNewPassword;
	@FindBy(xpath = "//input[@value='Cập nhật']") WebElement btnUpdate;
	
	@FindBy(name="keyword") WebElement tbSearch;
	@FindBy(xpath = "//button[@class='button-search btn btn-primary']") WebElement buttonSearch;
	
	public Day15_UpdatePassword_PageFactory(WebDriver _driver) 
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
	
	public void updatePassword(String oldPass, String newPass)
	{
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", btnMyAcount);
		try
		{
			while (cancelButton.isDisplayed())
			{
				cancelButton.click();
			}
		}catch (Exception ex) {
			btnMyAcount.click();
			btnDoiMatKhau.click();
			txtOldPassword.sendKeys(oldPass);
			txtNewPassword.sendKeys(newPass);
			txtCNewPassword.sendKeys(newPass);
			btnUpdate.click();
		}	
	}
	
	public void search(String typing)
	{
		try
		{
			while(cancelButton.isDisplayed())
			{
				cancelButton.click();
			}
		}catch(Exception ex) 
		{
		tbSearch.sendKeys(typing);
		buttonSearch.click();
		}
	}

}
