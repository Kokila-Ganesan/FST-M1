package CRM_APPLICATION;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_websitetitle {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	driver.get("http://alchemy.hguy.co/crm");
	String title =driver.getTitle();
	if("SuiteCRM".equals(title)) {
		System.out.println("title successfully verifyed");
	}
	else {
		System.out.println("title is not verifyed");
	}
    driver.quit();
	}

}
