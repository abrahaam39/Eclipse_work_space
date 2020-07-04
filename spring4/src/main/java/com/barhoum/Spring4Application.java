package com.barhoum;

import java.awt.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.barhoum.dao.Produit;
import com.barhoum.dao.ProduitRepository;


public class Spring4Application{
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring4Application.class, args);
		ProduitRepository pr = ctx.getBean(ProduitRepository.class);
		
		
	}

	
	

}