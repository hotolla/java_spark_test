package com.example.test_js_spark;

import com.example.test_js_spark.database.DatabaseClass;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJsSparkApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestJsSparkApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Hello");

		DatabaseClass myClass = new DatabaseClass();

		int result = myClass.methodName(2, 3);

		System.out.println("result = " + result);

		String str = String.format("result = %d", result);

		System.out.println(str);
	}
}
