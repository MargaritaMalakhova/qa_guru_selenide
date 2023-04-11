package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class JunitExampleSearch {
    @Test
    void junitExampleShouldBeFound() {
        //open Selenide project page
        open("https://github.com/selenide/selenide/");
        //click on Wiki section
        $("#wiki-tab").click();
        //insure SoftAssertions page is in the Pages list
        $("ul li.wiki-more-pages-link button").click();
        $("div.wiki-rightbar").$(byText("Soft Assertions"));
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("div.wiki-rightbar").$$("#wiki-pages-box ul li.wiki-more-pages.px-2")
                .last().$("a").click();
        $("h1").shouldHave(text("SoftAssertions"));
        sleep(5000);
    }
}
