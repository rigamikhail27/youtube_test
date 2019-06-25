package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    static WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    private By fourthResult = By.xpath("//ytd-video-renderer[@class='style-scope ytd-item-section-renderer'][4]/div[@id='dismissable']");

    public VideoPage clickOn_fourthResult() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(fourthResult)).click();
        return new VideoPage(driver);
    }
}
