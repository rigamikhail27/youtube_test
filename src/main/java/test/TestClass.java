package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.*;
import utils.RandomWord;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TestClass {

    private WebDriver driver;
    private MainPage mainPage;
    private SearchPage searchPage;
    private VideoPage videoPage;
    private AvatarPage avatarPage;
    private RandomWord random;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1500, 1000));

        driver.get("https://www.youtube.com/");

        mainPage = new MainPage(driver);
        searchPage = new SearchPage(driver);
        videoPage = new VideoPage(driver);
        avatarPage = new AvatarPage(driver);
        random = new RandomWord();
    }

    @Test
    public void testing() {
        mainPage.assert_titlePage().search(random.get_randomWord());
        searchPage.clickOn_fourthResult();
        videoPage.clickOn_avatar();
        avatarPage.clickOn_subscribeButton().assert_wordEnter();
    }

    @After
    public void tearDown() {
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.switchTo().window(tabs.get(0));
        driver.close();
    }
}