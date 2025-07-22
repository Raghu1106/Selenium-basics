package Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//swithch using id
		driver.switchTo().frame("");
		WebElement button1=driver.findElement(By.id("Click"));
		
		button1.click();
		
		
		
		
		
		
	}

}
