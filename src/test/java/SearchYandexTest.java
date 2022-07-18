import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

//проверка селекторов

public class SearchYandexTest {

    @Test
    void successfulSearchTest() {
        open("https://ya.ru/");
        $("#text").setValue("Кинопоиск");
        $("[type=submit]").click();
        //  $("button[type=\"submit\"]").click();                 //css
        //  $(By.xpath("//button[@type=\"submit\"]")).click();    //xpath
        $("[class=main__content]").shouldHave(text("kinopoisk.ru"));
    }
}
