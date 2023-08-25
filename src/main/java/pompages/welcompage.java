package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcompage {
	//Declaration
	@FindBy(id="loginBtn")
	private WebElement loginButton;
	
	//Initialization
	public welcompage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void clickLoginButton() {
		loginButton.click();
	}
}
