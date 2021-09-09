package com.devsuperior.dashboard.DTO;

import java.io.Serializable;

import com.devsuperior.dashboard.entities.Client;

public class SaleSuccessDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String clientName;
	private Long visits;
	private Long trainings;
	
	public SaleSuccessDTO() {}

	public SaleSuccessDTO(Client client, Long visits, Long trainings) {
		
		clientName = client.getName();
		this.visits = visits;
		this.trainings = trainings;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Long getVisits() {
		return visits;
	}

	public void setVisits(Long visits) {
		this.visits = visits;
	}

	public Long getTrainings() {
		return trainings;
	}

	public void setTrainings(Long trainings) {
		this.trainings = trainings;
	}

}
