
package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WThandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains/14554/");

		List<WebElement> rows = driver.findElements(By.xpath(".//table[@class='results']/tbody/tr"));
		System.out.println(rows.size());

		for (int i = 1; i <= rows.size(); i++) {
			List<WebElement> cols = driver.findElements(By.xpath(".//table[@class='results']/tbody/tr[" + i + "]/td"));

			for (int j = 1; j <= cols.size(); j++) {
				WebElement ele = driver
						.findElement(By.xpath(".//table[@class='results']/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.println(ele.getText());
			}

		}

	}

}
