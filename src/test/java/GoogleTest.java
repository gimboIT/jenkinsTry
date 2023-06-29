import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
    @Test
    void selenideFindInGoogle() {
        open("https://www.google.com/");
        $("textarea").setValue("kek").submit();
        $(".hlcw0c").shouldHave(Condition.text("kek"));
    }
}
