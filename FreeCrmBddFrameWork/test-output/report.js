$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Icam_Automation_Test_QA/FreeCrmBddFrameWork/src/main/java/com/qa/Features/contactList.feature");
formatter.feature({
  "line": 1,
  "name": "Contact List Test",
  "description": "",
  "id": "contact-list-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Check conatct list",
  "description": "",
  "id": "contact-list-test;check-conatct-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user will open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "login into application",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user will click on list of contact",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactListStep.user_will_open_browser()"
});
