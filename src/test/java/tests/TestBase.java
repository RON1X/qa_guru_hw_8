package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;
import pages.TextBoxPage;

public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TextBoxPage textBoxPage = new TextBoxPage();

    final String
            urlRegistrationPage = "/automation-practice-form",
            firstName = "Капибара",
            lastName = "0_0",
            email = "capibara@gmail.com",
            gender = "Male",
            number = "1234567890",
            year_of_birth = "2000",
            month_of_birth = "November",
            day_of_birth = "25",
            subject = "Arts",
            hobby = "Sports",
            fileUrl = "capybara.jpg",
            address = "Пруд с апельсинами",
            state = "NCR",
            city = "Delhi",
            urlTextBoxPage = "/text-box",
            currentAddress = "Mars 2",
            permanentAddress = "Mars";

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }
}
