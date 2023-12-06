package pomfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.MainRun;

public class Lpage extends MainRun

{
	 WebDriver Driver;
	
	 private By Uname = By.id("txtEmail");
	    private By pwfield = By.id("txtPWD");
	    private By Loginbtn = By.id("btnSignIn");
	

	
	public Lpage(WebDriver driver)
	{
		PageFactory.initElements(MainRun.driver, this);
	}
	
	
	public void Utab(String un)
	{
		WebElement Userele = driver.findElement(Uname);
		Userele.sendKeys(un);
	}
	
	public void Ptab(String pw)
	{
		WebElement Pwdele = driver.findElement(pwfield);
		Pwdele.sendKeys(pw);
	}
	public void Loginbt()
	{
		WebElement Lgbtn = driver.findElement(Loginbtn);
		Lgbtn.click();
	}
}
