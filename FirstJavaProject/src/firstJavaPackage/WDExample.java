package firstJavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WDExample {
	
	public static void main(String[] args) {
		
		ProfilesIni obj=new ProfilesIni();
		FirefoxProfile fp=obj.getProfile("kalyan");
		
		
		WebDriver driver=new FirefoxDriver(fp);
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.get("http://flipkart.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
		
		
	}

}
