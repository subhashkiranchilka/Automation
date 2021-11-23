package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage {

	public WebDriver driver;

	public SignOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logOutTextLink;
		
	public WebElement getLogOutTextLink() {
		return logOutTextLink;
	}



	public void logOut(){
		//	super(driver);
			
		}	

}
