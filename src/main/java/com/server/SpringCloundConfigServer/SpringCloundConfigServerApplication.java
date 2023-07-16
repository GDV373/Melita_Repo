package com.server.SpringCloundConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class SpringCloundConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloundConfigServerApplication.class, args);
	}

}
