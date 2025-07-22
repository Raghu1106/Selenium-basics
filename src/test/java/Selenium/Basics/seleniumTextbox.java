package Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		WebElement nameBox=driver.findElement(By.id("j_idt88:name"));
		nameBox.sendKeys("Raghu");
		
		WebElement appendBox=driver.findElement(By.id("j_idt88:j_idt91"));
		appendBox.sendKeys("Tamilnadu");
		
		WebElement clearBox=driver.findElement(By.id("j_idt88:j_idt95"));
		clearBox.clear();
		
		WebElement gettextBox=driver.findElement(By.id("j_idt88:j_idt97"));
		String value=gettextBox.getDomAttribute("value");
		System.out.println(value);
		
		WebElement disabledBox=driver.findElement(By.id("j_idt88:j_idt97"));
		boolean enabled=disabledBox.isEnabled();
		System.out.println(enabled);
		

	}

}
