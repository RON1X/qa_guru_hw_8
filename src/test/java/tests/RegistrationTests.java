package tests;

import org.junit.jupiter.api.Test;

public class RegistrationTests extends TestBase {

    @Test
    void fillFormTest() {
        registrationPage.openPage(urlRegistrationPage)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setNumber(number)
                .setDateOfBirth(day_of_birth, month_of_birth, year_of_birth)
                .setSubject(subject)
                .setHobby(hobby)
                .uploadImage(fileUrl)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .clickSubmitButton()
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", number)
                .verifyResult("Date of Birth", day_of_birth + " " + month_of_birth + "," + year_of_birth)
                .verifyResult("Subjects", subject)
                .verifyResult("Hobbies", hobby)
                .verifyResult("Picture", fileUrl)
                .verifyResult("Address", address)
                .verifyResult("State and City", state + " " + city);
    }
}
