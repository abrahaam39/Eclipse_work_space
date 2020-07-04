package com.barhoum.rest.entitees;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Produit111 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String designation;
    private long prix;
    private int quantite;

    public Produit111() {
        super();
    }
    public Produit111(String designation,long prix,int quantite){
        super();
    }
}
