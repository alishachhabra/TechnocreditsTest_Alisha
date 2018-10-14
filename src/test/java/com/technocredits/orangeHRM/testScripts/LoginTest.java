package com.technocredits.orangeHRM.testScripts;

import org.testng.annotations.Test;

public class LoginTest extends CommonTest{

	@Test
	public void doLogin(){
		login("Admin","admin123");
	}
}

