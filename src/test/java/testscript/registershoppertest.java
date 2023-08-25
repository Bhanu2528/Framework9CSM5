package testscript;

import java.util.Map;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import genericLibraries.BaseClass;
import pompages.SignUpPage;

public class registershoppertest extends BaseClass{
	 @Test
	public void createaccounttest()
	{
		welcom.clickloginbutton();
		login.clickcreateaccountbutton();
		Map<String, String>map=excel.getData("Sheet1","Shopper Registration");
		int randomNum=jutil.generateRandomNum(100);
		//String firstName=map.get("First Name")+randomNum;
		//String lastName=map.get("Last Name")+randomNum;
		String email=randomNum+map.get("Email Address");
		String pwd=map.get("password")+randomNum;
		
		SignUpPage.createUserAccount(map.get("First Name"),map.get("last Name"),map.get("Gender"),
				map.get("Phone Number"),map.get(pwd));
				
				Thread.sleep(10000);
		
		Welcom.clickLoginButton();
		login.loginToApp(map.get("Email Address"),map.get("password"));
		
		Assert.assertTrue(driver.getTitle().contains("home"));
	}
}
