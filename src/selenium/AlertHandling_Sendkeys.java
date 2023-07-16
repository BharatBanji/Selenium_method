package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling_Sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriver driver=new ChromeDriver();
	       driver.get("https://demo.automationtesting.in/Alerts.html");
	       driver.findElement(By.xpath("//*[@href=\"#Textbox\"]")).click();
	       driver.findElement(By.xpath("//*[@onclick=\"promptbox()\"]")).click();
	       Alert alert=driver.switchTo().alert();
	       alert.sendKeys("Bharat Veersss");
	       alert.accept();
	       
	    
	}

}
