import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Test {
    static String siteHomePage = "https://pn.com.ua/";
    private static WebDriver driver;
    private  HomePage homepage;
    private Page page;
    private Page page1;


    @BeforeClass
    public static void testBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\User_Asus\\Desktop\\тестирование\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(siteHomePage);
    }

    @org.junit.Test
    public void testComputerCategory() throws Exception {
        homepage = PageFactory.initElements(driver, HomePage.class);
        page = homepage.choiceComputerCategory();
        System.out.println(page.getTextITService());
        page.getTextITService();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
        Assert.assertEquals(page.getTextITService().contains("IT услуги"), true);
    }

    @org.junit.Test
    public void testSofas() throws InterruptedException {
        homepage = PageFactory.initElements(driver, HomePage.class);
        page1 = homepage.choiceSofaCategory();
        page1.getTextSofas();
        page1.clickSofas();

        int prevcount = page1.getPrevCount();
        page1.clickAWF();
        int currcount = page1.getCurrCount();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
        Assert.assertEquals(prevcount == currcount, true);
    }

    @After
    public void closeDriver() {
        driver.close();
    }
}
