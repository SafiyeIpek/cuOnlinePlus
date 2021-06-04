$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Users should be able to login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cuOnlinePlus.step_definitions.login_stepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters username, password and access key",
  "keyword": "When "
});
formatter.match({
  "location": "com.cuOnlinePlus.step_definitions.login_stepDefinitions.the_user_enters_username_password_and_access_key()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cuOnlinePlus.step_definitions.login_stepDefinitions.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});