package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;

    private By sliderInput = By.cssSelector(".sliderContainer input");
    private By sliderResult = By.cssSelector(".sliderContainer span");

    public HorizontalSliderPage(WebDriver driver){

        this.driver = driver;

    }

    public void enterKeys(String keys){

        driver.findElement(sliderInput).sendKeys(keys);

    }

    public void moveSlider(){

        enterKeys(Keys.chord(Keys.ARROW_RIGHT));

    }

    public String getResultText(){

        return driver.findElement(sliderResult).getText();

    }

}
