package Lume_HomepageData;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Data {
	WebDriver driver;
	public Homepage_Data(WebDriver drv) throws IOException
{
		
		driver=drv;
		PageFactory.initElements(driver, this);}
	@FindBy(name="q") WebElement searchdata;
	@FindBy(xpath="//button[@type='submit']") WebElement searchSymbol;
	@FindBy(xpath="//span[@style='width:240px;']/child::span/child::img[@src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/w/t/wt06-blue_main_1.jpg']") WebElement Bluedress;
	@FindBy(xpath="//div[@option-label='S']") WebElement size;
	@FindBy(xpath="//div[@class='control']/child::input[@type='number']") WebElement qunty;
	@FindBy(xpath="//a[@id='ui-id-3']") WebElement News;
	@FindBy(xpath="//a[@id='ui-id-4']") WebElement women;
	@FindBy(xpath="//li[@class='level1 nav-2-1 category-item first parent ui-menu-item']") WebElement Tops;
	@FindBy(xpath="//a[@href='https://magento.softwaretestingboard.com/men.html']") WebElement men;
	@FindBy(xpath="//a[@href='https://magento.softwaretestingboard.com/gear.html']") WebElement gear;
	@FindBy(xpath="//a[@href='https://magento.softwaretestingboard.com/training.html']") WebElement training;
	@FindBy(xpath="//a[@href='https://magento.softwaretestingboard.com/sale.html']") WebElement sale;
	@FindBy(xpath="//div[@class='product-addto-links']/a[@class='action towishlist'][@data-action='add-to-wishlist']") WebElement wishlist;
    @FindBy(linkText="My Account") WebElement Myaccount;
    @FindBy(linkText="My Orders") WebElement Myorder;
    @FindBy(linkText="My Downloadable Products") WebElement Downloadproducts; 
    @FindBy(linkText="Address Book") WebElement Address;
    @FindBy(linkText="Account Information") WebElement Account;
    @FindBy(linkText="Stored Payment Methods") WebElement payment;
    @FindBy(linkText="My Product Reviews") WebElement reviews;
    @FindBy(linkText="Home") WebElement home;
    @FindBy(linkText="Privacy and Cookie Policy") WebElement privacy;
    @FindBy(xpath="//span[@class='customer-name']/preceding::li[@class='customer-welcome']") WebElement dropdown;
    @FindBy(linkText="Sign Out") WebElement signout;
	public void newsDetails()
	{
		News.click();
	}
	public void WomenList()
	{
		women.click();
	}
	public void Topwear()
	{
		Tops.click();
	}
	public void Men()
	{
		men.click();
	}
	public void Gear()
	{
		gear.click();
	}
	public void Training()
	{
		training.click();
	}
	public void Sales()
	{
		sale.click();
	}
	public void Goto_Home()
	{
		home.click();
	}
	public void searchdata (String data)
	{
		searchdata.sendKeys(data);
	}
	public void searchKey()
	{
		searchSymbol.click();
		}
	public void BlueShirt()
	{
		Bluedress.click();
		
	}
	public void Sizeselection()
	{
		size.click();
	}
		public void Quantity(String q)
		{
			qunty.clear();
			qunty.sendKeys(q);
		}
		public void WishListItems()
		{
			wishlist.click();
			
		}
	public void My_Account()
	{
		Myaccount.click();
	}
		public void My_OrderPage()
		{
			Myorder.click();
		}
		public void Downloaded_Products()
		{
			Downloadproducts.click();
		}
		public void Address_Page()
		{
			Address.click();
		}
		public void Account_Page()
		{
			Account.click();
		}
		public void Payment_Page()
		{
			payment.click();
		}
		public void Reviews()
		{
			reviews.click();
		}
	    public void Privacy_Policy()
	    {
		privacy.click();
	    }
		public void Dropdown_List()
		{
			dropdown.click();
		}
		public void Close()
		{
			signout.click();
		}
		}
	
