package com.xworkz.projecttask;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {

		System.setProperty("server.servlet.context-path", "/projecttask");
		SpringApplication.run(SpringbootApplication.class, args);
		System.out.println("SpringbootApplication ended");
	}

}
