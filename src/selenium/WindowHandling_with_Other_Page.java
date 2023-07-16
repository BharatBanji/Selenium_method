package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling_with_Other_Page {

	public static void main(String[] args){
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://demo.automationtesting.in/Windows.html");
       driver.findElement(By.xpath("//*[@href=\"#Seperate\"]")).click();
       String Mainwindow=driver.getWindowHandle();
       System.out.println("this is the parent node : "+Mainwindow);
       driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();
       Set<String> childwindow1=driver.getWindowHandles();
       System.out.println("this is the child node : "+childwindow1);
       Iterator<String> iterator=childwindow1.iterator();
       while(iterator.hasNext()) {
    	   String childwindow=iterator.next();
    	   if(!Mainwindow.equalsIgnoreCase(childwindow)) {
    		   driver.switchTo().window(childwindow);
    		  String b= driver.findElement(By.xpath("//*[@class=\"mx-auto text-center p-4\"]/h1[1]")).getText();
    		  System.out.println(b);
    		  driver.switchTo().window(Mainwindow);
    		  driver.quit();
    	   }
    			   
       }
	}

}
