package demoQA;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TxtBoxTests {
    @Test
    void formTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Aleksandr");
        $("#userEmail").setValue("aleks@mail.ru");
        $("#currentAddress").setValue("Ekaterinburg, Pavlodarskaya street");
        $("#permanentAddress").setValue("Ekaterinburg, Pavlodarskaya street");
        $("#submit").scrollTo().click();
        $("#output").shouldHave(
                text("Aleksandr"),
                text("aleks@mail.ru"),
                text("Ekaterinburg, Pavlodarskaya street")
        );
        sleep(3000);
    }
}
