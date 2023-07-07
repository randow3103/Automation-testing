package Projects;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import bsh.ParseException;


public class get_row_and_column {

	public static void main(String[] args) throws ParseException{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		//No. of columns
		List<WebElement> col =driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.print("No. of columns: "+ col.size());
		//No. of rows
		List<WebElement> rows  =driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.print("No. of rows: "+ rows.size());
		driver.close();
	}
}
