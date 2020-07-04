package com.barhoum;

import java.text.DateFormat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.barhoum.dao.ProduitRepository;
import com.barhoum.entitees.Produit;

@SpringBootApplication
public class Rest1Application implements CommandLineRunner{
@Autowired	
ProduitRepository dao;
	public static void main(String[] args) {
		SpringApplication.run(Rest1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
    //dao.save(new Produit("pc dell",5200,120));
    // dao.deleteById((long) 2);
		List<Produit> prod = dao.findAll();
		for(Produit p:prod){
			System.out.println(p.getDesignation());       
			System.out.println(p.getPrix());
			
		}
		
	
	}

 
}