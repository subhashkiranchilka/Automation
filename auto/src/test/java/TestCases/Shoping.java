package TestCases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.PaymentPage;
import Pages.ProductPage;
import Pages.SignOutPage;
import Pages.SignUpPage;
import Utils.Config;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Shoping {
	public static WebDriver driver;
	public String loginid;
	SoftAssert softAssertion= new SoftAssert();

	@Parameters({ "browser-name", "operating-system" })
	@BeforeClass
	public void preCondtion(String browser, String OS) {

		if (browser.equalsIgnoreCase("IE")) {

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		} else if (browser.equalsIgnoreCase("Chrome")) {

		///	System.setProperty("webdriver.chrome.driver", Config.CHROMEDRIVER_PATH);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Config.BASE_URL);

	}

	@Test(priority=0)
	public void Registration() {		
		HomePage home=new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		SignUpPage signup=new SignUpPage(driver);
		SignOutPage signout=new SignOutPage(driver);
		
		
		home.getSignIn().click();
		loginid = "test"+getRandomNumberString()+"@hello.com";
		login.getCreateAccountEmailInputField().sendKeys(loginid);
		login.getCreateAccountSubmitButton().click();
		
		signup.getMrRadioButton().click();
		signup.getFirstnameInputField().sendKeys("First");
		signup.getLastnameInputField().sendKeys("LastName");
		signup.getPwdInputField().sendKeys("asdf123");
		
		Select day =new Select(driver.findElement(By.id("days")));
		day.selectByValue("2");
		
		Select month =new Select(driver.findElement(By.id("months")));
		month.selectByValue("1");
		
		Select year =new Select(driver.findElement(By.id("years")));
		year.selectByValue("2000");
		
		signup.getNewsLetterSignUpInputCheckBox().click();
		signup.getOffersSignUpInputCheckBox().click();
		
		signup.getCompanyNameAddressInputField().sendKeys("ITCompany");
		
		signup.getAddressOneInputField().sendKeys("Addressone");
		signup.getAddressTwoInputField().sendKeys("AddressTwo");
		signup.getCityInputField().sendKeys("Bangalore");
		Select state =new Select(driver.findElement(By.id("id_state")));
		state.selectByValue("9");
		signup.getPostalCodeInputField().sendKeys("56007");
		signup.getAdditionalInfoInputField().sendKeys("Additional Information");
		signup.getHomePhoneInputField().sendKeys("9902826000");
		signup.getMobilePhoneInputField().sendKeys("9902826011");
		
		signup.getAliasAddressInputField().clear();
		signup.getAliasAddressInputField().sendKeys("Address alias for reference");
		
		signup.getSubmitAccountButton().click();
		
		softAssertion.assertEquals(signup.getSignedInUserName().getText(), "First LastName");
		
		signout.getLogOutTextLink().click();
		softAssertion.assertAll();

	}
	
	@Test(priority=1)
	public void purchasing() {		
		
		LoginPage login=new LoginPage(driver);
		
		SignOutPage signout=new SignOutPage(driver);
		ProductPage product=new ProductPage(driver);
		PaymentPage payment=new PaymentPage(driver);
		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		login.getEmailInputField().sendKeys(loginid);
		login.getPasswordlInputField().sendKeys("asdf123");
		login.getSignInSubmitButton().click();
	//	driver.switchTo().frame("f3ebf0e0bd6528c");
		explicitWait(3);
	//	product.getDressesTopNavgLinkText().click();
		WebElement topnavigation = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]"));
    	//Mouse hover on product image'
    	actions.moveToElement(topnavigation).perform();
		product.getCasualDressTopNavTextLink().click();
		
		explicitWait(2);
		js.executeScript("window.scrollBy(0,250)", "");
		WebElement productimage = driver.findElement(By.xpath("//a[@class='product_img_link']"));
    	//Mouse hover on product image'
    	actions.moveToElement(productimage).perform();
    	
    	product.getPrintedDressAddToCartButton().click();
    	product.getProceedToCheckoutButton().click();
    
    		
    	js.executeScript("window.scrollBy(0,650)", "");
    	explicitWait(2);
    	product.getSummaryProceedToCheckoutButton().click();
    	
    	js.executeScript("window.scrollBy(0,650)", "");
    	explicitWait(2);
    	product.getAddressProceedToCheckoutButton().click();
    	
    	product.getTearmsAndConditionsCheckBox().click();
    	explicitWait(2);
    	js.executeScript("window.scrollBy(0,250)", "");
    	product.getShippingProceedToCheckoutButton().click();
    	
    	js.executeScript("window.scrollBy(0,250)", "");
    	explicitWait(2);
    	payment.getPayByBankWireLink().click();
    	
    	js.executeScript("window.scrollBy(0,250)", "");
    	explicitWait(2);
    	payment.getiCofirmOrderButton().click();
    	
    	softAssertion.assertEquals(payment.getOrderCompletText().getText(), "Your order on My Store is complete.");
    	
    	signout.getLogOutTextLink().clear();
    	softAssertion.assertAll();
	}
	
	
	public static String getRandomNumberString() {
	    // It will generate 6 digit random Number.
	    // from 0 to 999999
	    Random rnd = new Random();
	    int number = rnd.nextInt(999999);

	    // this will convert any number sequence into 6 character.
	    return String.format("%06d", number);
	}
	
	public void explicitWait(int durationInSec)
	{
		try {
			Thread.sleep(1000*durationInSec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}