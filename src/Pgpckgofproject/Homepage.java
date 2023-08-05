package Pgpckgofproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;
	
	By skincarebutton=By.xpath("/html/body/off-canvas-root/div[1]/div[2]/header-root/div[3]/div/x-menu-root/ul/li[1]/transition-root/div/ul/li[3]/h3/a");

	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
public void skincareclick()
{
	driver.findElement(skincarebutton).click();
}
}




