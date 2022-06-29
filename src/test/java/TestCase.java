import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import static org.aspectj.bridge.Version.getText;

public class TestCase extends BasePage {

    @FindBy(xpath = "//android.view.View[@content-desc=\"Login\"]")
    MobileElement loginbtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    MobileElement phonenum;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
    MobileElement continewbtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")
    MobileElement passbtn;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Login\"]")
    MobileElement loginbtnclk;

    public TestCase() throws IOException, InterruptedException {
        {
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        }
    }

    public String openApp() throws InterruptedException, MalformedURLException {
        loginbtn.click();
        phonenum.sendKeys("01900000001");
        continewbtn.click();
        passbtn.sendKeys("1234");
        loginbtnclk.click();
        return getText();
    }


}
