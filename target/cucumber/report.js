$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/contact.feature");
formatter.feature({
  "line": 1,
  "name": "Create a new contact and edit the name once is created",
  "description": "Data:\r\nFirst Name: Bring\r\nLast Name: Digital\r\nMobile Number: +351911111111\r\nChange to: Other\r\nPhone: +351911111111\r\nChange to: Other fax\r\nEmail: Sonia.pereira@bringglobal.com\r\nChange to: Work",
  "id": "create-a-new-contact-and-edit-the-name-once-is-created",
  "keyword": "Feature"
});
formatter.background({
  "line": 12,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 13,
  "name": "I enter to the application",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 15,
  "name": "Create contact",
  "description": "",
  "id": "create-a-new-contact-and-edit-the-name-once-is-created;create-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I click in contacts",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click \u0027+\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I see form to create a contact",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I enter the information required to create a contact",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I validate the contact is created",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 6501100,
  "status": "passed"
});
formatter.background({
  "line": 12,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 13,
  "name": "I enter to the application",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 22,
  "name": "Create and Edit contact",
  "description": "",
  "id": "create-a-new-contact-and-edit-the-name-once-is-created;create-and-edit-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I click in contacts",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I click \u0027+\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I see form to create a contact",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I enter the information required to create a contact",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I validate the contact is created",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click in edit contact",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I enter all the information required to edit contact",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I validate the contact is updated",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 21400,
  "status": "passed"
});
formatter.uri("feature/hola.feature");
formatter.feature({
  "line": 1,
  "name": "Test",
  "description": "First Name: Bring\r\nLast Name: Digital\r\nMobile Number: +351911111111\r\nChange to: Other\r\nPhone: +351911111111\r\nChange to: Other fax\r\nEmail: Sonia.pereira@bringglobal.com\r\nChange to: Work",
  "id": "test",
  "keyword": "Feature"
});
formatter.background({
  "line": 11,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 12,
  "name": "We are a user",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "We enter to application",
  "keyword": "And "
});
formatter.match({
  "location": "CreateUpdateSteps.we_are_a_user()"
});
formatter.result({
  "duration": 140651300,
  "status": "passed"
});
formatter.match({
  "location": "CreateUpdateSteps.we_enter_to_application()"
});
formatter.result({
  "duration": 7078500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Create contact",
  "description": "",
  "id": "test;create-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "we make login with user and password",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUpdateSteps.we_make_login_with_user_and_password()"
});
formatter.result({
  "duration": 9642100,
  "error_message": "java.lang.NullPointerException\r\n\tat java.base/java.util.Objects.requireNonNull(Objects.java:208)\r\n\tat org.openqa.selenium.support.ui.FluentWait.\u003cinit\u003e(FluentWait.java:106)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:85)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:45)\r\n\tat com.bring.CreateContact.create(CreateContact.java:11)\r\n\tat com.steps.CreateUpdateSteps.we_make_login_with_user_and_password(CreateUpdateSteps.java:43)\r\n\tat ✽.When we make login with user and password(feature/hola.feature:16)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 12000,
  "status": "passed"
});
});