package com.sabeerit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private Map<String, Object> cache = new HashMap<String, Object>();
	private static final String REST_URL = "https://www.equifax.com/getScores";



	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		int a = 10;
	}

	//HIS-301 changes
	public void loadDataToCache() {
		//logic
	}
}
