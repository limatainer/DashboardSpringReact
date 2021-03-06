package com.devsuperior.dashboard.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer visits;
	private Integer trainings;
	private Double price;
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	public Sale() {}

	public Sale(Long id, Integer visits, Integer trainings, Double price, LocalDate date, Client client) {
		
		this.id = id;
		this.visits = visits;
		this.trainings = trainings;
		this.price = price;
		this.date = date;
		this.client = client;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
}
