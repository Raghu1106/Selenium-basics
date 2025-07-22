package Selenium.Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement alertButton=driver.findElement(By.id("j_idt88:j_idt91"));
		alertButton.click();
		Alert alert=driver.switchTo().alert();
	//	Thread.sleep(3000);
		alert.accept();
		
        WebElement confirmButton=driver.findElement(By.id("j_idt88:j_idt93"));
        confirmButton.click();
        Alert confirmAlert=driver.switchTo().alert(); 
        confirmAlert.dismiss();
        
        WebElement promptButton=driver.findElement(By.id("j_idt88:j_idt104"));
        promptButton.click();
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Raghu");
        promptAlert.accept();
        
      //  WebElement confirmationButton=driver.findElement(By.id("j_idt88:j_idt106"));
        //confirmationButton.click();
        //Alert confirmationAlert=driver.switchTo().alert();
        
        
       // WebElement yesButton=driver.findElement(By.id("j_idt88:j_idt108"));
       // Alert yesAlert=driver.switchTo().alert();
       // yesAlert.dismiss();
        
		/*
		 * WebElement sweetButton=driver.findElement(By.id("j_idt88:j_idt106"));
		 * sweetButton.click(); Thread.sleep(5000); System.out.println("Before Click");
		 * WebElement Yesclk=
		 * driver.findElement(By.xpath(" //span[contains(text(),'Yes')]"));
		 * Yesclk.click(); System.out.println("successfully clicked ");
		 * Thread.sleep(5000); //Alert sweetAlert=driver.switchTo().alert();
		 * //sweetAlert.dismiss(); driver.quit();
		 */
        System.out.println("Before alt click");
        Thread.sleep(5000);
        WebElement alt = driver.findElement(By.xpath("//button[(@id='j_idt88:j_idt100')]"));
        alt.click();
        Thread.sleep(5000);
        System.out.println("After clk");
        WebElement clk=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a/span"));
        clk.click();
        System.out.println("Clicked successfully");
        Thread.sleep(5000);
        driver.close();
        
        
      //  confirmationAlert.dismiss();
        
        
        
        
        
        
        
        
      }

}
