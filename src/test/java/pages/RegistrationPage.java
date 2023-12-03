package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Tag;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

@Tag("registration")
public class RegistrationPage extends PageBase {

    SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderSelect = $("#genterWrapper"),
            numberInput = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            hobbiesSelect = $("#hobbiesWrapper"),
            uploadPictureInput = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input"),
            submitButton = $("#submit");

    @Step("Открыть страницу {url}")
    public RegistrationPage openPage(String url) {
        open(url);
        removeBanner();
        return this;
    }

    @Step("Указать имя {firstName}")
    public RegistrationPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }

    @Step("Указать фамилию {lastName}")
    public RegistrationPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    @Step("Указать email {email}")
    public RegistrationPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    @Step("Выбрать пол {gender}")
    public RegistrationPage setGender(String gender) {
        genderSelect.$(byText(gender)).click();
        return this;
    }

    @Step("Указать номер телефона {number}")
    public RegistrationPage setNumber(String number) {
        numberInput.setValue(number);
        return this;
    }

    @Step("Указать дату рождения {day}.{month}.{year}")
    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        calendarComponent.setDate(day, month, year);
        return this;
    }

    @Step("Указать предмет {subject}")
    public RegistrationPage setSubject(String subject) {
        subjectsInput.setValue(subject).pressEnter();
        return this;
    }

    @Step("Указать хобби {hobby}")
    public RegistrationPage setHobby(String hobby) {
        hobbiesSelect.$(byText(hobby)).click();
        return this;
    }

    @Step("Загрузить картинку {fileUrl}")
    public RegistrationPage uploadImage(String fileUrl) {
        uploadPictureInput.uploadFromClasspath(fileUrl);
        return this;
    }

    @Step("Указать адрес {address}")
    public RegistrationPage setAddress(String address) {
        addressInput.setValue(address);
        return this;
    }

    @Step("Указать штат {state}")
    public RegistrationPage setState(String state) {
        stateInput.setValue(state).pressEnter();
        return this;
    }

    @Step("Указать город {city}")
    public RegistrationPage setCity(String city) {
        cityInput.setValue(city).pressEnter();
        return this;
    }

    @Step("Нажать кнопку Submit")
    public RegistrationPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    @Step("Проверить что в поле {key} находится значение {value}")
    public RegistrationPage verifyResult(String key, String value) {
        tableComponent.verifyResult(key, value);
        return this;
    }
}
