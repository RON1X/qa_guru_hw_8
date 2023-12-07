package tests;

import com.github.javafaker.Faker;

public class TestData {

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
}
