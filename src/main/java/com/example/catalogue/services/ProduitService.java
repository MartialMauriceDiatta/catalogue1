package com.example.catalogue.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogue.models.Produit;
import com.example.catalogue.repositories.ProduitRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProduitService {

 @Autowired
 private ProduitRepository produitRepository;

 // Méthode pour ajouter un produit
    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }

 // Méthode pour récupérer toutes les produit
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }

}

