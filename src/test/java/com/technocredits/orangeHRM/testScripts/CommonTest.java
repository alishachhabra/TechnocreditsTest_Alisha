package com.technocredits.orangeHRM.testScripts;

import com.technocredits.orangeHRM.base.PredefinedMethods;
import com.technocredits.orangeHRM.pages.LoginPage;

public class CommonTest extends PredefinedMethods{

	void login(String username,String password){
		LoginPage loginpageInstance = LoginPage.getInstance();
		loginpageInstance.enterValueForLoginPage("//input[@id='txtUsername']", username);
		loginpageInstance.enterValueForLoginPage("//input[@id='txtPassword']", password);
		loginpageInstance.clickOnLoginPage("//input[@id='btnLogin']");
	}
	
	
}