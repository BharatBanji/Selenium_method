package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
       WebElement a=  driver.findElement(By.xpath("//select[@id=\"first\"]"));  
       Select dropdown=new Select(a);
       dropdown.selectByValue("Apple");
	}

}
