package Pgpckgofproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signup {
	WebDriver driver;
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(90));
	Timeouts w=driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	By ads=(By.xpath("//*[@id=\"onetrust-reject-all-handler\"]"));

	//WebElement w=wait.until(ExpectedConditions.visibilityOfElementLocated(ads));


	
	
			//Timeouts w=driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	By adsss=(By.cssSelector("#shopify-section-header > header-root > div.header--top-row > a > svg"));
	By firstname=By.xpath("//input[@id='first_name']");
	By lastname=By.xpath("//input[@id='last_name']");
	By emailid=By.xpath("//input[@id='email']");
	By pwd=By.xpath("//input[@id='password']");
	By sign=By.xpath("//*[@id=\"create_customer\"]/div[5]/div/button");
	
	
	
	
	public Signup(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void adpage()
	{
		driver.findElement(ads).click();
		driver.findElement(adsss).click();	
	}
	
	public void setValues(String nameone,String nametwo,String mail,String password)
	{
		driver.findElement(firstname).sendKeys(nameone);
		driver.findElement(lastname).sendKeys(nametwo);
		driver.findElement(emailid).sendKeys(mail);
		driver.findElement(lastname).sendKeys(password);	
	}
	
public void Signin()
{
	driver.findElement(sign).click();
}}
	
	//driver.findElement(ads).click();
	//driver.findElement(adsss).click();


 
	// TODO Auto-generated method stub
	





