package com.savvas.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.savvas.Base;

public class PersonalForm extends Base {
	public WebDriver driver;

	public PersonalForm(WebDriver driver) {

		this.driver = driver;
	}

	public By fname = By.id("ts_first_name");

	public WebElement getFName() {
		return driver.findElement(fname);
	}

	public By lname = By.id("ts_last_name");

	public WebElement getLName() {
		return driver.findElement(lname);
	}

	public By address = By.id("ts_address");

	public WebElement getAddresss() {
		return driver.findElement(address);

	}

}
