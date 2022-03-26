package asos.tests;

import asos.helpers.DriverUtils;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class MainPageTest extends TestBase {
    @Test
    @Description("Search tests")
    @DisplayName("Search for New Balance")
    void searchNBTest() {
        step("Open https://www.asos.com/", () -> {
            open("https://www.asos.com/");
        });

        step("Set New Balance in the search field", () -> {
            $("#chrome-search").setValue("New Balance").pressEnter();
        });

        step("Check results", () -> {
            $("._2qG85dG ._3WEsAhb > div", 1).shouldHave(Condition.text("New Balance"));
        });
    }

    @Test
    @Description("Search tests")
    @DisplayName("Search for Vans")
    void searchVansTest() {
        step("Open https://www.asos.com/", () -> {
            open("https://www.asos.com/");
        });

        step("Set Vans in the search field", () -> {
            $("#chrome-search").setValue("Vans").pressEnter();
        });

        step("Check results", () -> {
            $("._2qG85dG ._3WEsAhb > div", 1).shouldHave(Condition.text("Vans"));
        });
    }

    @Test
    @Description("Search tests")
    @DisplayName("Search for Nike")
    void searchNikeTest() {
        step("Open https://www.asos.com/", () -> {
            open("https://www.asos.com/");
        });

        step("Set Nike in the search field", () -> {
            $("#chrome-search").setValue("Nike").pressEnter();
        });

        step("Check results", () -> {
            $("._2qG85dG ._3WEsAhb > div", 1).shouldHave(Condition.text("Nike"));
        });
    }

    @Test
    @Description("Search tests")
    @DisplayName("Search for Adidas")
    void searchAdidasTest() {
        step("Open https://www.asos.com/", () -> {
            open("https://www.asos.com/");
        });

        step("Set Adidas in the search field", () -> {
            $("#chrome-search").setValue("Adidas").pressEnter();
        });

        step("Check results", () -> {
            $("._2qG85dG ._3WEsAhb > div", 1).shouldHave(Condition.text("Adidas"));
        });
    }

    @Test
    @Description("Main UI tests")
    @DisplayName("Men's Trending brands Nike link test")
    void trendingBrandsNikeTest() {
        step("Open https://www.asos.com/", () -> {
            open("https://www.asos.com/");
        });

        step("Click MEN Button", () -> {
            $("#men-floor").click();
        });

        step("Click Scroll to Trending brands and click Nike", () -> {
            $("[data-analytics-id=com-gblbrands-nike] .logoLinks__logos").scrollIntoView(false).click();
        });

        step("Check the title", () -> {
            $("#category-banner-wrapper div h1").shouldHave(Condition.text("Men's Nike"));
        });
    }

    @Test
    @Description("Main UI tests")
    @DisplayName("Men's Trending brands Tommy Hilfiger link test")
    void trendingBrandsThTest() {
        step("Open https://www.asos.com/", () -> {
            open("https://www.asos.com/");
        });

        step("Click MEN Button", () -> {
            $("#men-floor").click();
        });

        step("Click Scroll to Trending brands and click Tommy Hilfiger", () -> {
            $("[data-analytics-id=com-gblbrands-tommy] .logoLinks__logos").scrollIntoView(false).click();
        });

        step("Check the title", () -> {
            $("#category-banner-wrapper div h1").shouldHave(Condition.text("Men's Tommy Hilfiger"));
        });
    }

    @Test
    @Description("Main UI tests")
    @DisplayName("Men's Trending brands Dr. Martens link test")
    void trendingBrandsDmTest() {
        step("Open https://www.asos.com/", () -> {
            open("https://www.asos.com/");
        });

        step("Click MEN Button", () -> {
            $("#men-floor").click();
        });

        step("Click Scroll to Trending brands and click Dr. Martens", () -> {
            $("[data-analytics-id=com-gblbrands-drmartens] .logoLinks__logos").scrollIntoView(false).click();
        });

        step("Check the title", () -> {
            $("#category-banner-wrapper div h1").shouldHave(Condition.text("Men's Dr. Martens"));
        });
    }

    @Test
    @Description("Broken tests")
    @DisplayName("Broken test two")
    @Disabled
    void brokenTest() {
        step("Open https://www.asos.com/", () -> {
            open("https://www.asos.com/");
        });

        step("Set New Balance in the search field", () -> {
            $("#dd-search").setValue("New Balance").pressEnter();
        });

        step("Check results", () -> {
            $(".dd ._3WEsAhb > div", 1).shouldHave(Condition.text("New Balance"));
        });
    }

    @Test
    @Description("Broken tests")
    @DisplayName("Broken test one")
    @Disabled
    void brokenTestTwo() {
        step("Open https://www.asos.com/", () -> {
            open("https://www.asos.com/");
        });

        step("Set New Balance in the search field", () -> {
            $("#dd-search").setValue("New Balance").pressEnter();
        });

        step("Check results", () -> {
            $(".dd ._3WEsAhb > div", 1).shouldHave(Condition.text("New Balance"));
        });
    }



    @Test
    @Description("Page title test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.asos.com/'", () ->
                open("https://www.asos.com/"));

        step("Page title should have text 'ASOS | Online Shopping for the Latest Clothes & Fashion'", () -> {
            String expectedTitle = "ASOS | Online Shopping for the Latest Clothes & Fashion";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Page console test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.asos.com/'", () ->
                open("https://www.asos.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}