package com.barhoum;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.barhoum.dao.Produit;
import com.barhoum.dao.ProduitRepository;

@SpringBootApplication
public class Spring3Application implements CommandLineRunner{
	@Autowired
	private ProduitRepository pr;

	public static void main(String[] args) {
		 SpringApplication.run(Spring3Application.class, args);
			
	}

	@Override
	public void run(String... args) throws Exception {
		//pr.save(new Produit("peugeot",15888,12));
		//pr.save(new Produit("peugeot",258,1236));
		//pr.save(new Produit("renault",158000,100));
	   pr.findAll().forEach(p->{System.out.println(p.getDesignation());});
		
		
	}

}
