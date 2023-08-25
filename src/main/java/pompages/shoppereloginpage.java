package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppereloginpage {
//Declaration
	@FindBy(id="Email")
	private WebElement emailTF;
	@FindBy(id="password")
	private WebElement passwordTF;
	@FindBy(name="Login")
	private WebElement loginButton;
	@FindBy(id="Create Account")
	private WebElement createAccountButton;
	
	//initialization
	public shoppereloginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void logintoapp(String email,String password) {
		emailTF.sendKeys(email);
		passwordTF.sendKeys(password);
		loginButton.click();
	}
	public void clickoncreateaccountbutton()
	{
		createAccountButton.click();
		}
}
