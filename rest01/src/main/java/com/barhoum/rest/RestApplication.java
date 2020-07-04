package com.barhoum.rest;

import com.barhoum.rest.dao.ProduitRepository;
import com.barhoum.rest.entitees.Produit111;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication implements CommandLineRunner {
    @Autowired
    ProduitRepository pr;
    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

     pr.save(new Produit111("pc hp", 9455, 12));
    }
}
