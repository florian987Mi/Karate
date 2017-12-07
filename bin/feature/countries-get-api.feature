Feature: Send request for google maps with location

  Background:
    * configure cookies = null

  Scenario: Verify that map data are received when sending address to the google map service
    Given url 'http://maps.googleapis.com/maps/api/geocode/xml?'
    And params {address: '75, Perera Mawatha, Pellawatte, Batharamulla'}
    When method get
    Then status 200

  Scenario: Get all countries
    Given url 'https://restcountries.eu/rest/v2/all'
    When method GET
    Then status 200

  Scenario: Request without authentication
    Given url 'https://dls-qa.siemens.cloud/hl/hl.obsreqprocess/'
    And request { test : 'karate' }
    When method POST
    Then status 403

  Scenario: Request without authentication
    Given url 'https://restcountries.eu/rest/v2/capital/berlin'
    #And params { capital : 'berlin' }
    When method GET
    Then status 200
#    And match response contains {name : 'Germany'}




