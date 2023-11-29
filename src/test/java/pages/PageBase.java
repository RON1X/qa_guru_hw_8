package pages;

import pages.components.CalendarComponent;
import pages.components.TableComponent;
import pages.components.UserFormComponent;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class PageBase {

    CalendarComponent calendarComponent = new CalendarComponent();
    TableComponent tableComponent = new TableComponent();
    UserFormComponent userFormComponent = new UserFormComponent();

    public void removeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
    }

}
