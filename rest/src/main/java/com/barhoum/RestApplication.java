package com.barhoum;

import
		java.text.DateFormat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.barhoum.dao.Produitrepository;
import com.barhoum.entitees.Produit;

@SpringBootApplication
public class RestApplication implements CommandLineRunner{
@Autowired	
Produitrepository dao;
	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		//DateFormat d = SimpleDtaeFormat("dd/MM/yyyy");
    dao.save(new Produit("pc dell",5200,120));
    // dao.deleteById((long) 2);
		List<Produit> prod = dao.findAll();
		for(Produit p:prod){
			System.out.println(p.getDesignation());       
			System.out.println(p.getPrix());
		}
		
	
	}

 
}
