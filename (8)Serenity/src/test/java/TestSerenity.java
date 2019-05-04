import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TestSerenity {
    static String siteHomePage = "https://pn.com.ua";

    @Steps
    StepsForSerenity stepsForSerenity;

    @Test
    public void verifySubCategory() throws InterruptedException {
        // GIVEN
        stepsForSerenity.a_user_visits_a_page(siteHomePage);
        // WHEN
        stepsForSerenity.the_user_chooses_Computer();
        // THEN
        stepsForSerenity.the_user_can_see_subcategory_ITService("IT услуги");
    }

    @Test
    public void verifyCountOfSofas() throws InterruptedException {
        // GIVEN
        stepsForSerenity.a_user_visits_a_page(siteHomePage);
        // WHEN
        stepsForSerenity.the_user_chooses_Sofas();
        // THEN
        stepsForSerenity.checking_the_number_of_awf();
    }
}

