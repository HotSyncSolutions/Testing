package Lume_MainPage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import Lume_HomepageData.Homepage_Data;
import Lume_LoginPage.Lume_LoginDetails;

public class MainPage_Lume {
	WebDriver driver;
	@Test
	public void mainExecution() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Lume_LoginDetails LLg=new Lume_LoginDetails(driver);
		LLg.url();
		 LLg.signin();
		 LLg.enterUserName("Surya123@gmail.com");
		 LLg.enterpassword("Surya@123");
		 LLg.clickonsubmit();
		 Homepage_Data HD=new Homepage_Data(driver);
		 HD.newsDetails();
		 HD.WomenList();
		 HD.Men();
		 HD.Gear();
		 HD.Training();
		 HD.Sales();
		 HD.Goto_Home();
	     HD.searchdata("Blue Tshirt");
	     HD.searchKey();
	     HD.BlueShirt();
	     HD.Sizeselection();
	     HD.Quantity("2");
	     HD.WishListItems();
	     HD.My_Account();
	     HD.My_OrderPage();
	     HD. Downloaded_Products();
	 	 HD.Address_Page();
	 	 HD.Account_Page();
	 	 HD.Payment_Page();
	 	 HD.Reviews();
	 	 HD.Privacy_Policy();
	 	 HD.Dropdown_List();
	 	 HD.Close();
	}
	@AfterSuite

		public void closewindow()
		{
		driver.close();
		}	 
}
