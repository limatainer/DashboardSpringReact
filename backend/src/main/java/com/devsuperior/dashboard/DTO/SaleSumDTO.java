package com.devsuperior.dashboard.DTO;

import java.io.Serializable;

import com.devsuperior.dashboard.entities.Client;

public class SaleSumDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String clientName;
	private Double sum;
	
	public SaleSumDTO() {}

	public SaleSumDTO(Client client, Double sum) {
		this.clientName = client.getName();
		this.sum = sum;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	

}
