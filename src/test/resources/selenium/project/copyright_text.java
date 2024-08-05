package CRM_APPLICATION;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copyright_text {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("http://alchemy.hguy.co/crm");
	    WebElement text=driver.findElement(By.xpath("//a[@id='admin_options']"));
	    String Text =text.getText();
	    System.out.println("copyright text: "+ Text);
        driver.quit();
	}

}
