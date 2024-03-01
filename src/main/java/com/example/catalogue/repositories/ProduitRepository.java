package com.example.catalogue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogue.models.Produit;


	public interface ProduitRepository extends JpaRepository<Produit, Long> {

		
	}
