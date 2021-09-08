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

	public Integer getVisited() {
		return visits;
	}

	public void setVisited(Integer visits) {
		this.visits = visits;
	}

	public Integer getDeals() {
		return trainings;
	}

	public void setDeals(Integer trainings) {
		this.trainings = trainings;
	}

	public Double getAmount() {
		return price;
	}

	public void setAmount(Double price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Client getSeller() {
		return client;
	}

	public void setSeller(Client client) {
		this.client = client;
	}
}
