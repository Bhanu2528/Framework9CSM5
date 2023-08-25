package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage {
	//Declaration
	@FindBy(xpath="//div[@class='cart_productDetials__pKWBd']/h3")
	private WebElement cartitem;
	
	//Initialization
	public cartpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public String getCartitem() {
	return cartitem.getText();
	}
}
