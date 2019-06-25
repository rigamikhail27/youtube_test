package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AvatarPage {

    static WebDriver driver;

    public AvatarPage(WebDriver driver) {
        this.driver = driver;
    }

    private By subscribeButton = By.xpath("//div[@id='inner-header-container']//paper-button[@id='button']");
    private By wordEnter = By.xpath("//ytd-modal-with-title-and-button-renderer//yt-formatted-string[@id='text']");

    public AvatarPage clickOn_subscribeButton(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(subscribeButton)).click();
        return this;
    }

    public String get_wordEnter(){
    return driver.findElement(wordEnter).getText();
    }

    public AvatarPage assert_wordEnter(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(wordEnter));
        Assert.assertEquals("ВОЙТИ", get_wordEnter());
        return this;
    }
}
