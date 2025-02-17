package RESTAPIPACKAGE;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;


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