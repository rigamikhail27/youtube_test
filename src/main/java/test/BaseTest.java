//package test;
//
//import io.github.bonigarcia.wdm.FirefoxDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.BeforeClass;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//
//import java.util.concurrent.TimeUnit;
//
//public class BaseTest {
//
//    public static WebDriver driver;
//    public static String browser = "chrome";
//
//    @BeforeClass
//    public static void setUp2() {
//
//        switch (browser) {
//
//            case "firefox":
////                WebDriverManager.firefoxdriver().setup();
////                FirefoxOptions optionsF = new FirefoxOptions();
////                optionsF.setExperimentalOption("useAutomationExtension", false);
////                driver = new FirefoxDriver(optionsF);
////                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////                driver.manage().window().setSize(new Dimension(1500, 1000));
////                break;
//
//            case "chrome":
//                WebDriverManager.chromedriver().setup();
////                ChromeOptions optionsC = new ChromeOptions();
////                optionsC.setExperimentalOption("useAutomationExtension", false);
//                driver = new ChromeDriver();
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                driver.manage().window().setSize(new Dimension(1500, 1000));
//                break;
//
//            default:
//                break;
//        }
//
//        driver.get("https://www.youtube.com/");
//
//    }
//}
