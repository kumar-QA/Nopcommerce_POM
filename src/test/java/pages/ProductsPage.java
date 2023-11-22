package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	WebDriver driver;
	
	public ProductsPage(WebDriver d) {
	driver=d;
		PageFactory.initElements(driver, this);
	}

	 @FindBy(id="SearchProductName")
	 WebElement productnameInputFiled;
	 @FindBy(id="search-products")
	 WebElement searchBtn;
	 
	  public void VerifySearchFunctionality(String productname) {
		  productnameInputFiled.sendKeys(productname);
		  searchBtn.click();
	  }
	
	
}
