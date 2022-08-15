package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.FaceMixPage;
import org.testng.Assert;
import java.net.MalformedURLException;

public class FaceMixPageStep {

    FaceMixPage FaceMixPage = new FaceMixPage();

    public FaceMixPageStep() throws MalformedURLException {
    }

    //PhotoFromGallery
    @When("\"Upload from photos\" button is tapped")
    public void clickAddToGal() {
        FaceMixPage.clickAddToGallery();
    }

    @Then("Check for {string}")
    public void clickChoosePht(String Page) {
        Assert.assertTrue(FaceMixPage.checkRecentImages(Page),"Page can't open." );
    }

    @And("Photo is selected from gallery")
    public void clickSelectPhotoFromGal() {
        FaceMixPage.clickChoosePhoto();
    }

    @Then("Select button is tapped")
    public void clickSelectBtn() {
        FaceMixPage.clickSelectBtn();
    }

    //PhotoFromTakeASelfie
    @When("\"Take a selfie\" button is tapped")
    public void clickTakeASelfiebtn() {
        FaceMixPage.clickTakeASelfieBtn();
    }

    @And("Photo is taken")
    public void takePhot() {
        FaceMixPage.clickTakeAPhoto();
    }

    @Then("Confirm button is tapped")
    public void clickSConfirmBtn() {
        FaceMixPage.clickConfirmBtn();
    }

    //BottomButtonsActions
    @When("\"Skip\" button is taped")
    public void clickSkip() {
        FaceMixPage.clickSkip();
    }

    @And("\"Favorites\" button is taped")
    public void clickFav() {
        FaceMixPage.clickFavBtn();
    }

    @When("\"History\" button is tapped")
    public void clickHist() {
        FaceMixPage.clickHistoryBtn();
    }

    @When("\"Home\" button is tapped")
    public void clickHomeBtn() {
        FaceMixPage.clickHomeBtn();
    }
}