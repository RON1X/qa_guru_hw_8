package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.TextBoxPage;

public class RegistrationTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TestData data = new TestData();

    @Test
    void fillFormTest() {
        registrationPage.openPage(data.urlRegistrationPage)
                .setFirstName(data.firstName)
                .setLastName(data.lastName)
                .setEmail(data.email)
                .setGender(data.gender)
                .setNumber(data.number)
                .setDateOfBirth(data.day_of_birth, data.month_of_birth, data.year_of_birth)
                .setSubject(data.subject)
                .setHobby(data.hobby)
                .uploadImage(data.fileUrl)
                .setAddress(data.address)
                .setState(data.state)
                .setCity(data.city)
                .clickSubmitButton()
                .verifyResult("Student Name", data.firstName + " " + data.lastName)
                .verifyResult("Student Email", data.email)
                .verifyResult("Gender", data.gender)
                .verifyResult("Mobile", data.number)
                .verifyResult("Date of Birth", data.day_of_birth + " " + data.month_of_birth + "," + data.year_of_birth)
                .verifyResult("Subjects", data.subject)
                .verifyResult("Hobbies", data.hobby)
                .verifyResult("Picture", data.fileUrl)
                .verifyResult("Address", data.address)
                .verifyResult("State and City", data.state + " " + data.city);
    }
}
