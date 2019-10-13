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

public class Flipkart {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_0_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_0_0_na_na_na&as-pos=0&as-type=HISTORY&suggestionId=mobiles&requestId=06bff215-f30d-430c-8e1c-70dbb6fe20f5");
		driver.manage().window().maximize();
		
		String xpath1 = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[";
		String xpath2 = "']/div/div/div/a/div[1]/div[1]/div/div/img";
		int i=0;
				while(true)
				{
					String xpath = xpath1+xpath2;
					WebElement logo = driver.findElement(By.xpath(xpath));
					System.out.println(logo.getText());
					i++;
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
					BufferedImage mobile = copy.getSubimage(x, y, width, hight);
					ImageIO.write(mobile, "png", scr);
					FileUtils.copyFile(scr, new File("E:\\new\\mobile.png"));

		

	}

}
}