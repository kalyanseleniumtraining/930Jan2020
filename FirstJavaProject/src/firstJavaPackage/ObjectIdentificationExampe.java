package firstJavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentificationExampe {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		driver.findElement(By.id("gh-ac")).sendKeys("Laptops");;
		
		driver.findElement(By.id("gh-btn")).click();
		

		
	}

}
