package seleniumdemo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordinates {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.id("hplogo"));
		Point pnt = logo.getLocation();
		int x= pnt.getX();
		int y= pnt.getY();
		System.out.println(x);
		System.out.println(y);
		
		int hight = logo.getSize().height;
		int width = logo.getSize().width;
		System.out.println(hight);
		System.out.println(width);
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage copy = ImageIO.read(scr);
		BufferedImage crop = copy.getSubimage(x, y, width, hight);
		ImageIO.write(crop, "png", scr);
		FileUtils.copyFile(scr, new File("E:\\new\\crop.png"));
		
		
		
		
		
		

	}

}
