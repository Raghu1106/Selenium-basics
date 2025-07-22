package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {
	
	@Test(enabled = false)
	public void highSchool() {
		System.out.println("high school");
	}
	
    @Test(dependsOnMethods = "highSchool")
	public void higherSecSchool() {
		System.out.println("higher sec school");
	}
	
    @Test(dependsOnMethods = "higherSecSchool")
	public void engineering() {
		System.out.println("engineering");
	}

}
	
