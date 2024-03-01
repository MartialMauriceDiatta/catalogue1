package com.example.catalogue.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogue.models.Services; 
import com.example.catalogue.services.ServiceService;

@RestController
@RequestMapping("/api/catalogues")///@RequiredArgsConstructor
public class ServicesController {
	@Autowired
 private ServiceService serviceService;


// Méthode GET pour récupérer toutes les dépenses
    @GetMapping("/services")
    public List<Services> listServices() {

        return serviceService.getAllServices();
    }
 
// Méthode POST pour enregistrer une dépense
    @PostMapping("/services")
    public Services save(@RequestBody Services services) {

        return serviceService.addServices(services);
    }
  
}

