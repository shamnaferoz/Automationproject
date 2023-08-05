package Testpckgofproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Pgpckgofproject.Skincarepage;

public class Skincaretestpg {
	WebDriver driver;

	@Test
	public void skincaresection()
	{
		Skincarepage sk=new Skincarepage(driver);
		sk.addtocartcream();
		sk.checkout();
			

	}
	}


