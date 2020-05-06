package com.cognizant.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
@EnableFeignClients
public class MyProjectApplication {
	
	 @RequestMapping("/")
	    public String home() {
	        return "Hey There!!       Enter Valid Credentials.";
	    }

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

}
