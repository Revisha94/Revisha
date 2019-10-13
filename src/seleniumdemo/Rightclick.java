package seleniumdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
    WebElement gmail = driver.findElement(By.linkText("Gmail"));
    Actions s = new Actions(driver);
    s.contextClick(gmail).build().perform();
    
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_DOWN);
    robot.keyPress(KeyEvent.VK_DOWN);
    robot.keyPress(KeyEvent.VK_ENTER);
	}

}
