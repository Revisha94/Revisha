package seleniumdemo;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement tooltip = driver.findElement(By.xpath("//*[@id='age']"));
		String data= tooltip.getAttribute("title");
		System.out.println(data);
		
	}

}
