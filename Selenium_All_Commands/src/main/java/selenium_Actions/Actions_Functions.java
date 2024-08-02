package selenium_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Functions {

	public static WebDriver driver;

	// Xpaths

	private final String livTrianinglnk = "//ul[@class='blog-menu']//a[text()='Live Training']";

	public void actionsUrl() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");

		Thread.sleep(5000);

		WebElement livTr = driver.findElement(By.id("column-a"));
		WebElement livTr1 = driver.findElement(By.id("column-b"));

		Actions ac = new Actions(driver);

		ac.dragAndDrop(livTr, livTr1).build().perform();
		ac.scrollByAmount(500, 200);
		
		
//		driver.close();
	}

}
