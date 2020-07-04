package com.barhoum;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.barhoum.dao.CategoryRepository;
import com.barhoum.dao.Produitrepository;
import com.barhoum.entitees.Categorie;
import com.barhoum.entitees.Produit;

@SpringBootApplication
public class Spring2Application implements CommandLineRunner{
	@Autowired
	private  Produitrepository pr;
	@Autowired
	private CategoryRepository cr;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring2Application.class, args);
	
		Produitrepository produitdao = ctx.getBean(Produitrepository.class);
		//produitdao.save(new Produit("dell",552,2));
		//produitdao.save(new Produit("hp",525,2));
		//produitdao.save(new Produit("asus",522,25,1g));
		List<Produit> prods = produitdao.findAll();
		for(Produit p : prods) {
			System.out.println("designation  "+p.getDesignation());
			System.out.println("designation  "+p.getPrix());
			System.out.println("designation  "+p.getQuantite());
		    
		}
	
		System.out.println("----------------------------------------------------------------------");
		CategoryRepository cat = ctx.getBean(CategoryRepository.class);
		//cat.save(new Categorie("materiel"));
		//cat.save(new Categorie("fourniture"));
		//cat.save(new Categorie("informatique"));
		//produitdao.save(new Produit("pc azuz",5898,12,1l));
		List<Categorie> cat1 = cat.findAll();
		/*for(Categorie c : cat1) {
			System.out.println("nom   "+c.getNomcategorie());
		    Produit p = new Produit("aaaaa",1000,12);
		    p.setCategorie(c);
		    produitdao.save(p);
		}*/
		Categorie c1 = new Categorie("rechange");
		cat.save(c1);
		List<Produit> p1 = produitdao.produitmc("%hp%");
		for(Produit p  : p1) {
			
		    p.setCategorie(c1);
		    produitdao.save(p);
		}
		System.out.println("______________________________________________________________________________");
	     Produit pt = new Produit("pcccccccc",122,1111);
	 
		}

	@Override
	public void run(String... args) throws Exception {
		pr.save(new Produit("scanner hp",1255,2699));
		System.out.println("hii");
	}

}
	


