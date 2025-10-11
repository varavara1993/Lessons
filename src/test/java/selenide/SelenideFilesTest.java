package selenide;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import java.io.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class SelenideFilesTest {

    @Test
    void selenideDownloadTest() throws IOException {
        open("https://github.com/junit-team/junit-framework/blob/main/README.md");

        File downloadedFile = $("[data-testid='raw-button']").download();
        try (InputStream is = new FileInputStream(downloadedFile)) {
            byte[] bytes = is.readAllBytes();
            String textContent = new String(bytes);
            assertThat(textContent).contains("This repository is the home of JUnit Platform, Jupiter, and Vintage");
        }
    }
    @Test
    void selenideUploadFile() {
           open("https://dropmefiles.com/");
           $("input[type='file']").uploadFromClasspath("C2CA3A3C-A102-43F0-9F3A-A11451B8AF02.jpeg");
           $(".url").shouldHave(Condition.visible);

        }



}
