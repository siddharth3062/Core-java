package com.vivek;

public abstract class Bero {
	protected String beroType;
	protected String beroColor;
	protected double Price;
	public String getBeroType() {
		return beroType;
	}
	public void setBeroType(String beroType) {
		this.beroType = beroType;
	}
	public String getBeroColor() {
		return beroColor;
	}
	public void setBeroColor(String beroColor) {
		this.beroColor = beroColor;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public Bero(String beroType, String beroColor, double price) {
		super();
		this.beroType = beroType;
		this.beroColor = beroColor;
		Price = price;
	}	
}