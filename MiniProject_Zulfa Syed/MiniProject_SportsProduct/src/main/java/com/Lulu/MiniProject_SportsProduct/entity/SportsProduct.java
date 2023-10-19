package com.Lulu.MiniProject_SportsProduct.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sportsproduct")
public class SportsProduct {
	@Id
	int id;
	String name;
	String descp;
	double cost;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescp() {
		return descp;
	}
	public void setDescp(String descp) {
		this.descp = descp;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double d) {
		this.cost = d;
	}
	public SportsProduct(int id, String name, String descp, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.descp = descp;
		this.cost = cost;
	}
	public SportsProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SportsProduct [id=" + id + ", name=" + name + ", descp=" + descp + ", cost=" + cost + "]";
	}

	
}
