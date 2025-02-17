package RESTAPIPACKAGE;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;



public class Test_GET {
	
	@Test
	public void test_01() {

		Response response = get("https://reqres.in/api/users?page=2");

		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

	}

	
	@Test
		public void test_02() {

			given()
			.get("https://reqres.in/api/users?page=2")
			.then()
			.statusCode(200)
			.body("data.id[0]", equalTo(7));
		}
	
	@Test
		void test_03() {

			given()
			.param("key", "value")
			.header("key", "value")
			.when()
			.get("https://reqres.in/api/users?page=2")
			.then()
			.statusCode(200)
			.body("data.first_name", hasItems("Michael", "Lindsay"));
		}
}
	
	


