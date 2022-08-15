package Pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;
import java.net.MalformedURLException;

public class FaceMixPage extends HomePage {

    //Elements for PhotoFromGallery
    By addToGalleryBtn = MobileBy.AccessibilityId("Upload from photos");
    By recentImages = By.xpath("//*[@text='Recent images']");
    By choosePhoto = By.id("com.google.android.documentsui:id/icon_thumb");
    By selectBtn = MobileBy.AccessibilityId("Select");

    //Elements for PhotoFromTakeASelfie
    By takeASelfieBtn = MobileBy.AccessibilityId("Take a selfie");
    By takeAPhoto = By.xpath("//android.view.View[2]");
    By confirmBtn = MobileBy.AccessibilityId("Confirm");

    //Elements for BottomButtonsActions
    By skipBtn = MobileBy.AccessibilityId("Skip");
    By favBtn = By.xpath("//android.widget.ImageView[4]");
    By noFav = By.xpath("//android.view.View[@content-desc=\"No favorites yet\"]");
    By historyBtn = By.xpath("//android.widget.ImageView[5]");
    By noVideo = By.xpath("//android.view.View[@content-desc=\"No videos yet\"]");
    By homeBtn = By.xpath("//android.widget.ImageView[3]");
    By tryItNow = By.xpath("//android.view.View[@content-desc=\"Try it now\"]");

    //for driver
    public FaceMixPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    //for PhotoFromGallery
    public void clickAddToGallery() {
        click(addToGalleryBtn);
    }

    public boolean checkRecentImages(String Page) {

        if (Page.equals("No favorites yet")) {
            isVisible(noFav);
            return true;
        } else if (Page.equals("No videos yet")) {
            isVisible(noVideo);
            return true;
        } else if (Page.equals("Try it now")) {
            isVisible(tryItNow);
            return true;
        } else if (Page.equals("Recent images")) {
            isVisible(recentImages);
            return true;
        } else {
            return false;
        }
    }

    public void clickChoosePhoto() {
        click(choosePhoto);
    }

    public void clickSelectBtn() {
        click(selectBtn);
    }

    //for PhotoFromTakeASelfie
    public void clickTakeASelfieBtn() {
        click(takeASelfieBtn);
    }

    public void clickTakeAPhoto() {
        click(takeAPhoto);
    }

    public void clickConfirmBtn() {
        click(confirmBtn);
    }

    //for BottomButtonsActions
    public void clickSkip() {
        click(skipBtn);
    }

    public void clickFavBtn() {
        click(favBtn);
    }

    public void clickHistoryBtn() {
        click(historyBtn);
    }

    public void clickHomeBtn() {
        click(homeBtn);
    }
}