package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barhoum.entitees.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long>{

}
