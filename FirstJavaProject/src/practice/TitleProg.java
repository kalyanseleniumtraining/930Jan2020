package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleProg {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		boolean result = actualTitle.equals(expectedTitle);
		if (result == true) {
			System.out.println("Pass");

		} else {
			System.out.println("fail");
		}

	}

}
