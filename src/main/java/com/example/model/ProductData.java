package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductData {
	@Id
	@Column
	private int id;
	private double price,discount,netPrice;
	@Override
	public String toString() {
		return "ProductData [id=" + id + ", price=" + price + ", discount=" + discount + ", netPrice=" + netPrice + "]";
	}
	public ProductData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
	public ProductData(int id, double price, double discount, double netPrice) {
		super();
		this.id = id;
		this.price = price;
		this.discount = discount;
		this.netPrice = netPrice;
	}

	
}
