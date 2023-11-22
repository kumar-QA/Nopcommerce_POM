package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.DashBoardPage;
import pages.LoginPage;

public class LoginnTestPage extends Baseclass {
	LoginPage lp;
	DashBoardPage dp;
	
	@BeforeMethod
	public void setup() {
		launch();
		 lp=new LoginPage(driver);
	}
	  
	@Test
	public void validateLoginFunction() {
		dp=lp.verifyLogin("admin@yourstore.com","admin");
		String Expectedvalue="homepageLanded";
		Assert.assertEquals(dp.getPageTitle(), Expectedvalue);
		
	}
	
	@Test
	public void InvalidateLoginFunction() {
		dp=lp.verifyLogin("adminstore.com","a2wwmin");
		String Expectedvalue="homepageLanded";
		Assert.assertEquals(dp.getPageTitle(), Expectedvalue);
		
	}
	
	@Test
	public void validateusername_InvalidPwd_LoginFunction() {
		dp=lp.verifyLogin("admin@yourstore.com","sccccce");
		String Expectedvalue="homepageLanded";
		Assert.assertEquals(dp.getPageTitle(), Expectedvalue);
		
	}
	
}
