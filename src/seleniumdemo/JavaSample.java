package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class JavaSample {

  public static final String USERNAME = "revisharevisha1";
  public static final String AUTOMATE_KEY = "z6P4cd4B3G7sCMaCqzJH";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

  public static void main(String[] args) throws Exception {

    DesiredCapabilities caps = new DesiredCapabilities();
    
    caps.setCapability("browser", "Firefox");
    caps.setCapability("browser_version", "69.0");
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "8.1");
    caps.setCapability("resolution", "1024x768");
    
    caps.setCapability("name", "Bstack-[Java] Sample Test");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://www.google.com");
    WebElement element = driver.findElement(By.name("q"));

    element.sendKeys("BrowserStack");
    element.submit();

    System.out.println(driver.getTitle());
    driver.quit();

  }
}
