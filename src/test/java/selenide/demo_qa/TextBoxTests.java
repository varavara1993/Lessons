package selenide.demo_qa;

import com.codeborne.selenide.Configuration;
import selenide.demo_qa.pages.PageObject;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {
    PageObject PageObject =  new PageObject();
    String userName = "Aleksandr";


    @BeforeAll
    static void beforeALL() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void formTest() {
        PageObject.openPage();

        PageObject.setUserName(userName);
        PageObject.setUserEmail("aleks@mail.ru");
        PageObject.setCurrentAddress("Ekaterinburg, Pavlodarskaya street");
        PageObject.setPermanentAddress("Ekaterinburg, Pavlodarskaya street");

        $("#submit").scrollTo().click();
        $("#output").shouldHave(
                text("Aleksandr"),
                text("aleks@mail.ru"),
                text("Ekaterinburg, Pavlodarskaya street")
        );
        sleep(3000);
    }
}
