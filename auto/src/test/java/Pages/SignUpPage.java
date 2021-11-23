package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	public WebDriver driver;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

// Create Accpimt fields	
	@FindBy(id = "id_gender1")
	private WebElement mrRadioButton;
	
	@FindBy(id = "id_gender2")
	private WebElement mrsRadioButton;
	
	@FindBy(id = "customer_firstname")
	private WebElement firstnameInputField;

	@FindBy(id = "customer_lastname")
	private WebElement lastnameInputField;

	@FindBy(id = "email")
	private WebElement emailInputField;
	
	@FindBy(id = "passwd")
	private WebElement pwdInputField;
	
	@FindBy(id = "days")
	private WebElement daysSelectInputField;
	
	@FindBy(id = "months")
	private WebElement monthsSelectInputField;
	
	@FindBy(id = "years")
	private WebElement yearsSelectInputField;
	
	@FindBy(id = "newsletter")
	private WebElement newsLetterSignUpInputCheckBox;
	
	@FindBy(id = "optin")
	private WebElement offersSignUpInputCheckBox;
	
	
	// Address input fields
	
	@FindBy(id = "firstname")
	private WebElement firstNameAddressInputField;
	
	@FindBy(id = "lastname")
	private WebElement lastNameAddressInputField;
	
	@FindBy(id = "company")
	private WebElement companyNameAddressInputField;
	
	@FindBy(id = "address1")
	private WebElement AddressOneInputField;
	
	@FindBy(id = "address2")
	private WebElement AddressTwoInputField;
	
	@FindBy(id = "city")
	private WebElement cityInputField;
	
	@FindBy(id = "id_state")
	private WebElement StateSelectField;
	
	@FindBy(id = "postcode")
	private WebElement postalCodeInputField;
	
	@FindBy(id = "id_country")
	private WebElement countrySelectInputField;
	
	@FindBy(id = "other")
	private WebElement additionalInfoInputField;
	
	@FindBy(id = "phone")
	private WebElement homePhoneInputField;
	
	@FindBy(id = "phone_mobile")
	private WebElement mobilePhoneInputField;
	
	@FindBy(id = "alias")
	private WebElement aliasAddressInputField;
	
	@FindBy(id = "submitAccount")
	private WebElement submitAccountButton;
	
	@FindBy(xpath = "//a[@class='account']/span")
	private WebElement signedInUserName;
	
	
	public WebElement getSignedInUserName() {
		return signedInUserName;
	}

	public WebElement getMrRadioButton() {
		return mrRadioButton;
	}

	public WebElement getMrsRadioButton() {
		return mrsRadioButton;
	}

	public WebElement getFirstnameInputField() {
		return firstnameInputField;
	}

	public WebElement getLastnameInputField() {
		return lastnameInputField;
	}

	public WebElement getEmailInputField() {
		return emailInputField;
	}

	public WebElement getPwdInputField() {
		return pwdInputField;
	}

	public WebElement getDaysSelectInputField() {
		return daysSelectInputField;
	}

	public WebElement getMonthsSelectInputField() {
		return monthsSelectInputField;
	}

	public WebElement getYearsSelectInputField() {
		return yearsSelectInputField;
	}

	public WebElement getNewsLetterSignUpInputCheckBox() {
		return newsLetterSignUpInputCheckBox;
	}

	public WebElement getOffersSignUpInputCheckBox() {
		return offersSignUpInputCheckBox;
	}

	public WebElement getFirstNameAddressInputField() {
		return firstNameAddressInputField;
	}

	public WebElement getLastNameAddressInputField() {
		return lastNameAddressInputField;
	}

	public WebElement getCompanyNameAddressInputField() {
		return companyNameAddressInputField;
	}

	public WebElement getAddressOneInputField() {
		return AddressOneInputField;
	}

	public WebElement getAddressTwoInputField() {
		return AddressTwoInputField;
	}

	public WebElement getCityInputField() {
		return cityInputField;
	}

	public WebElement getStateSelectField() {
		return StateSelectField;
	}

	public WebElement getPostalCodeInputField() {
		return postalCodeInputField;
	}

	public WebElement getCountrySelectInputField() {
		return countrySelectInputField;
	}

	public WebElement getAdditionalInfoInputField() {
		return additionalInfoInputField;
	}

	public WebElement getHomePhoneInputField() {
		return homePhoneInputField;
	}

	public WebElement getMobilePhoneInputField() {
		return mobilePhoneInputField;
	}

	public WebElement getAliasAddressInputField() {
		return aliasAddressInputField;
	}

	public WebElement getSubmitAccountButton() {
		return submitAccountButton;
	}
		

}
