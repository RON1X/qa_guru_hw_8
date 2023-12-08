package tests;

import com.github.javafaker.Faker;
import java.util.HashMap;
import java.util.Map;

public class TestData {

    Faker faker = new Faker();

    final String
            urlRegistrationPage = "/automation-practice-form",
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = getRandomGender(),
            number = faker.phoneNumber().subscriberNumber(10),
            yearOfBirth = getRandomYear(),
            monthOfBirth = getRandomMounth(),
            dayOfBirth = getRandomDay(),
            subject = getRandomSubjects(),
            hobby = getRandomHobbies(),
            fileUrl = "capybara.jpg",
            address = faker.address().cityName(),
            state = getRandomState(),
            city = getRandomCity(state),
            urlTextBoxPage = "/text-box",
            currentAddress = faker.address().streetAddress(),
            permanentAddress = faker.address().secondaryAddress();

    public String getRandomGender() {
        String[] genders = {"Male","Female","Other"};
        return faker.options().option(genders);
    }
    public String getRandomSubjects() {
        String[] subjects = {"Math", "Accounting", "Social Studies", "Arts", "Chemistry","English", "Biology", "Computer Science", "Economics"};
        return faker.options().option(subjects);
    }

    public String getRandomHobbies() {
        String[] hobbies = {"Sports","Reading","Music"};
        return faker.options().option(hobbies);
    }

    public String getRandomState() {
        String[] state = getStateAndCity().keySet().toArray(String[]::new);
        return faker.options().option(state);
    }

    public String getRandomCity(String state) {
        String[] city = getStateAndCity().get(state);
        return faker.options().option(city);
    }

    public Map<String, String[]> getStateAndCity() {
        HashMap<String, String[]> stateAndCity = new HashMap<>();
        stateAndCity.put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
        stateAndCity.put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
        return stateAndCity;
    }

    public String getRandomDay() {
        return String.format("%02d",(faker.number().numberBetween(1,28)));
    }

    public String getRandomMounth() {
        String[] mounth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return faker.options().option(mounth);
    }

    public String getRandomYear() {
        String year = String.valueOf(faker.number().numberBetween(1800, 2022));
        return faker.options().option(year);
    }
}