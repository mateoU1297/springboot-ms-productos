package com.springboot.app.msproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.springboot.app.mscommons.models.entity"})
public class SpringbootMsProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMsProductosApplication.class, args);
	}

}
