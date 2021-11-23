package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[@class='login']")
	private WebElement SignIn;

	public WebElement getSignIn() {
		return SignIn;
	}

	public void setSignIn(WebElement signIn) {
		SignIn = signIn;
	}
		

}
