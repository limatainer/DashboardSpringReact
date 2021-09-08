package com.devsuperior.dashboard.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dashboard.DTO.ClientDTO;
import com.devsuperior.dashboard.entities.Client;
import com.devsuperior.dashboard.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<ClientDTO> findAll(){
		List<Client> result = repository.findAll();
		return result.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}
}
