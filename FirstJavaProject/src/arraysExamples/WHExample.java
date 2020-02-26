package arraysExamples;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://naukri.com");// 3 windows
		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) {
			driver.switchTo().window(id);
		    String title=driver.getTitle();
		    if(title.equals("Tech Mahindra"))
		    {
		    	driver.close();
		    }
		    else if()
		    {
		    	
		    }
		}
		
		

	}

}
