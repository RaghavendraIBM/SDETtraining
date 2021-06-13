$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("portalfeature.feature");
formatter.feature({
  "line": 2,
  "name": "eLearning Portal functionality Verification",
  "description": "\nDescription: Sign up to eLearning portal, verify the login and sendmail functionality",
  "id": "elearning-portal-functionality-verification",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FeatureTag"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 6,
      "value": "#  Background: Navigating to the elearning portal."
    },
    {
      "line": 7,
      "value": "#   Given elearning portal is successfully loaded on screen"
    }
  ],
  "line": 9,
  "name": "Verify the registration Process",
  "description": "",
  "id": "elearning-portal-functionality-verification;verify-the-registration-process",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Smoke"
    },
    {
      "line": 8,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user navigates to eLearning portal",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user click on the Sign up link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user selects the course - \"\u003cCourseName\u003e\" in Courses radio button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enters the first name - \"\u003cFirstName\u003e\" in the First name field",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enters the last name - \"\u003cLastName\u003e\" in the Last name field",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enters the email - \"\u003cEmail\u003e\" in the Email field",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters the username - \"\u003cUsername\u003e\" in the Username field",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enters the password - \"\u003cPassword\u003e\" in the pass field",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters the confirm Password - \"\u003cPassword\u003e\" in the Confirm Password field",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user enters the Phone num - \"\u003cPhone\u003e\" in the Phone field",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user selects the Language - \"\u003cLanguage\u003e\" in the Language select box",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user clicks on the Register button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Signup successful message should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "-",
  "description": "",
  "id": "elearning-portal-functionality-verification;verify-the-registration-process;-",
  "rows": [
    {
      "cells": [
        "CourseName",
        "FirstName",
        "LastName",
        "Email",
        "Username",
        "Password",
        "Phone",
        "Language"
      ],
      "line": 25,
      "id": "elearning-portal-functionality-verification;verify-the-registration-process;-;1"
    },
    {
      "cells": [
        "Follow courses",
        "Automation",
        "Testing",
        "Automation@Testing.com",
        "Keeptesting",
        "Keeptesting@123",
        "9535098000",
        "English"
      ],
      "line": 26,
      "id": "elearning-portal-functionality-verification;verify-the-registration-process;-;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 94800,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Verify the registration Process",
  "description": "",
  "id": "elearning-portal-functionality-verification;verify-the-registration-process;-;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Smoke"
    },
    {
      "line": 8,
      "name": "@Sanity"
    },
    {
      "line": 1,
      "name": "@FeatureTag"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user navigates to eLearning portal",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user click on the Sign up link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user selects the course - \"Follow courses\" in Courses radio button",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enters the first name - \"Automation\" in the First name field",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enters the last name - \"Testing\" in the Last name field",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enters the email - \"Automation@Testing.com\" in the Email field",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters the username - \"Keeptesting\" in the Username field",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enters the password - \"Keeptesting@123\" in the pass field",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters the confirm Password - \"Keeptesting@123\" in the Confirm Password field",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user enters the Phone num - \"9535098000\" in the Phone field",
  "matchedColumns": [
    6
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user selects the Language - \"English\" in the Language select box",
  "matchedColumns": [
    7
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user clicks on the Register button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Signup successful message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinationclass.user_navigates_to_eLearning_portal()"
});
formatter.result({
  "duration": 6003219100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinationclass.user_click_on_the_Sign_up_link()"
});
formatter.result({
  "duration": 1732140800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Follow courses",
      "offset": 27
    }
  ],
  "location": "stepdefinationclass.user_selects_the_course_in_Courses_radio_button(String)"
});
formatter.result({
  "duration": 84316900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Automation",
      "offset": 30
    }
  ],
  "location": "stepdefinationclass.user_enters_the_first_name_in_the_First_name_field(String)"
});
formatter.result({
  "duration": 163326200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testing",
      "offset": 29
    }
  ],
  "location": "stepdefinationclass.user_enters_the_last_name_in_the_Last_name_field(String)"
});
formatter.result({
  "duration": 167628900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Automation@Testing.com",
      "offset": 25
    }
  ],
  "location": "stepdefinationclass.user_enters_the_email_in_the_Email_field(String)"
});
formatter.result({
  "duration": 180614300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Keeptesting",
      "offset": 28
    }
  ],
  "location": "stepdefinationclass.user_enters_the_username_in_the_Username_field(String)"
});
formatter.result({
  "duration": 214165200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Keeptesting@123",
      "offset": 28
    }
  ],
  "location": "stepdefinationclass.user_enters_the_password_in_the_pass_field(String)"
});
formatter.result({
  "duration": 182132300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Keeptesting@123",
      "offset": 36
    }
  ],
  "location": "stepdefinationclass.user_enters_the_confirm_Password_in_the_Confirm_Password_field(String)"
});
formatter.result({
  "duration": 165138600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9535098000",
      "offset": 29
    }
  ],
  "location": "stepdefinationclass.user_enters_the_Phone_num_in_the_Phone_field(String)"
});
formatter.result({
  "duration": 127105700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "English",
      "offset": 29
    }
  ],
  "location": "stepdefinationclass.user_selects_the_Language_in_the_Language_select_box(String)"
});
formatter.result({
  "duration": 21363500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinationclass.user_clicks_on_the_Register_button()"
});
formatter.result({
  "duration": 4926328300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinationclass.signup_successful_message_should_be_displayed()"
});
formatter.result({
  "duration": 17938700,
  "status": "passed"
});
formatter.after({
  "duration": 22500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 29,
  "name": "Verify the elearning portal login feature",
  "description": "",
  "id": "elearning-portal-functionality-verification;verify-the-elearning-portal-login-feature",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@Smoke"
    },
    {
      "line": 28,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#When user navigates to eLearning portal"
    }
  ],
  "line": 31,
  "name": "User enters the Login Username : \"\u003cUsername\u003e\" field value",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User enters the Login Password : \"\u003cPassword\u003e\" field value",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User clicks on Signin button",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Welcome screen or Homepage should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 36,
  "name": "-",
  "description": "",
  "id": "elearning-portal-functionality-verification;verify-the-elearning-portal-login-feature;-",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 37,
      "id": "elearning-portal-functionality-verification;verify-the-elearning-portal-login-feature;-;1"
    },
    {
      "cells": [
        "Keeptesting11",
        "Keeptesting@123"
      ],
      "line": 38,
      "id": "elearning-portal-functionality-verification;verify-the-elearning-portal-login-feature;-;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 50400,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Verify the elearning portal login feature",
  "description": "",
  "id": "elearning-portal-functionality-verification;verify-the-elearning-portal-login-feature;-;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@Smoke"
    },
    {
      "line": 28,
      "name": "@Sanity"
    },
    {
      "line": 1,
      "name": "@FeatureTag"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#When user navigates to eLearning portal"
    }
  ],
  "line": 31,
  "name": "User enters the Login Username : \"Keeptesting11\" field value",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User enters the Login Password : \"Keeptesting@123\" field value",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User clicks on Signin button",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Welcome screen or Homepage should be displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Keeptesting11",
      "offset": 34
    }
  ],
  "location": "stepdefinationclass.user_enters_the_Login_Username_field_value(String)"
});
formatter.result({
  "duration": 15887200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Keeptesting@123",
      "offset": 34
    }
  ],
  "location": "stepdefinationclass.user_enters_the_Login_Password_field_value(String)"
});
formatter.result({
  "duration": 19584500,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinationclass.user_clicks_on_Signin_button()"
});
formatter.result({
  "duration": 27039300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinationclass.welcome_screen_or_Homepage_should_be_displayed()"
});
formatter.result({
  "duration": 49100,
  "status": "passed"
});
formatter.after({
  "duration": 20500,
  "status": "passed"
});
formatter.before({
  "duration": 27400,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Verify the SendMail Functionality",
  "description": "",
  "id": "elearning-portal-functionality-verification;verify-the-sendmail-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@Smoke"
    },
    {
      "line": 40,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "User clicks on the Profile Icon",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "User clicks on the Inbox Link",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "User clicks on the Compose Message Icon",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "New Message page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinationclass.user_clicks_on_the_Profile_Icon()"
});
formatter.result({
  "duration": 106354800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinationclass.user_clicks_on_the_Inbox_Link()"
});
formatter.result({
  "duration": 2008871100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinationclass.user_clicks_on_the_Compose_Message_Icon()"
});
formatter.result({
  "duration": 2061974700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinationclass.new_Message_page_should_be_displayed()"
});
formatter.result({
  "duration": 8615600,
  "status": "passed"
});
formatter.after({
  "duration": 30200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 48,
  "name": "Verify the SendMail Functionality",
  "description": "",
  "id": "elearning-portal-functionality-verification;verify-the-sendmail-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 47,
      "name": "@Smoke"
    },
    {
      "line": 47,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "User enters the Receipient address - \"\u003cSendTo\u003e\" in the Send To field",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "User clicks on the email popup suggestion under SendTo field",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "User enters the Subject - \"\u003cSubject\u003e\" in the Subject field",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "User enters the Message - \"\u003cMessage\u003e\" in the Message field",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "User clicks on the Send Message button",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "Mail Sending success message should be displayed on screen",
  "keyword": "Then "
});
formatter.examples({
  "line": 56,
  "name": "-",
  "description": "",
  "id": "elearning-portal-functionality-verification;verify-the-sendmail-functionality;-",
  "rows": [
    {
      "cells": [
        "SendTo",
        "Subject",
        "Message"
      ],
      "line": 57,
      "id": "elearning-portal-functionality-verification;verify-the-sendmail-functionality;-;1"
    },
    {
      "cells": [
        "sales",
        "Hi For Testing",
        "Hello Mr.Portal, This is for testing. From, Automation"
      ],
      "line": 58,
      "id": "elearning-portal-functionality-verification;verify-the-sendmail-functionality;-;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 31100,
  "status": "passed"
});
formatter.scenario({
  "line": 58,
  "name": "Verify the SendMail Functionality",
  "description": "",
  "id": "elearning-portal-functionality-verification;verify-the-sendmail-functionality;-;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 47,
      "name": "@Smoke"
    },
    {
      "line": 47,
      "name": "@Sanity"
    },
    {
      "line": 1,
      "name": "@FeatureTag"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "User enters the Receipient address - \"sales\" in the Send To field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "User clicks on the email popup suggestion under SendTo field",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "User enters the Subject - \"Hi For Testing\" in the Subject field",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "User enters the Message - \"Hello Mr.Portal, This is for testing. From, Automation\" in the Message field",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "User clicks on the Send Message button",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "Mail Sending success message should be displayed on screen",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "sales",
      "offset": 38
    }
  ],
  "location": "stepdefinationclass.user_enters_the_Receipient_address_in_the_Send_To_field(String)"
});
formatter.result({
  "duration": 2150706300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinationclass.user_clicks_on_the_email_popup_suggestion_under_SendTo_field()"
});
formatter.result({
  "duration": 563177800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hi For Testing",
      "offset": 27
    }
  ],
  "location": "stepdefinationclass.user_enters_the_Subject_in_the_Subject_field(String)"
});
formatter.result({
  "duration": 10166013000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello Mr.Portal, This is for testing. From, Automation",
      "offset": 27
    }
  ],
  "location": "stepdefinationclass.user_enters_the_Message_in_the_Message_field(String)"
});
formatter.result({
  "duration": 2341602300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinationclass.user_clicks_on_the_Send_Message_button()"
});
formatter.result({
  "duration": 1985104700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinationclass.mail_Sending_success_message_should_be_displayed_on_screen()"
});
formatter.result({
  "duration": 54035200,
  "status": "passed"
});
formatter.after({
  "duration": 24500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 61,
  "name": "Verify the Mail Outbox Functionality",
  "description": "",
  "id": "elearning-portal-functionality-verification;verify-the-mail-outbox-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 60,
      "name": "@Smoke"
    },
    {
      "line": 60,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 62,
  "name": "User clicks on the Profile Icon",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "User clicks on the Inbox Link",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "User clicks on the Outbox Icon",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "User clicks on the \"\u003cSubject\u003e\" Link",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "Mail \"\u003cMessage\u003e\" should be displayed on screen with subject \"\u003cSubject\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 68,
  "name": "-",
  "description": "",
  "id": "elearning-portal-functionality-verification;verify-the-mail-outbox-functionality;-",
  "rows": [
    {
      "cells": [
        "Subject",
        "Message"
      ],
      "line": 69,
      "id": "elearning-portal-functionality-verification;verify-the-mail-outbox-functionality;-;1"
    },
    {
      "cells": [
        "Hi For Testing",
        "Hello Mr.Portal, This is for testing. From, Automation"
      ],
      "line": 70,
      "id": "elearning-portal-functionality-verification;verify-the-mail-outbox-functionality;-;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 31100,
  "status": "passed"
});
formatter.scenario({
  "line": 70,
  "name": "Verify the Mail Outbox Functionality",
  "description": "",
  "id": "elearning-portal-functionality-verification;verify-the-mail-outbox-functionality;-;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 60,
      "name": "@Smoke"
    },
    {
      "line": 60,
      "name": "@Sanity"
    },
    {
      "line": 1,
      "name": "@FeatureTag"
    }
  ]
});
formatter.step({
  "line": 62,
  "name": "User clicks on the Profile Icon",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "User clicks on the Inbox Link",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "User clicks on the Outbox Icon",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "User clicks on the \"Hi For Testing\" Link",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "Mail \"Hello Mr.Portal, This is for testing. From, Automation\" should be displayed on screen with subject \"Hi For Testing\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinationclass.user_clicks_on_the_Profile_Icon()"
});
formatter.result({
  "duration": 138050000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinationclass.user_clicks_on_the_Inbox_Link()"
});
formatter.result({
  "duration": 858482000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinationclass.user_clicks_on_the_Outbox_Icon()"
});
formatter.result({
  "duration": 1083520700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hi For Testing",
      "offset": 20
    }
  ],
  "location": "stepdefinationclass.user_clicks_on_the_Link(String)"
});
formatter.result({
  "duration": 1349059500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello Mr.Portal, This is for testing. From, Automation",
      "offset": 6
    },
    {
      "val": "Hi For Testing",
      "offset": 106
    }
  ],
  "location": "stepdefinationclass.mail_should_be_displayed_on_screen_with_subject(String,String)"
});
formatter.result({
  "duration": 18436300,
  "status": "passed"
});
formatter.after({
  "duration": 10900,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 73,
  "name": "Finalise and close browser",
  "description": "",
  "id": "elearning-portal-functionality-verification;finalise-and-close-browser",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 72,
      "name": "@Smoke"
    },
    {
      "line": 72,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 74,
  "name": "Mail \"\u003cMessage\u003e\" should be displayed on screen with subject \"\u003cSubject\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 75,
  "name": "close the browser instance",
  "keyword": "Then "
});
formatter.examples({
  "line": 77,
  "name": "-",
  "description": "",
  "id": "elearning-portal-functionality-verification;finalise-and-close-browser;-",
  "rows": [
    {
      "cells": [
        "Subject",
        "Message"
      ],
      "line": 78,
      "id": "elearning-portal-functionality-verification;finalise-and-close-browser;-;1"
    },
    {
      "cells": [
        "Hi For Testing",
        "Hello Mr.Portal, This is for testing. From, Automation"
      ],
      "line": 79,
      "id": "elearning-portal-functionality-verification;finalise-and-close-browser;-;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 31300,
  "status": "passed"
});
formatter.scenario({
  "line": 79,
  "name": "Finalise and close browser",
  "description": "",
  "id": "elearning-portal-functionality-verification;finalise-and-close-browser;-;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 72,
      "name": "@Smoke"
    },
    {
      "line": 72,
      "name": "@Sanity"
    },
    {
      "line": 1,
      "name": "@FeatureTag"
    }
  ]
});
formatter.step({
  "line": 74,
  "name": "Mail \"Hello Mr.Portal, This is for testing. From, Automation\" should be displayed on screen with subject \"Hi For Testing\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 75,
  "name": "close the browser instance",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Hello Mr.Portal, This is for testing. From, Automation",
      "offset": 6
    },
    {
      "val": "Hi For Testing",
      "offset": 106
    }
  ],
  "location": "stepdefinationclass.mail_should_be_displayed_on_screen_with_subject(String,String)"
});
formatter.result({
  "duration": 12267700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinationclass.close_the_browser_instance()"
});
formatter.result({
  "duration": 1062528100,
  "status": "passed"
});
formatter.after({
  "duration": 13700,
  "status": "passed"
});
});