package com.devsuperior.dashboard.DTO;

import java.time.LocalDate;

import com.devsuperior.dashboard.entities.Sale;

public class SaleDTO {
	private Long id;
	private Integer visits;
	private Integer trainings;
	private Double price;
	private LocalDate date;
	
	private ClientDTO client;
	
	public SaleDTO() {}

	public SaleDTO(Long id, Integer visits, Integer trainings, Double price, LocalDate date, ClientDTO client) {
		this.id = id;
		this.visits = visits;
		this.trainings = trainings;
		this.price = price;
		this.date = date;
		this.client = client;
	}
	
	public SaleDTO(Sale entity) {
		id = entity.getId();
		visits = entity.getVisits();
		trainings = entity.getTrainings();
		price = entity.getPrice();
		date = entity.getDate();
		client = new ClientDTO(entity.getClient());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisits() {
		return visits;
	}

	public void setVisits(Integer visits) {
		this.visits = visits;
	}

	public Integer getTrainings() {
		return trainings;
	}

	public void setTrainings(Integer trainings) {
		this.trainings = trainings;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public ClientDTO getClient() {
		return client;
	}

	public void setClient(ClientDTO client) {
		this.client = client;
	}
	
}
