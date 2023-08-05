package Testpckgofproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pgpckgofproject.Signup;

public class Signuppagetest extends Baseclasssproject {
	WebDriver driver;

@Test
public void testlogin()
{
	Signup sp=new Signup(driver);
	//ob.adddss();
	sp.setValues("soumya","r","soumya.red1997@gmail.com","soumya@123");
	sp.Signin();
	sp.adpage();
	

}
}
