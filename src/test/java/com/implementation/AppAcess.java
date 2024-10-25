package com.implementation;

import java.io.IOException;
import java.util.List;

import com.base.BaseClass;
import com.commonactionmethods.CommonActions;
import com.globalvariable.Constants;
import com.globalvariable.GlobalVariable;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utilities.DriverUtils;

//import io.appium.java_client.AppiumDriver;

public class AppAcess extends GlobalVariable {

	public static void openApplication() throws IOException {

		if (driver == null || driver.toString().contains("null")) {

			driver = DriverUtils.getDriver();
			  
			driver.get(BaseClass.getURL());
			driver.manage().window().maximize();
			try {
				CommonActions.iClickElementByLocator(LoginPage.residentialbutton, "Residnetial option");
       			driver.manage().deleteAllCookies();
			}
			catch (Exception e) {
				CommonActions.iLogErrorMessage("Residentail option is not able to select..");
			}
			
	          
		}
	}

	public static void resetDriver() {
		try {
//			driver.quit();
		} catch (Exception e) {

		}
	}

}
