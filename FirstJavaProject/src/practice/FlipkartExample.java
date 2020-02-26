package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("moblies");
		driver.findElement(By.className("nav-input")).click();

	}

}
