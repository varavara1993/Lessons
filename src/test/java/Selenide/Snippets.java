package Selenide;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class Snippets {
    @Test
    void browser_command(){
        Configuration.baseUrl = "https://www.google.com";
        open("https://google.com");
        open("/path/path");
        back();
        refresh();
        clearBrowserCookies();
        clearBrowserCookies();
        executeJavaScript("sessionStorage.clear();");
        confirm(); // всплывающие окна, жмет на все"ОК"
        dismiss(); // всплывающие окна, "закрыть"
        closeWindow();
        closeWebDriver();
        switchTo().frame("");
        switchTo().window("");


    void selectors_example(){
        $("").click();
        element("").click();

        $("div", 2).click();
        $x("xpath").click();
        $(byText("text"));
        $(withText("text")).click();


        }

    void actions(){
        $("a").click();
        $("a").doubleClick();

        $("").hover(); //подвести мышку и не кликать

        $("").setValue("");

        $("").sendKeys(""); //hotkey

        $("").pressEnter();
        $("").pressTab();
        $("").pressEscape();




        }







    }


    }
}
