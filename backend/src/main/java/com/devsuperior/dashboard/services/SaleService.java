package com.devsuperior.dashboard.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dashboard.DTO.SaleDTO;
import com.devsuperior.dashboard.DTO.SaleSumDTO;
import com.devsuperior.dashboard.entities.Sale;
import com.devsuperior.dashboard.repositories.ClientRepository;
import com.devsuperior.dashboard.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		clientRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> priceGroupedByClient(){
		return repository.priceGroupedByClient(); 
		
	}
}
