package firstJavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonExample {
	

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=laptops&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		
		WebElement secondLaptop=driver.findElement(By.className("_2cLu-l"));
		secondLaptop.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
