package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	boolean b = false;

	public void print() {
		System.out.println("I am print methods from class a");
	}

	public static void main(String[] args) {

		// This statement will open the frirefox browser
		WebDriver driver = new FirefoxDriver();
		// this statement will navigate to an url
		// http is mandatory//www is optional
		driver.get("http://google.com");
//close will close active window
		driver.close();
//close all the windows opened by webdriver in that instance
		driver.quit();

	}

}
