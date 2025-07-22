package Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		WebElement java=driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[1]/div/div[2]/span"));
		java.click();
		
		

	}

}
