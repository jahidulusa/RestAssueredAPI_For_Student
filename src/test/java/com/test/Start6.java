package com.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;



public class Start6 {

	@Test
	public  void start() {
		Response data=  get("https://samples.openweathermap.org/data/2.5/weather?q=newyork,us&appid=25e4fc6e6b2e357a177262c7005.json");
		JsonPath jsonPathEvaluator = data.jsonPath();
		String city = jsonPathEvaluator.get("name");
		System.err.println("City received from Response ::" + city);

		}
	}

