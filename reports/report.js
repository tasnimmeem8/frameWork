$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/doc.feature");
formatter.feature({
  "name": "Test case",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "001_Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open browser and load URL",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase.open_browser_and_load_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username as DemoCSR",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.enter_username_as_DemoCSR()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.enter_password_as_crmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login",
  "keyword": "When "
});
formatter.match({
  "location": "TestCase.click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click CRMSFA",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase.click_CRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.close_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "002_CreatLead",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open browser and load URL",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase.open_browser_and_load_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username as DemoCSR",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.enter_username_as_DemoCSR()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.enter_password_as_crmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login",
  "keyword": "When "
});
formatter.match({
  "location": "TestCase.click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click CRMSFA",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase.click_CRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click CreatLead button",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.click_CreatLead_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Create Lead\"}\n  (Session info: chrome\u003d108.0.5359.99)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MEEM\u0027, ip: \u0027192.168.1.159\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002718.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.99, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\tasni\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:65355}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d82ce0d10b6c4213a350405258e89403\n*** Element info: {Using\u003dlink text, value\u003dCreate Lead}\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat setup.TestCase.click_CreatLead_button(TestCase.java:44)\r\n\tat ✽.Click CreatLead button(file:src/test/java/features/doc.feature:21)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Enter Companyname as ABC",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.enter_Companyname_as_ABC()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Firstname as Hema",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.enter_Firstname_as_Hema()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Lastname as Mali",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.enter_Lastname_as_Mali()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click My Home link",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.click_My_Home_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.close_Browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "003_CreatAccount",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open browser and load URL",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase.open_browser_and_load_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username as DemoCSR",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.enter_username_as_DemoCSR()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.enter_password_as_crmsfa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login",
  "keyword": "When "
});
formatter.match({
  "location": "TestCase.click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click CRMSFA",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase.click_CRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Create Account link",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.click_Create_Account_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter account name as XYZ",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.enter_account_name_as_XYZ()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose Aerospace as Industry",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.choose_Aerospace_as_Industry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase.close_Browser()"
});
formatter.result({
  "status": "passed"
});
});