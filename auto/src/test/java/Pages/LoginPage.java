package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "email")
	private WebElement emailInputField;
	
	@FindBy(id = "passwd")
	private WebElement passwordlInputField;
	
	@FindBy(id = "SubmitLogin")
	private WebElement signInSubmitButton;

	@FindBy(id = "email_create")
	private WebElement createAccountEmailInputField;

	@FindBy(id = "SubmitCreate")
	private WebElement createAccountSubmitButton;

	public WebElement getEmailInputField() {
		return emailInputField;
	}

	public WebElement getPasswordlInputField() {
		return passwordlInputField;
	}

	public WebElement getSignInSubmitButton() {
		return signInSubmitButton;
	}

	public WebElement getCreateAccountEmailInputField() {
		return createAccountEmailInputField;
	}

	public WebElement getCreateAccountSubmitButton() {
		return createAccountSubmitButton;
	}
	
	
}
