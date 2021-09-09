package com.devsuperior.dashboard.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dashboard.DTO.SaleDTO;
import com.devsuperior.dashboard.DTO.SaleSuccessDTO;
import com.devsuperior.dashboard.DTO.SaleSumDTO;
import com.devsuperior.dashboard.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/sum-by-client")
	public ResponseEntity<List<SaleSumDTO>> priceGroupedByClient() {
		List<SaleSumDTO> list = service.priceGroupedByClient();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/success-by-client")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedByClient() {
		List<SaleSuccessDTO> list = service.successGroupedByClient();
		return ResponseEntity.ok(list);
	}
}
