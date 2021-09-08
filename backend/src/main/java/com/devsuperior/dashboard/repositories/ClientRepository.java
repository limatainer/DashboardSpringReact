package com.devsuperior.dashboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dashboard.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
