package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	private WebElement dressesTopNavgLinkText;
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	private WebElement casualDressTopNavTextLink;
	
	@FindBy(xpath = "//a[@class='product_img_link']")
	private WebElement printedDressImgLink;

	@FindBy(xpath = "//a[@title='Add to cart']")
	private WebElement printedDressAddToCartButton;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceedToCheckoutButton;
	
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement addressProceedToCheckoutButton;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement shippingProceedToCheckoutButton;
	
	@FindBy(xpath = "//p[@class='cart_navigation clearfix']/a[@title='Proceed to checkout']")               
	private WebElement summaryProceedToCheckoutButton;
	
	@FindBy(xpath = "//input[@id='cgv']")
	private WebElement tearmsAndConditionsCheckBox;

	
	
	public WebElement getAddressProceedToCheckoutButton() {
		return addressProceedToCheckoutButton;
	}

	public WebElement getShippingProceedToCheckoutButton() {
		return shippingProceedToCheckoutButton;
	}

	public WebElement getSummaryProceedToCheckoutButton() {
		return summaryProceedToCheckoutButton;
	}

	public WebElement getDressesTopNavgLinkText() {
		return dressesTopNavgLinkText;
	}

	public WebElement getCasualDressTopNavTextLink() {
		return casualDressTopNavTextLink;
	}

	public WebElement getPrintedDressImgLink() {
		return printedDressImgLink;
	}

	public WebElement getPrintedDressAddToCartButton() {
		return printedDressAddToCartButton;
	}

	public WebElement getProceedToCheckoutButton() {
		return proceedToCheckoutButton;
	}

	public WebElement getTearmsAndConditionsCheckBox() {
		return tearmsAndConditionsCheckBox;
	}
	
	
}
