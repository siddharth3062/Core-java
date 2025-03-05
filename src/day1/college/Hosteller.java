package day1.college;

public class Hosteller extends Student{
	 private int roomNumber;
	 private char blockName;
	 private String roomType;
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public char getBlockName() {
		return blockName;
	}
	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	 
	
	
	
	
	public Hosteller(int studentId, String studentName, String category, String department, String gender,
			double collegeFee, int roomNumber, char blockName, String roomType) {
		super(studentId, studentName, category, department, gender, collegeFee);
		this.roomNumber = roomNumber;
		this.blockName = blockName;
		this.roomType = roomType;
	}
	public double calculateTotalFee() {
		
		double hostelFee=0;
		if(blockName == 'A' && roomType.equals("AC")) {
			hostelFee=60000+8000;
		}
		else if(blockName == 'B' && roomType.equals("AC")){
			hostelFee=50000+5000;
		}
		else if(blockName == 'C' && roomType.equals("AC")){
			hostelFee=40000+2500;
		}
		else if(blockName == 'A' && roomType.equals("NON-AC")){
			hostelFee=60000;
		}
		else if(blockName == 'B' && roomType.equals("NON-AC")){
			hostelFee=50000;
		}
		else if(blockName == 'C' && roomType.equals("NON-AC")){
			hostelFee=40000;
		}
		
		return this.getCollegeFee()+hostelFee;
		
	}

}
