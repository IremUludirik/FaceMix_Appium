package Steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import Pages.HomePage;
import Utilities.Driver;

import java.net.MalformedURLException;

public class HomePageStep {

    public AndroidDriver driver;
    HomePage HomePage = new HomePage();

    public HomePageStep() throws MalformedURLException {
    }

    //BackGround
    @Given("FaceMix Apk is opened")
    public void apkOpened() throws MalformedURLException { driver = Driver.getDriver(); }

    @And("Get Started button is tapped")
    public void clickGetStrt() {
        HomePage.clickGetStart();
    }

    @After
    public void quitDriver() {
        Driver.closeDriver();
    }
}