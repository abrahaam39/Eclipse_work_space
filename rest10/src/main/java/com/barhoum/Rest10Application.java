package com.barhoum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.barhoum.dao.ProduitRepository;

@SpringBootApplication
public class Rest10Application {
	@Autowired
    ProduitRepository pr;
	public static void main(String[] args) {
		SpringApplication.run(Rest10Application.class, args);
	}

}
