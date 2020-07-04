package com.barhoum;

import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.barhoum.dao.EntityRepository;
import com.barhoum.dao.IClient;
import com.barhoum.entitees.Produit;
import com.barhoum.entitees.Utilisateur;

@SpringBootApplication
public class Spring6Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring6Application.class, args);
		
		EntityRepository<Produit> dao =ctx.getBean(EntityRepository.class);
		//dao.save(new Produit("pc hp",1565,122));
		//dao.save(new Produit("imprimente dell ",1255,136));
		//dao.save(new Produit("scanner hp",188,100));
		//dao.save(new Produit("onduleur asus",12236,122));
		//dao.remove((long) 4);
	
		Produit p = dao.findone((long) 3);
		System.out.println(p.getDesignation());
		List<Produit> prods = dao.findbyDesignation("%hp%");
		for(Produit p1 : prods){
			System.out.println(p1.getDesignation());
			System.out.println(p1.getPrix());
			System.out.println(p1.getQuantite());	
		}
		System.out.println("---------------------------------------------------------------------------");
		
		IClient dao1 =ctx.getBean(IClient.class);
		//dao1.save(new Utilisateur("saroura","sarour","5 rue makther"));
		//dao1.save(new Utilisateur("ibrahim","barhoum","5 rue makthe"));
		//dao1.save(new Utilisateur("amel","amoul","5 rue makther"));
		//dao1.save(new Utilisateur("hanen","hanoun","5 rue makther"));
		
		List<Utilisateur> ut = dao1.findAll();
		for(Utilisateur u :ut) {
			System.out.println(u.getLogin());
			System.out.println(u.getPasword());
			System.out.println(u.getAdress());
		}
		//dao1.deleteById((long) 9);
		System.out.println("---------------------------------------------------------------------------");
		List<Utilisateur> ut1 = dao1.findbylogin("%rou%");
		for(Utilisateur u :ut1) {
			System.out.println(u.getLogin());
			System.out.println(u.getPasword());
			System.out.println(u.getAdress());
		}
	}

}
