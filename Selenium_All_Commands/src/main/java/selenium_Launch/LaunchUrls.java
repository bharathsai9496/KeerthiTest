package selenium_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchUrls {

	public static WebDriver driver;

	
	public void getUrl() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/");
		driver.quit();
	}

	@Test
	public void naigateUrl() {

		driver = new ChromeDriver();

		driver.navigate().to("https://naveenautomationlabs.com/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
	}

}
