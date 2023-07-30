import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class Homework23 {
    @Test
    void Test1() {
        open("https://hotline.ua/");
        $(".icon-section--categories--auto").click();
        sleep(3000);
    }

    @Test
    void Test2() {
        open("https://hotline.ua/");
        $("input[aria-controls=\"autosuggest-autosuggest__results\"]").setValue("Generator").pressEnter();
        webdriver().shouldHave(urlContaining("q=Generator"));
        sleep(3000);
    }
    @Test
    void Test3() {
        open("https://hotline.ua/");
        $("input[aria-controls=\"autosuggest-autosuggest__results\"]").setValue("Generator").pressEnter();
        webdriver().shouldHave(urlContaining("q=Generator"));
        SelenideElement alt = $("GasEBDUAL");
        $(".list-item__img").click();
        webdriver().shouldHave(urlContaining("ecoflow-smart-generator-dual-fuel"));
        sleep(3000);
    }
    @Test
    void Test4() {
        open("https://hotline.ua/");
        $("input[aria-controls=\"autosuggest-autosuggest__results\"]").setValue("Generator").pressEnter();
        webdriver().shouldHave(urlContaining("q=Generator"));
        SelenideElement alt = $("GasEBDUAL");
        $(".list-item__img").click();
        webdriver().shouldHave(urlContaining("ecoflow-smart-generator-dual-fuel"));
        $(".many__price-btn-container").click();
        sleep(3000);
    }
    @Test
    void Test5() {
        open("https://hotline.ua/");
        $("input[aria-controls=\"autosuggest-autosuggest__results\"]").setValue("Generator").pressEnter();
        webdriver().shouldHave(urlContaining("q=Generator"));
        SelenideElement alt = $("GasEBDUAL");
        $(".list-item__img").click();
        webdriver().shouldHave(urlContaining("ecoflow-smart-generator-dual-fuel"));
        $(".mini-price-dynamics__link").click();
        sleep(3000);
    }
}
