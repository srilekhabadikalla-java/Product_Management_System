package com.rest.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Charges {
	private double discount;
	private double gst;
	private double delivary_charges;
	public Charges() {
		super();
	}
	public Charges(double discount, double gst, double delivary_charges) {
		super();
		this.discount = discount;
		this.gst = gst;
		this.delivary_charges = delivary_charges;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDelivary_charges() {
		return delivary_charges;
	}
	public void setDelivary_charges(double delivary_charges) {
		this.delivary_charges = delivary_charges;
	}
	@Override
	public String toString() {
		return "Charges [discount=" + discount + ", gst=" + gst + ", delivary_charges=" + delivary_charges + "]";
	}

    
}

