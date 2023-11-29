package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;
import pages.TextBoxPage;

import java.util.Locale;

public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TextBoxPage textBoxPage = new TextBoxPage();

    Faker faker = new Faker();

    final String
            urlRegistrationPage = "/automation-practice-form",
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = "Male",
            number = faker.phoneNumber().subscriberNumber(10),
            year_of_birth = "2000",
            month_of_birth = "November",
            day_of_birth = "25",
            subject = "Arts",
            hobby = "Sports",
            fileUrl = "capybara.jpg",
            address = faker.address().cityName(),
            state = "NCR",
            city = "Delhi",
            urlTextBoxPage = "/text-box",
            currentAddress = faker.address().streetAddress(),
            permanentAddress = faker.address().secondaryAddress();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
    }

    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }
}
