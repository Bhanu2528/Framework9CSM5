package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class addressfrompage {
//Declaration
	@FindBy(id="Name")
	private WebElement nameTF;
	@FindBy(id="House/Office Info")
	private WebElement houseTF;
	@FindBy(id="Street Info")
	private WebElement streetTF;
	@FindBy(id="Landmark")
	private WebElement landmarkTF;
	@FindBy(id="Country")
	private WebElement countryDropdown;
	@FindBy(id="State")
	private WebElement stateDropdown;
	@FindBy(id="City")
	private WebElement cityDrpodown;
	@FindBy(id="Pincode")
	private WebElement pincodeTF;
	@FindBy(id="Phone Number")
	private WebElement phonenumberTF;
	@FindBy(xpath="//button[text()='Add Adress']")
	private WebElement addressbutton;
	
	
	//Initialization
	public addressfrompage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	//Utilization
	public void addAddressDetails(WebDriverUtility web,String name,String house,String street,String landmark,
			String country,String state,String city) {
	nameTF.sendKeys(name);
	houseTF.sendKeys(house);
	streetTF.sendKeys(street);
	landmarkTF.sendKeys(landmark);
	
	web.selectFromDropDown(country,countryDropdown);
	web.selectFromDropdown(details.get("state"),stateDropdown);
	web.selectFromDropdown(details.get("city",cityDrpodown);
	
	pincodeTF.sendKeys(details.get("pincode"));
	phonenumberTF.sendKeys(details.get("phonenumber"));
	addressbutton.click();	
}
}
