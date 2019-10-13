package seleniumdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Schoolname {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.justdial.com/Mumbai/Schools/nct-10422444");
		driver.manage().window().maximize();
		
		
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

}
