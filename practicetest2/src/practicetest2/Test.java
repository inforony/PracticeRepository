package practicetest2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\abull\\Documents\\jar\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "\\Users\\abull\\Documents\\jar\\IEDriverServer.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.nyse.com/index");
		driver.findElement(By.className("site-search-icon")).click();
		driver.findElement(By.xpath("//*[@id='content-1500131924']/div/div/div/input")).sendKeys("AB");
		driver.findElement(By.xpath("//*[@id='content-1500131924']/div/div/div/input")).sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		

	}

}
