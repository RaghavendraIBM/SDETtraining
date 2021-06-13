@FeatureTag
Feature: eLearning Portal functionality Verification
  
  Description: Sign up to eLearning portal, verify the login and sendmail functionality

  #  Background: Navigating to the elearning portal.
  #   Given elearning portal is successfully loaded on screen
  @Smoke @Sanity
  Scenario Outline: Verify the registration Process
    When user navigates to eLearning portal
    When user click on the Sign up link
    When user selects the course - "<CourseName>" in Courses radio button
    When user enters the first name - "<FirstName>" in the First name field
    When user enters the last name - "<LastName>" in the Last name field
    When user enters the email - "<Email>" in the Email field
    When user enters the username - "<Username>" in the Username field
    When user enters the password - "<Password>" in the pass field
    When user enters the confirm Password - "<Password>" in the Confirm Password field
    When user enters the Phone num - "<Phone>" in the Phone field
    When user selects the Language - "<Language>" in the Language select box
    When user clicks on the Register button
    Then Signup successful message should be displayed

    Examples: -
      | CourseName     | FirstName  | LastName | Email                  | Username    | Password        | Phone      | Language |
      | Follow courses | Automation | Testing  | Automation@Testing.com | Keeptesting | Keeptesting@123 | 9535098000 | English  |

  @Smoke @Sanity
  Scenario Outline: Verify the elearning portal login feature
    #When user navigates to eLearning portal
    When User enters the Login Username : "<Username>" field value
    When User enters the Login Password : "<Password>" field value
    When User clicks on Signin button
    Then Welcome screen or Homepage should be displayed

    Examples: -
      | Username      | Password        |
      | Keeptesting11 | Keeptesting@123 |

  @Smoke @Sanity
  Scenario: Verify the SendMail Functionality
    When User clicks on the Profile Icon
    When User clicks on the Inbox Link
    When User clicks on the Compose Message Icon
    Then New Message page should be displayed

  @Smoke @Sanity
  Scenario Outline: Verify the SendMail Functionality
    When User enters the Receipient address - "<SendTo>" in the Send To field
    When User clicks on the email popup suggestion under SendTo field
    When User enters the Subject - "<Subject>" in the Subject field
    When User enters the Message - "<Message>" in the Message field
    When User clicks on the Send Message button
    Then Mail Sending success message should be displayed on screen

    Examples: -
      | SendTo | Subject        | Message                                                |
      | sales  | Hi For Testing | Hello Mr.Portal, This is for testing. From, Automation |

  @Smoke @Sanity
  Scenario Outline: Verify the Mail Outbox Functionality
    When User clicks on the Profile Icon
    When User clicks on the Inbox Link
    When User clicks on the Outbox Icon
    When User clicks on the "<Subject>" Link
    Then Mail "<Message>" should be displayed on screen with subject "<Subject>"

    Examples: -
      | Subject        | Message                                                |
      | Hi For Testing | Hello Mr.Portal, This is for testing. From, Automation |

  @Smoke @Sanity
  Scenario Outline: Finalise and close browser
    When Mail "<Message>" should be displayed on screen with subject "<Subject>"
    Then close the browser instance

    Examples: -
      | Subject        | Message                                                |
      | Hi For Testing | Hello Mr.Portal, This is for testing. From, Automation |
