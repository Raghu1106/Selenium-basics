package Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chromedriver location = "C:\Users\raghu\Chrome\chromedriver.exe"
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/input.xhtml");
		
		//driver.manage().window().maximize();
		
		//driver.navigate().to("https://www.youtube.com/");
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.quit();
		
		//WebElement searchBox =  
		//driver.findElement(By.name("q")).sendKeys("Selenium WebDriver"+Keys.ENTER);
		
		//driver.findElement(By.partialLinkText("Dashboard")).click();
		
		//driver.quit();
		driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']"));



		
		
		
		
		
		
		
	
		

	}

}
