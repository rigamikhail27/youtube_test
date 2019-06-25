package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VideoPage {

    static WebDriver driver;

    public VideoPage(WebDriver driver) {
        this.driver = driver;
    }

    private By avatar = By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-video-owner-renderer']//img[@id='img']");

    public AvatarPage clickOn_avatar(){
        driver.findElement(avatar).click();
        return new AvatarPage(driver);
    }
}
