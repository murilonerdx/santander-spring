package com.murilonerdx.santander;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages="com.murilonerdx.santander.*")
public class SantanderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderApplication.class, args);
	}

}
