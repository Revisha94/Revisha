package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.id("hplogo"));
		WebElement searchbox = driver.findElement(By.id("q"));
		searchbox.sendKeys("selenium");
		
		
		
		
		
		
		
		
		String xpath1 = "//*[@id=\"bcard";
		String xpath2 = "']/div[1]/section/div[1]/h2/span/a/span";
		int i=0;
				while(true)
				{
					String xpath = xpath1+xpath2;
					WebElement school = driver.findElement(By.xpath(xpath));
					System.out.println(school.getText());
					i++;
					
					
				}
					
		
		
		
		
		
		 
		
	}
