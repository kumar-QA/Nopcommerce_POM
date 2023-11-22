package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.DashBoardPage;
import pages.LoginPage;
import pages.ProductsPage;

public class ProductsTestPage extends Baseclass{

	LoginPage lp;
	DashBoardPage dp;
	ProductsPage p;
	@BeforeMethod
	public void setup() {
		launch();
		lp=new LoginPage(driver);
		dp=new DashBoardPage(driver);
		p=new ProductsPage(driver);
	}
	
	 @Test
	 public void ValidateSearchFunction() {
		 dp=lp.verifyLogin("admin@yourstore.com","admin");
		 dp.clickonCatalogLink();
		 dp.clickonProductsLink();
		 p.VerifySearchFunctionality("Apple MacBook Pro 13-inch");
		 
	 }
	 
	
}
