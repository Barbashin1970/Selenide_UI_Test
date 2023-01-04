package ru.yandex;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

class HomePageMestoSelenide {

    // локатор для поля «Занятие» профиля пользователя
    @FindBy(how = How.CLASS_NAME,using = "profile__description")
    private SelenideElement activity;
    // метод ожидания загрузки страницы
    public void waitForLoadHomePage(){
        $(byClassName("card__image")).shouldBe(visible);
    }
    // метод, возвращающий значение поля «Занятие» профиля пользователя
    public String getActivity(){
        return activity.getText();
    }
}
