package com.devsuperior.dashboard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dashboard.DTO.SaleSuccessDTO;
import com.devsuperior.dashboard.DTO.SaleSumDTO;
import com.devsuperior.dashboard.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	@Query("SELECT new com.devsuperior.dashboard.DTO.SaleSumDTO(obj.client, SUM(obj.price))"
			+ "FROM Sale As obj GROUP BY obj.client")
	List<SaleSumDTO> priceGroupedByClient();
	
	@Query("SELECT new com.devsuperior.dashboard.DTO.SaleSuccessDTO(obj.client, SUM(obj.visits), SUM(obj.trainings))"
			+ "FROM Sale As obj GROUP BY obj.client")
	List<SaleSuccessDTO> successGroupedByClient();
}
