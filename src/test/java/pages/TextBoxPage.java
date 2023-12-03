package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage extends PageBase {

    SelenideElement nameInput = $("#userName"),
            emailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitButton = $("#submit");

    @Step("Открыть страницу {url}")
    public TextBoxPage openPage(String url) {
        open(url);
        removeBanner();
        return this;
    }

    @Step("Указать имя {name}")
    public TextBoxPage setName(String name) {
        nameInput.setValue(name);
        return this;
    }

    @Step("Указать email {email}")
    public TextBoxPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    @Step("Указать адрес 1 {currentAddress}")
    public TextBoxPage setCurrentAddress(String currentAddress) {
        currentAddressInput.setValue(currentAddress);
        return this;
    }

    @Step("Указать адрес 2 {permanentAddress}")
    public TextBoxPage setPermanentAddress(String permanentAddress) {
        permanentAddressInput.setValue(permanentAddress);
        return this;
    }

    @Step("Нажать кнопку Submit")
    public TextBoxPage submitButtonClick() {
        submitButton.click();
        return this;
    }

    @Step("Проверить что в поле {key} находится значение {value}")
    public TextBoxPage verifyResult(String key, String value) {
        userFormComponent.verifyResult(key, value);
        return this;
    }
}
