$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cart.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Cart Page Functionality",
  "description": "",
  "id": "verify-cart-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4942033642,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify cart count",
  "description": "",
  "id": "verify-cart-page-functionality;verify-cart-count",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the cart count is \"0\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user is on Shop page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "the user adds \"Smiley Bear\" to the cart",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify that the cart count is \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the user is on Cart Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user clicks Empty Cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "clicks \"yes\" to confirm to empty the cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "verify that the cart count is \"0\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 19
    }
  ],
  "location": "CartSteps.theCartCountIs(String)"
});
formatter.result({
  "duration": 209995423,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.theUserIsOnShopPage()"
});
formatter.result({
  "duration": 66191856,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Smiley Bear",
      "offset": 15
    }
  ],
  "location": "ShopSteps.theUserAddsToTheCart(String)"
});
formatter.result({
  "duration": 601052633,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 31
    }
  ],
  "location": "CartSteps.verifyThatTheCartCountIs(String)"
});
formatter.result({
  "duration": 47722129,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.theUserIsOnCartPage()"
});
formatter.result({
  "duration": 188759768,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.theUserClicksEmptyCart()"
});
formatter.result({
  "duration": 252867658,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yes",
      "offset": 8
    }
  ],
  "location": "CartSteps.clicksToConfirmToEmptyTheCart(String)"
});
formatter.result({
  "duration": 97017635,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 31
    }
  ],
  "location": "CartSteps.verifyThatTheCartCountIs(String)"
});
formatter.result({
  "duration": 18524383,
  "status": "passed"
});
formatter.after({
  "duration": 1066222181,
  "status": "passed"
});
formatter.uri("Contact.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Contact Page functionality",
  "description": "",
  "id": "verify-contact-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4420261303,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify mandatory error messages are displayed",
  "description": "",
  "id": "verify-contact-page-functionality;verify-mandatory-error-messages-are-displayed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the user is on Contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user clicks Submit button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "verify that the following error messages are displayed",
  "rows": [
    {
      "cells": [
        "fieldname",
        "errormessage"
      ],
      "line": 7
    },
    {
      "cells": [
        "forename",
        "Forename is required"
      ],
      "line": 8
    },
    {
      "cells": [
        "email",
        "Email is required"
      ],
      "line": 9
    },
    {
      "cells": [
        "message",
        "Message is required"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ContactSteps.theUserIsOnContactPage()"
});
formatter.result({
  "duration": 103194428,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.theUserClicksSubmitButton()"
});
formatter.result({
  "duration": 279554419,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.verifyThatTheFollowingErrorMessagesAreDisplayed(DataTable)"
});
formatter.result({
  "duration": 216650364,
  "status": "passed"
});
formatter.after({
  "duration": 949286620,
  "status": "passed"
});
formatter.before({
  "duration": 4401415335,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify error messages are not displayed when valid values are entered",
  "description": "",
  "id": "verify-contact-page-functionality;verify-error-messages-are-not-displayed-when-valid-values-are-entered",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "the user is on Contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "the user enters following values for the fields",
  "rows": [
    {
      "cells": [
        "fieldname",
        "fieldvalue"
      ],
      "line": 16
    },
    {
      "cells": [
        "forename",
        "Automation"
      ],
      "line": 17
    },
    {
      "cells": [
        "email",
        "automation@test.com"
      ],
      "line": 18
    },
    {
      "cells": [
        "message",
        "Testing Automation"
      ],
      "line": 19
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "verify that the following error messages are not displayed",
  "rows": [
    {
      "cells": [
        "fieldname",
        "errormessage"
      ],
      "line": 21
    },
    {
      "cells": [
        "forename",
        ""
      ],
      "line": 22
    },
    {
      "cells": [
        "email",
        ""
      ],
      "line": 23
    },
    {
      "cells": [
        "message",
        ""
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ContactSteps.theUserIsOnContactPage()"
});
formatter.result({
  "duration": 167884841,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.theUserEntersFollowingValuesForTheFields(DataTable)"
});
formatter.result({
  "duration": 685761819,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.verifyThatTheFollowingErrorMessagesAreNotDisplayed(DataTable)"
});
formatter.result({
  "duration": 60113452763,
  "status": "passed"
});
formatter.after({
  "duration": 919553248,
  "status": "passed"
});
formatter.before({
  "duration": 4505026908,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Verify invalid field error messages",
  "description": "",
  "id": "verify-contact-page-functionality;verify-invalid-field-error-messages",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "the user is on Contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "the user enters following values for the fields",
  "rows": [
    {
      "cells": [
        "fieldname",
        "fieldvalue"
      ],
      "line": 30
    },
    {
      "cells": [
        "email",
        "automation@"
      ],
      "line": 31
    },
    {
      "cells": [
        "telephone",
        "@$#"
      ],
      "line": 32
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "verify that the following error messages are displayed",
  "rows": [
    {
      "cells": [
        "fieldname",
        "errormessage"
      ],
      "line": 34
    },
    {
      "cells": [
        "email",
        "Please enter a valid email"
      ],
      "line": 35
    },
    {
      "cells": [
        "telephone",
        "Please enter a valid telephone number"
      ],
      "line": 36
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ContactSteps.theUserIsOnContactPage()"
});
formatter.result({
  "duration": 127134303,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.theUserEntersFollowingValuesForTheFields(DataTable)"
});
formatter.result({
  "duration": 392593561,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.verifyThatTheFollowingErrorMessagesAreDisplayed(DataTable)"
});
formatter.result({
  "duration": 121220210,
  "status": "passed"
});
formatter.after({
  "duration": 937364287,
  "status": "passed"
});
formatter.before({
  "duration": 4350364853,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Verify the successful submission",
  "description": "",
  "id": "verify-contact-page-functionality;verify-the-successful-submission",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "the user is on Contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "the user enters following values for the fields",
  "rows": [
    {
      "cells": [
        "fieldname",
        "fieldvalue"
      ],
      "line": 41
    },
    {
      "cells": [
        "forename",
        "Dan"
      ],
      "line": 42
    },
    {
      "cells": [
        "email",
        "dan@jupiter.com"
      ],
      "line": 43
    },
    {
      "cells": [
        "message",
        "Testing Automation"
      ],
      "line": 44
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "the user clicks Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "verify that \"Thanks Dan, we appreciate your feedback.\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactSteps.theUserIsOnContactPage()"
});
formatter.result({
  "duration": 99214087,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.theUserEntersFollowingValuesForTheFields(DataTable)"
});
formatter.result({
  "duration": 467492238,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.theUserClicksSubmitButton()"
});
formatter.result({
  "duration": 76659997,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thanks Dan, we appreciate your feedback.",
      "offset": 13
    }
  ],
  "location": "ContactSteps.verifyThatMessageIsDisplayed(String)"
});
formatter.result({
  "duration": 2808676353,
  "status": "passed"
});
formatter.after({
  "duration": 1030353273,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Login Page functionality",
  "description": "",
  "id": "verify-login-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4343929945,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify invalid login message",
  "description": "",
  "id": "verify-login-page-functionality;verify-invalid-login-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the user is on Login pge",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user enters username as \"XXX\" and password as \"XXX\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user clicks the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "verify that \"Your login details are incorrect\" error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.theUserIsOnLoginPge()"
});
formatter.result({
  "duration": 100429911,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "XXX",
      "offset": 29
    },
    {
      "val": "XXX",
      "offset": 51
    }
  ],
  "location": "LoginSteps.theUserEntersUsernameAsAndPasswordAs(String,String)"
});
formatter.result({
  "duration": 210709120,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.theUserClicksTheLoginButton()"
});
formatter.result({
  "duration": 61388507,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your login details are incorrect",
      "offset": 13
    }
  ],
  "location": "LoginSteps.verifyThatErrorMessageIsDisplayed(String)"
});
formatter.result({
  "duration": 38837238,
  "status": "passed"
});
formatter.after({
  "duration": 948901916,
  "status": "passed"
});
formatter.before({
  "duration": 4360348498,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify a valid login",
  "description": "",
  "id": "verify-login-page-functionality;verify-a-valid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "the user is on Login pge",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the user enters username as \"user1\" and password as \"letmein\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the user clicks the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify that \"Welcome to Jupiter Toys, a magical world for good girls and boys.\" welcome message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.theUserIsOnLoginPge()"
});
formatter.result({
  "duration": 132219393,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user1",
      "offset": 29
    },
    {
      "val": "letmein",
      "offset": 53
    }
  ],
  "location": "LoginSteps.theUserEntersUsernameAsAndPasswordAs(String,String)"
});
formatter.result({
  "duration": 280191598,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.theUserClicksTheLoginButton()"
});
formatter.result({
  "duration": 85683819,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to Jupiter Toys, a magical world for good girls and boys.",
      "offset": 13
    }
  ],
  "location": "LoginSteps.verifyThatWelcomeMessageIsDisplayed(String)"
});
formatter.result({
  "duration": 50254272,
  "status": "passed"
});
formatter.after({
  "duration": 948137794,
  "status": "passed"
});
formatter.uri("Shop.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Shop Page Functionality",
  "description": "",
  "id": "verify-shop-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4450951326,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify product price",
  "description": "",
  "id": "verify-shop-page-functionality;verify-product-price",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the user is on Shop page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user finds the \"Smiley Bear\" product",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "verify that the price is \"14.99\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ShopSteps.theUserIsOnShopPage()"
});
formatter.result({
  "duration": 107486835,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Smiley Bear",
      "offset": 20
    }
  ],
  "location": "ShopSteps.theUserFindsTheProduct(String)"
});
formatter.result({
  "duration": 341290607,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "14.99",
      "offset": 26
    }
  ],
  "location": "ShopSteps.verifyThatThePriceIs(String)"
});
formatter.result({
  "duration": 31312744,
  "status": "passed"
});
formatter.after({
  "duration": 937138964,
  "status": "passed"
});
});