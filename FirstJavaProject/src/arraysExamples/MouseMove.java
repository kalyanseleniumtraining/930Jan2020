package arraysExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");

		WebElement myebayLink = driver.findElement
				(By.xpath(".//*[text()=' My eBay']"));

		Actions act = new Actions(driver);
//		act.contextClick(myebayLink).perform();
//		act.click(myebayLink).perform();
//		act.doubleClick(myebayLink).perform();
		
		
		
		act.moveToElement(myebayLink).perform();

		Thread.sleep(2000);
		driver.findElement
		(By.xpath(".//*[text()=' Messages']")).click();

		
		
		
	}

}
