package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OpenEnterprizeByHover {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void enterpriseShouldOpen() {
        //open Github page
        open("https://github.com/");
        //hover first avatar by cursor
        $("div.header-menu-wrapper").$(byText("Solutions")).hover();
        //click on Enterprise
        $(byText("Enterprise")).click();
        $("h1").shouldHave(text("Build like the best"));
    }
}
