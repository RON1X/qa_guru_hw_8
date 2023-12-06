package pages;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public abstract class PageBase {
    public void removeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
    }

}
