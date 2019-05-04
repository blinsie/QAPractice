package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SofaPage {
    private WebDriver driver;
    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[2]/div[2]/div/section/div[2]/article[1]/div/ul/li[2]/a")
    private WebElement sofas;//диваны для гостиной
    @FindBy (xpath = "html/body/div[1]/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[3]/span[4]/a")
    private WebElement awf;
    @FindBy(xpath ="html/body/div[1]/div[2]/div/div/div[1]/ul/li[1]/a/span")
    private WebElement returnHomePage;

    public SofaPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); }

    public String getTextSofas() { return sofas.getText(); }

    public HomePage clickSofas() {
        sofas.click();
        return new HomePage(driver); }

    public HomePage clickAWF() {
        awf.click();
        return new HomePage(driver); }

    public int getPrevCount() {
        return Integer.parseInt(driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[3]/span[4]/small"))
                .getText()); }

    public int getCurrCount() {
        return Integer.parseInt(driver.findElement(By.xpath(
                "html/body/div[1]/div[2]/div/div[2]/div[1]/ul/li[3]/small/b")).getText()); }
}
