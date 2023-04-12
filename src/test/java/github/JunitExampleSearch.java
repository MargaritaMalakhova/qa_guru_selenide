package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class JunitExampleSearch {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void junitExampleShouldBeFound() {
        //open Selenide project page
        open("https://github.com/selenide/selenide/");
        //click on Wiki section
        $("#wiki-tab").click();
        //insure SoftAssertions page is in the Pages list
        $(".wiki-rightbar").$("button").shouldHave(text(" Show 2 more pages")).click();
        //open SoftAssertions, check code example for JUnit5
        $("div#wiki-pages-box").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
