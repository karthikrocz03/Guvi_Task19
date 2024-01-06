package guvitask18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GuviTask19 {
	
	public static void main(String[] args) {
		WebDriver driver; 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.guvi.in/register");
		//below are the possible locators from the given url
		driver.findElement(By.id("name"));//fullname
		driver.findElement(By.id("email"));//emailaddress
		driver.findElement(By.id("password"));//password
		driver.findElement(By.id("mobileNumber"));//locatingmobilenumber
		driver.findElement(By.id("signup-btn"));//locating signup button
		driver.findElements(By.linkText("Login"));//locating Login hyperlink
		driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-Bz112c']"));//locating signup with google
		driver.findElement(By.xpath("//h1[@class='mainHeading']"));//locating mainheading
		
		
		
	}

}
