package com.barhoum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.barhoum.dao.ProduitRepository;
import com.barhoum.entitees.Produit;

@SpringBootApplication
public class MvApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MvApplication.class, args);
		ProduitRepository dao = ctx.getBean(ProduitRepository.class);
		//dao.deleteById((long) 1);
		//dao.save(new Produit("scan",12258,12));
		//dao.save(new Produit("impri",11229,12125));
		
		
	}
		
		
		
	}

