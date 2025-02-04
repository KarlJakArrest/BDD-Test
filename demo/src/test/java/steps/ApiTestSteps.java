package steps;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

import groovyjarjarantlr4.v4.parse.ANTLRParser.id_return;

public class ApiTestSteps {

    private static final Object id_return = null;
        private String endpoint;
        private Response response;
    
        @Given("the API Endpoint {string}")
        public void theApiEndpoint(String url){
            this.endpoint = url;
        }
        @When("I send a GET Request")
        public void iSendGetRequest(){
            response =  given().when().get(endpoint);
        }
        @Then("the response status should be {int}")
        public void theResoponseStatusShouldBe(int statusCode){
            assertEquals(statusCode, response.getStatusCode());
        }
        @And("the response should contain {string}")
        public void theResponseShouldContain(String key){
            assertTrue(response.getBody().asString().contains(key));
        }
        @And("the response should contain second {string}")
        public void theResponseShouldContainSecond(String key){
            assertTrue(response.getBody().asString().contains(key));
        }
    
    
    @Then("match response.userId[{int}].id == {int}")
    public void match_response_user_id_id(Integer int1, Integer int2) {
        assertTrue(response.getBody().equals(id_return));
    throw new io.cucumber.java.PendingException();
}

}
