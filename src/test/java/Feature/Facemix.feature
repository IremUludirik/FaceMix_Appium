Feature: FaceMix Scenarios

  Background:
    Given FaceMix Apk is opened
    And Get Started button is tapped

  Scenario: PhotoFromGallery
    When "Upload from photos" button is tapped
    Then Check for "Recent images"
    And Photo is selected from gallery
    Then Select button is tapped

  Scenario: PhotoFromTakeASelfie
    When "Take a selfie" button is tapped
    And Photo is taken
    Then Confirm button is tapped

  Scenario: BottomButtonsActions
    When "Skip" button is taped
    And "Favorites" button is taped
    Then Check for "No favorites yet"
    When "History" button is tapped
    Then Check for "No videos yet"
    When "Home" button is tapped
    Then Check for "Try it now"