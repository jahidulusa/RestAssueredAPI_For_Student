package com.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;



public class responecode6 {

	public static void main(String[] args) {
		Response data=  get("http://ergast.com/api/f1/2017/circuits.json");
		System.out.println(data.prettyPrint());
	
		String season = "2017";
	    int numberOfRaces = 20;
	        
	    given().
	        pathParam("raceSeason",season).
	    when().
	        get("http://ergast.com/api/f1/{raceSeason}/circuits.json").
	    then().
	        assertThat().
	        body("MRData.CircuitTable.Circuits.circuitId",hasSize(numberOfRaces));
	
		}
	}

