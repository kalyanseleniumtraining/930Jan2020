package arraysExamples;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SSExample {

	public void screenshot(WebDriver driver, String fileName) 
			throws Exception {
		File f = ((TakesScreenshot) driver).getScreenshotAs
				(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\" + fileName + ".png"));
	}

	public static void main(String[] args) throws Exception {
		SSExample obj = new SSExample();
		WebDriver driver = null;

		try {
			driver = new FirefoxDriver();
		} catch (Exception e) {
			obj.screenshot(driver, "BrownerNotFound");
		}

		try {
			driver.get("ebay.com");
		} catch (Exception e) {
			obj.screenshot(driver, "NoUrl");
		}

		try {
			driver.findElement(By.id("gh-acc")).sendKeys("Watches");
		} catch (Exception e) {
			obj.screenshot(driver, "TextBoxScreen");

		}

	}

}
