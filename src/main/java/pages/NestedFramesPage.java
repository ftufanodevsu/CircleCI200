package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String topFrame = "frame-top";
    private String topLeftFrame = "frame-left";
    private By topLeftTitle = By.tagName("body");
    private String bottomFrame = "frame-bottom";
    private By bottomTitle = By.tagName("body");

    public NestedFramesPage(WebDriver driver){

        this.driver = driver;

    }

    public String getTextFromTopLeftArea(){

        switchToTopArea();
        switchToLeftArea();
        String text = driver.findElement(topLeftTitle).getText();
        switchToMainArea();
        switchToMainArea();
        return text;

    }

    public String getTextFromBottomArea(){

        switchToBottomArea();
        String text = driver.findElement(bottomTitle).getText();
        switchToMainArea();
        return text;

    }

    private void switchToTopArea(){

        driver.switchTo().frame(topFrame);

    }

    private void switchToLeftArea(){

        driver.switchTo().frame(topLeftFrame);

    }

    private void switchToBottomArea(){

        driver.switchTo().frame(bottomFrame);

    }

    private void switchToMainArea(){

        driver.switchTo().parentFrame();

    }

}
