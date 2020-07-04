package com.barhoum;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import dao.ProduitRepository;

@SpringBootApplication
public class Mvc01Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Mvc01Application.class, args);
		ProduitRepository dao = ctx.getBean(ProduitRepository.class);
		
		
  	    
	}

}
