package src.test.pages;

import org.openqa.selenium.By;

import src.test.base.Page;

public class HomePage extends Page {
	
	public void goToCustomers() {
		driver.findElement(By.linkText("Login")).click();
		
	}
	
	public void goToSupport() {
		driver.findElement(By.linkText("Support")).click();
	}

	public void goToContactSales() {
		driver.findElement(By.linkText("Contact Sales")).click();
	}
	
	public LoginPage goToLogin() {
		driver.findElement(By.xpath("//a[@class='zh-login']")).click();
		
		return new LoginPage();
	}
	
	public void goToFreeSignUp() {
		driver.findElement(By.linkText("Free Sign Up")).click();
	}
	
}
