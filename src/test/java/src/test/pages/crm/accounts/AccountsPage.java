package src.test.pages.crm.accounts;

import org.openqa.selenium.By;

import src.test.base.Page;

public class AccountsPage extends Page {
	
	public void goToCreateAccount() {
		driver.findElement(By.xpath("//button[contains(@class,'newwhitebtn customPlusBtn')]")).click();
	}
	
	public void goToImportAccount() {
		
	}

}

