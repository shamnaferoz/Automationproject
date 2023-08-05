package Testpckgofproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pgpckgofproject.Shippingaddress;

public class Shippingtest {
	WebDriver driver;

	@Test
	public void shiptest()
	{
		Shippingaddress sh=new Shippingaddress(driver);
		sh.ship("125 High Street" +"\n",1475893279);
		sh.conshipping();
		

	}
	}



