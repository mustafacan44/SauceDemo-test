package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

public class LoginPage {
    ElementHelper elementHelper;
    WebDriver wait;

    public LoginPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
        this.wait = driver;
    }

    By loginButton = By.cssSelector("#login-button");
    By errorMessage = By.cssSelector("h3[data-test='error']");
    By usernameBox = By.cssSelector("#user-name");
    By passwordBox = By.cssSelector("#password");
    By productText = By.cssSelector(".title");

    public void userAtHomePage() {

    }

    public void clickLogin() {
        elementHelper.click(loginButton);
    }

    public void checkMessage(String username) {
        elementHelper.checkVisible(errorMessage);
    }


    public void writeUsernameForUsernameField(String username) {
        elementHelper.click(usernameBox);
        elementHelper.sendKey(usernameBox, "abcdefg");
    }

    public void writePasswordForPasswordField() {
        elementHelper.click(passwordBox);
        elementHelper.sendKey(passwordBox, "123456");
    }

    public void correctUsernameForUsernameField(String correctUsername) {
        elementHelper.click(usernameBox);
        elementHelper.sendKey(usernameBox, "standard_user");
    }

    public void falsePasswordForPasswordField(String falsePassword) {
        elementHelper.click(passwordBox);
        elementHelper.sendKey(passwordBox, "abc1234");
    }

    public void dontMatchErrorMessage(String dontMatch) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeFalseUsername(String falseUsername) {
        elementHelper.click(usernameBox);
        elementHelper.sendKey(usernameBox, "asdfg");
    }

    public void writeCorrectPassword(String correctPassword) {
        elementHelper.click(passwordBox);
        elementHelper.sendKey(passwordBox, "secret_sauce");
    }

    public void checkSuccessful() {
        elementHelper.checkVisible(productText);
    }
}
