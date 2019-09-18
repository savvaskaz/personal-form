package com.savvas.business;

import org.openqa.selenium.WebDriver;

import com.savvas.page.PersonalForm;

public class BusinessForm extends PersonalForm {

	public BusinessForm(WebDriver driver) {
		super(driver);

	}
	
public void formFillUp(String fname,String lname,String address) {
	
	getFName().clear();
	getFName().sendKeys(fname);
	
	getLName().clear();
	getLName().sendKeys(lname);
	
	getAddresss().clear();
	getAddresss().sendKeys(address);
	
	
	
	
}
	
	
}
