package RestAssured;
import static io.restassured.RestAssured.*;

import io.qameta.allure.internal.shadowed.jackson.databind.util.JSONPObject;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Test1 {
	@Test
	public void test1() {
		
		Response response = get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.getStatusCode());
		int statusCode=response.getStatusCode();
		System.out.println(response.getHeader("Content-Type"));
		Assert.assertEquals(statusCode, 200);
	}
	@Test
	public void test2() {
	
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200);
		
	}
	
	
	@Test
	public void test3() {
	
		Map<String,Object> map= new HashMap<String,Object>();
		map.put("name", "Kapil");
		map.put("job","Teacher");
		
		System.out.println(map);
		
		
	}
	
	
}
