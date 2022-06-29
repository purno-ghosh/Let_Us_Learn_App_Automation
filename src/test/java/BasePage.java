import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterTest;

import java.io.IOException;

public class BasePage {

    public AndroidDriver driver = AppLaunch.getInstance().driver;
    public BasePage() throws IOException, InterruptedException {
    }
    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
