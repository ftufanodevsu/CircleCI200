package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage2 {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadIndicator = By.id("loading");
    private By loadText = By.id("finish");

    public DynamicLoadingPage2(WebDriver driver){

        this.driver = driver;

    }

    public void clickStart(){

        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadText));

    }

    public String getLoadedText(){

        return driver.findElement(loadText).getText();

    }

}
