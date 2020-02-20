package src.test.rough;

import org.testng.annotations.Test;

import src.test.base.Page;
import src.test.pages.HomePage;
import src.test.pages.LoginPage;
import src.test.pages.ZohoAppPage;
import src.test.pages.crm.accounts.AccountsPage;
import src.test.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	@Test()
	public void loginAndOthersTest() {

		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
			
		ZohoAppPage zp = lp.doLogin("tuoanh0307@gmail.com", "P@ssw0rd#");
		
		zp.goToCRM();

		Page.menu.goToAccounts();
		
		AccountsPage ap = new AccountsPage();
		ap.goToCreateAccount();
		
		CreateAccountPage cap = new CreateAccountPage();
		cap.createAccount("julie");
		
//		driver.quit();
	}

}
