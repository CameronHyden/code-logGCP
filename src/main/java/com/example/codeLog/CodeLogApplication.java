package com.example.codeLog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class CodeLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeLogApplication.class, args);
	}

}
