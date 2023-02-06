package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P02_SignUp {

    WebDriver driver;
    public P02_SignUp(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Register")
    private WebElement register;

    @FindBy(xpath = "//input[@id='customer.firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    private WebElement address;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    private WebElement city;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    private WebElement state;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    private WebElement zipCode;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='customer.ssn']")
    private WebElement ssn;

    @FindBy(xpath = "//input[@id='customer.username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='customer.password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    private WebElement repeatedPassword;

    @FindBy(xpath = "//input[@value='Register']")
    private WebElement registerButton;

    public void registerNewAccount(String firstName,String lastName,String address,String city,String state,String zipCode,String phoneNumber,String ssn,String userName,String Password,String repeatedPassword) throws InterruptedException {
        // explicit wait condition
        WebDriverWait w = new WebDriverWait(driver,30);
        // presenceOfElementLocated condition
        w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//a[normalize-space()='Register']")));

        // click registration link
        this.register.click();
        // fill registration form
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.address.sendKeys(address);
        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.zipCode.sendKeys(zipCode);
        this.phoneNumber.sendKeys(phoneNumber);
        this.ssn.sendKeys(ssn);
        this.userName.sendKeys(userName);
        this.password.sendKeys(Password);
        this.repeatedPassword.sendKeys(repeatedPassword);
        // click register button
        this.registerButton.click();
    }
}
