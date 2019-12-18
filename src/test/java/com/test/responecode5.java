package com.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;



public class responecode5 {

	public static void main(String[] args) {
		Response data=  get("http://ergast.com/api/f1/2017/circuits.json");
		System.out.println(data.prettyPrint());
	
		
		
		 given().
		    when().
		        get("http://ergast.com/api/f1/2017/circuits.json").
		    then().
		        assertThat().
		        statusCode(200).
		    and().
		        contentType(ContentType.JSON).
		    and().
		        header("Content-Length",equalTo("4551"));
		
	
		}
	}

