package com.rest.model;

import com.rest.entity.Charges;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Pro_table")
  public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String product_name;
	private String product_type;
	private String category;
	private double price;
	
	@Embedded
	private Charges charges;
	private double finalPrice;
	public Product() {
		super();
	}
	public Product(int id, String product_name, String product_type, String category, double price, Charges charges,
			double finalPrice) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_type = product_type;
		this.category = category;
		this.price = price;
		this.charges = charges;
		this.finalPrice = finalPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Charges getCharges() {
		return charges;
	}
	public void setCharges(Charges charges) {
		this.charges = charges;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name + ", product_type=" + product_type + ", category="
				+ category + ", price=" + price + ", charges=" + charges + ", finalPrice=" + finalPrice + "]";
	}
	
	
	
	
}
