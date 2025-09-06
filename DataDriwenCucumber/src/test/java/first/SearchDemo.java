package first;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class SearchDemo {
	WebDriver d;

	public static List<List<String>> getSheetDataSearch(String filePath, String sheetName) {
		List<List<String>> sheetData = new ArrayList<>();
		try (FileInputStream fis = new FileInputStream(filePath); Workbook workbook = WorkbookFactory.create(fis)) {
			Sheet sheet = workbook.getSheet(sheetName);

			for (Row row : sheet) {
				List<String> rowData = new ArrayList<>();
				for (Cell cell : row) {
					rowData.add(cell.toString());
				}
				sheetData.add(rowData);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return sheetData;
	}

	
	@Given("user search multiple types of products from excel")
	public void user_search_multiple_types_of_products_from_excel() throws InterruptedException {
		String excelPath = "C:\\Users\\sai durga\\OneDrive\\Desktop\\googleSheets\\SearchExcel.xlsx";
		List<List<String>> sheetData = getSheetDataSearch(excelPath, "Sheet1");

		for (int i = 1; i < sheetData.size(); i++) {
			String search = sheetData.get(i).get(0);
			System.out.println("Search attempt " + i + ": " + search);
			
			d = new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://bstackdemo.com/");
			
			WebElement inp = d.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
			inp.click();
			inp.clear();
			inp.sendKeys(search);
			Thread.sleep(2000);
			d.findElement(By.cssSelector("button[role=\"button\"]")).click();
			Thread.sleep(2000);
			
			d.close();
		}
	}
}
