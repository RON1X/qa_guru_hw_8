package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.UserFormComponent;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage extends PageBase {

    UserFormComponent userFormComponent = new UserFormComponent();

    SelenideElement nameInput = $("#userName"),
            emailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitButton = $("#submit");


    public TextBoxPage openPage(String url) {
        open(url);
        removeBanner();
        return this;
    }

    public TextBoxPage setName(String name) {
        nameInput.setValue(name);
        return this;
    }

    public TextBoxPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public TextBoxPage setCurrentAddress(String currentAddress) {
        currentAddressInput.setValue(currentAddress);
        return this;
    }

    public TextBoxPage setPermanentAddress(String permanentAddress) {
        permanentAddressInput.setValue(permanentAddress);
        return this;
    }

    public TextBoxPage submitButtonClick() {
        submitButton.click();
        return this;
    }

    public TextBoxPage verifyResult(String key, String value) {
        userFormComponent.verifyResult(key, value);
        return this;
    }
}