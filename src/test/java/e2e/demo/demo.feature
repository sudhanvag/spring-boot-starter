  Feature: Test demo

  Background:
    * url baseUrl
    * configure logPrettyRequest = true
    * configure logPrettyResponse = true

  Scenario: Test demo feature
  Given path 'demo'
  When method get
  Then status 200
  And match response == 'Hello World!!'