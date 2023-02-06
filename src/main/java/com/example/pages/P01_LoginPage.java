package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_LoginPage {
	
     WebDriver driver;
	public P01_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement userPassword;
	
	@FindBy(xpath="//input[@value='Log In']")
	public WebElement loginButton;

}
