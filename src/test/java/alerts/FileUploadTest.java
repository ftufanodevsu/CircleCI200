package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload(){

        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:\\Users\\franc\\IdeaProjects\\webdriver_java\\resources\\chromedriver.exe");
        assertEquals(fileUploadPage.getUploadedFiles(),"chromedriver.exe", "Wrong uploaded file");

    }

}
