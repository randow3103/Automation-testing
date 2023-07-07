package Projects;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.List;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class demo {
	private WebDriver driver;
	private ChromeOptions options;
	private String baseUrl;
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void beforeTest() throws Exception{
		options = new ChromeOptions();
		options.addArguments("Start-maximized");
		driver=new ChromeDriver(options);
		baseUrl="https://github.com/trieunhat2806";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	//"//a[@id='repositories-tab']/..//a[@id="+Xitem+"]"
	public void SelectItem(String Xitem) {
		Actions actions = new Actions(driver);
		WebElement item= (WebElement) driver.findElements(By.xpath("//span[@title='PRACTICE-1']//preceding::span[@title="+Xitem+"]"));
		actions.contextClick(item).perform();
			

	}
	@Test
	public void Test() throws Exception{
		driver.get(baseUrl);
		SelectItem("trieunhat2806");
	}
}