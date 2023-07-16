package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.automationtesting.in/Windows.html");
     driver.findElement(By.xpath("//*[@href=\"http://www.selenium.dev\"][button]")).click();
     String a=driver.getWindowHandle();
     System.out.print(a);
     Set<String> b=driver.getWindowHandles();
     System.out.print(b);
     driver.quit();
     
     
	}

}
