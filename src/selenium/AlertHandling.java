package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//*[@onclick=\"alertbox()\"]")).click();
        // How to handle alert
        Alert alert=driver.switchTo().alert();
        alert.accept();
        driver.close();
        
	}

}
