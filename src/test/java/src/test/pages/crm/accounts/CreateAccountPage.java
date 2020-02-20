package src.test.pages.crm.accounts;

import org.openqa.selenium.By;

import src.test.base.Page;

public class CreateAccountPage  extends Page {
	
	public void createAccount(String accountName) {
	driver.findElement(By.xpath("//input[@id='Crm_Accounts_ACCOUNTNAME']")).sendKeys(accountName);	
	}

}
