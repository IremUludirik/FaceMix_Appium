package Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;

public class Helper {
    public Helper() throws MalformedURLException {
    }

    private AndroidDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);

    public void click(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public boolean isVisible(By elementBy) {
        AndroidElement element = (AndroidElement)driver.findElement(elementBy);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }
}