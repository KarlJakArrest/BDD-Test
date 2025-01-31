package steps;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class ApiTestSteps {

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
}