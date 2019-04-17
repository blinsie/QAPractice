import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DoTest {
    private static WebDriver driver;

    @Before
    public void TestBeforeMethod() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\User_Asus\\Desktop\\тестирование\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://pn.com.ua/");
    }

    @Test
    public void Test1() {
        driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div/div[2]/div/section/div[5]/ul/li[1]/a")).click();
        List<WebElement> wElements = driver.findElements(By.xpath(
                "html/body/div[1]/div[2]/div/div[2]/div[2]/div[2]/section/div[3]" +
                        "[contains(text(), 'AMF')]"
        ));
        boolean cond = true;
        for (WebElement wEl : wElements)
            if (!wEl.getText().contains("AMF")) cond = false;
        Assert.assertEquals(cond,  true);
    }

    @Test
    public void Test2() {
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[2]/div/section/div[5]/ul/li[1]/a")).click();
        int prevcount = Integer.parseInt(
                driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[3]/span[4]/small")).getText());

        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[3]/span[4]/a")).click();
        int currcount = Integer.parseInt(driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/ul/li[3]/small/b")).getText());

        Assert.assertEquals(prevcount == currcount, true);
    }

    @Test
    public void Test3() {
        driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div/div[2]/div/section/div[3]/ul/li[3]/a")).click();
        driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[3]/article[1]/div[2]/div[2]/span[2]/a")).click();
        driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[3]/article[2]/div[2]/div[2]/span[2]/a")).click();

        String compare = driver.findElement(
                By.xpath("html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[1]/div[1]/a")).getText();
        Assert.assertEquals(compare, "Сравнить (2)");
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[1]/div[1]/a")).click();

        String text = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/ul/li[3]/small")).getText();
        Assert.assertEquals(text, "(2 модели)");
    }

    @Test
    public void Test4() {
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[2]/div/section/div[3]/ul/li[3]/a")).click();
        driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[3]/article[1]/div[2]/div[2]/span[2]/a")).click();
        driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[3]/article[2]/div[2]/div[2]/span[2]/a")).click();
        driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[3]/article[3]/div[2]/div[2]/span[2]/a")).click();
        driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[3]/article[4]/div[2]/div[2]/span[2]/a")).click();

        String compare = driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[1]/div[1]/a")).getText();
        Assert.assertEquals(compare, "Сравнить (4)");
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[1]/div[1]/a")).click();

        String text = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/ul/li[3]/small")).getText();
        Assert.assertEquals(text, "(4 модели)");

        driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div/div[2]/section/div[2]/div/div[2]/div/div/div/div[1]/div[1]/div/div[4]/a")).click();
        String delete = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/ul/li[3]/small")).getText();
        Assert.assertEquals(delete, "(3 модели)");
    }

    @Test
    public void Test5() {
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[2]/div/section/div[3]/ul/li[3]/a")).click();
        driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[3]/article[1]/div[2]/div[2]/span[2]/a")).click();
        driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[3]/article[2]/div[2]/div[2]/span[2]/a")).click();
        driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[3]/article[3]/div[2]/div[2]/span[2]/a")).click();
        driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[3]/article[4]/div[2]/div[2]/span[2]/a")).click();

        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div[2]/div[2]/section/div[1]/div[1]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[2]/section/div[2]/div/div[1]/div[1]/a")).click();
        driver.switchTo().alert().accept();

        boolean cond = false;
        if (driver.getCurrentUrl().contains("https://pn.com.ua/ct/2163/")) cond = true;
        Assert.assertTrue(cond);
    }

    @Test
    public void Test6() {
        WebElement element = driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[4]/form/div[1]/div[1]/input"));
        element.sendKeys("Samsung");
        driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[4]/form/div[1]/div[3]/input")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[2]/div/section/article[2]/ul/li[1]/ul/li[1]/a")).click();
        List<WebElement> elemList = driver.findElements(By.xpath(".//*[@id='column-center']/section/div[3]/article/div[2]/div[1]/" +
                "a[contains(text(), 'Samsung')]"));
        boolean cond = true;
        for (WebElement we : elemList)
            if (!we.getText().contains("Samsung")) cond = false;
        Assert.assertTrue(cond);
    }

    @After
    public void closeDriver() throws Exception {
        driver.close();
    }


}
