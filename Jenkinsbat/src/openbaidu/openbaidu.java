package openbaidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openbaidu {
	public static WebDriver driver;
	  public static String Url;
	  @Test
public void open() {
	 //—°‘Òπ»∏Ë‰Ø¿¿∆˜
	System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
	driver = new ChromeDriver();
	Url = "http://www.baidu.com";
	driver.get(Url);
	driver.findElement(By.name("wd")).sendKeys("’Êœ„");
	}
}
