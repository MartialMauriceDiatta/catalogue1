package com.example.catalogue.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogue.models.Depense;
import com.example.catalogue.repositories.DepenseRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepenseService {

	 @Autowired
	 private DepenseRepository depenseRepository;
	
	 // Méthode pour ajouter une dépense
	    public Depense addDepense(Depense depense) {
	        return depenseRepository.save(depense);
	    }
	
	 // Méthode pour récupérer toutes les dépenses
	    public List<Depense> getAllDepense() {
	        return depenseRepository.findAll();
	    }

}
