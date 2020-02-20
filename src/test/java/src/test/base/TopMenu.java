package src.test.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * TopMenu is not a Page
 * 
 * LoginPage has TopMenu
 * AccountPage has TopMenu
 * 
 * */

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}
	
	public void goToHome() {
		
	}

	public void goToFeeds() {
		
	}

	public void goToLead() {
		
	}

	public void goToAccounts() {
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
	}

	public void goToContacts() {
		
	}
	
	public void signOut() {
		
	}

}
