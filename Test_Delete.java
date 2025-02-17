package RESTAPIPACKAGE;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class Test_Delete {
	
	@Test
		public void test_delete() {

			given().
			when().
			delete("https://reqres.in/api/users/2").
			then().
			statusCode(204);
			
		}

}
