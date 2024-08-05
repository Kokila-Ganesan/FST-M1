package CRM_APPLICATION;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("http://alchemy.hguy.co/crm");
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	    String title=driver.getTitle();
	    if("home page".equals(title)) {
	    	System.out.println("home page is displayed");
	    }
	    else {
	    	System.out.println("home page is not displayed");
	    }
	    driver.quit();
	}

}
