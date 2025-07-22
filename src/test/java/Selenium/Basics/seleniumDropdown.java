package Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumDropdown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement favoriteOne=driver.findElement(By.className("ui-selectonemenu"));
		Select select =new Select(favoriteOne);
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByVisibleText("Puppeteer");
		Thread.sleep(3000);
		
		
		
	
		
		

	}

}
