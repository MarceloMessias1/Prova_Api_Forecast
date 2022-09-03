package reqres.in;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidacaoApi {

	Response response = RestAssured.get("https://reqres.in/api/users?page=2&id=7");

	@Test
	public void validarListUser() {

		System.out.println(response.asPrettyString());
		String email = "michael.lawson@reqres.in";
		assertTrue(response.asPrettyString().contains(email));
	}

	@Test
	public void validarStatusCode() {
		assertEquals(200, response.getStatusCode());
	}

}
