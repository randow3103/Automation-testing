package Projects;

import java.text.NumberFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class get_row_and_column_method {
     public static int getTotalColNumber() {
        // No. of columns
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
        List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.print("No. of columns: " + col.size());
        driver.close();
        return  col.size();
    }

    public static int getTotalRowNumber() {
        // No. of rows
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
        System.out.print("No. of rows: " + rows.size());
        return  rows.size();

    }
    

public void getRowNumberByValue(String value) throws Exception {	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseUrl=("https://demo.guru99.com/test/web-table-element.php");
		driver.get(baseUrl);
		
		List<WebElement> column= driver.findElements(By.xpath("//*[@id='leftcontainer']" + "/table/tbody/tr/td[1]"));
		for (int i=0;i<column.size();i++) {
			if(column.get(i).getText().equals(value)) {
				System.out.print("Value is: "+(i+1));
			}
		}
	}
    
    
    @Test
    public static int getTableCellValue(int row, int col) {
    	WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
        WebElement value = driver.findElement(By.xpath
        		("//*[@id=\"leftcontainer\"]/table/tbody/tr["+ col +"]/td["+ row +"]\r\n"));
        String num = value.getText();
        System.out.print("Dap an o cot do: " + num);
       Assert.assertTrue(true);
        return 0;
        
    }
    public static int checkIfExist(String input) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
        List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));

		
		for(int i = 1; i<rows.size(); i++)
		{
			for(int u=1; u<col.size(); u++) {
		        WebElement value = driver.findElement(By.xpath
		        		("//*[@id=\"leftcontainer\"]/table/tbody/tr["+ i +"]/td["+ u +"]\r\n"));
		        String num = value.getText();
		        if (num.equals(input)){
		            System.out.print("Co dap an " + num + " tai col " + u + " tai row " +i+"  ");
		        };
		        
			}

		}
		
        return 0;
    }
    @Test
    
    
    public static void main(String[] args) {
    	//getTotalColNumber();
    	//getTotalRowNumber();
    	//getTableCellValue(1,1);
    	checkIfExist("Nestle India");
    }
}

