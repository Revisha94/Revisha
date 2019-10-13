package seleniumdemo;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.xpath.functions.FunctionDef1Arg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentwaitconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.seleniumpractise.blog/");
		driver.manage().window().maximize();
		
		WebElement clickbutton = driver.findElement(By.xpath("//button[text()='click me to start timer"));
		clickbutton.click();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(6,TimeUnit.SECONDS);
		wait.withTimeout(30, TimeUnit.SECONDS);
		
		wait.until(new Function<webdriver, webelement>() {

			@Override
			public webelement apply(WebDriver wd) {
				// TODO Auto-generated method stub
				WebElement demo = wd.findElement(By.id("demo"));
				if(demo.getAttribute("innerHTML")).equalsIgnoreCase("webdriver"))
		{
			System.out.println();
		}
				return null;
			}
			
		})
		
		
		
		

	}

}
