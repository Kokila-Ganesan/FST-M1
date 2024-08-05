package CRM_APPLICATION;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_header {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	driver.get("http://alchemy.hguy.co/crm");
    WebElement url =driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
    String Url = url.getText();
    System.out.println("header url:"+ Url);
    driver.quit();
	}

}
