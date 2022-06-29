import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class AppLaunch {

    public static AndroidDriver driver;
    public static AppLaunch instance;

    private AppLaunch() throws MalformedURLException, InterruptedException {
        setUp();
    }

    public static AppLaunch getInstance() throws IOException, InterruptedException, MalformedURLException {
        if (instance == null) {
            instance = new AppLaunch();
        }
        return instance;
    }
    private void setUp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "My Device");
        cap.setCapability("platformName", "Android");
        cap.setCapability("uuid", "8906808");
        cap.setCapability("appPackage", "com.example.letuslearn");
        cap.setCapability("appActivity", "com.example.letuslearn.MainActivity");
        cap.setCapability("autoGrantPermissions", true);
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AndroidDriver(url,cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
