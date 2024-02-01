package edu.iu.c322.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootConfiguration
public class Test1Application {
	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

}
