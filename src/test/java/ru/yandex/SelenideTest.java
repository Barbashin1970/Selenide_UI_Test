package ru.yandex;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SelenideTest {
    // локатор поля ввода email
    @FindBy(how = How.ID,using = "email")
    private SelenideElement emailField;
    // локатор поля ввода пароля
    @FindBy(how = How.ID,using = "password")
    private SelenideElement passwordField;
    // локатор кнопки входа в приложение
    @FindBy(how = How.CLASS_NAME,using = "auth-form__button")
    private SelenideElement signInButton;
    // метод заполнения поля ввода email
    public void setUsername(String username) {
        emailField.setValue(username);
    }
    // метод заполнения поля ввода пароля
    public void setPassword(String password) {
        passwordField.setValue(password);
    }
    // метод клика по кнопке авторизации
    public void clickSignInButton() {
        signInButton.click();
    }
    // метод авторизации в приложении: объединяет ввод email, пароля и клик по кнопке
    public void login(String username, String password){
        setUsername(username);
        setPassword(password);
        clickSignInButton();
    }
}
