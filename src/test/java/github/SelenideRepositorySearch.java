package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        //open main page
        open("https://github.com/");
        // put "selenide" and press enter
        $("[placeholder='Search GitHub']").setValue("selenide").pressEnter();
        //click on first repository from the founded list
        $$("ul.repo-list li").first().$("a").click();
        //check title "selenide/selenide"
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }
}
