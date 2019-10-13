package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement aboutus = driver.findElement(By.linkText("about us"));
		Actions a = new Actions(driver);
		a.moveToElement(aboutus).build().perform();
		
		WebElement csr = driver.findElement(By.linkText("CSR"));
		a.moveToElement(csr).build().perform();
		
		WebElement investor = driver.findElement(By.linkText("Investors"));
		a.moveToElement(investor).build().perform();
		
		WebElement stockinformation = driver.findElement(By.xpath("//*@id="));
		a.click(stockinformation).build().perform();
		//stockinformation.click();
		
	}

}
