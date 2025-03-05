package day2.store;

public class CustomerDetails implements BonusPoints, DoorDelivery {
	private String customerName;
	 private String phoneNumber;
	 private String streetName;
	 private double billAmount;
	 private int distance;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public CustomerDetails(String customerName, String phoneNumber, String streetName, double billAmount,
			int distance) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.streetName = streetName;
		this.billAmount = billAmount;
		this.distance = distance;
	}
	
	@Override
	public double calculateBonusPoints()
	{
		double bonusAmount =0;
		
		if(this.billAmount>=250)
		{
			bonusAmount= this.billAmount/10;
		}
		
		return bonusAmount;
	}
	
	
	@Override
	public double deliveryCharge() {
		
		double deliveryCharge=0;
		if(this.distance>=25) {
			deliveryCharge = 8;
		}
		else if(this.distance>=15 && this.distance < 25) {
			deliveryCharge = 5;
			
		}
		else if(this.distance<15) {
			deliveryCharge = 2;
		}
		return this.distance* deliveryCharge;
	}
	
	
	 
}
