package ru.yandex;

import ru.yandex.SelenideTest;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideTestRun {

    @Test
    public void test () {

        // открывается страница и создаётся экземпляр класса страницы
        SelenideTest loginPage =
                open("https://qa-mesto.praktikum-services.ru/",
                        SelenideTest.class);

        // вход в приложение
        loginPage.login("banksnab@mail.ru",
                "1234");

    }

}
