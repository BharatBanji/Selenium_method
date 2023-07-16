package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver dri=new ChromeDriver();
      dri.get("https://demo.automationtesting.in/Frames.html");
      dri.switchTo().frame(1);
      dri.findElement(By.xpath("//div[@class=\"col-xs-6 col-xs-offset-5\"]/input[1]")).sendKeys("Bharat veer");
      
	}

}
