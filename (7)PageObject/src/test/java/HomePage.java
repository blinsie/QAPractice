import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    @FindBy (xpath = ".//*[@id='column-center']/section/div[1]/a")
    private WebElement computerCategory;
    @FindBy (xpath = "html/body/div[1]/div[2]/div/div/div[2]/div/section/div[5]/a")
    private WebElement sofaCategory;  //мебель

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public Page choiceComputerCategory() throws InterruptedException {
        computerCategory.click();
        return new Page(driver);
    }
    public Page choiceSofaCategory() throws InterruptedException {
        sofaCategory.click();
        return new Page(driver);
    }
}
