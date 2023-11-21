package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public  WebDriver driver;

	   public void launch() {
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://admin-demo.nopcommerce.com/login");
	   }

	   public void close() {
		   driver.close();
	   }
}
