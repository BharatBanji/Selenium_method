package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nokari_Profile {
			public static void main(String[] args) throws InterruptedException {
				// ChromeOptions options = new ChromeOptions();
				// options.addArguments("--remote-allow-origins=*");
				// TODO Auto-generated method stub
				WebDriver driver= new ChromeDriver();
				
				driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
				
				driver.manage().window().maximize();
				
				Thread.sleep(10000);
				
				driver.findElement(By.xpath("//*[@id=\"usernameField\"]")).sendKeys("Naukri Username");
				
				//Thread.sleep(2);
				
				driver.findElement(By.xpath("//*[@id=\"passwordField\"]")).sendKeys("Naukri password");
				
				driver.findElement(By.xpath("//*[text()='Login' and @type='submit']")).click();
			
				Thread.sleep(5000);

				driver.findElement(By.xpath("//*[text()='View']  ")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//em[@class=\"icon edit\"]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"name\"]")).clear();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Your Name");
				
		//		 JavascriptExecutor js = (JavascriptExecutor) driver;
				 
				 //js.executeScript("arguments[0].scrollIntoView();", "//*[@id=\"saveBasicDetailsBtn\"]");
				 
	//			 js.executeScript("scrollBy(0, 525)"); 
				 
	//			 driver.findElement(By.xpath("//*[@id=\"saveBasicDetailsBtn\"]")).click();
				                              
				
			}

			

		
	}


