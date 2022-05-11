package com.example.codeLog;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.io.File;
import java.io.FileInputStream;



@SpringBootApplication

public class CodeLogApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CodeLogApplication.class, args);

		ConvertImageService test = new ConvertImageService();
		test.TEST();

		File f = new File("/Users/cameronhyden/Downloads/alien.png");
		FileInputStream fin = new FileInputStream(f);
		byte imageByteArray[] = new byte[(int)f.length()];
		fin.read(imageByteArray);
		String imageToBase64 = Base64.encodeBase64String(imageByteArray);
		fin.close();
		System.out.println(imageToBase64);

	}

}




