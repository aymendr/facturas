package com.drira.facturas.repo;

import com.drira.facturas.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepo extends JpaRepository<Client,Long> {
    Optional<Client> findClientById(Long id);
}
