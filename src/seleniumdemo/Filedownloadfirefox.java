package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Filedownloadfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
	    System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver.exe");
	    String path = "E:\\new";
	    FirefoxOptions firefoxProfile = new FirefoxOptions();
	    firefoxProfile.addPreference("browser.download.folderList",2);
	    firefoxProfile.addPreference("browser.download.manager.showWhenStarting",false);
	    firefoxProfile.addPreference("browser.download.dir",path);
	    firefoxProfile.addPreference("browser.helperApps.neverAsk.saveToDisk","text/csv");
	    firefoxProfile.addPreference("browser.download.folderList", 2);
	    firefoxProfile.addPreference("browser.download.dir", path);
	    firefoxProfile.addPreference("browser.download.manager.alertOnEXEOpen", false);
	    firefoxProfile.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword, application/csv, application/ris, text/csv, image/png, application/pdf, text/html, text/plain, application/zip, application/x-zip, application/x-zip-compressed, application/download, application/octet-stream");
	    firefoxProfile.addPreference("browser.download.manager.showWhenStarting", false);
	    firefoxProfile.addPreference("browser.download.manager.focusWhenStarting", false);  
	    firefoxProfile.addPreference("browser.download.useDownloadDir", true);
	    firefoxProfile.addPreference("browser.helperApps.alwaysAsk.force", false);
	    firefoxProfile.addPreference("browser.download.manager.alertOnEXEOpen", false);
	    firefoxProfile.addPreference("browser.download.manager.closeWhenDone", true);
	    firefoxProfile.addPreference("browser.download.manager.showAlertOnComplete", false);
	    firefoxProfile.addPreference("browser.download.manager.useWindow", false);
	    firefoxProfile.addPreference("services.sync.prefs.sync.browser.download.manager.showWhenStarting", false);
	    firefoxProfile.addPreference("pdfjs.disabled", true);

	    driver = new ChromeDriver(firefoxProfile);
		driver.get("https://www.resumeworld.ca/resume-templates/types-resume-templates/curriculum-vitae-resume-template.html");
		driver.manage().window().maximize();

		driver = new FirefoxDriver();
		driver.get("https://www.resumeworld.ca/resume-templates/types-resume-templates/curriculum-vitae-resume-template.html");
		driver.manage().window().maximize();
		WebElement downloadtemplate = driver.findElement(By.xpath("//*[@id=\'text\']/div/table/tbody/tr[1]/td[1]/u/a"));
		downloadtemplate.click();

	}

}
