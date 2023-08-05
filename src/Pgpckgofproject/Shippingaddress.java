package Pgpckgofproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shippingaddress {
WebDriver driver;
	
	By address=By.xpath("/*[@id=\"checkout_shipping_address_address1\"]");
   By mobilenum=By.xpath("//*[@id=\"checkout_shipping_address_phone\"]");
   By contshipping=By.xpath("//*[@id=\"continue_button\"]");
   
	
	public Shippingaddress(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
public void ship(String houseaddr,int mob)
{
	driver.findElement(address).sendKeys("houseaddr");
	driver.findElement(mobilenum).sendKeys("mob");
}
public void conshipping()
{
	driver.findElement(contshipping).click();
}


}
