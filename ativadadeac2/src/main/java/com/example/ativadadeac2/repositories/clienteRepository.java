package com.example.ativadadeac2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ativadadeac2.models.Cliente;

public interface clienteRepository extends JpaRepository<Cliente, Long>{
    
}
