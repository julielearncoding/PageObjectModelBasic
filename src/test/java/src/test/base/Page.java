package src.test.base;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Page {

	public static WebDriver driver;
	public static TopMenu menu;

	public Page() {
		// Chrome
		String driverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentails_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		
		if (driver == null) {
			driver = new ChromeDriver(options);
			driver.get("https://www.zoho.com");

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		menu = new TopMenu(driver);
		}
	}
}
