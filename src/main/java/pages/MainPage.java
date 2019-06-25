package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    static WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchField = By.xpath("//div[@class='ytd-searchbox-spt']//input[@id='search']");
    private By secondResult = By.xpath("//div[@class='sbsb_a']//li[2]");

    public MainPage clickOn_searchField(){
        driver.findElement(searchField).click();
        return this;
    }

    public MainPage typeIn_searchField(String randomWord){
        driver.findElement(searchField).sendKeys(randomWord);

        Boolean searchList = driver.findElements(By.xpath("//div[@class='sbsb_a']")).size() > 0;

        if (!searchList){
            driver.findElement(searchField).sendKeys(Keys.SPACE);
            driver.findElement(searchField).sendKeys(Keys.BACK_SPACE);
        } else {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sbsb_a']")));
        }

        return this;
    }

    public MainPage choose_secondResult() {
        driver.findElement(secondResult).click();
        return new MainPage(driver);
    }

    public SearchPage search(String randomWord) {
        this.clickOn_searchField();
        this.typeIn_searchField(randomWord);
        this.choose_secondResult();
        return new SearchPage(driver);
    }

    public MainPage assert_titlePage() {
        Assert.assertTrue(driver.getTitle().contains("YouTube"));
        return this;
    }
}
