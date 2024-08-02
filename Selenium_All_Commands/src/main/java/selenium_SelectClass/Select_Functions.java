package selenium_SelectClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Select_Functions {

	public static WebDriver driver;

	// Xpaths

	@Test
	public void actionsUrl() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/windows");

		String mw=driver.getWindowHandle();
				
		System.out.println(mw);
		
		WebElement wi = driver.findElement(By.xpath("//a[text()='Click Here']"));

		wi.click();
		Set<String> set = driver.getWindowHandles();

		System.out.println(set);
		
		Iterator<String> ite=set.iterator();
		
		while(ite.hasNext()) {
			
			String cw=ite.next();
			
			
			if(!mw.equals(cw)) {
				
				driver.switchTo().window(cw);
				Thread.sleep(5000);
				System.out.println(driver.getTitle());
			}
		}
		
		driver.switchTo().window(mw);
		
		
//		driver.quit();
	}

}
