package uk.co.automationtesting.mavenproject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;


public class L07_Surefire {
	
	//WebDriver driver;
	
	@Test
	public void testng() {
		AssertJUnit.assertEquals("demo", "demo");
	}

}
