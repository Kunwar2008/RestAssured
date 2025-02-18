package RESTAPIPACKAGE;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;


public class Test_Post {
	
	@Test
	public void test_post() {

		Map<String, Object> jsonMap = new HashMap<String, Object>();

		jsonMap.put("name", "Aman");
		jsonMap.put("job", "Student");
		
		JSONObject request = new JSONObject(jsonMap);
		System.out.println("JSON request is : "+request);

		request.put("name", "Aman");
		request.put("job", "Student");

		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("Content-Type","application/json").
		body(request.toJSONString()).

		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201);
		
	}

}

