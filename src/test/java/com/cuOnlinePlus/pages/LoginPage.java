package com.cuOnlinePlus.pages;

import com.cuOnlinePlus.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.jboss.aerogear.security.otp.Totp;

public class LoginPage {


    //makes the connection b
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "username")
    public WebElement userNamebBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginBtn;

    @FindBy(id = "password")
    public WebElement passWordBox;

    @FindBy(id= "btnPassword")
    public WebElement  continueBtn;

    @FindBy(xpath = "//a[@id='btnSMS']")
    public WebElement smsBtn;

    @FindBy(id = "approve")
    public WebElement approveBtn;

    public void  login(String usernameStr, String passwordStr) throws InterruptedException {

        userNamebBox.sendKeys(usernameStr);
        loginBtn.click();
        Thread.sleep(2000);
        passWordBox.sendKeys(passwordStr);
        continueBtn.click();
        Thread.sleep(2000);
        getAccessKey();
        Thread.sleep(2000);
        approveBtn.click();

    }

    public void getAccessKey(){

        Driver.get().switchTo().frame("psd2iframe");
        smsBtn.click();

        String secretKey = "6jm7n6xwitpjooh7ihewyyzeux7aqmw2";

        Totp totp = new Totp(secretKey);
        System.out.println(totp.now());

    }

}
