package com.springBootDocker.welcomeDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WelcomeDockerApplication {
	
@GetMapping("/welcome")
public String welcome() {
	return "welcome SpringBoot Docker Container Application";
	
}


	public static void main(String[] args) {
		SpringApplication.run(WelcomeDockerApplication.class, args);
	}

}
