package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());
        goHome();
        setCookie();

        homePage = new HomePage(driver);

    }

    @BeforeMethod
    public void goHome(){

        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

    }

    @AfterClass
    public void quitBrowser(){

        driver.quit();

    }

    @AfterMethod
    public void recordFailure(ITestResult result) throws IOException {

        if(ITestResult.FAILURE == result.getStatus()){

            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);

            try {

                Files.move(screenshot, new File ("resources/screenshots/" + result.getName() + ".png"));

            }catch (IIOException e){

                e.printStackTrace();

            }

        }

    }

    private ChromeOptions getChromeOptions(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        return options;

    }

    private void setCookie(){

        Cookie cookie = new Cookie.Builder("TAU", "123")
                .domain("the-internet.herokuapp.com").build();

        driver.manage().addCookie(cookie);

    }

    public WindowManager getWindowManager(){

        return new WindowManager(driver);

    }

}
