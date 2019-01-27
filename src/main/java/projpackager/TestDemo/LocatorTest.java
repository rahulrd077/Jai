package projpackager.TestDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\n\\Gecko\\geckodriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		Set<String> mainwindow = driver.getWindowHandles();
		
		System.out.println(mainwindow);
		
		Object[] window = mainwindow.toArray();
		
		System.out.println(window[1]);
		
	}

}
