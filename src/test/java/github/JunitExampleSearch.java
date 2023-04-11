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
        $("#wiki-pages-box").$(byText("Show 2 more pages…")).click();
        //open SoftAssertions, check code example for JUnit5
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
        sleep(5000);
    }
}
