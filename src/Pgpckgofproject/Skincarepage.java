package Pgpckgofproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Skincarepage {
WebDriver driver;
	
	By nightcream=By.xpath("//*[@id=\"collection-root\"]/div[2]/div[2]/button");
   By checkout=By.xpath("//button[@name='checkout'");
   Alert alrt=driver.switchTo().alert();
	
	public Skincarepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
public void addtocartcream()
{
	driver.findElement(nightcream).click();
}
public void checkout()
{
	WebElement c=driver.findElement(checkout);
	c.click();
	alrt.accept();
}
}





