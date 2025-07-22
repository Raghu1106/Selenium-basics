package Selenium.Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumWindowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
		String oldWindow=driver.getWindowHandle();
		
		System.out.println("Window id = "+oldWindow);
		
		WebElement firstButton=driver.findElement(By.id("j_idt88:new"));
		firstButton.click();
	    Thread.sleep(3000);
		Set<String> handles=driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		
		WebElement browseButton=driver.findElement(By.id("menuform:j_idt39"));
	    browseButton.click();
	    Thread.sleep(3000);
	    WebElement openFrame=driver.findElement(By.id("menuform:m_frame"));
	    openFrame.click();
	    Thread.sleep(3000);
	   
	    driver.close();
	     
	    driver.switchTo().window(oldWindow);
	    Thread.sleep(3000);
	     
	    WebElement multipleWindow=driver.findElement(By.id("j_idt88:j_idt91"));
	    multipleWindow.click();
	    Thread.sleep(3000);
	    
		int numberOfWindows = driver.getWindowHandles().size();
		System.out.println("No of windows opened :"+numberOfWindows);
				
		WebElement dontCloseMe=driver.findElement(By.id("j_idt88:j_idt93"));
		Thread.sleep(3000);
		dontCloseMe.click();	
		Thread.sleep(3000);
		
		Set<String>newWindowHandle= driver.getWindowHandles();
		for (String allWindows : newWindowHandle) {
		if (!allWindows.equals(oldWindow)) {
		driver.switchTo().window(allWindows);
		driver.close();
			}
			
		}  
		    
		driver.quit();	
		
		}
}
