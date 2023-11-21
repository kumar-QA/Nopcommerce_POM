package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	WebDriver driver;
	 public DashBoardPage(WebDriver driverl) {
		 driver=driverl;
		 PageFactory.initElements(driver,this);
		 
	 }
	 
	    @FindBy(xpath="//h1[contains(text(),'Dashboard')]")
		WebElement pageTitle;
		@FindBy(xpath="//i[@class='nav-icon fas fa-book']")
		WebElement CatalogLink;
		@FindBy(xpath="//a[@href='/Admin/Product/List']")
		WebElement ProductsLinks;
		@FindBy(xpath="//a[@href='/Admin/Category/List']")
		WebElement categoriesLink;
	 
		public String getPageTitle() {
			return pageTitle.getText();
		}
		
	 

}
