package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLogin {
	@Test
	public void TestUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome","https://opensource-demo.orangehrmlive.com/");
		LoginPage loginHRM = PageFactory.initElements(driver, LoginPage.class);
		loginHRM.LoginHRM("Admin","admin123");
		

	}

}
