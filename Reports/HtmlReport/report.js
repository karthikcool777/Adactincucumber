$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginadactin.feature");
formatter.feature({
  "line": 3,
  "name": "To verify booking functionality",
  "description": "",
  "id": "to-verify-booking-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag5"
    }
  ]
});
formatter.before({
  "duration": 19558900,
  "status": "passed"
});
formatter.before({
  "duration": 10570092000,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User has to be in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Booking.user_has_to_be_in_home_page()"
});
formatter.result({
  "duration": 7050016700,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User has to book the hotel",
  "description": "",
  "id": "to-verify-booking-functionality;user-has-to-book-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tag12"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User has to be in search the hotel page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User has to enter the itinerary details",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click a search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user has to select the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user has to book the hotel",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user gets the booking ID",
  "keyword": "Then "
});
formatter.match({
  "location": "Booking.user_has_to_be_in_search_the_hotel_page()"
});
formatter.result({
  "duration": 1697589200,
  "status": "passed"
});
formatter.match({
  "location": "Booking.user_has_to_enter_the_itinerary_details()"
});
formatter.result({
  "duration": 3985191200,
  "status": "passed"
});
formatter.match({
  "location": "Booking.click_a_search_button()"
});
formatter.result({
  "duration": 1646680600,
  "status": "passed"
});
formatter.match({
  "location": "Booking.user_has_to_select_the_hotel()"
});
formatter.result({
  "duration": 3491791700,
  "status": "passed"
});
formatter.match({
  "location": "Booking.user_has_to_book_the_hotel()"
});
formatter.result({
  "duration": 168763400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#first_name\"}\n  (Session info: chrome\u003d83.0.4103.97)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027DESKTOP-COF0CMN\u0027, ip: \u0027192.168.43.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\DELL\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:60547}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0bf077328a054cced2187935bdb47459\n*** Element info: {Using\u003did, value\u003dfirst_name}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdefinetion.Booking.user_has_to_book_the_hotel(Booking.java:64)\r\n\tat ✽.Then user has to book the hotel(loginadactin.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Booking.user_gets_the_booking_ID()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1119814600,
  "status": "passed"
});
formatter.after({
  "duration": 808503400,
  "status": "passed"
});
formatter.before({
  "duration": 450200,
  "status": "passed"
});
formatter.before({
  "duration": 9565918000,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User has to be in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Booking.user_has_to_be_in_home_page()"
});
formatter.result({
  "duration": 7163007700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User has to view the booking",
  "description": "",
  "id": "to-verify-booking-functionality;user-has-to-view-the-booking",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User has to be in booking itinerary page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User has to fetch the booked orders",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user has to select the last booking",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "gets the cancellation acknowledgement",
  "keyword": "Then "
});
formatter.match({
  "location": "Cancellationadactin.user_has_to_be_in_booking_itinerary_page()"
});
formatter.result({
  "duration": 2188512600,
  "status": "passed"
});
formatter.match({
  "location": "Cancellationadactin.user_has_to_fetch_the_booked_orders()"
});
formatter.result({
  "duration": 5460748800,
  "status": "passed"
});
formatter.match({
  "location": "Cancellationadactin.user_has_to_select_the_last_booking()"
});
formatter.result({
  "duration": 36600,
  "status": "passed"
});
formatter.match({
  "location": "Cancellationadactin.gets_the_cancellation_acknowledgement()"
});
formatter.result({
  "duration": 35900,
  "status": "passed"
});
formatter.after({
  "duration": 37100,
  "status": "passed"
});
formatter.after({
  "duration": 1214938200,
  "status": "passed"
});
});