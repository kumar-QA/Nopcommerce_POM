package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	WebDriver driver;
	
	 public LoginPage(WebDriver d) {
		 driver=d;
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	   @FindBy(name="Email")
		WebElement usernmae;
		@FindBy(name="Password")
		WebElement password;
		@FindBy(xpath="//button[@type='submit']")
		WebElement LoginBtn;

		
		public DashBoardPage verifyLogin(String uname,String pwd) {
			usernmae.clear();
			usernmae.sendKeys(uname);
			password.clear();
			password.sendKeys(pwd);
			LoginBtn.click();
			return new DashBoardPage(driver);
		}
		
	 
	
}
