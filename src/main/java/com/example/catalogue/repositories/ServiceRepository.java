package com.example.catalogue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogue.models.Services;

public interface ServiceRepository extends JpaRepository<Services, Long>{

}
