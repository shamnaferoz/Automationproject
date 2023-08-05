package Testpckgofproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pgpckgofproject.Homepage;

public class Homepgtest {
	WebDriver driver;

	 {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testlogin()
	{
		 Homepage sm=new Homepage(driver);
		sm.skincareclick();
		
		

	}
	

}
