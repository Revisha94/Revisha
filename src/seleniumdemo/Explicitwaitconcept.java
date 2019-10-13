package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 6);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sb_form_q")));
		WebElement searchbox = driver.findElement(By.id("sb_form_q"));
		searchbox.sendKeys("vmetry technology");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sb_form_go")));
		WebElement searchbutton = driver.findElement(By.id("sb_form_go"));
		searchbutton.click();
		

	}

}
