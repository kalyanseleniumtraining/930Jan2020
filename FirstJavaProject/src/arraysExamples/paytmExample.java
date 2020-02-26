package arraysExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class paytmExample {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://paytm.com");
		Thread.sleep(5000);
		WebElement signin = driver.findElement
				(By.className("_3ac-"));
		signin.click();
		Thread.sleep(5000);

		List<WebElement> 
		frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());

		driver.switchTo().frame(0);

		driver.findElement
		(By.xpath(".//*[text()='Login/Signup with mobile number and password']")).click();

	}

}
