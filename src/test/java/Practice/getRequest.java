package Practice;

import io.restassured.RestAssured;

public class getRequest {

	public static void main(String[] args) {
	
		        // Base URI of the REST API
		        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

		        // Send GET request and get the response
		        Response response = RestAssured
		                                .given()
		                                .when()
		                                .get("/posts/1")
		                                .then()
		                                .extract()
		                                .response();

		        // Validate the status code
		        int statusCode = response.getStatusCode();
		        if (statusCode == 200) {
		            System.out.println("Test Passed! Status code: " + statusCode);
		        } else {
		            System.out.println("Test Failed! Status code: " + statusCode);
		        }
		    }

}

}
