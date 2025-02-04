Feature: API Testing in BDD

@test
Scenario: Verify API Response
Given the API Endpoint "https://httpstat.us/200"
When I send a GET Request
Then the response status should be 200
And the response should contain "200 OK"

@smoke @test
Scenario: Verify API Second Response
Given the API Endpoint "https://jsonplaceholder.typicode.com/posts"
When I send a GET Request
Then the response status should be 200
And the response should contain second "2"