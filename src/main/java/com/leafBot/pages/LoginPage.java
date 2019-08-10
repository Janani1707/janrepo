package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUserName(String username) {
		WebElement we = locateElement("id", "username");
	// WebElement we = driver.findElementById("username");
	 clearAndType(we, username);
	 return this;
 }
	
	public LoginPage enterPassword(String password) {
		WebElement we = locateElement("id","password");
		clearAndType(we, password);
		return this;
	}
	
	public void clickLogin() {
		WebElement we = locateElement("ClassName", "decorativeSubmit");
		click(we);
	}
}
