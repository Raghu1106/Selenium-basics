package Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ndbooks.stellarsolutionsindia.com/#/contact");
		
		driver.findElement(By.linkText("support@ndslifestyle.com")).click();
		//driver.findElement(By.partialLinkText("Dashboard")).click();
	
		
		

	}

}
