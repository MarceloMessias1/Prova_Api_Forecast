package hg.brasil;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidarForestCast {

	Response response = RestAssured.get("https://api.hgbrasil.com/weather/");

	public String getForCast(String path, String topico){
		return response.getBody().path("results.forecast."+path+"["+topico+"]", "retornando o max").toString(); 
		
	}
	@Test

	public void testeValidarForecast() {

		String max = response.getBody().path("results.forecast.max[1]", "retornando o max").toString();
		System.out.println(max);
		assertEquals("15", max);

	}

}
