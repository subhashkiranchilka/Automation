package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

	public WebDriver driver;

	public PaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement payByBankWireLink;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement iCofirmOrderButton;
	
	@FindBy(xpath = "//*[contains(text(),'Your order on My Store is complete')]")
	private WebElement orderCompletText;

	public WebElement getPayByBankWireLink() {
		return payByBankWireLink;
	}

	public WebElement getiCofirmOrderButton() {
		return iCofirmOrderButton;
	}

	public WebElement getOrderCompletText() {
		return orderCompletText;
	}
	
}
