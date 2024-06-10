package Lume_LoginPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lume_LoginDetails {
	WebDriver driver;
	public Lume_LoginDetails (WebDriver drv) throws IOException
	{
		driver=drv;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='panel header']/child::ul[@class='header links']/child::li[2]/child::a") WebElement Sign;
	@FindBy(name="login[username]") WebElement usernm;
	@FindBy(name="login[password]") WebElement pass;
	@FindBy(xpath="//button[@class='action login primary']") WebElement sub;
	public void url()
	{
		driver.get("https://magento.softwaretestingboard.com/");
	}
	public void signin()
	{
		Sign.click();
	}

	 public void enterUserName(String nm)
	 {
		 usernm.sendKeys(nm);
	 }
	 public void enterpassword(String pw)
	 {
		 pass.sendKeys(pw);
	 }
	 
	 public void clickonsubmit()
	 {
		 sub.click();
	 }
	 }

