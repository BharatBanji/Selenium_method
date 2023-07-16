package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHanding_dismiss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://demo.automationtesting.in/Alerts.html");
       driver.findElement(By.xpath("//*[@href=\"#CancelTab\"]")).click();
       driver.findElement(By.xpath("//*[@onclick=\"confirmbox()\"]")).click();
       Alert alert=driver.switchTo().alert();
       alert.dismiss();
       driver.close();
	}

}
