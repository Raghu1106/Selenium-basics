package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSuite {
	
	
	@Test 
   public void openGoogle() {
		long startTime=System.currentTimeMillis();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\raghu\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in"); 
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("total time"+totalTime);
   }
	@Test 
   public void openBing() { 
		long startTime=System.currentTimeMillis();

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\raghu\\Chrome\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.bing.com"); 
			    driver.quit();
			    long endTime=System.currentTimeMillis();
				long totalTime=endTime-startTime;
				System.out.println("total time"+totalTime);
	   
   }
	@Test 
   public void openFireFox() {
		long startTime=System.currentTimeMillis();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\raghu\\Chrome\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.firefox.com"); 
				driver.quit();
				long endTime=System.currentTimeMillis();
				long totalTime=endTime-startTime;
				System.out.println("total time"+totalTime);
	   
   }
}
