package org.example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountPage {

    @FindBy(xpath = "//span[text()=\"Create New Customer Account\"]")
    public WebElement Header_CreateNewCustomerAccount;

    @FindBy(id = "firstname")
    public WebElement Textbox_FirstName;

    @FindBy(id = "lastname")
    public WebElement Textbox_LastName;

    @FindBy(id = "email_address")
    public WebElement Textbox_Email;

    @FindBy(id = "password")
    public WebElement Textbox_Password;

    @FindBy(id = "password-confirmation")
    public WebElement Textbox_ConfirmPassword;

    @FindBy(xpath = "//span[text()=\"Confirm Password\"]/following::div[2]/div[1]/button/span[text()=\"Create an Account\"]")
    public WebElement Button_CreateAnAccount;
}
