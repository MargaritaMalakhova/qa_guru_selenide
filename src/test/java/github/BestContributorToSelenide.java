package github;

import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {
        @Test
        void asolntsevShouldBeFirstContributor() {
            //open page with Selenide repository
            open("https://github.com/selenide/selenide");
            //hover first avatar by coursor
            $("div.Layout-sidebar").$(byText("Contributors"))
                    .closest(".BorderGrid-cell").$$("ul li").first().hover();
            //check text in pop-up
            $(".Popover-message").shouldHave(text("Andrei Solntsev"));
        }
}
