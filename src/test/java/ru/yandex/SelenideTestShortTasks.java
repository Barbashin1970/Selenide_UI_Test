package ru.yandex;

import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTestShortTasks {

	@Test
	public void checkButtonText() {
		// создай драйвер для браузера Chrome
		// перейди на страницу тестового стенда
		open("https://qa-mesto.praktikum-services.ru/");

		// Блок авторизации
		$(byId("email")).setValue("banksnab@mail.ru");
		$(byId("password")).setValue("1234");
		$(byClassName("auth-form__button")).click();


		// Задача 0
		// Подсчитай количество карточек, соответствующих местоположению "Москва"
		//Integer cardsQuantity = $$(byText("Москва")).size();
		//System.out.println("карточек тут "+ cardsQuantity);

		// Задача 1.
		// кликни по изображению профиля
		//$(byCssSelector(".profile__image")).click();
		// в поле ссылки на изображение введи ссылку
		//$(byId("owner-avatar")).setValue("https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/avatarSelenide.png");
		// сохрани новое изображение
		//$(byXpath(".//form[@name='edit-avatar']/button[text()='Сохранить']")).click();

		// Задача 2
		// кликни по кнопке добавления нового контента
		//$(byClassName("profile__add-button")).click();
		// в поле названия введи «Москва»
		//$(byName("name")).setValue("Москва");
		// в поле ссылки на изображение введи ссылку
		//$(byName("link")).setValue("https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/photoSelenide.jpg");
		// сохрани контент
		//$(byXpath(".//form[@name='new-card']/button[text()='Сохранить']")).click();
		// удали добавленную карточку, кликнув по кнопке удаления
		//$(byXpath(".//button[@class='card__delete-button card__delete-button_visible']")).click();

		// Задача 3
		// кликни по кнопке редактирования профиля
		//$(byClassName("profile__edit-button")).click();
		// введи «Аристарх Сократович» в поле «Имя»
		//$(byId("owner-name")).setValue("Аристарх Сократович");
		// введи «Автор автотестов» в поле «Занятие»
		//$(byId("owner-description")).setValue("Автор автотестов");
		// сохрани изменения
		//$(byXpath(".//form[@name='edit']/button[text()='Сохранить']")).click();

		// Задача 4 - получи текст второй карточки и сохрани его в переменную cardText
		// Чтобы найти веб-элемент внутри другого веб-элемента, используй метод find.
		// Например, так: $(byId("поиск веб-элемента по id")).find(byId("поиск вложенного веб-элемента по его id"))
		//
		// Чтобы выбрать все карточки коллекции, можно использовать имя класса: byClassName("card")
		// Чтобы найти подпись карточки, используй её класс byClassName("card__title")
		// Чтобы выбрать элемент коллекции, пригодится метод get(номер_элемента).
		// Нумерация элементов в коллекции начинается с нуля.
		// Чтобы получить текст веб-элемента, понадобится метод getText()

		String cardText = $$(byClassName("card")).get(2).find(byClassName("card__title")).getText();
		System.out.println(cardText);

		// дождаться чтобы была кликабельна $(byTagName("Войти").shouldBe(clickable));
		// дождаться, пока кнопка станет активной, а потом кликнуть по ней
		// $("#submit").shouldBe(enabled).click();
		// ждать, пока веб-элемент не станет видимым, в течение 8с
		// shouldBe(visible, Duration.ofSeconds(8))

		// проверь, что на кнопке входа в приложение есть надпись "Войти"
	    // $(byClassName("auth-form__button")).shouldHave(exactText("Войти"));

	}
}