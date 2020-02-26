package firstJavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");
		WebElement dropDown = driver.findElement(By.id("gh-cat"));

		Select sel = new Select(dropDown);
		List<WebElement> items = sel.getOptions();//100
		for(WebElement item : items)
		{
			System.out.println(item.getText());
		}
//		System.out.println(items.size());
//		for (int i = 0; i < items.size(); i=i+2) {
//			String text = items.get(i).getText();
//			if (text.equals("Music")) {
//				System.out.println("item found");
//			} else {
//				System.out.println("Item not found");
//			}
//		}

//		WebElement defaultElement = sel.getFirstSelectedOption();
//
//		if (defaultElement.getText().equals("All Categories")) {
//			System.out.println("Default value matched");
//		} else {
//			System.out.println("Default value not matched");
//		}

//		sel.selectByIndex(4);
//		sel.selectByVisibleText("Music");
//		sel.selectByValue("550");

	}

}
