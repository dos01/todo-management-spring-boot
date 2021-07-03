package com.todo.todomanagementspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TodoManagementSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoManagementSpringBootApplication.class, args);
	}

}
