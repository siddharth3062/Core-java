package day1.college;

public class DayScholar extends Student {
	private int busNumber;
	 private float distance;
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public DayScholar(int studentId, String studentName, String category, String department, String gender,
			double collegeFee, int busNumber, float distance) {
		super(studentId, studentName, category, department, gender, collegeFee);
		this.busNumber = busNumber;
		this.distance = distance;
	}
	
	@Override
	public double calculateTotalFee() {
		
		double busFee=0;
		if(distance > 30 && distance <=40) {
			busFee = 28000;
		}
		else if(distance > 20 && distance <=30) {
			busFee = 20000;
		}
		else if(distance > 10 && distance <=20) {
			busFee = 12000;
		}
		else if(distance<=10) {
			busFee = 6000;
		}
		
		
		return this.getCollegeFee()+busFee;
	}
	
	

	
}
