package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItExample {
	
	public static void main(String[] args) throws Exception {
		//this is to verify the code in the git hub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.convertfiles.com/");

		driver.findElement(By.name("uploadedfile")).click();
		
		Runtime.getRuntime().exec("cmd /C D:\\NewUpload.exe");
	}

}
