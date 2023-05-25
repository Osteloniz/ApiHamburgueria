package com.example.ativadadeac2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ativadadeac2.models.Hamburguer;

public interface hamburguerRepository extends JpaRepository<Hamburguer, Long>{
    
}
