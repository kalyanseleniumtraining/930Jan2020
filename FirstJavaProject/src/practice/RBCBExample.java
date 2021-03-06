package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RBCBExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");

		WebElement checkbox = driver.findElement(By.name("permission"));

		boolean state = checkbox.isSelected();
		if (state) {
			System.out.println("Already selected no clicking it...");
		} else {
			checkbox.click();
		}

	}

}
