package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14_BTVN_signin 
{
	private WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Đăng Nhập']") WebElement btnDangNhap;
	@FindBy(id="txtLoginUsername") WebElement textEmail;
	@FindBy(id="txtLoginPassword") WebElement textPassword;
	@FindBy(xpath = "//button[text()='ĐĂNG NHẬP' and @class='btn btn_pink_sm fleft marright15']") WebElement btnLogin;

	@FindBy(xpath = "//a[text()='Đăng Ký']") WebElement btnDangKy;
	@FindBy(id="txtFirstname") WebElement tbName;
	@FindBy(id="txtEmail") WebElement tbEmail;
	@FindBy(id="txtCEmail") WebElement tbEmailAgain;
	@FindBy(id="txtPassword") WebElement tbPassWord;
	@FindBy(id="txtCPassword") WebElement tbPassWordAgain;
	@FindBy(id="txtPhone") WebElement tbPhoneNumber;
	@FindBy(xpath = "//button[text()='ĐĂNG KÝ' and @class='btn_pink_sm fs16']") WebElement btnSignin;
	
	@FindBy(xpath = "/i[@class='fa fa-caret-down']") WebElement hover;
	@FindBy(xpath = "//a[text()='Chỉnh sửa thông tin']") WebElement linktextUpdateInfo;
	@FindBy(id="txtpassword") WebElement tbOldPassWord;
	@FindBy(id="txtnewpass") WebElement tbNewPassWord;
	@FindBy(id="txtrenewpass") WebElement tbNewPassWordAgain;
	@FindBy(xpath = "//button[text()='Lưu mật khẩu mới']") WebElement btnSavePassword;
	
	@FindBy(xpath = "//a[text()='Thoát']") WebElement linktextExit;
	

	public Day14_BTVN_signin(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void signinFunction(String name, String email, String emailAgain, String password, String passwordAgain, String phoneNumber) 
	{
		btnDangKy.click();
		tbName.sendKeys(name);
		tbEmail.sendKeys(email);
		tbEmailAgain.sendKeys(emailAgain);
		tbPassWord.sendKeys(password);
		tbPassWordAgain.sendKeys(passwordAgain);
		tbPhoneNumber.sendKeys(phoneNumber);
		btnSignin.click();	
	}
	
	public void updateInfo(String oldPassword, String newPassword, String newPasswordAgain)
	{
		hover.click();
		linktextUpdateInfo.click();
		tbOldPassWord.sendKeys(oldPassword);
		tbNewPassWord.sendKeys(newPassword);
		tbNewPassWordAgain.sendKeys(newPasswordAgain);
		btnSavePassword.click();
		
	}
	
	public void logoutFunction()
	{
		linktextExit.click();
	}
	
	public void loginFunction(String emailLogin, String passwordLogin)
	{
		btnDangNhap.click();
		textEmail.sendKeys(emailLogin);
		textPassword.sendKeys(passwordLogin);
		btnLogin.click();
		
	}

}
