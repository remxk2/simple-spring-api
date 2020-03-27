package com.teste.uds.demo.domain.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "size", length = 20, nullable = false, unique = false)
	private String size;
	
	@Column(name = "flavor", length = 20, nullable = false, unique = false)
	private String flavor;
	
	@ElementCollection
	private List<String> additionals = new ArrayList<String>();
	
	
	public Order(String size, String flavor, List<String> additionals) {
		this.size = size;
		this.flavor = flavor;
		this.additionals = additionals;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public List<String> getAdditionals() {
		return additionals;
	}

	public void setAdditionals(List<String> additionals) {
		this.additionals = additionals;
	}
	
}
