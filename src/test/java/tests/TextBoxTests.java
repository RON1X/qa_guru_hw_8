package tests;

import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {
    @Test
    void fillFormTest() {
        textBoxPage.openPage(urlTextBoxPage)
                .setName(firstName)
                .setEmail(email)
                .setCurrentAddress(currentAddress)
                .setPermanentAddress(permanentAddress)
                .submitButtonClick()
                .verifyResult("name", firstName)
                .verifyResult("email", email)
                .verifyResult("currentAddress", currentAddress)
                .verifyResult("permanentAddress", permanentAddress);
    }
}
