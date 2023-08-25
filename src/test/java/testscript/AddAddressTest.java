package testscript;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class AddAddressTest extends BaseClass {
		@Test
		public void addAddressTest() throws InterruptedException {
			Map<String, String> map = excel.getData("Sheet1", "Add Address");
			welcome.clickloginbutton();
			login.loginToApp(map.get("Email"), map.get("Password"));
			Thread.sleep(2000);
			home.clickProfileButton();
			Thread.sleep(2000);
			home.selectMyProfile();
			Thread.sleep(2000);
			myprofile.clickMyAdresses();
			myAddress.clickAddAddress();
			address.addAddressDetails(webUtil, map);
			Thread.sleep(2000);
			Assert.assertEquals(myAddress.getsuccessmessage(), "successfully added");
			Thread.sleep(2000);
		}
	}
}
