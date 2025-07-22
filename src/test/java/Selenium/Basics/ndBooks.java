package Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ndBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/");
		WebElement searchBox= driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div[4]/div[1]/div/button"));
		searchBox.click();
		//searchBox.sendKeys("Books");
		

		
		//driver.manage().window().maximize();
		WebElement menuBar=driver.findElement(By.id("text"));
		menuBar.click();
		
		
		;

	}

}
