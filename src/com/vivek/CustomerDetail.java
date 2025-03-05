package com.vivek;

public class CustomerDetail {
	private String customerName;
	private long phoneNumber;
	private String address;
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	public long getPhoneNumer() {
		return this.phoneNumber;
	}
	public String getAddress() {
		return this.address;
	}
	CustomerDetail (String customerName,long phoneNumber,String address){
		this.customerName=customerName;
		this.phoneNumber=phoneNumber;
		this.address=address;
	}
}