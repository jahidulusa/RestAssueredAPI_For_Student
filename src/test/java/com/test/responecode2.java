package com.test;

import org.testng.Assert;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class responecode2 {

	public static void main(String[] args) {
		Response response=get("http://samples.openweathermap.org/data/2.5/"
				+ "weather?q=London,uk&appid=25e4fc6e6b2e357a177262c7005");
		
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println(response.getTime());
		System.out.println(response.getStatusLine());
		System.out.println(response.asString());
		System.out.println("======================");
		System.out.println(response.getBody().prettyPrint());
	}

}
