import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
    private WebDriver driver;
    @FindBy (xpath = ".//*[@id='column-center']/section/div[4]/article[3]/div/div")
    private WebElement ITService;
    @FindBy (xpath = "html/body/div[1]/div[2]/div/div[2]/div[2]/div/section/div[2]/article[1]/div/ul/li[2]/a")
    private WebElement sofas;//диваны для гостиной
    @FindBy (xpath = "html/body/div[1]/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[3]/span[4]/a")
    private WebElement awf;

    public WebDriver getDriver() {
        return driver;
    }
    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getTextSofas() {
        return sofas.getText();
    }

    public Page clickSofas() {
        sofas.click();
        return new Page(driver);
    }
    public Page clickAWF() {
        awf.click();
        return new Page(driver);
    }
    public String getTextITService() {
        return ITService.getText();
    }

    public int getPrevCount() {
        return Integer.parseInt(driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[3]/span[4]/small"))
                .getText());
    }
    public int getCurrCount() {
        return Integer.parseInt(driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[2]/div[1]/ul/li[3]/small/b")).getText());
    }
}
