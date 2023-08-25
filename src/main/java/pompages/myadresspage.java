package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myadresspage {
//Declaration
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressButton;
	@FindBy(xpath="//div[text()='successfully added']")
	private WebElement successfullmassage;
	
	//Initialization
	public myadresspage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		
		//Utilization
		public void clickAddAddress() {
			addAddressButton.click();
		}
		public String getsuccessmessage() {
			return successfullmassage.getText();
		
	}
}
