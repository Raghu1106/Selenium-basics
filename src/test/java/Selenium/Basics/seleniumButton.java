package Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		WebElement getPositonButton=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt94']/span[2]"));
		Point xypoint=getPositonButton.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		System.out.println("X value is "+xValue + " Y value is "+yValue);
		
		WebElement colourButton=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt96\']/span[2]"));
		String colour=colourButton.getCssValue("background");
		System.out.println("Button colour is "+colour);
		
		WebElement sizeButton=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']/span[2]"));
		int height=sizeButton.getSize().getHeight();
		int width=sizeButton.getSize().getWidth();
		System.out.println("Height is "+height);
		System.out.println("Width is"+width);
		
		

	}

}
