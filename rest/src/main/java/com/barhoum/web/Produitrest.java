package com.barhoum.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.barhoum.dao.Produitrepository;
import com.barhoum.entitees.Produit;

@RestController
public class Produitrest {
@Autowired	
private Produitrepository dao;
@RequestMapping(value="/produits",method=RequestMethod.GET)
public List<Produit> getProduits(){
	return dao.findAll();
	
}
@RequestMapping(value="/produits/{id}",method=RequestMethod.GET)
public Optional<Produit> getProduit(@PathVariable Long id){
	return dao.findById(id);
	
}
@RequestMapping(value="/produits",method=RequestMethod.POST)
public Produit saveProduit(@RequestBody Produit p){
	return dao.save(p);
	
}
@RequestMapping(value="/produits/{id}",method=RequestMethod.DELETE)
public boolean supProduit(@PathVariable Long id){
	dao.deleteById(id);
    return true;

}
@RequestMapping(value="/produits/{id}",method=RequestMethod.PUT)
public Produit updateProduit(@PathVariable Long id,@RequestBody Produit p){
	p.setId(id);
	return dao.save(p);

}
/*@RequestMapping(value="/chercher",method=RequestMethod.GET)
public Page<Produit> chercherProduit(@RequestParam(name="mc",defaultValue="")String mc,
		                             @RequestParam(name="page",defaultValue="0")int page,
		                             @RequestParam(name="size",defaultValue="5")int size){
	return dao.chercher(mc,PageableRequest(page,size));
}*/

}