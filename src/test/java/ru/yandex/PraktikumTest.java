package ru.yandex;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class PraktikumTest {
    @Test
    public void testNew () {

        // открывается страница и создаётся экземпляр класса страницы
        LoginPageMestoSelenide loginPage =
                open("https://qa-mesto.praktikum-services.ru/",
                        LoginPageMestoSelenide.class);

        // вход в приложение и создание экземпляра главной страницы
        HomePageMestoSelenide homePage = loginPage.login("banksnab@mail.ru",
                "1234");

        // сохранение в переменную profileActivity значения поля "Занятие" профиля пользователя
        String profileActivity = homePage.getActivity();
        System.out.println(profileActivity);

    }
}
