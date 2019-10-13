package seleniumdemo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver;
    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	WebElement searchbox= driver.findElement(By.name("q"));
	for(int i=0;i<option.)
	
	
	}

}
