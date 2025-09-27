package demo_qa.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PageObject {
    private final String userName = "#userName";
    private final String userEmail = "#userEmail";
    private final String currentAddress = "#currentAddress";
    private final String permanentAddress = "#permanentAddress";
    private final String submitButton = "#submit";
    private final String output = "#output";

    public void openPage() {
        open("/text-box");
    }

    public void setUserName(String value) {
        $(userName).setValue(value);
    }
    public void setUserEmail(String value) {
        $(userEmail).setValue(value);
    }
    public void setCurrentAddress(String value) {
        $(currentAddress).setValue(value);
    }
    public void setPermanentAddress(String value) {
        $(permanentAddress).setValue(value);

    }

}
