package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxTests extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();
    TestData data = new TestData();

    @Test
    void fillFormTest() {
        textBoxPage.openPage(data.urlTextBoxPage)
                .setName(data.firstName)
                .setEmail(data.email)
                .setCurrentAddress(data.currentAddress)
                .setPermanentAddress(data.permanentAddress)
                .submitButtonClick()
                .verifyResult("name", data.firstName)
                .verifyResult("email", data.email)
                .verifyResult("currentAddress", data.currentAddress)
                .verifyResult("permanentAddress", data.permanentAddress);
    }
}
