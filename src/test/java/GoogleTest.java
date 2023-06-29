import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
    @Test
    void selenideFindInGoogle() {
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

        open("https://www.google.com/");
        $("#L2AGLb").click();
        $("textarea").setValue("kek").submit();
        $(".hlcw0c").shouldHave(Condition.text("kek"));
    }
}
