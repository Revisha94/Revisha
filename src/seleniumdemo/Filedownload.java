package seleniumdemo;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Filedownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	    String fileDownloadPath = "E:\\new";
	    Map<String, Object> prefsMap = new HashMap<String, Object>();
	    prefsMap.put("profile.default_content_settings.popups", 0);
	    prefsMap.put("download.default_directory", fileDownloadPath);
	    ChromeOptions option = new ChromeOptions();
	    option.setExperimentalOption("prefs", prefsMap);
	    option.addArguments("--test-type");
	    option.addArguments("--disable-extensions");
	    
	    driver = new ChromeDriver(option);
		driver.get("https://www.resumeworld.ca/resume-templates/types-resume-templates/curriculum-vitae-resume-template.html");
		driver.manage().window().maximize();
		WebElement downloadtemplate = driver.findElement(By.xpath("//*[@id=\'text\']/div/table/tbody/tr[1]/td[1]/u/a"));
		downloadtemplate.click();
		
		

	}

}
