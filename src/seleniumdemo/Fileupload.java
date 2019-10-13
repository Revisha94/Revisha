package seleniumdemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://tinyupload.com/");
		driver.manage().window().maximize();
		
		WebElement choosefile= driver.findElement(By.name("upload_file"));
		choosefile.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Revisha S\\Desktop\\fileupload.exe");
		
		
		
		
	}

}
