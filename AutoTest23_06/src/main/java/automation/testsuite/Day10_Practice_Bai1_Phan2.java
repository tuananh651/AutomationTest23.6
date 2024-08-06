package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automaiton.common.CommonBase;

public class Day10_Practice_Bai1_Phan2 extends CommonBase {

	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver("https://alada.vn/thong-tin-ca-nhan");
	}

	@Test
	public void testCombined() {
		WebElement textHo = driver.findElement(By.xpath("//input[contains(@id,'member_lastname')]"));
		System.out.println("textHo is oke");

		WebElement textTen = driver.findElement(By.xpath("//input[contains(@id,'member_firstname')]"));
		System.out.println("textTen is oke");

		WebElement checkGioiTinh1 = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		System.out.println("checkGioiTinh1 is oke");

		WebElement checkGioiTinh0 = driver.findElement(By.xpath("//input[@type='radio' and @value='0']"));
		System.out.println("checkGioiTinh0 is oke");

		WebElement dateNgaySinh = driver.findElement(By.xpath("//input[contains(@name,'member_birthday')]"));
		System.out.println("dateNgaySinh is oke");

		WebElement dropdownTinhTP = driver.findElement(By.xpath("//option[(normalize-space()='TP.HCM')]/.."));
		System.out.println("dropdownTinhTP is oke");

		WebElement txtDienThoai = driver.findElement(By.xpath("//input[contains(@name,'member_tel')]"));
		System.out.println("txtDienThoai is oke");

		WebElement txtDiaChi = driver.findElement(By.xpath("//input[contains(@name,'member_address')]"));
		System.out.println("txtDiaChi is oke");

		WebElement txtCongTy = driver.findElement(By.xpath("//input[contains(@name,'member_company')]"));
		System.out.println("txtCongTy is oke");

		WebElement btnLuuThongTin = driver.findElement(By.xpath("//button[starts-with(text(),'Lưu thông tin')]"));
		System.out.println("btnLuuThongTin is oke");

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}