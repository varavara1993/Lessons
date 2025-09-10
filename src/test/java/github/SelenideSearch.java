package github;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SelenideSearch {
    @Test
    void search() {
        open("https://github.com");
        $("[data-target='qbsearch-input.inputButton']").click();
        $("[id='query-builder-test']").setValue("Selenide").pressEnter();
        $("span.search-match").shouldBe(text("selenide/selenide"));




    }
}
