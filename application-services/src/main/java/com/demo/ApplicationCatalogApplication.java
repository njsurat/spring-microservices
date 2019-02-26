package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.demo")
public class ApplicationCatalogApplication {

	public static void main(String... args) {
		SpringApplication.run(ApplicationCatalogApplication.class, args);

	}
}
