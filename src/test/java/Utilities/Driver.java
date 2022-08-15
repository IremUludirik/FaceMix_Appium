package Utilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static AndroidDriver driver;

    public static AndroidDriver getDriver() throws MalformedURLException {

        //open appium driver
        if (driver == null) {
            DesiredCapabilities DesiredCapabilities = new DesiredCapabilities();

            //Desired capabilities
            DesiredCapabilities.setCapability("platformName","Android");
            DesiredCapabilities.setCapability("appium:deviceName","emulator-5554");
            DesiredCapabilities.setCapability("appium:app","C:\\Users\\irem6.DESKTOP-8MQ14NE\\OneDrive\\Masaüstü\\Facemix AI Face Swap Videos_v1.0.8_apkpure.com.apk");

            //for more speed
            DesiredCapabilities.setCapability("fullReset:","true");
            DesiredCapabilities.setCapability("noReset","false");
            DesiredCapabilities.setCapability("autoGrantPermissions","true");

            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),DesiredCapabilities);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}