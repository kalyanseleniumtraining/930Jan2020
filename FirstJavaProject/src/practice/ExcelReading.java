package practice;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelReading {

	/** This below method will enter the text in the ebay search box */

	static public void enterTextInToEbaySrchBox(WebDriver driver, String searchValue) {
		WebElement ele1 = driver.findElement(By.id("gh-ac"));
		ele1.sendKeys(searchValue);
	}

	/** This below method will enter the text in the ebay search box */
	static public void selectItemFromEbayDropDown(WebDriver driver, String dropDownValue) {
		WebElement ele2 = driver.findElement(By.id("gh-cat"));
		Select sel = new Select(ele2);
		sel.selectByVisibleText(dropDownValue);
	}

	/** This below method will click on the search buton */
	static public void clickOnEbaySrchBtn(WebDriver driver) {
		WebElement ele3 = driver.findElement(By.id("gh-btn"));
		ele3.click();
	}

	public static void main(String[] args) throws Exception {

		XSSFWorkbook wb = new XSSFWorkbook("TestData.xlsx");
		XSSFSheet sh = wb.getSheet("Data");
		int rowCount = sh.getPhysicalNumberOfRows();

		for (int i = 0; i < rowCount; i++) {
			String srchValue = sh.getRow(i).getCell(0).getStringCellValue();
			String dropDownValue = sh.getRow(i).getCell(1).getStringCellValue();

			WebDriver driver = new ChromeDriver();
			driver.get("http://ebay.com");
			ExcelReading.enterTextInToEbaySrchBox(driver, srchValue);
			ExcelReading.selectItemFromEbayDropDown(driver, dropDownValue);
			ExcelReading.clickOnEbaySrchBtn(driver);

		}

	}

}
