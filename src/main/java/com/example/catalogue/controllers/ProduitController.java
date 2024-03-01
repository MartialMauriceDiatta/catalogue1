package com.example.catalogue.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogue.models.Produit;
import com.example.catalogue.services.ProduitService;

@RestController
@RequestMapping("/api/catalogues")
//@RequiredArgsConstructor
public class ProduitController {
	@Autowired
 private ProduitService produitService;

// Méthode GET pour récupérer toutes les produits
    @GetMapping("/produits")
    public List<Produit> listProduit() {
        return produitService.getAllProduit();
    }
 
// Méthode POST pour enregistrer un produit
    @PostMapping("/produits")
    public Produit save(@RequestBody Produit produit) {
    	return produitService.addProduit(produit);
    }
  
}
