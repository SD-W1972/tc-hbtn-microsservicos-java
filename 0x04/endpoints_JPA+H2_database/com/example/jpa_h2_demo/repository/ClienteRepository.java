package com.example.jpa_h2_demo.repository;

import com.example.jpa_h2_demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
    Optional<Cliente> findById(Long idClient);

    void deleteById(Long idClient);
}
