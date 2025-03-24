package org.example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    @FindBy(xpath = "//span[text()=\"Customer Login\"]")
    public WebElement Header_CustomerLogin;

    @FindBy(id = "email")
    public WebElement Textbox_Email;

    @FindBy(id = "pass")
    public WebElement Textbox_Password;

    @FindBy(id = "send2")
    public WebElement Button_SignIn;
}
