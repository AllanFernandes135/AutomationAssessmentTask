package org.example.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//span[text()=\"Home Page\"]")
    public WebElement Header_HomePage;

    @FindBy(id = "email")
    public WebElement Link_Signin;

    @FindBy(id = "pass")
    public WebElement Link_CreateAnAccount;
}
