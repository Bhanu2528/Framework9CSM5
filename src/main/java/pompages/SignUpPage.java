package pompages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	//Declaration
	@FindBy(id="First Name")
	private WebElement firstNameTF;
	@FindBy(id="Last Name")
	private WebElement lastNameTF;
	@FindBy(xpath="//div@id='Gender']/descendant::lable/span[2]")
	private List<WebElement> genderRadioButtons;
	@FindBy(id="Phone Number")
	private WebElement phoneNumberTF;
	@FindBy(id="Email Address")
	private WebElement emailaddressTF;
	@FindBy(id="Password")
	private WebElement passwordTF;
	@FindBy(id="Confirm Password")
	private WebElement conformpasswordTF;
	@FindBy(id="Terms and Conditions")
	private WebElement termaandcondations;
	@FindBy(xpath="//button[text()='Register']")
	private WebElement register;
	
	//Initialization
	public SignUpPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	//utilization
	public void createUserAccount(String firstName,String lastName,
			String expectedGender,String phoneNum,String email,String password,String comformpassword) {
		firstNameTF.sendKeys(firstName);
		lastNameTF.sendKeys(lastName);
		
		for(WebElement element: genderRadioButtons)
		{
			String gender=element.getText();
			if(gender.equals(expectedGender))
			{
				element.click();
				break;
			}
		}
		phoneNumberTF.sendKeys(phoneNum);
		emailaddressTF.sendKeys( email);
		passwordTF.sendKeys(password);
		conformpasswordTF.sendKeys(comformpassword);
		termaandcondations.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		register.click();
	}
}
