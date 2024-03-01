package com.example.catalogue.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogue.models.Services;
import com.example.catalogue.repositories.ServiceRepository;

import lombok.RequiredArgsConstructor;

@Service
//@RequiredArgsConstructor
public class ServiceService {

 @Autowired
 private ServiceRepository serviceRepository;

 // Méthode pour ajouter
    public Services addServices(Services services) {
        return serviceRepository.save(services);
    }

 // Méthode pour récupérer toutes les produit
    public List<Services> getAllServices() {
        return serviceRepository.findAll();
    }
}

