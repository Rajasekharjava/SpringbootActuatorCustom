package com.raja.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class SpringBootActuatorEndpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorEndpointApplication.class, args);
	}

	@Bean
	public ActiveSessionCounter activeSessionCounter() {
		return new ActiveSessionCounter();
	}

}
