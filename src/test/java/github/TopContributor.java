package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TopContributor {
    @Test
    public void topContributor() {
        open("https://github.com/selenide/selenide");
        $(".BorderGrid").$(byText("Contributors")).ancestor(".BorderGrid-row");
        $$("ul li").first().hover();
        $("a.Link--secondary.no-underline.ml-1").shouldHave(text("Andrei Solntsev"));






    }
}
