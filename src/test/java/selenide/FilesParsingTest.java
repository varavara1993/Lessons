package selenide;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class FilesParsingTest {
    @Test
    void pdfParseTest() throws IOException {
        open("https://docs.junit.org/current/user-guide/");
        File downloadedPdf = $("a[href='junit-user-guide-6.0.0.pdf']").download();
        PDF content = new PDF(downloadedPdf);
        assertThat(content.author).contains("Sam Brannen");
    }
}
