package src.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import src.test.base.Page;

public class LoginPage extends Page {

	public ZohoAppPage doLogin(String username, String password) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		WebElement userNameField = driver.findElement(By.cssSelector("#login_id"));
		wait.until(ExpectedConditions.elementToBeClickable(userNameField));
		userNameField.sendKeys(username);
		
		WebElement nextBtn = driver.findElement(By.cssSelector("#nextbtn"));
		wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
		nextBtn.click();
		
		
		WebElement passwordField = driver.findElement(By.cssSelector("#password"));
		wait.until(ExpectedConditions.elementToBeClickable(passwordField));
		passwordField.sendKeys(password);
		
		wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
		nextBtn.click();
		
		return new ZohoAppPage();
	}
}
