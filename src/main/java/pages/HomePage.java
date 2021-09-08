package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private  WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;

    }

    public LoginPage clickFormAuth(){

        clickLink("Form Authentication");

        return new LoginPage(driver);

    }

    public DropdownPage clickDropdown(){

        clickLink("Dropdown");

        return new DropdownPage(driver);

    }

    public ForgotPasswordPage clickRetrievePassword(){

        clickLink("Forgot Password");

        return new ForgotPasswordPage(driver);

    }

    public HoversPage clickHovers(){

        clickLink("Hovers");

        return new HoversPage(driver);

    }

    public KeyPressesPage clickKeyPresses(){

        clickLink("Key Presses");

        return new KeyPressesPage(driver);

    }

    public HorizontalSliderPage clickHorizontalSlider(){

        clickLink("Horizontal Slider");

        return new HorizontalSliderPage(driver);

    }

    public AlertsPage clickJavaScriptAlerts(){

        clickLink("JavaScript Alerts");

        return new AlertsPage(driver);

    }


    public FileUploadPage clickFileUpload(){

        clickLink("File Upload");

        return new FileUploadPage(driver);

    }

    public ContextMenuPage clickContextMenu(){

        clickLink("Context Menu");

        return new ContextMenuPage(driver);

    }

    public WysiwygEditorPage clickWysiwygEditor(){

        clickLink("WYSIWYG Editor");

        return new WysiwygEditorPage(driver);

    }

    public NestedFramesPage clickNestedFrames(){

        clickFrames();

        clickLink("Nested Frames");

        return new NestedFramesPage(driver);

    }

    public FramesPage clickFrames(){

        clickLink("Frames");

        return new FramesPage(driver);

    }

    public DynamicLoadingPage1 clickDynamicLoading1(){

        clickDynamicLoading();

        clickLink("Example 1: Element on page that is hidden");

        return new DynamicLoadingPage1(driver);

    }

    public DynamicLoadingPage2 clickDynamicLoading2(){

        clickDynamicLoading();

        clickLink("Example 2: Element rendered after the fact");

        return new DynamicLoadingPage2(driver);

    }

    public DynamicLoadingPage clickDynamicLoading(){

        clickLink("Dynamic Loading");

        return new DynamicLoadingPage(driver);

    }

    public LargeAndDeepDOMPage clickLargeAndDeepDOM(){

        clickLink("Large & Deep DOM");

        return new LargeAndDeepDOMPage(driver);

    }

    public InfiniteScrollPage clickInfiniteScroll(){

        clickLink("Infinite Scroll");

        return new InfiniteScrollPage(driver);

    }

    public MultipleWindowsPage clickMultipleWindows(){

        clickLink("Multiple Windows");

        return new MultipleWindowsPage(driver);

    }

    protected void clickLink(String linkText){

        driver.findElement(By.linkText(linkText)).click();

    }

}
