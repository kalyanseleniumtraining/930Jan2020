package arraysExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesExample {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get
		("https://www.quackit.com/javascript/javascript_alert_box.cfm");
		
		List<WebElement> 
		frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
	
		WebElement frm=driver.findElement(By.className("result"));
		
		//driver.switchTo().frame("result1");
		
		driver.switchTo().frame(frm);
		
		
		driver.findElement
		(By.xpath(".//*[@value='Click me']")).click();
		
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
