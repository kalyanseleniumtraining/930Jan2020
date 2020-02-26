package arraysExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");

		List<WebElement> links = 
				driver.findElements(By.tagName("a"));
		int count = 0;
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			if (!links.get(i).getText().equals("")) {
				count = count + 1;
				System.out.println(links.get(i).getText());
			}
		}

		System.out.println
		("total no of links with text are " + count);

	}

}
