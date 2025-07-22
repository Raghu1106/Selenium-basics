package testNG;

import org.testng.annotations.Test;

public class skipTestCase {
	
	@Test(priority=1)
	public void startTheCar() {
		System.out.println("start the car");
	}
	@Test(priority=4,enabled = false)   
	//enabled is an attribute
	public void musicOn() {
		System.out.println("music ON");
	}
	@Test(priority=2)
	public void putfirstGear() {
		System.out.println("first gear");
	}
	@Test(priority=3)
	public void putSecondGear() {
		System.out.println("second gear");
		
		
			
		}
		
	
	}
		


