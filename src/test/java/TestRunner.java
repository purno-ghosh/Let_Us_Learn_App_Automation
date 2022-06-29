import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRunner extends BasePage  {
    TestCase objTest;

    public TestRunner() throws IOException, InterruptedException {
    }

    @Test
    public void runApp() throws IOException, InterruptedException {
        objTest=new TestCase();
        String res=objTest.openApp();

    }
}
