package com.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;



public class responecode4 {

	public static void main(String[] args) {
		Response data=  get("http://ergast.com/api/f1/2017/circuits.json");
		System.out.println(data.prettyPrint());
		
		given().
		    when().
		        get("http://ergast.com/api/f1/2017/circuits.json").
		    then().
		        assertThat().
		        body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
		
	
		}
	}

