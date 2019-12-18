package com.test;

import static io.restassured.RestAssured.get;

public class responecode3 {

	public static void main(String[] args) {
		String data=get("http://samples.openweathermap.org/data/2.5/"
				+ "weather?q=London,uk&appid=25e4fc6e6b2e357a177262c7005").asString();
		System.out.println(data);
		String [] s=data.split(",");
		System.out.println(s.length);
		System.out.println("========== Text formate =========");
		for(String ss:s) {
			System.out.println(ss);
		//	System.out.println(ss.replaceAll("\\t|,|;|\"|\\.|\\?|!|@|\\[|\\]|\\(|\\)|\\{|\\}|_|\\*|/", ""));
			
		
	
		}
	}

}
