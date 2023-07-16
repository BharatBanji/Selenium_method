package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChromeOptions a= new  ChromeOptions();
//		a.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");

		// clicked on Iframe on iframe link
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		//traversing first iframe
		@SuppressWarnings("unused")
		WebElement firstiframe= driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		
		
		driver.switchTo().frame(1);//id index webelment


		//traversing second iframe
		@SuppressWarnings("unused")
		WebElement siframe= driver.findElement(By.xpath("//div[@class=\"iframe-container\"]/iframe"));
		driver.switchTo().frame(0);////id index webelment


		// added value on iframe
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("within an Iframe");

		///switch to main frame parent 
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("")).click();
		
		driver.switchTo().parentFrame();
		
		
	}

}