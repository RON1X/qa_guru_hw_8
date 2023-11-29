package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class UserFormComponent {
    public void verifyResult(String key, String value) {
        $("#output").$(byId(key)).shouldHave(text(value));
    }
}
