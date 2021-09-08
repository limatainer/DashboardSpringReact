package com.devsuperior.dashboard.DTO;

import java.io.Serializable;

import com.devsuperior.dashboard.entities.Client;

public class ClientDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	public ClientDTO() {}

	public ClientDTO(Long id, String name) {
	
		this.id = id;
		this.name = name;
	}
	
	public ClientDTO(Client entity) {
		
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
