package com.devsuperior.dashboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dashboard.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
