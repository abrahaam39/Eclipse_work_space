package com.barhoum.web;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import javax.validation.Valid;

import com.barhoum.dao.ProduitRepository;
import com.barhoum.entitees.Produit;

@Controller
public class ProduitControler {
	@Autowired
	ProduitRepository pr;
	//@RequestMapping(value="/index",method=RequestMethod.GET)
	@GetMapping("/")
	public String index() {
		return "produits";
	}
	//@GetMapping("/index1")
	//public String chercher(Model model) {
		//List<Produit>  produits = pr.findAll();
		//model.addAttribute("listproduit",produits);
		//return "produits";
	//}
	@GetMapping(path="/index")
	public String chercher(Model modele,@RequestParam(name="page",defaultValue="0") int page,
			                           @RequestParam(name="motcle",defaultValue="") String mc,
			                           @RequestParam(name="size",defaultValue="5")int size) {
		
		
		Page<Produit>  Pagesproduits =pr.findByDesignationContains(mc, PageRequest.of(page,size));
		modele.addAttribute("listproduit",Pagesproduits.getContent());
		modele.addAttribute("pages",new int[Pagesproduits.getTotalPages()]);
		modele.addAttribute("currentpage",page);
		modele.addAttribute("motcle",mc);
		return "produits";
	}
	
	@GetMapping("/delete")
	public String delete(Long id,int page,String motcle) {
		pr.deleteById(id);
		return "redirect:/index?page="+page+"&motcle="+motcle;
	}
	@GetMapping("/formulaire")
	public String form(Model modele) {
		modele.addAttribute("produit",new Produit());
    
		return "ajoutproduit";
	}
	@PostMapping("/ajout")
	public String save(Model modele ,@Valid Produit produit,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) return "ajoutproduit";
    pr.save(produit);
		return "redirect:/index";
	}
	@GetMapping("/edit")
	public String edit(Model modele,Long id) {
		Produit produit = pr.findById(id).get();
		modele.addAttribute("produit",produit);
		return "editproduit";
	}
}
