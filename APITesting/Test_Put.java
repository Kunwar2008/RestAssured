package RESTAPIPACKAGE;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;


public class Test_Put {
	
	@Test
		public void test_put() {


			JSONObject request = new JSONObject(); 

			request.put("name", "Aman");
			request.put("job", "Working");

			given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toJSONString()).

			when().
			put("https://reqres.in/api/users/2").
			then().
			statusCode(200);
			
		}
	
	
}