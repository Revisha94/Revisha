package seleniumdemo;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span));"));
		Actions a = new Actions(driver);
		a.dragAndDropBy(slider, 80, 0).build().perform();
		a.dragAndDropBy(slider, -80, 0).build().perform();
}
}