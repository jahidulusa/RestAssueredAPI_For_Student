package com.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;



public class Start3 {

	@Test
	public  void start3(){
		given().get("https://samples.openweathermap.org/data/2.5/weather?q=newyork,us&appid=25e4fc6e6b2e357a177262c7005")
		.then().statusCode(200);
		
		}
	}

