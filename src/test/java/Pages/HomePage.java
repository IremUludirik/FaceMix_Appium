package Pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Utilities.Driver;
import Utilities.Helper;

import java.net.MalformedURLException;;

public class HomePage extends Helper {

    By getStartedBtn = MobileBy.AccessibilityId("Get Started");

    public HomePage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    public void clickGetStart() {
        click(getStartedBtn);
    }
}