import Pages.ComputerPage;
import Pages.HomePage;
import Pages.SofaPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.assertj.core.api.Assertions.assertThat;

public class StepsForSerenity {
    public HomePage homePage;
    public WebDriver driver;
    public ComputerPage computerPage;
    public SofaPage sofaPage;
    public String siteHomePage = "https://pn.com.ua/";

    @Step("Given the user visits a page {0}")
    public void a_user_visits_a_page(String homePage) {
        this.siteHomePage = homePage;
    }

    @Step("When the user chooses category Computer")
    public void the_user_chooses_Computer() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\User_Asus\\Desktop\\тестирование\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get(siteHomePage);
        computerPage = homePage.choiceComputerCategory();
    }
    @Step("Then the user sees {0} subcategory")
    public void the_user_can_see_subcategory_ITService(String subCategory) {
        assertThat(computerPage.getTextITService()).overridingErrorMessage
                ("testComputerCategory failed").contains(subCategory);
        driver.close();
    }

    /////////////////////////////////////////////////////////////////////

    @Step("When the user chooses category Sofas")
    public void the_user_chooses_Sofas() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\User_Asus\\Desktop\\тестирование\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get(siteHomePage);
        sofaPage = homePage.choiceSofaCategory();
    }
    @Step("Then the user sees subcategory")
    public void checking_the_number_of_awf() {
        sofaPage.clickSofas();
        int prevcount = sofaPage.getPrevCount();
        sofaPage.clickAWF();
        int currcount = sofaPage.getCurrCount();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
        Assert.assertEquals(prevcount == currcount, true);
        driver.close();
    }
}

